---
name: cljs.core/uuid
see also:
  - cljs.core/random-uuid
  - syntax/uuid-literal
---

## Summary

## Details

Creates a universally unique identifier (UUID) from the given string, using the
[doc:cljs.core/UUID] type.

The string has an expected format `8-4-4-4-12` where the numbers represent the
number of hex digits.  No validation is performed.

To create a UUID literal (parsed and validated at compile time), use [doc:syntax/uuid-literal].

## Examples

```clj
(uuid "00000000-0000-0000-0000-000000000000")
;;=> #uuid "00000000-0000-0000-0000-000000000000"

(uuid "97bda55b-6175-4c39-9e04-7c0205c709dc")
;;=> #uuid "97bda55b-6175-4c39-9e04-7c0205c709dc"
```

No validation is performed:

```clj
(uuid "")
;;=> #uuid ""
```

<!-- AUTO-GENERATED docfile links for github -->
[doc:cljs.core/UUID]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/UUID.md
[doc:syntax/uuid-literal]:https://github.com/cljs/api/blob/master/docfiles/syntax/uuid-literal.md
