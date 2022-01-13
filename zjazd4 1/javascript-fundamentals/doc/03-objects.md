Obiekty
=======

- Obiekty to typy danych składające się z właściwości (`properties`) i metod (`methods`)
- Obiekty są koncepcyjnie podobne do obiektów w świecie rzeczywistym: posiadają stan (`properties`) i zachowanie (`methods`)
- Obiekt to "kontener" na wartości
- Obiekty mogą przechowywać dowolny typ, w tym inne obiekty
- Tablice mogą przechowywać obiekty
- Obiekty mogą być przekazywane do funkcji i z niej zwracane

## Inicjalizacja nowego obiektu

```javascript
const car = {} // nawiasy klamrowe
```

- Przypisanie właściwości:

```javascript
car.manufacturer = "Mercedes";
```

- Dostęp do właściwości obiektu:

```javascript
console.log(car.manufacturer) // notacja kropki
```

- Deklaracja metody obiektu:

```javascript
car.drive = function(speed) {}; // deklaracja
car.drive(); // wywołanie metody
```

## `Object literal`

- Właściwości i metody obiektu mogą być zadeklarowane podczas deklaracji obiektu => `Object literal`
- Obiekt bez właściwości i metod:

```javascript
const person = {}; // pusty obiekt

console.log(typeof person);
console.log(person)
```

- Obiekt posiadający właściwości:

```javascript
const person = {name: 'John Doe', age: 42, favColors: ["red", "green", "blue"] };
```

Więcej informacji: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Object_initializer

## Dostęp do właściowości i metod

- Notacja kropki (`dot notation`)

```javascript
let personAsString = person.firstname + ' ' + person.lastname + ', age ' + person.age`    
```

- Notacja nawiasów kwadratowych (`brackets notation`):

```javascript
let personAsString = person['firstname'] + ' ' + person['lastname'] + ', age ' + person['age'];    
```

- Nieistniejące właściwości - `undefined`

W powyższy sposób możesz również zmieniać wartości:

    `person.firstname = 'Joa';`

Uwaga: Aby usunąć właściwość użyj słowa kluczowego `delete`:

    `delete person.age;`

## Dostęp do "własnych" właściwości i metod - `this`

- `this` nazywane jest obiektem, który jest właścicielem obiektu
- W obiekcie wartość `this` odnosi się do obiektu, w którym zostało użyte

```javascript
const person = {
    name: "John Doe",
    age: 42,
    toString: function() {
        return this.name + ", aged: " + this.age; // `this` w tym kontekście reprezentuje obiekt `person`
    }
}
```

*Uwaga*: W JavaScript słowo `this` ma inną wartość w zależności od kontekstu: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/this


## Wyświetlanie wszystkich właściwości obiektu

```javascript
const keys = Object.keys(o) // ["firstname", "lastname", "age", "fullName", "address", "favMovies"]
```

## Przykłady

- `samples/25a-objects`

## Przekazywanie obiektów do funkcji

- Obiekty mogą być przekazywane do funkcji

```javascript
let o = {name: "John Doe"}
let func = function(arg) {
    console.info(arg.name)
}
```

- Typy proste przekazywane są przez wartość (kopia)
- Obiekty zawsze są przekazywane przez referencje (adres w pamięci)
- Modyfikowanie obiektu przekazanego jako argument do funkcji modyfikuje oryginalny obiekt
- Przykład - `samples/25b-pass-by-reference`

## Porównywanie obiektów

- Obiekty to typy referencyjne, dwa różne obiekty nigdy nie są takie same nawet jeżeli mają te same właściwości

```javascript
let fruit1 = {name: "apple"};
let fruit2 = {name: "apple"};

fruit1 == fruit2 // return false
fruit1 === fruit2 // return false
```

- Porównywanie referencji:

```javascript
let fruit1 = {name: "apple"};
let fruit2 = {name: "apple"};

fruit1 = fruit2 // fruit1 i fruit2 to te same referencje

fruit1 == fruit2 // return true
fruit1 === fruit2 // return true
```

Przydatne informacje:

- https://www.delftstack.com/howto/javascript/compare-objects-javascript/
- https://masteringjs.io/tutorials/fundamentals/compare-objects


## Klasa `Object`

- Klasa `Object` zawiera wiele metod pomocniczych
- Najbardziej przydatne to:
  - `Object.assign()`
  - `Object.freeze()`
  - `Object.keys()`
  - `Object.values()`

Więcej informacji:

- https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object

## Ćwiczenie praktyczne

- `excercises/25a-objects`
- `excercises/25b-objects`

## Konstruktor obiektu (`function constructor`)

- `Object literal` dostarcza mozliwości tworzenia jedynie pojedynczego obiektu
- `Function constructor` dostarcza mozliwość tworzenia szablonów obiektów:

```javascript
function Person(first, last, age) {
  this.firstName = first;
  this.lastName = last;
  this.age = age;
}
```

Aby utworzyć obiekt klasy `Person`, nalezy wywołać funkcję z operatorem `new`:

```javascript
let john = new Person('John', 'Doe', 21);
let jane = new Person('Jane', 'Doe', 20);
```

- Nowoczesną alternatywą dla są klasy
- Przyłady - `samples/25c-function-constructor`
