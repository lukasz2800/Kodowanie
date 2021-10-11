import turtle

powolniak = turtle.Turtle()
powolniak.shape('turtle')
powolniak.color('blue')

maruda = turtle.Turtle()
maruda.shape('turtle')
maruda.color('red')

dupa = turtle.Turtle()
dupa.color('green')

abc = turtle.Turtle()
abc.color('yellow')

def narysuj_kwadrat(zolw):       # tworzymy wspolna funkcje dla obu zolwi
    for i in range(8):         # wykonuje 4 razy te same ruchy
        zolw.forward(100)
        zolw.right(45)

narysuj_kwadrat(powolniak)

maruda.right(90)
maruda.shape('turtle')
narysuj_kwadrat(maruda)

dupa.right(180)
narysuj_kwadrat(dupa)

abc.right(270)
narysuj_kwadrat(abc)




print('trzymaj zolwia')
turtle.mainloop()
