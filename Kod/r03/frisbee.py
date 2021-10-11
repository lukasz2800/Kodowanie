class Pies:
    def __init__(self, imie, wiek, waga):
        self.imie = imie
        self.wiek = wiek
        self.waga = waga

    def szczekanie(self):
        if self.waga > 10:
            print(self.imie, 'robi "HAU, HAU"')
        else:
            print(self.imie, 'robi "hau, hau"')

    def ludzkie_lata(self):
        wiek_w_ludzkich_latach = self.wiek * 7
        return wiek_w_ludzkich_latach 

    def __str__(self):
        return "Jestem psem o imieniu" + self.imie

class PiesTowarzyszacy(Pies):
    def __init__(self, imie, wiek, waga, opiekun):
        Pies.__init__(self, imie, wiek, waga)
        self.opiekun = opiekun
        self.pelni_sluzbe = False

    def chodzenie(self):
         print(self.imie, 'i jego opiekun', self.opiekun, 'wychodzą na spacer')

    def szczekanie(self):
        if self.pelni_sluzbe:
            print(self.imie, 'mówi: "Nie mogę szczekać, bo jestem na służbie"')
        else:
            Pies.szczekanie(self)

class Frisbee:
    def __init__(self, kolor):
        self.kolor = kolor
    def __str__(self):
        return 'Jestem frisbee a moj kolor to' + self.kolor
        

class PiesAportujacy(Pies):
    def __init__(self, imie, wiek, waga):
        Pies.__init__(self, imie, wiek, waga)
        self.frisbee = None
    
    def szczekanie(self):
        if self.frisbee != None:
            print(self.imie, ' Hau hau')
        else:
            Pies.szczekanie(self)

    def lapanie(self, frisbee):
        self.frisbee = frisbee
        print(self.imie, 'zlapal frisbee w kolorze', frisbee.kolor + 'm')

    

rufus = PiesAportujacy('Rufus', 8, 12)
niebieskie_frisbee = Frisbee('niebieski')
rufus.lapanie(niebieskie_frisbee)
print(frisbee)