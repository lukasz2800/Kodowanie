from tkinter import *
import model

wielkosc_komorki = 5 
uruchomiony = False


def ustawienia():
    global okno_glowne, widok_siatki, wielkosc_komorki, przycisk_start, przycisk_wyczysc, wybor

    okno_glowne = Tk()
    okno_glowne.title('Gra w życie')

    widok_siatki = Canvas(okno_glowne, width=model.szer*wielkosc_komorki,
                             height=model.wys*wielkosc_komorki,
                             borderwidth=0,
                             highlightthickness=0,
                             bg='white')

    przycisk_start = Button(okno_glowne, text='Start', width=12)
    przycisk_start.bind('<Button->1', handler_start)  # chcemy wywolac funkcje button start kietd przycisk zostanie klikniety
                                                        # funkcja bind wywoluje zdarzenie gdy spelnimy warunek klikniecia lewego przycisku myszy
    przycisk_wyczysc = Button(okno_glowne, text='Wyczyść', width=12)

    wybor = StringVar(okno_glowne) 
    wybor.set('Wybierz wzorzec')
    opcja = OptionMenu(okno_glowne, wybor, 'Wybierz wzorzec', 'szybowiec', 'działo/szybowiec', 'losowy')
    opcja.config(width=20)

    widok_siatki.grid(row=0, columnspan=3, padx=20, pady=20) 
    przycisk_start.grid(row=1, column=0, sticky=W,padx=20, pady=20)
    przycisk_start.bind('<Button-1>', handler_start)
    opcja.grid(row=1, column=1, padx=20)
    przycisk_wyczysc.grid(row=1, column=2, sticky=E, padx=20, pady=20)


def handler_start(zdarzenie):
    global uruchomiony, przycisk_start

    if uruchomiony:
        uruchomiony = False
        przycisk_start.configure(text='Start')
    else:
        uruchomiony = True
        przycisk_start.configure(text='Pauza')
        aktualizacja()

def aktualizacja():
   global widok_siatki, okno_glowne, uruchomiony

   widok_siatki.delete(ALL)

   model.nastepne_pokolenie()
   for i in range(0, model.wys):
       for j in range(0, model.szer):
           if model.model_siatki[i][j] == 1:
                narysuj_komorke(i, j, 'black')
if (uruchomiony):
        okno_glowne.after(100, aktualizacja) #po 0,1 sekundy zaktualizuje sie

def narysuj_komorke(rzad, kolumna, kolor):
    global widok_siatki, wielkosc_komorki

    if kolor == 'black':
        outline = 'grey'
    else:
        outline = 'white'

    widok_siatki.create_rectangle(rzad*wielkosc_komorki,
                               kolumna*wielkosc_komorki,
                               rzad*wielkosc_komorki+wielkosc_komorki,
                               kolumna*wielkosc_komorki+wielkosc_komorki,
                               fill=kolor, outline=outline)

if __name__ == '__main__':
    ustawienia()
    model.losuj(model.model_siatki, model.szer, model.wys)
    aktualizacja()
    mainloop()
