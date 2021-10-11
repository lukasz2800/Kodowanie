import random
owoce = ('truskawka', 'banany')
polewa = ('z serkiem', 'z bita smietana')
ciasto = ('w tortili', 'na gofrze')
owoce = random.choice(owoce)
polewa = random.choice(polewa)
ciasto = random.choice(ciasto)
zdanie = owoce + ' ' + polewa + ' ' + ciasto
print(zdanie)
