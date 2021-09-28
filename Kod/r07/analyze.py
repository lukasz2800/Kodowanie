'''modul analize xxxxxxxxxxxxxxxxxxxxx'''  # - notka dokumentacyjna
import ch1text

def policz_zdania(tekst):
    '''Ta funkcja pobiera lancuch tekstowy dowolnej dlugosci i wyswietla pozion trudnosci tekstu'''
    liczba = 0
    for znak in tekst:
        if znak == '.' or znak == '?' or znak == '!':
           liczba = liczba + 1
    return liczba

def policz_sylaby(slowa):                                # nowa funkcja, która przyjmuje listę słów
    liczba = 0                                           # lokalna zmienna okreslajaca łączną liczbę słow
    for slowo in slowa:                                  # iteracja po każdym slowie z listy
        liczba_slow = policz_sylaby_w_slowie(slowo)      # wywolujemy nowa funkcje zwracajaca liczbe sylab w ojedynczym slowie, wkrotce ja napiszemy. zmienna liczba_slow przechowuje liczbe sylab z biezacego slowa
        liczba = liczba + liczba_slow                    # dodajemy liczbe sylab z biezacego wyrazu do wyniku
    return liczba                                        # na koniec zwracamy laczna liczbe sylab z wszystkich slow

def policz_sylaby_w_slowie(slowo):
    liczba = 0

    koncowki = ',.;!?:'                                  # tworzymy lancuch obejmujacy wszystkie koncowki
    ostatni_znak = slowo[-1]                             # znajdujemy ostatni znak biezacego slowa

    if ostatni_znak in koncowki:                         # sprawdzamy czy ostatni znak jest jednym ze znakow w koncowki
        przetworzone_slowo = slowo[0:-1]                 # jezeli tak to przypisujemy zmiennej przetworzone_slowo  to slowo lecz bez osttniego znaku
    else:
        przetworzone_slowo = slowo                       # jezeli nie, przypisyjemy zmiennej przetworzone_slowo  cale slowo
    
    if len(przetworzone_slowo) <= 3:
        return 1
    
    if przetworzone_slowo[-1] in 'eE':                  # sprawdzamy czy na koncu kazdego slowa nie ma eE
        przetworzone_slowo = przetworzone_slowo[0:-1]   # jezeli jest to nie bierzemy pod uwage tej sylaby
    else:
        przetworzone_slowo = slowo                      # jezeli nie ma to bierzemy pod uwage

    if len(przetworzone_slowo) <= 3:
        return 1
    
    samogloski = 'aeiouAEIOU'                            # tworzymy zmienna lokalna samogloski, gdzie zapisujemy wszyskie samogloski
    poprzedni_znak_byl_samogloska = False

    for znak in przetworzone_slowo:
        if znak in samogloski:
            if not poprzedni_znak_byl_samogloska:
                liczba = liczba +1
            poprzedni_znak_byl_samogloska = True
        else:
            poprzedni_znak_byl_samogloska = False

    if przetworzone_slowo[-1] in 'yY':             # sprawdza czy slowo konczy sie na y lub Y
        liczba = liczba + 1

    return liczba


    for znak in slowo:                                   # szukamy we wszyskich znakach w wyrazie
        if znak in samogloski:                           # uzywamy operatora in by sprawdzic czy znak ze zmiennej znak jest rowny ktoremukolwiek ze znakow z lancucha samogloski
            liczba = liczba + 1                          # jezeli ten znak znajduje sie w lancuchu to trafilismy w samogloske, zwiekszamy wtedy wartosc zmiennej o 1

    return liczba

def zwroc_wyniki(wynik):
    if wynik >= 90.0:
        print('5 klasa podstawowki')
    elif wynik >= 80.0:
        print('6 klasa podstawowki')
    elif wynik >= 70.0:
        print('7 klasa podstawowki')
    elif wynik >= 60.0:
        print('8 klasa podstawowski i 1 klasa liceum')
    elif wynik >= 50.0:
        print('2 - 4 klasa liceum')
    elif wynik >= 30.0:
        print('studia licencjackie')
    else:
        print('studia magisterskie')



    

def oblicz_czytelnosc(tekst):     # funkcja przyjmuje tekst jako parametr
    liczba_slow = 0               # deklarujemy zmienne z wartoscia 0 
    liczba_zdan = 0 
    liczba_sylab = 0
    wynik = 0
    slowa = tekst.split()
    liczba_slow = len(slowa)            # liczy ilosc slow w podzielonym lancuchu slowa
    liczba_zdan = policz_zdania(tekst) # szacuje liczbe zdan na podstawie ilosci znakow koncowych (.?!)
    liczba_sylab = policz_sylaby(slowa)
    
    wynik = (206.835-1.015 * (liczba_slow / liczba_zdan)) - 84.6 * (liczba_sylab / liczba_slow) 

    print(liczba_slow, 'slow w tekscie')
    print(liczba_zdan, 'zdan w tekscie')
    print(liczba_sylab, 'sylab w tekscie')
    print(wynik, 'indeks czytelnosci')
    zwroc_wyniki(wynik)

    
    

oblicz_czytelnosc(ch1text.tekst)

    



