def jak_tam_dotrzec(kilometry):
    if kilometry > 200:
        print('samolotem')
    elif kilometry >= 3.0:
        print('samochodem')
    else:
        print('pieszo')

jak_tam_dotrzec(800.3)
jak_tam_dotrzec(.5)
jak_tam_dotrzec(3.0)


