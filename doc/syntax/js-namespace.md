---
name: syntax/js-namespace
display: "js/ namespace"
related:
  - syntax/Math-namespace
  - special/.
  - cljs.core/aget
  - cljs.core/aset
---

## Usage
js/foo
js/foo.bar


## Details

A special namespace used for accessing any symbol defined
in JavaScript's global scope.


## Examples

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