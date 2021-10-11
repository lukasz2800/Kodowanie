powitanie = 'witaj'          # tworzymy zmienna globalna powitanie
print(powitanie)             # zmienna globalna powitanie obecnie to witaj
def witaj(imie, komunikat):
    global powitanie          # nakazuje funkcji użyć funkcji globalnej z wartoscia czesc w obrebie funkcji
    powitanie = 'czesc'       # zmiana wartosci funkcji globalnej obowiazujaca od teraz na czesc
    print(powitanie, imie + '.', komunikat)
witaj('jacek', 'milego dnia')

print(powitanie)
