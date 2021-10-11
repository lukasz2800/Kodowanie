import requests, json, turtle

iss = turtle.Turtle()

def ustawienia(okno):
    global iss

    okno.setup(1000, 500)
    okno.bgpic('C:/Users/lukasz.dyrda/Desktop/Kod/r10/earth.gif')
    okno.setworldcoordinates(-180, -90, 180, 90)
    turtle.register_shape('C:/Users/lukasz.dyrda/Desktop/Kod/r10/iss.gif')
    iss.shape('C:/Users/lukasz.dyrda/Desktop/Kod/r10/iss.gif')

def rusz_iss(dlugosc, szerokosc):
    global iss

    iss.penup()
    iss.goto(szerokosc, dlugosc)
    iss.pendown()

def sledz_iss():

    url = 'http://api.open-notify.org/iss-now.json'
    odpowiedz = requests.get(url)
    if (odpowiedz.status_code == 200):
        odpowiedz_slownik = json.loads(odpowiedz.text)
        polozenie = odpowiedz_slownik['iss_position']
        dlugosc = float(polozenie['latitude'])
        szerokosc = float(polozenie['longitude'])
        rusz_iss(dlugosc, szerokosc)
    else:
        print('Huston mamy problem', odpowiedz.status_code)

    widget = turtle.getcanvas()
    widget.after(5000, sledz_iss)  # odswiezanie co 5 sekund

def main():
    global iss
    ekran = turtle.Screen()
    ustawienia(ekran)
    sledz_iss()

if __name__ == '__main__':
    main()
    turtle.mainloop()