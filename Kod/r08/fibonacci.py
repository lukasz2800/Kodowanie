import time                  # uzyjemy modulu time zeby przesledziec obliczenia w czasie    

def fibonacci(n):            # rekurencyjny kod obliczajacy liczby z ciagu fibonacciego
    if n == 0:
        return 0
    elif n == 1:
        return 1
    else:
        return fibonacci(n-1) + fibonacci(n-2)

for i in range(20, 55, 5):             # w ramach testu obliczymy liczby z ciagu fibo od 20 do 55, w odstepach o 5
    poczatek = time.time()             # czas rozpoczecia obliczenia
    wynik = fibonacci(i)               # obliczanie liczby z ciagu
    koniec = time.time()               # czas zamonczenia obliczenia
    czas = koniec - poczatek           # obliczenie czasu trwania
    print(i, wynik, czas)