DOM (Document Object Model) - Podstawy
======================================

https://developer.mozilla.org/en-US/docs/Web/API/Document_Object_Model

## Wprowadzenie

- DOM (ang. `Document Object Model`, obiektowy model dokumentu) to API dla dokumentów `HTML` (oraz `XML`).
- DOM Wprowadza strukturalne odwzorowanie dokumentu, pozwalając modyfikować jego zawartość i warstwę prezentacji. 
- DOM to serce każdej strony internetowej
- DOM tworzony jest po załadowaniu dokumentu HTML
- DOM reprezentowany jest przez obiekt `document`
- Metody HTML DOM to akcje, które mogą być wykonywane na elementach HTML 
- Właściwości HTML DOM to wartości, które mogą być dodawane, usuwane lub zmieniane

## DOM Inspektor w Chrome

- https://codeleak.pl/web-samples/01-html/10-html5-test-page.html

Więcej informacji:

- https://developer.chrome.com/docs/devtools/

## Podstwowe typu w DOM

- `document` i `window` objects są podstawowymi obiektami, których używa się w programowaniu w DOM

### `Document`

- Obiekt reprezentuje załadowany dokument w oknie przeglądarki
- Daje dostęp do całej treści poprzez drzewo obiektów
- `samples/dom/01a-document`

Więcej informacji:

- https://developer.mozilla.org/en-US/docs/Web/API/Document

### `window`

- Obiekt `window` reprezentujący okno zawierające dokument DOM.
- `samples/dom/01b-window`

Więcej informacji:

- https://developer.mozilla.org/en-US/docs/Web/API/Window

### `HTMLElement`

- `HTMLElement` jest generyczną klasą reprezentującą elementy HTML w dokumencie
- Wyspecjalizowane klasy dziedziczą właściwości `HTMLElement`
- `samples/dom/01c-element`

Więcej informacji:

- https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement
- https://developer.mozilla.org/en-US/docs/Web/API/HTML_DOM_AP

### `Event`

- `Event` reprezentuje zdarzenia zachodzące w DOM
- Zdarzenie może być wywołane przez kliknięcie myszą, naciśnięcie klawisza itp.
- Zdarzenie moze być wywołane programistycznie
- Wiele elementów DOM pozwala na rejestrowanie obsługi zdarzeń i wykonywanie kodu w odpowiedzi na konkretne zdarzenie
- `samples/dom/01d-event`

Więcej informacji:

- https://developer.mozilla.org/en-US/docs/Web/API/Event
- https://developer.mozilla.org/en-US/docs/Web/API/EventTarget

### Wszystkie interfejsy DOM

- Interfejsy DOM: https://developer.mozilla.org/en-US/docs/Web/API/Document_Object_Model#dom_interfaces

## API DOM

### Wyszukiwanie oraz właściwości elementów

- DOM pozwala na łatwe odnajdowanie elementów w dokumencie
  - `document.querySelector()`
  - `document.querySelectorAll()`
  - `document.getElementById()`
- Punktem wejścia do wyszukiwania elementów jest obiekt `document`
- DOM pozwala na odczytywania dowolnych właściwości elementów
- Przykład`samples/dom/02a-find-elements`

### Manipulacja dokumentem

- DOM pozwala na dynamiczną modyfikację zawartości dokomentu
- Cały dokument jak również poszczególne elementy mogą być dynamicznie modyfikowane
- DOM pozawala na modyfikację większości właściwości i atrybutów poszczególnych elementów
  - `document.createElement()`
  - `parentNode.appendChild(node)`
  - `element.addEventListener()`
  - `element.setAttribute()`
- Przykłady: 
  - `samples/dom/02a-alter-element-properties`
  - `samples/dom/02b-add-remove-elements`

### Zdarzenia w DOM

- Rejestracja obsługi zdarzeń poprzez atrybut elementu HTML
- Rejestracja obsługi zdarzeń za pomocą metody `addEventListener()`
- Rejestracja obsługi zdarzeń za pomocą atrybutów `onclick`, `onblur` itd.
- Obsługa zdarzenia - obiekt `event`:
  - Blokowanie automatycznej akcji: `event.preventDefault()` (np. wysyłania formularza)
  - Pobieranie elementu, na którym miało miejsce zdrzenie: `event.target`
- Przykład: `samples/dom/03-events`

Więcej informacji:

- Event bubbling - https://javascript.info/bubbling-and-capturing
- Zdarzenia -  https://developer.mozilla.org/en-US/docs/Web/Events#event_listing

## Ćwiczenia

- `excercises/dom`
