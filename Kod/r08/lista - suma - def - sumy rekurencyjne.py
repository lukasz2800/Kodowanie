kulki = [10, 13, 39, 14, 41, 9, 3]

def oblicz_sume(lista):          # zdefiniujmy funkcje, ktora obliczy sume zriobur liczb (mozna zrobic prosciej sum(lista))
    suma = 0                     # tworzymy zmienna 0, ktora bedzi eprzechowywac biezaca sume
    for liczba in lista:
        suma = suma + liczba          # iterujemy liste i dodajemy kolejne liczby do siebie
    return suma                       # zwracamy sume

print('kulek w worku jest ', oblicz_sume(kulki))


suma = kulki[0] + kulki[1] + kulki[2] + kulki[3] + kulki[4] + kulki[5] + kulki[6]     # mozna tak tez obliczyc sume
print(suma)

suma = sum(kulki)                     # albo tez tak z uzyciem wbudowanej funkcji sum
print(suma)

# przypadek bazowy

def oblicz_sume_rekurencyjnie(lista):
    if len(lista) == 0:                                  # sprawdzamy czy lista jest pusta - czy jej dlugosc wynosi 0
        return 0
    
# przypadek rekurencyjny

def oblicz_sume_rekurencyjnie(lista):
    if len(lista) == 0:                                  
        return 0                                          # dotąd przypadek bazowy
    else:                                   # tworzymy zmienna przechowujaca pierwszy element oraz druga odnoszaca sie do reszty listy
        pierwszy = lista[0]
        reszta = lista[1:]                  # szukamy w dalszej czesci listy jezeli istnieje nie jest pusta
        suma = pierwszy + oblicz_sume_rekurencyjnie(reszta)      # wywolujemy ta funkcje aby wykonac to dzialanie na krotszej liscie
        return(suma)
    
suma = oblicz_sume_rekurencyjnie(kulki)
print(oblicz_sume_rekurencyjnie(kulki))

