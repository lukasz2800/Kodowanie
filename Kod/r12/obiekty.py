
class Pies:      # tworzymy klase o nazwie pies 
    def __init__(self, imie, wiek, waga):  # w pythonie konstruktorem klasy jest funkcja o nazwie __init__, pierwszy parametr zazwyczaj przyjmuje wartosc self
        self.imie = imie
        self.wiek = wiek
        self.waga = waga # w ciele konstruktora definiujemy kazdy z atrybutow obiektu: imie, wiek i waga przy uzyciu self

    def szczekanie(self): # zdefiniowalismy metode o takiej samej skladni jak funkcja, zawsze uzywamy self
        if self.waga > 10:  # gdy korzystamy z atrybutow obiektu
            print(self.imie, 'robi HAU HAU') # do metody szczekanie jako jej pierwszy argument zostaje przekazany obiekt,
        else:                                # na ktorym jest wywolywana(nie ma innych parametrow)
            print(self.imie, 'robi hauciu') # ponieważ zawsze przekazujemy jako pierwszy atrybut instancje,
                                            # na ktorej wywolywana jest metoda, mozemy uzyskac dostep do jej atrybutow
                                            # uzywajac parametru self

def wyswietl_psa(pies):  # funkcja, ktora wyswietla psy
    print(pies.imie, 'ma', pies.wiek, 'lat i wazy', pies.waga)


kodi = Pies('Kodi', 12, 18)  
fafik = Pies('Fafik', 9, 6)  # instancjonujemy dwa psy o roznych atrybutach i przekazujemy funkcji wyswietl psa

kodi.szczekanie()
wyswietl_psa(kodi)
wyswietl_psa(fafik)
