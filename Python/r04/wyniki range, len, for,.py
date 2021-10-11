wyniki = [60, 50, 60, 58, 54, 54,
           58, 50, 52, 54, 48, 69,
           34, 55, 51, 52, 44, 51,
           69, 64, 66, 55, 52, 61,
           46, 31, 57, 52, 44, 18,
           41, 53, 55, 61, 51, 44]

najwyzszy_wynik = 0

dlugosc = len(wyniki)
i = 0 # zaczynamy od zerowej wartosci - nie trzeba tej linijki ale lepiej sie kojarzy
for i in range(dlugosc): # zwraca po kolei kazda wartosc indeksu z wynikow po kolei
    print('Wyniki roztworu #' +str(i), 'to', wyniki[i]) # str uzywamy zeby przeksztalcic wrtosc i w ciag i usunac przerwe miedzy # a liczba
    
    
liczba_testow = dlugosc
print('Liczba testow to', liczba_testow)


