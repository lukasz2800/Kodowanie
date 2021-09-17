import random
losowa_liczba = random.randint(0, 2)
print(losowa_liczba)

if losowa_liczba == 0:
    wybór_komputera = 'kamień'

elif losowa_liczba == 1:
    wybór_komputera = 'papier'

else:
    wybór_komputera = 'nożyce'

wybór_użytkownika = input('kamień, papier czy nożyce? ')
print('Wybrałeś', wybór_użytkownika + ', a komputer wybral ', wybór_komputera)
