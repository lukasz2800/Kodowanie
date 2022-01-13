Podstawy
========

# Kod źródłowy

- Program, kod źródłowy, kod - to zbiór instrukcji, które komputer ma wykonać w celu wykonania konkretnego zadania
- Kod musi mieć prawidłową strukturę, aby się wykonał - `syntax`

## JavaScript w konsoli przeglądarki

- Konsola Chrome / Firefox
    - Jak używać konsoli JavaScript w Chrome?
    - Wyświetlanie danych - `console`, `alert`
    - Pobieranie danych - `prompt`
- Przykład: `samples/01-interacting-with-webpage`


## Instrukcje (Statements)

- Grupa słów kluczowych, liczb, czy operatorów opisujących zadanie do wykonania:
    
    - Przypisanie -  `let x = 41 + 2;`    
    - Wywołanie - `alert("JS");`    
    - Powrót - `return 5;`
    - Instukcje warunkowe - `if (x == 42) {}`    
    - Pętla - `while(x < 42) {}`

- Zmienne
- Operatory wykonujące akcje na zmiennych lub wartościach (operacje matematyczne) oraz służące do porównywania zmiennych
- Średnik używany jest do oddzielania kolejnych instrukcji od siebie `;`

## Literals

- Literały to stałe wartości w kodzie, takie jak:
  - Liczba: `42`, `3.14`
  - Łańcuch znaków: `"Łańcuch znaków"`, `'Łańcuch znaków'`

## Wyrażenia (Expression)

- Instrukcje tworzone są przez jedno lub wiele wyrażeń
- Wyrażenie to kombinacja wartości, zmiennych, operatorów, funkcji realizującej zadanie

`2 + 5` -  to wyrażenie, które ewaluuje do wartości `5`
`5 > 5` -  to wyrażenie, które ewaluuje do wartości `false`
`5 == 5` - to wyrażenie, które ewaluuje do wartości `true`

## Wykonanie programu

- Zbiór instrukcji jest wykonywany przez silnik JavaScript
- Silnik wykonuje kilka kroków w celu uruchomienia kodu:
    - Parsuje i optymalizuje kod
    - Konwertuje go to kodu binarnego zrozumiałego przez kompilator
    - Wykonuje ten kod
    
## Edytory / IDE

- Visual Studio Code
    - Zainstaluj VSCode: https://code.visualstudio.com
    - Uruchom i wybierz folder projektu (`File > Open`)
- Inne
  - WebStorm
  - Atom

## Dokumentacja

- JavaScript: ucz się z oficjalnych źródeł: https://developer.mozilla.org/en-US/docs/Web/JavaScript
- Narzędzia programisty w `Chrome` - oficjalna dokumentacja: https://developer.chrome.com/docs/devtools/
  

## Ćwiczenia w konsoli `Chrome`

- Otwórz przeglądarkę `Chrome`
- Otwórz narzędzia programisty i przejdź do konsoli
- Wykonaj kilka poleceń (`Enter` wykonuje polecenie):

```javascript
let greetings = "Hello, World";

console.log(greetings)

console.log(10 + 10 * 20)

alert(42 / 0)

let firstName = "John"
let lastName = "Doe"
let fullName = firstName + lastName;

console.log(fullName)
```

- Przydatne skróty klawiczowe w konsoli:
  - `Enter` - wykonaj polecenie
  - `Ctrl + L` - wyczyszczenie konsoli
  - `Arrow Up / Down` - przewijaj polecenia 


# Quokka.js

- Zainstaluj rozszerzenie Quokka.js dla VSC: https://marketplace.visualstudio.com/items?itemName=WallabyJs.quokka-vscode
- Dokumentacja projektu: https://quokkajs.com/docs/
- Utwórz nowy plik i eksperymentuj z JavaScript

```javascript
let greetings = "Hello, World";

console.log(greetings)

console.log(10 + 10 * 20)

let firstName = "John"
let lastName = "Doe"
let fullName = firstName + lastName;

console.log(fullName)
```

# JavaScript - Wprowadzenie

## Dołączanie skryptu do dokumentu HTML

- Skrypty mogą być dołączanie w sekcji `head` lub `body`
  - `<script src="app.js"></script>`

## Komentarze (`comments`)

- Komentarze są ignorowane podczas wykonywania programu
- `//`
- `/* */` - komentarze blokowe

## Zmienne (`variables`)

- Zmienne pozwalaja na przechowanie wartości, do której później można się odwołać
- Wartości zmiennych moga się "zmieniać" w trakcie wykonywania programu
- Zmienne deklarujemy z użyciem słowa kluczowego `let`
    - `let` używamy do deklaracji zmiennej z ograniczeniem zasięgu do bloku, w którym są zadeklarowane (o zasięgu zmiennych w dalszej części). `let` zostało wprowadzone w ES6.
