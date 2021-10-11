class Czlowiek:     # klase rozpoczynajmy z duzej litery dla rozroznienia pozwalaja na przechowywanie w sobie zbioru zmiennych i funkcji wewnatrz siebie
    imie ='Sebastian'   # kiedy funkcja znajduje sie wewnatrz klasy nazywamy ja metoda, obiektem w klasie Czlowiek moze byc konkretnie zdefiniowana osoba np Andrzej Duda
    wzrost ='190'
    kolor = 'zielony'
    
    def przedstaw_sie(self):   # self odwoluje sie do klasy czlowiek w kazdym obiekcie (self - wlasny)
            return 'Czesc, mam na imie', self.imie, self.wzrost, self.kolor

obiekt = Czlowiek()
print(obiekt.imie)
print(obiekt.wzrost)
print(obiekt.przedstaw_sie())

obiekt2 = Czlowiek()
obiekt2.imie = "Adrian Duda"
obiekt2.wzrost = '175'
obiekt2.kolor = 'czerwony'

print(obiekt2.przedstaw_sie())
