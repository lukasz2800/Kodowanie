moj_plik = open('lib.txt', 'r')    # otwieramy plik za pomoca open, nazwa pliku, tryb(r) - do odczytu, i - do zapisu
wiersz1 = moj_plik.readline()      # przypisujemy pierwszy wiersz tekstu do zmiennej wiersz1
print(wiersz1)
wiersz2 = moj_plik.readline()    # przypisujemy drugi wiersz do zmiennej wiersz2
print(wiersz2)            
moj_tekst = moj_plik.read()    # przypisujemy moj_plik łancuchowi moj_tekst
print(moj_tekst)
moj_plik.close()   # zamykamy plik


# mozna tez za pomoca funkcji zrobic to dla wszystkich wierszy od razu:

moj_plik = open('lib.txt', 'r')
while True:                      # petla while true oznacza, ze iterujemy w nieskonczonosc
    wiersz = moj_plik.readline()
    if wiersz != '':           # koniec pliku jest pustym lancuchem
        print(wiersz)      # przy kazdym wykonaniu petli odczytujemy nastepny wiersz az do pustego lancucha ''
    else:
        break    # jesli trafimy na koniec pliku, uzywamy break do przerwania funkcji
moj_plik.close()

# mozna tez najprosciej

moj_plik = open('lib.txt', 'r')
for wiersz in moj_plik:         # iteracja po kazdym wierszu w pliku
    print(wiersz)
moj_plik.close()