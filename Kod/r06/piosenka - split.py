piosenka = 'Szewc zabija szewca bumtarara bumtarara.  Lubie placki'
slowa = piosenka.split()   # funkcja split dzieli tekst poprzez wykrywanie bialych znako na podlancuchy oddzielone przecinkami
print(slowa)
liczba_slow = len(slowa)
print('liczba slow to ', liczba_slow)

for znak in piosenka:        # iterujemy slowa po kazdym znaku, za kazda iteracja kolejny znak jest przypisywany do zmiennej znak
    print(znak)

def policz_zdania9(piosenka):
    liczba_zdan = 0

print('liczba slow to ', liczba_slow)