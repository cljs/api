## Name
syntax/js-namespace

## Display
js/ namespace

## Usage
js/foo
js/foo.bar

## Description

A special namespace used for accessing any symbol defined
in JavaScript's global scope.

## Related
syntax/Math-namespace
special/.
cljs.core/aget
cljs.core/aset

## Example#06f234

The following examples are run from a browser REPL.

Get the JavaScript global `document` object:

```clj
js/document
;;=> #<[object HTMLDocument]>
```

Display an alert:

```clj
(js/alert "Hello World")
;; displays alert popup
```

Log to console:

```clj
(js/console.log "Hello World")
;; displays in developer console
```

Create a JavaScript date object:

```clj
(js/Date.)
;;=> #inst "2015-07-14T00:25:33.881-00:00"
```