- Nazewnictwo zmiennych
    - Zmienne są czułe na wielkość liter
    - Nie może rozpoczynać się od liczby
    - Nie może mieć spacji w nazwie
    - Nie może używać słów zarezerwowanych (np. `if`, `case`, `switch` itd.)
    - Używaj nazewnictwa `camelCase` dla złożonych nazw zmiennych    
- Przykład: `samples/03-variables`
- Ćwiczenie: `excercises/01-variables`

## Stałe

- `const` - stała z zasięgiem blokowym
- Stała po zainicjowaniu nie może zmienić wartości
- Przykład: `samples/04-const`
- Ćwiczenie: `excercises/02-const`

## Typy podstawowe (`data types`)

- Każde wyrażenie zwraca wartość, która ma określony typ
- Typy podstawowe
    - `string`
    - `number`
    - `boolean`
    - `undefined`
    - `null`
- Określanie typu - `typeof` (operator typu)
- Przykład: `samples/05-data-types`
- Ćwiczenie: `excercises/03-data-types`

### Łańcuchy znaków (`string`)

- String przechowuje uporządkowaną listę znaków
- Przypisanie wartości - `let s = "s"`
- Właściowość `length` zwraca długość ciągu
- Każdy znak ma określony index rozpoczynający się od `0`
- Deklaracja zmiennej: `let x = 'TEST'` lub `let x = "TEST"`
- Escape character 
    - `\`, przykład: `let a = "Escape \"quotes\""`
    - `\t`, `\n`, `\r`
- Przykład: `samples/06-string`
- Ćwiczenia: `excercises/06a-string`, `excercises/06b-string`


### Liczby (`number`)

- JavaScript posiada 1 typ liczbowy
- Liczby zapisujemy z informacją dziesiętną lub bez niej
- Przypisanie wartości liczbowej - `let n = 10`
- Liczby zawsze zapisywane są w reprezentacji 64-bitowej
- Liczba moze być obiektem: `new Number("s")`
- Uwaga: łańcuchy znaków (string) mogą mieć reprezentację liczbową:
- Przykład: `samples/07-number`

```javascript
let x = 100;
let y = "10";
let z = x / y;  // z = 10
```

- W JavaScript istnieje zarezerwowane słowo `NaN` oznaczające `Not a Number`:

```javascript
let x = 100 / "X";  // x will be NaN (Not a Number)
```
- Jest też zarezerwowane słowo `Infinity` oznaczające nieskończoność. Np. wynik dzielenia przez zero będzie równy `Infinity`

- Ćwiczenie: `excercises/07-number`

### Wartości logiczne (`boolean`)

- Przypisanie wartości logicznej - `let b = true`
- Typ logiczny moze mieć tylko 2 wartości: `true` i `false`
- Wszystko co ma wartość jest `true`
- Wszystko co nie ma wartości lub jest `null`, `undefined`, `0`, `""`, `NaN` - jest `false`
- Boolean moze być obiektem: `new Boolean("s")`
- Przykład: `samples/08-boolean`

### Wartość niezdefiniowana (`undefined`)

- `undefined` to prosta wartość nadana zmiennym właśnie co zadeklarowanym

```javascript
let x;

