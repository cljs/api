---
name: syntax/uuid-literal
display as: "#uuid literal"
see also:
  - cljs.core/uuid
  - cljs.core/random-uuid
clojure doc: https://github.com/clojure/clojure/blob/master/changes.md#212-uuid-literals
edn doc: https://github.com/edn-format/edn#uuid-f81d4fae-7dec-11d0-a765-00a0c91e6bf6
---

## Summary

A universally unique identifier (UUID).  Randomly generate one with [doc:cljs.core/random-uuid].

- `#uuid "8-4-4-4-12"` - numbers represent the number of hex digits
- `#uuid "97bda55b-6175-4c39-9e04-7c0205c709dc"` - actual example

## Details

Uses the [doc:cljs.core/UUID] type.

Representing UUIDs with `#uuid` rather than just a plain string has the following benefits:

- the reader will throw an exception on malformed UUIDs
- its UUID type is preserved and shown when serialized to [edn].

To create a UUID from an evaluated expression, use [doc:cljs.core/uuid].

[edn]:https://github.com/edn-format/edn

## Examples

```clj
#uuid "00000000-0000-0000-0000-000000000000"
;;=> #uuid "00000000-0000-0000-0000-000000000000"

#uuid "97bda55b-6175-4c39-9e04-7c0205c709dc"
;;=> #uuid "97bda55b-6175-4c39-9e04-7c0205c709dc"

#uuid "asdf"
;; clojure.lang.ExceptionInfo: Invalid UUID string: asdf
```

Get as a string:

```clj
(def foo #uuid "97bda55b-6175-4c39-9e04-7c0205c709dc")
(str foo)
;;=> "97bda55b-6175-4c39-9e04-7c0205c709dc"
```

<!-- AUTO-GENERATED docfile links for github -->
[doc:cljs.core/UUID]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/UUID.md
[doc:cljs.core/uuid]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/uuid.md
