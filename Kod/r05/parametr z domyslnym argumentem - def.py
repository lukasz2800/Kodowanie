def witaj(imie, komunikat='fajnie wygladasz'): # domyslna wartosc komunikatu, w kodzie wywolania nie pojawia sie argumen dla parametru komunikat
        print('Czesc', imie + '.', komunikat)

witaj('Jacek')
witaj('Karolina', 'co u ciebie') # przy podaniu argumentu dla komunikat, co u ciebie przyjmuje nowa wartosc parametru komunikat