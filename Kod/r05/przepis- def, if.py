def zrob_pucharek(lody='lody waniliowe', polewa='czekoladowa', orzeszki='True', banan='True', ciastko='False', bita_smietana='True'):
    przepis = 'lody', + 'lody' + ' i polewa' + '+ polewa' + ''
    if orzeszki:
        przepis = przepis + 'z orzeszkami'
    if banan:
        przepis = przepis + 'z bananem'
    if ciastko:                                   # cos nie dziala ten kod
        przepis + 'z ciastkiem'
    if bita_smietana:
        przepis + 'z bita smietana'
    else:
        przepis = przepis + 'bez bitej smietany'
    return przepis

pucharek = zrob_pucharek()  # zwraca Zamówiłeś pucharek: lody waniliowe(domyslne) i polewa czekoladowa(domyslne) z orzeszkami(domyslne) , bananem(domyslne) , bitą śmietaną.(domyslne)  
print('Zamowiles pucharek:', pucharek)

pucharek = zrob_pucharek('czekoladowe') # zmienia tylko domyslna wartosc dla lody na czekoladowe, reszta jw
print('zamowiles pucharek:', pucharek)

pucharek = zrob_pucharek(polewa='karmelowa', bita_smietana=False, banan=False) # zmienia wartosc polewy, bitej smietany i banana, reszta jw
print('zamowiles pucharek', pucharek)

pucharek = zrob_pucharek(bita_smietama=False, banan=True, ciastko=True, lody='orzechowe')
print('zamowiles pucharek', pucharek)
