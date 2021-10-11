lista = [-5, 1, 2, 3, 4, 5]
najmniejsza = 0 
najwieksza = 0
for i in lista:
    if najmniejsza == 0 or najmniejsza > i:
        najmniejsza = i
    if najwieksza == 0 or najwieksza < i:
        najwieksza == i

print('najmniejsza liczba to', najmniejsza)
print('najwieksza liczba to', najwieksza)