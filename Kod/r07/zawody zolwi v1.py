import turtle
import random


zolwie = list()   

def ustawienia():         # tworzymy funkcje ustawienia żeby utworzyć żółwie i okreslic ich polozenie
    global zolwie
    start = -620          # zmienna start przechowuje wspolrzedna x linii startowej, której to wspolrzedne używamy poniżej
    ekran = turtle.Screen()        
    ekran.setup(1290, 720)
    ekran.bgcolor('yellow')  # dziwne bo nie dziala plik gif jako tlo


    zolw_pion = [-40, -20, 0, 20, 40]           # pokazuje wspolrzednie zolwia na starcie w pionie
    zolw_kolor = ['blue', 'red', 'purple', 'brown', 'green']   # wstepne wartosci atrybutow zolwie zapisane w dwoch listach

    for i in range(0, len(zolw_pion)):    # przechodzimy po wszystkich zolwiach
        nowy_zolw = turtle.Turtle()       # przy kazdej iteracji dokonamy instancjonowania nowego zolwia
        nowy_zolw.shape('turtle')
        nowy_zolw.penup()
        nowy_zolw.setpos(start, zolw_pion[i]) # nadajemy kazdemu zolwiowi pozycje z listy
        nowy_zolw.color(zolw_kolor[i]) # okreslamy tez jego kolor
        nowy_zolw.pendown()
        zolwie.append(nowy_zolw)              # dodajemy tego nowego zolwia do globalnej listy 'zolwie'
ustawienia()                                  # pamietamy o wywolaniu funckji ustawienia

def wyscig():
    global zolwie
    zwyciezca = False 
    meta = 590

    while not zwyciezca:             # wykonujemy petle az zmienna zwyciezca uzyska wartosc True
        for biezacy_zolw in zolwie:  # z kazda iteracja petli bedziemy iterowac po kazdym zolwiu
            ruch = random.randint(0,15)      # generujemy losowa liczbe i przesuwamy randomowego zolwia naprzod o tyle jednostek
            biezacy_zolw.forward(ruch)

            xcor = biezacy_zolw.xcor()     # pobieramy biezaca wspolrzedna x zolwia aby sprawdzic czy xcor > 590 (meta)
            if (xcor >= meta):             # porownujemy wartosc z meta
                zwyciezca = True 
                kolor_zwyciezcy = biezacy_zolw.color()               # uzywamy metody color do koloru zolwia, ktory zwyciezyl
                print('zwyciezca jest zolw', kolor_zwyciezcy[0])     # metoda color zwraca dwie wartosci, kolor pisaka i kolor wypelnienie.  Interesuje nas kolor pisaka dlatego wpisujemy [0]
                                                                   
wyscig()


turtle.mainloop()