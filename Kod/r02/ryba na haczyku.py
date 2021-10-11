def ryba_na_haczyku():
    print("Złapałem rybę! ")

def czekaj():
    print('czekam ')
        
     print('biorę robaka')
     print('zakladam robaka na haczyk')
     print('zarzucam przynete')

    while True:
        odpowiedz = input('czy splawik jest pod woda? ')
        if odpowiedz == 'tak':
            return ryba_na_haczyku
            
        else:
            czekaj()
