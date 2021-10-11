try:
    nazwapliku = 'niemamnie.txt'  
    plik = open(nazwapliku, 'r')    
except: 
    print('\n', 'Nastapil blad przy otwiraniu', nazwapliku, '\n')
else:
    print('udalo sie otworzyc plik')
    plik.close()