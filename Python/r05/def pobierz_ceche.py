def pobierz_ceche(zapytanie, domyslna):    # funkcje nazwalem 'pobierz_ceche' (dwa parametry zapytanie - bedzie pytaniem, domyslna - brazowy, krotkie)
    pytanie = zapytanie + ' [' + domyslna + ']?'
    odpowiedz = input(pytanie)    # zadajemy pytanie i uzyskujemy dane wejsciowe
    if (odpowiedz == ''):   # brak odpowiedzi oznacza ceche domyslna 
        odpowiedz = domyslna
    print('wybrales', odpowiedz)
    return odpowiedz

wlosy = pobierz_ceche('Jaki kolor wlosow', 'brazowy')   # wszystkie pierwotne cechy zostaly przypisane do funkcji pobierz_ceche
wlosy_dlugosc = pobierz_ceche('Jaka dlugosc wlosow', 'krotkie')
oczy = pobierz_ceche('Jaki kolor oczy', 'niebieski')
plec = pobierz_ceche('Jaka plec', 'kobieta')
okulary = pobierz_ceche('Okulary', 'nie')
broda = pobierz_ceche('Broda', 'nie')