---
name: clojure.string/replace-first
---

## Signature
[s match replacement]


## Details

Replaces the first instance of `match` with `replacement` in `s`.

The options for match / replacement are:

| match  | replacement |
|--------|-------------|
| string | string      |
| regex  | string      |
| regex  | function    |
