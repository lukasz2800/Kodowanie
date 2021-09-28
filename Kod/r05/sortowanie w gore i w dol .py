litery = 'atokanapa'
wynik = ''
dlugosc = len(litery)
i = 0
while (i < dlugosc):
    wynik = wynik + litery[i]
    i = i +1

dlugosc = dlugosc * -1
i = -2

while (i >= dlugosc):
    wynik = wynik + litery[i]
    i = i - 1

print(wynik)
