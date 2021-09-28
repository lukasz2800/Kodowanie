def szczekanie(imie, waga):

    if waga > 10 and waga < 15:    
        print(imie, 'Robi Hau')

    elif waga > 15:
        print(imie, 'Wieje')

    else:
        print(imie, 'mruczy')

szczekanie('Mruczek',9)
szczekanie('Azor', 12)
szczekanie('Wicher', 22)

print('calkiem spoko poszlo')


def pobierz_szczekanie(waga):
    if waga > 10:
        return 'Hau miał'
    else:
        return 'lalala'
kodi_szczekanie = pobierz_szczekanie(40)
print('kodi szczeka', kodi_szczekanie)




