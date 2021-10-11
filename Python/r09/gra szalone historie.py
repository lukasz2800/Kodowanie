
def utworz_szalone_historie(nazwa_pliku):   # nasza funkcja pobierajaca nazwe pliku  i go otwiera
    plik = open(nazwa_pliku, 'r')
    
    tekst = ''       # tworzymy zmienna tekst do tworzenia tekstu wyjsciowego podczas przetwarzania danych wejsciowych

    for wiersz in tekst:       #kazdy wiersz przetworzymy funkcja przetworz_wiersz i dodamy do tworzonego tekstu
        tekst = tekst + przetworz_wiersz(wiersz)
    
    plik.close()  # po przejsciu po kazdym wierszu zamykamy plik i wracamy do tekstu

    return tekst

znaczniki = ['MIANOWNIK', 'DOPEŁNIACZ', 'BIERNIK', 'NARZĘDNIK', 'MIEJSCOWNIK'] # tworzymy liste znaczniki globalna, na wypadek gdyby byla potrzebna pozniej
def przetworz_wiersz(wiersz):  # na potrzeby testy sprawimy, by funkcja przetworz_wiersz zwracala przekazany jej tekst.
    przetworzony_wiersz = ''
    slowa = wiersz.split()

    for slowo in slowa:         # przegladamy kazde slowo sprawdzajac czy jest znacznikiem, jesli tak podajemy slowo
        odpowiedz = input('Podaj slowo', + slowo + ':')
        przetworz_wiersz = przetworzony_wiersz + odpowiedz + ' '  # dodajemy odpowiedz uzytkownika do przetworzonego wiersza
    else:
        przetworzony_wiersz = przetworz_wiersz + slowo + ' ' # w przeciwnym razie dodajemy samo slowo(które nie jest znacznikiem) do przetworzonego wiersza

   
    return przetworzony_wiersz + '\n'     # znak nowego wiersza na koncu linijki bo split go usuwa
                               
def main():
    historia = utworz_szalone_historie('lib.txt')  # wywolujemy funkcje utworz_szalone_historie w f main
    print(historia)

if __name__ == '__main__':
    main()