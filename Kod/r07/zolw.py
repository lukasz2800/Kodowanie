import turtle                         # importuje modul turtle
powolniak = turtle.Turtle()           # pokazuje/tworzy  zółwia

powolniak.shape('turtle')             # nadaje zolwiowi ksztal zółwia




powolniak.right(90)
powolniak.forward(100)                # nakazuje zółwiowi ruszyc do przodu w kierunku zwrotu o 100 jednostek
powolniak.right(90)                   # odwraca zolwia o 90 stopni w prawo
powolniak.forward(100)
powolniak.right(90)
powolniak.forward(100)                
powolniak.right(90)                   
powolniak.forward(100)
powolniak.right(90)

input('trzymaj zolwia')
turtle.mainloop()
