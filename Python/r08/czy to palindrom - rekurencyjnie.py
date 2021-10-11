

def czy_to_paindrom(slowo):
    if len(slowo) <= 1:         # przypadek bazowy jezeli liczba liter w slowie <= 1 to na pewno jest palidromem
        return True
    else:
        if slowo[0] == slowo[-1]:         # jezeli pierwsza i ostatnia litera slowa sa takie same
            return czy_to_paindrom(slowo[1:-1])    # jezeli powyzsze sie zgadza to sprawdzamy czy srodkowe litery sa takie same ( mamy juz do tego funkcje)
        else:                                  # wywolujemy ta sama funkcje drugi raz
                return False              # jezeli nie to false

slowa = ['atokanapapanakota', 'radar', 'jak', 'rador',  'kaijak', 'ama']
for slowo in slowa:
    print(slowo, czy_to_paindrom(slowo))