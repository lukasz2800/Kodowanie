uzytkownicy = {}
uzytkownicy['Kasia'] = {'email' : 'kasia@przyklad.com', 'plec' : 'k', 'wiek' : '27', 'przyjaciele' :  ['Jan', 'Jacek']}
uzytkownicy['Jan'] = {'email' : 'jan@abc.com', 'plec' : 'm', 'wiek' : '24', 'przyjaciele' :  ['Kasia', 'Jacek']}
uzytkownicy['Jacek'] = {'email' : 'jacek.xyz.com', 'plec' : 'm', 'wiek' : '32', 'przyjaciele' :  ['Kasia']}

max = 1000                                    # tworzymy zmienna przechowujaca biezacy wynik najbardziej aspolecznej osoby, nazywamy ja max i przypisujemy wysoka wartosc(musi byc wyzsza niz ilosc przyjaciol, na oko)
for imie in uzytkownicy:                      # sprawdzamy kazde imie w slowniku uzytkownicy
    uzytkownik = uzytkownicy[imie]       
    przyjaciele = uzytkownik['przyjaciele']    # uzywamy klucza przyjaciele do pobrania listy przyjaciol
    if len(przyjaciele) < max:                 # jezeli liczba przyjaciol jest nizsza niz max to mamy do czynienia z biezacym kandydatem do wygranej
        najbardziej_aspoleczny = imie          # nadajemy zmiennej najbardziej_aspoleczny wartosc imie
        max = len(przyjaciele)                 # a zmiennej max nowa liczbe przyjaciol
    
print('Najbardziej aspolecznym uzytkownikiem jest', najbardziej_aspoleczny)

# po iteracji wszystkich imion mozemy wskazac, ktory uzytkownik ma najmniej przyjaciol