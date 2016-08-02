---
name: cljs.core/defn
see also:
  - cljs.core/def
  - cljs.core/defn-
  - cljs.core/defmacro
  - cljs.core/fn
---

## Summary

## Details

Defines a function.

`doc-string?` is an optional documentation string.

`attr-map?` is an optional map of [metadata](http://clojure.org/metadata) to
attach to the global variable name.

`prepost-map?` is an optional map with optional keys `:pre` and `:post` that
contain collections of [pre or post conditions](http://blog.fogus.me/2009/12/21/clojures-pre-and-post/)
for the function.

<table class="code-tbl-9bef6">
  <thead>
    <tr>
      <th>Code</th>
      <th>Expands To</th></tr></thead>
  <tbody>
    <tr>
      <td><pre>
(defn foo [a b c]
  (\* a b c))</pre></td>
      <td><pre>
(def foo
  (fn [a b c]
    (\* a b c)))</pre></td></tr></tbody></table>

## Examples
