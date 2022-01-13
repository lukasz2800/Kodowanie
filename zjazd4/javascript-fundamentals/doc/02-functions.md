Funkcje
=======

## Wprowadzenie do funkcji (`functions`)

- Funkcja to grupa instrukcji, która może być wielokrotnie używana
- Funkcje może być `nazwana` lub `anonimowa`
- Deklaracja funkcji:
    - słowo kluczowe `function`
    - opcjonalnie - nazwa funkcji
    - opcjonalnie - argumenty funkcji
    - ciało funkcji
    - opcjonalnie - zwracana wartość (`return`)

```
function name([param[, param,[..., param]]]) {
   [statements]
}
```

- Funkcje mogą deklarować dowolną ilość argumentów
- Funkcje mogą deklarować domyślne wartości argumentów
- Wywoływanie funkcji: nazwa z nawiasami okrągłymi i opcjonalnymi parametrami, np. `parseInt("1234")`
- Funkcje mogą być przekazywane jako argumenty do innych funkcji
- Funkcje mogą być zwracane przez funkcje
- Funkcje mogą rzucać (`throw`) wyjątki
- Przykłady: `samples/20[a,b,c,d,e]-functions`

## Funkcje predefiniowane wysokiego poziomu

`eval()`
`isFinite()`
`isNaN()`
`parseFloat()`
`parseInt()`
`decodeURI()`
`decodeURIComponent()`
`encodeURI()`
`encodeURIComponent()`

- Przykład: `samples/21-global-functions` 

https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects

## Przekazywanie argumentów do funkcji

- Argumenty przekazywane są do funkcji przez wartość, tzn. JavaScript wykonuje kopie przekazanej wartości
- `pass by value` dot. zmiennych podstawowych (np. `string`, `number`, `boolean`)
- Przykład: `samples/22a-pass-by-value` 

## Zasięg zmiennych (`scope`)

- Zmienne (`let`, `const`) są zmiennymi blokowymi
- Zmienne blokowe dostępne są w bloku, gdzie zostały zadeklarowane i poniżej

```
{ // blok 1
    { // blok 2
        { // blok 3

        }
    }
}
```

- Zmienna deklarowana poza funkcją to zmienna globalna
  - Unikaj tworzenie zmiennych globalnych!

```javascript
let a = 42;

function myFunction() {
    console.log(a);
}

myFunction();
```

- Zmienna deklarowana w funkcji to zmienna lokalna tej funkcji
  - Zmienna lokalna funkcji nie jest poza nią dostępna
  - Zmienne lokalne są usuwane po wykonaniu funkcji

```javascript
function myFunction() {
    var a = 42;
    console.log(a);
}

myFunction();
console.log(a);
```

- Przykład: `samples/22b-variable-scope`

Więcej informacji:

- https://dmitripavlutin.com/javascript-scope/

## `Arrow functions` - wprowadzenie

Wyrażenie `arrow function` jest kompaktową alternatywą dla tradycyjnego wyrażenia funkcji z kilkoma ograniczeniami.

- Tradycyjna funkcja:

```javascript
function (a) {
  return a + 100;
}
```

- `Arrow function`:

```javascript
(a) => a + 10
```

- Brak słowa `function`
- Dodaj strzałkę miedzy argumentami a ciałem funkcji
- Usuń słowo kluczowe `return`
- Nazwij funkcję, przez zapisanie jest w stałej:

```javascript
const add10ToNumber = (a) => a + 10 // deklaracja
add10ToNumber(20); // wywołanie
```

- Przykład: `samples/23-arrow-functions`
- Ćwiczenia: `excercises/23[a,b]-arrow-functions`

Więcej informacji: 

- https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Functions/Arrow_functions

## Domknięcia (`closures`)

- Domknięcie to funkcja, która ma dostęp do zmiennych i argumentów funkcji zewnętrznej, w której została utworzona, nawet po tym, jak zewnętrzna funkcja zakończyła działanie.
- Przykład: `samples/20f-clousure`

Więcej informacji:

- https://blog.bitsrc.io/a-beginners-guide-to-closures-in-javascript-97d372284dda

## Planowanie wykonania funkcji ('scheduling')

### setTimeout

- Wywołaj funkcję po upływie określonego czasu
- `samples/24a-setTimeout`

### setInterval

- Wywołuj funkcje co wskazany interwał
- `samples/25b-setInterval`

## Materiały dodatkowe

Więcej informacji:

- https://developer.mozilla.org/en-US/docs/Web/API/setTimeout
- https://developer.mozilla.org/en-US/docs/Web/API/setInterval
- https://javascript.info/settimeout-setinterval