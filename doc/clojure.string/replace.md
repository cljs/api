---
name: clojure.string/replace
related:
  - cljs.core/subs
  - clojure.string/split
  - clojure.string/replace-first
---

## Signature
[s match replacement]


## Description

Replaces all instance of `match` with `replacement` in `s`.

The options for match / replacement are:

| match  | replacement |
|--------|-------------|
| string | string      |
| regex  | string      |
| regex  | function    |
