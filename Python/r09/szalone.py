def utworz_szalona_historie(nazwa_pliku):
    try:
        plik = open(nazwa_pliku, 'r')

        tekst = ''

        for wiersz in plik:
            tekst = tekst + przetworz_wiersz(wiersz)


        plik.close()

        return tekst
    
    except FileNotFoundError:
        print('nie znaleziono pliku')
    except IsADirectoryError:
        print('nie jest katalogiem ')
    except:
        print('nie mozna odczytac')

znaczniki = ['MIANOWNIK', 'DOPEŁNIACZ', 'BIERNIK', 'NARZĘDNIK', 'MIEJSCOWNIK']

def przetworz_wiersz(wiersz):
    global znaczniki
    przetworzony_wiersz = ''

    slowa = wiersz.split()

    for slowo in slowa:
        oczyszczone = slowo.strip('.,;?!')
        if oczyszczone in znaczniki:
            odpowiedz = input('Podaj ' + oczyszczone + ':')
            przetworzony_wiersz = przetworzony_wiersz + odpowiedz
        
            if slowo[-1] in '.,;!?':
                przetworzony_wiersz = przetworzony_wiersz + slowo[-1] + ' '
            else:
                przetworzony_wiersz = przetworzony_wiersz + ' '

        else:
            przetworzony_wiersz  = przetworzony_wiersz + slowo + ' '
    return przetworzony_wiersz + '\n'

def zapisz_szalona_historie(nazwa_pliku, tekst):
    try:
        plik = open(nazwa_pliku, 'w')
        plik.write(tekst)
        plik.close()
    except:
        print('nie udalo sie zapisac pliku', nazwa_pliku)

def main():       
    nazwa_pliku = 'lib.txt'
    historia = utworz_szalona_historie(nazwa_pliku)
    if (historia != None):
        zapisz_szalona_historie('crazy_' + nazwa_pliku, historia)   # zapisuje plik w tym samym katalogu

if __name__ == '__main__':
    main()