import requests, json, turtle       # importujemy modul requests, json i turtle

def rusz_iss(dlugosc, szerokosc):  # funkcja pobiera dlugosc i szerokosc
    global iss

    iss.penup()   # podnosimy pisaka
    iss.goto(szerokosc, dlugosc)
    iss.pendown()

ekran = turtle.Screen()
ekran.setup(1000, 500) # wielkosc ekranu
ekran.bgpic('C:/Users/lukasz.dyrda/Desktop/Kod/r10/earth.gif') # tlo 
ekran.setworldcoordinates(-180, -90, 180, 90)  # nanosimy uklad wspolrzednych na siatke, na ktorej znajduje sie ISS
 # mozemy okreslic polozenie iss na podstawie nowego ukladu wspolrzednych

iss = turtle.Turtle()
turtle.register_shape('C:/Users/lukasz.dyrda/Desktop/Kod/r10/iss.gif') # informujemy, ze chcemy uzyc obrazu jako ksztaltu
iss.shape('C:/Users/lukasz.dyrda/Desktop/Kod/r10/iss.gif') # nadajemy zolwiowi ksztal iss


url = 'http://api.open-notify.org/iss-now.json'  # przypisujemy adres uslugi zwracajacej wspolrzedne ISS zmiennej url

odpowiedz = requests.get(url) # obiekt odpowiedzi, uzywamy funkcji get przekazujac jej adres url, z ktorego chcemy pobrac dane

if (odpowiedz.status_code == 200): # sprawdzamy kod statusu aby upewnic sie czy wszystko jest ok (powinno byc 200)
    odpowiedz_slownik = json.loads(odpowiedz.text)  # przeksztalcamy JSONa w formie lancucha w slownik Pythona
    polozenie = odpowiedz_slownik['iss_position']  # pobieramy wartosc iss position, ktora ma forme slownika
    print('Wspolrzedne ISS to ' + '\n' + polozenie['latitude'] + ', ' + polozenie['longitude'])
    
    dlugosc = float(polozenie['latitude'])  # dodajemy float bo to liczby zmiennoprzecinkowe
    szerokosc = float(polozenie['longitude'])
    rusz_iss(dlugosc,szerokosc)

else:   # wyswietlami dlugosc i szerokosc geograficzna
    print('Huston mamy problem:', odpowiedz.status_code) # jezeli status jest zly to odpowiedź


turtle.mainloop()