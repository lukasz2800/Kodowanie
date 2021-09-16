
import random
liczba_losowa = random.randint(0,2)


if liczba_losowa == 0:
    wybór_komputera = 'kamień'

elif liczba_losowa == 1:
    wybór_komputera = 'papier'
    
else:
    wybór_komputera = 'nożyce'

print('Komputer wybrał' + ' ' + wybór_komputera)
83
