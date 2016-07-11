---
name: syntax/inst-literal
display: "#inst literal"
see also:
  - cljs.core/time
  - syntax/tagged-literal
---

## Summary

## Details

An instant in time, using a [RFC-3339] formatted string. Creates a JavaScript [Date] object.

The format is `#inst "yyyy-mm-ddThh:mm:ss"`, where:

- `yyyy-mm-dd` = date
- `hh:mm:ss` = time (optional)

Append `Z` to denote UTC, or `-hh:mm` to denote exact UTC offset.

[Date]:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date
[RFC-3339]:http://www.ietf.org/rfc/rfc3339.txt

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

## Usage
#inst "yyyy-mm-dd"
#inst "yyyy-mm-ddThh:mm:ss"
#inst "yyyy-mm-ddThh:mm:ssZ"
#inst "yyyy-mm-ddThh:mm:ss-hh:mm"
