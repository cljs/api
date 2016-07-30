---
name: syntax/js-namespace
display as: "js/ namespace"
see also:
  - syntax/Math-namespace
  - special/.
  - cljs.core/aget
  - cljs.core/aset
---

## Summary

Use a JavaScript variable.

- `js/document` - the global document object
- `js/console.log` - the global console log function

## Details

Everything after the `js/` namespace is passed through to the compiled
JavaScript.

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
