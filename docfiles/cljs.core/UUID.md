---
name: cljs.core/UUID
see also:
  - syntax/uuid-literal
  - cljs.core/random-uuid
  - cljs.core/uuid
---

## Summary

## Details

A type representing a universally unique identifier ([UUID]).

Use [doc:cljs.core/uuid] or [doc:syntax/uuid-literal] to create one.

[UUID]:https://en.wikipedia.org/wiki/Universally_unique_identifier

## Examples

```clj
;; Can be used to generate UUIDs but cljs.core/uuid is preferred
(UUID. (str (random-uuid)))
=> #uuid "d9b3d2a1-3f2a-4662-ae48-bfd7fe39e2a6"

;; UUID allows manual setting of hash values, which can make two otherwise
;; identical UUIDs no longer equal
(def nil-uuid #uuid "00000000-0000-0000-0000-000000000000")
(def custom-hash-nil-uuid (UUID. #uuid "00000000-0000-0000-0000-000000000000" 13))

(= nil-uuid #uuid "00000000-0000-0000-0000-000000000000")
=> true

(= custom-hash-nil-uuid #uuid "00000000-0000-0000-0000-000000000000")
=> false

(hash custom-hash-nil-uuid)
=> 13

(hash nil-uuid)
=> 1297391103

```

<!-- AUTO-GENERATED docfile links for github -->
[doc:syntax/uuid-literal]:https://github.com/cljs/api/blob/master/docfiles/syntax/uuid-literal.md
[doc:cljs.core/uuid]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/uuid.md
