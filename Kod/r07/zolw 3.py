import turtle


dupa = turtle.Turtle()
dupa.color('blue')
dupa.penup()
dupa.setposition(-120,0)
dupa.pendown()
dupa.circle(100)

lew = turtle.Turtle()
lew.color('red')
lew.left(36)

smok = turtle.Turtle()
smok.right(100)

def narysuj_figure(dupa):
    for i in range(10):
        dupa.right(36)
        dupa.forward(80)

narysuj_figure(dupa)
narysuj_figure(lew)
narysuj_figure(smok)

print('helo')
turtle.mainloop()

