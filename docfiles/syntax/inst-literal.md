---
name: syntax/inst-literal
display as: "#inst literal"
see also:
  - cljs.core/time
  - syntax/tagged-literal
clojure doc: https://github.com/clojure/clojure/blob/master/changes.md#211-instant-literals
edn doc: https://github.com/edn-format/edn#inst-rfc-3339-format
---

## Summary

Creates a JavaScript [Date] object using [RFC-3339] formatted string.

- `#inst "yyyy-mm-dd"` - date
- `#inst "yyyy-mm-ddThh:mm:ss"` - date and time
- `#inst "yyyy-mm-ddThh:mm:ssZ"` - specify UTC
- `#inst "yyyy-mm-ddThh:mm:ss-hh:mm"` - specify negative time zone offset
- `#inst "yyyy-mm-ddThh:mm:ss+hh:mm"` - specify positive time zone offset

[Date]:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date
[RFC-3339]:http://www.ietf.org/rfc/rfc3339.txt

## Details

## Examples

```clj
#inst "1985-04-12"
;;=> #inst "1985-04-12T00:00:00.000-00:00"

#inst "1985-04-12T23:20:50.52Z"
;;=> #inst "1985-04-12T23:20:50.520-00:00"
```

Dates can be tested for order, as native JavaScript Dates can:

```clj
(def a #inst "2005-01-20")
(def b #inst "2005-01-21")

(< a b)
;;=> true
```

Dates can be tested for equality, unlike JavaScript Dates.  (ClojureScript
extends `js/Date` type with `IEquiv` protocol to allow this.)

```clj
(def a #inst "2012-06-13")
(def b #inst "2012-06-13")

(= a b)
;;=> true
```
