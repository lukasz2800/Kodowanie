for i in range(0, 1000): # szukamy
    nazwa_pliku = lancuch(i) + '.txt'    # kod do wyszukiwania igly
    plik = open(nazwa_pliku, 'r')
    tekst = plik.read()
    if 'igla' in tekst:
        print('znalazlem igle w pliku', + lancuch(i) + '.txt')
        break  #  po znalezieniu igly uzyjemy funkcji break do pominiecia reszty kodu i wyjscia z petli(petla przerwana)
    plik.close()
    print('zakonczono wyszukiwania')
