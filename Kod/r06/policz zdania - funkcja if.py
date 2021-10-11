import ch1text

def policz_zdania(tekst):
    liczba = 0
    
    koncowe = '.?!'

    for znak in tekst:           #wyswietla wszystkie znaki w tekscie
        if znak in koncowe:      # jezeli w znakach zawieraja sie wartosci koncowe(?!.) to je zlicza
            liczba = liczba + 1 
    return liczba                # na podstawie liczby znakow (?!.) system wylicza ilosc zdan

def oblicz_czytelnosc(tekst):     # funkcja przyjmuje tekst jako parametr
    liczba_slow = 0               # deklarujemy zmienne z wartoscia 0 
    liczba_zdan = 0 
    liczba_sylab = 0
    wynik = 0
    slowa = tekst.split()
    liczba_slow = len(slowa)
    liczba_zdan = policz_zdania(tekst)


    print(liczba_slow, 'slow w tekscie')
    print(liczba_zdan, 'zdan w tekscie')



oblicz_czytelnosc(ch1text.tekst)