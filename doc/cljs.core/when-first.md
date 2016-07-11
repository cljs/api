---
name: cljs.core/when-first
see also:
---

## Summary

## Details

With `bindings` as `x`, `xs`, roughly the same as `(when (seq xs) (let [x (first
xs)] body))` but `xs` is evaluated only once.

## Examples

## Signature
[bindings & body]