console.log("x's value is", x)  // logs "x's value is undefined"
```

- Przykład: `samples/09-undefined`

### `null`

- `null` to intencjonalna wartość prosta nadawana obiektom bez wartości

```javascript
let x = null;
```
- Przykład: `samples/10-null`

## Operatory (`operators`)

- Operatory w JavaScript
    - Przypisanie - `=`, `+=` i inne
    - Operatory arytmetyczne - w tym `++` i `--`
    - Operatory porównania - `==`, `===`, `>`
    - Operatory logiczne - `&&`, `||`, `!`
    - Operatory typów - `typeof`, `instanceof`

- Pierwszeństwo operatorów - https://developer.mozilla.org/pl/docs/Web/JavaScript/Referencje/Operatory/Pierwsze%C5%84stwo_operator%C3%B3w

- Przykład: `samples/11-operators`
- Ćwiczenie: `excercises/11-operators`

## Konwersja typów (`type conversion`)

- JavaScript jest językiem dynamicznie typowanym (wartość ma określony typ - nie zmienna)
- Konwersja automatyczna
    - `"40" + 2 = "402"`
    - `"37" - 7 = 30`
    - `"1" / 5  = 0.2`
- Dzięki funkcjom konwertującym istnieją nieograniczone możliwościa konwertowania między różnymi typami
    - `Boolean()`, `Number()`, `String()`
    - `parseInt()`, `parseFloat()`

- Przykład: `samples/12-type-conversion`

## Instrukcje warunkowe (`conditions`)

### Porównania

- Operatory porównania są wykorzystywane w wyrazeniach logicznych
    - `==`, `===`, `!=`, `!==`, `>=`, `=<`, `<`, `>`

```javascript
if (age < 18) { 
    console.log("Too young");
}
```

- Operatory logiczne:
    - Operator logiczny `AND`: `(x < 10 && y > 1)`
    - Operator logiczny `OR`: `(x == 5 || y == 5)`
    - Operator logiczny `NOT`: `!(x == y)`
- Tablice "prawdy": https://en.wikipedia.org/wiki/Truth_table
- Częsty błąd - mylenie operatora przypisania z operatorem porównania
  - Kiedy tylko możesz używaj `===`

### Istnienie zmiennych

- `let a; if (a) {}`
- `let a = null; if (a) {}`
- `let a = "test1"; if(a) {}`
- `let a = 0; if(a) {}` => `let a = 0; if (a || a === 0) {}` 
- `let a; if (a === undefined) {}`
- `let a; if (a == null) {}`
- `let a; if (a === null) {}`
- `let a = null; if (a === null) {}`

- Przykład: `samples/13-comparisons`
- https://developer.mozilla.org/en-US/docs/Web/JavaScript/Equality_comparisons_and_sameness
- Kilka przykładów
    - `"0" == 0` to `true` ale `"0" === 0` to `false`
    - `false == 0` to `true` ale `false === 0` to `false`    
    - `false < 0` to `false'
    - `undefined == 0` to `false`
    - `null < 1` to `true`
    - `"" = 0` to `true`
- Operatory logiczne
    - `&&`, `||`, `!`

### Wyrażenie `if`

- Pseudokod:

```
if (condition)
   statement1
[else
   statement2]
```

- Przykład: `samples/14-if`
- Ćwiczenie: `excercises/14a-if`, `excercises/14b-if`

### Wyrażenie `switch`

- Pseudokod:

```
switch (expression) {
  case value1:
    // Statements executed when the result of expression matches value1
    [break;]
  case value2:
    // Statements executed when the result of expression matches value2
    [break;]
  ...
  case valueN:
    // Statements executed when the result of expression matches valueN
    [break;]
  [default:
    //Statements executed when none of the values match the value of the expression
    [break;]]
}
```
- Przykład: `samples/15-switch`
- Ćwiczenie: `excercises/15-switch`


## Tablice (`arrays`) - wprowadzenie

- Tablica przechowuje uporządkowaną listę wartości dowolnego typu:

```javascript
var arr = [1, 2, 3];
var colors = ['red', 'green', 'blue'];

```
- Tablice są obiektamy, które uzywają indeksów numerowanych
- Rozmiar tablicy - `length`

```javascript
console.log(arr.length)
```

- Dostęp do elementów tablicy poprzez indeks - `var red = colors[0];`
- Zmiana elementów tablicy - `colors[1] = 'purple'`
- Dodawanie elementów
    - Poprzez index  - `colors[4] = 'black'`
    - Metoda `push` - `colors.push('white')`

- Przykład: `samples/16a-arrays`

### for...of

- Pętla dla obiektów iterowalnych, w tym tablic:

```
for (let variable of iterable) {
  statement
}
```
- Przykład: `samples/17a-for-of`

## Klasyczne pętle

### Pętla `for`

- Pętla `for` jest zwykle używana, gdy liczba iteracji jest z góry znana
- Przerywanie wykonania pętli - `break`

```
for ([initialization]; [condition]; [final-expression])
   statement
```
- Przykład: `samples/17b-for`


### Pętla `while`

- Pętla `while` jest zwykle używana, gdy liczba iteracji nie jest z góry znana

```
while (condition)
  statement
```

- Przykład: `samples/18-while`

### Pętla `do..while`

- Pętla `do..while` jest używana, gdy chcemy aby pierwsza instrukcja była zawsze wykonana. Poza tym działa jak `while`

```
do
   statement
while (condition);
```
- Przykład: `samples/19-do-while`


## Wyjątki

- Kod w trakcie wykonania może "rzucać" wyjątki. Użyj słowa kluczowego `throw`
- Wyjątek rzucany z funkcji może być dowolnym obiektem
- Obsługa sytuacji wyjątkowych w kodzie realizowana jest za pomocą bloku `try...catch...finally`:

```
try {
  try_statements
}
catch (exception_var) {
  catch_statements
}
finally {
  finally_statements
}
```

Więcej informacji:

- https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/try...catch
