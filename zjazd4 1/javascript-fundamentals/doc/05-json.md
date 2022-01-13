JSON
====

# Wprowadzenie

- JSON - JavaScript Object Notation
- JSON używa składni JavaScript ale jest formatem tekstowym
- JSON Wykorzystywany jest do wymiany danych między systemami
- JSON natywnie jest wspierany w JavaScript ale równiez w innych popularnych językach programowania

# Składnia

- Dane reprezentowane są przez pary nazwa i wartość
- Dane są odzielone przecinkami
- Nawiasy klamrowe określają obiekty
- Nawiasy kwadratowe określają tablice
- Wartości stringowe muszą być zapisane z uzyciem cydzysłowów
- Pliki zwykle mają rozszerzenie `.json`
- Type pliku to `application/json`

## JSON vs JavaScript

- Nazwy właściwości w JavaScript nie wymagają cudzysłowów
- W JSON nie mozna uzywać `undefined` czy `function`, `new Boolean()` itd.
- W JSON wspierany typy danych to: `string`, `number`, `object`, `array`, `boolean` lub `null`

# Obiekty

- Obiekty otoczone są nawiasami klamrowymi: `{}`.
- Właściwości muszą być łańcuchami znaków w cydzosłowiach
- Właściwości i wartości odzielone są dwukropkiem
- Pary właściwość i wartość odzielone są przecinkami

# Tablice

- Nawiasy kwadratowe określają tablice

# Obiekt wbudowany `JSON`

- `JSON.strigify()`
- `JSON.parse()`

Więcej informacji:

- https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON

# Przyklady

- `samples/json`
- https://json-generator.com/

# Ćwiczenia

- `excercises/35a-json`
- `excercises/35b-json`