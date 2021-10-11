import turtle



def ustawienia(pisak):           # funkcja ustawienia okresla kolo zolwia, ktorego nazywamy pisakiem, przenosi go do
    pisak.color('blue')          # bardziej centralnej pozycji
    pisak.penup()
    pisak.goto(-200, 100)
    pisak.pendown()
    

def koch(pisak, rozmiar, skala):   # funkcja koch przyjmuje 3 argumenty
    if skala == 0:                 # <--- nasz przypadek bazowy. Jesli skala = 0, rysujemy prosta linie 
        pisak.forward(rozmiar)     # o dlugosci rownej parametrowi rozmiar
    else:
        for kat in [60, -120, 60, 0]:     # w przeciwnym razie wywolujemy funkcje czterokrotnie przekazujac jej  
            koch(pisak, rozmiar/3, skala-1) # parametr rozmiar podzielony 3 krotnie  i skala pomniejszony o 1
            pisak.left(kat)  # po kazdym wywolaniu funkcji koch zmieniamy kat obrotu zolwia

def main():                  # funkcja glowna main() tworzy zolwia czyli pisak
    pisak = turtle.Turtle()  # definiuje dwie zmienne skala i rozmiar
    ustawienia(pisak)
    turtle.tracer(100)

    skala = 5
    rozmiar = 400
    for i in range(3):
        koch(pisak, rozmiar, skala) # funkcja main() wywoluje funkcje rekurencyjna przekazujac 3 argumenty 
        pisak.right(120)

if __name__ == '__main__': # wywolujemy funkcje glowna
    main()
    turtle.tracer(100)       # uruchamiamy petle zolwia, tracer przyspiesza ruchy zolwia
    turtle.mainloop()
