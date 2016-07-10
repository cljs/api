---
name: cljs.core/when-first
---

## Signature
[bindings & body]


## Description

With `bindings` as `x`, `xs`, roughly the same as `(when (seq xs) (let [x (first
xs)] body))` but `xs` is evaluated only once.


## TODO

This needs better explanation + examples.