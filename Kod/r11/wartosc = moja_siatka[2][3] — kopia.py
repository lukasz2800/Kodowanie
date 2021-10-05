import random

wys = 100
szer = 100  

def losuj(siatka, szer, wys):
    for i in range(0, wys):
        for j in range(0, szer):
            siatka[i][j] = random.randint(0, 1)      

model_siatki = [0] * wys  # tworzymy liste o liczbie zer równiej wysokosci
nastepny_model_siatki = [0] * wys

for i in range(wys):
    model_siatki[i] = [0] * szer   # Iterujemy po kazdym elemencie listy model_siatki i zastepujemy je listami o liczbie zer rownej szerokosci
    nastepny_model_siatki[i] = [0] * szer


losuj(model_siatki, szer, wys)

def nastepne_pokolenie():
    global model_siatki, nastepny_model_siatki

    for i in range(0, wys):        # iterujemy po kazdej komorce z dwuwymiarowej listy
        for j in range(0, szer):
            komorka = 0
            
            licznik = policz_sasiadow(model_siatki, i, j)

            if model_siatki[i][j] == 0:
                if licznik == 3:
                    komorka = 1
            elif model_siatki[i][j] == 1:
                if licznik == 2 or licznik == 3:
                    komorka = 1
            nastepny_model_siatki[i][j] = komorka # po obliczeniu stanu komorki zapisujemy stan w biezacej lokalizacji w siatce nastepny_model_siatki
            
    tymczasowa = model_siatki
    model_siatki = nastepny_model_siatki
    nastepny_model_siatki = tymczasowa  # po obliczeniu wszystkich wartosci nastepny_model_siatki musimy przekazac je zmiennej 
                                        # model_siatki. W tym celu zamieniamy zmienne miejscami, tak aby model siatki
                                        # wskazywal dane z siatki nastepny_model_siatki i na odwrot


def policz_sasiadow(siatka, rzad, kolumna): # funkcja przyjmuje siatke oraz rzad i kolumne a zwraca liczbe zywych sasiadow danej komorki

   licznik = 0
   if rzad-1 >= 0:
       licznik = licznik + siatka[rzad-1][kolumna]
   if (rzad-1 >= 0) and (kolumna-1 >= 0):
       licznik = licznik + siatka[rzad-1][kolumna-1]
   if (rzad-1 >= 0) and (kolumna+1 < szer):
       licznik = licznik + siatka[rzad-1][kolumna+1]
   if kolumna-1 >= 0:
       licznik = licznik + siatka[rzad][kolumna-1]
   if kolumna + 1 < szer:
       licznik = licznik + siatka[rzad][kolumna+1]
   if rzad + 1 < wys:
       licznik = licznik + siatka[rzad+1][kolumna]
   if (rzad + 1 < wys) and (kolumna-1 >= 0):
       licznik = licznik + siatka[rzad+1][kolumna-1]
   if (rzad + 1 < wys) and (kolumna+1 < szer):
       licznik = licznik + siatka[rzad+1][kolumna+1]
   return licznik

if __name__ == '__main__':
    nastepne_pokolenie()