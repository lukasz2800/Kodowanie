import time

bufor = {}               # slownik, ktorego uzyjemy jako buforu do zapisywania sum liczb

def fibonacci(n):   
    global bufor
    if n in bufor:       # sprawdzamy czy n jest kluczem w slowniku bufor, jezli tak to zwracamy wartosc odpowiadajaca temu kluczowi
        return bufor[n]

    if n == 0:           # zamiast od razu zwracac, czy n = 0 czy 1, przypisujemy n zmiennej lokalnej wynik
        wynik = 0
    elif n == 1:
        wynik = 1
    else:                # jesli okaze sie, ze bedziemy rekurencyjnie obliczac wynik to od razu przypisujemy go od zmiennej wynik
        wynik = fibonacci(n-1) + fibonacci(n-2)
    bufor[n] = wynik     # wynik przed zwroceniem przypisujemy w buforze klucozwi n. * klucz slownika moze miec dowolna wartosc np liczbowa
    return wynik

poczatek = time.time()
                             # obliczamy czas trwania obliczenia 100 pierwszych liczb ciagu fibonacciego
for i in range(0,101):     
    wynik = fibonacci(i)
    print(i, wynik)

koniec = time.time()   
czas = koniec - poczatek
print('wszystkie 100 liczb obliczono w ', czas, 'sekund')