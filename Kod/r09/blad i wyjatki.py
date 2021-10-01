try:      # slowo kluczowe try
    nazwapliku = 'niemamnie.txt'  
    plik = open(nazwapliku, 'r')    
except FileNotFoundError:  # podajemy konkretny blad   #except bez konkretnego bledu wylapie wszystkie
    print('\n', 'Nastapil blad przy otwiraniu', nazwapliku, '\n') # blok kodu przy wystapieniu bledy
except IsADirectoryError:
    prinst('to nie plik tylko katalog')
else:
    print('udalo sie otworzyc plik')   # blok kodu jak wszytko jest ok
    plik.close()
finally:
    print('Wykonywany niezaleznie od okolicznosci')  #blok wyswietlany niezaleznie od tego cyz sie udalo czy nie