---
name: special/.
see also:
  - cljs.core/..
  - cljs.core/aget
---

## Summary

## Details

For interop, the `.` special form allows access to member properties of the
given JavaScript object `o`.

If the second operand is a symbol preceded with a hyphen as in `-p`, the
expression will result in the value of the property named `p`.

If the second operand is a symbol that is not preceded with a hyphen as in `m`,
the expression will evaluate to a call of the method named `m`.  Any additional
operands will be passed as arguments to the method.

The __preferred, idiomatic__ way to access members of a JavaScript object is to
use the following sugar:

<table class="code-tbl-9bef6">
  <thead>
    <tr>
      <th>Sugar</th>
      <th>Expands To</th></tr>
  </thead>
  <tbody>
    <tr>
      <td><pre>(.-p o)</pre></td>
      <td><pre>(. o -p)</pre></td>
    </tr>
    <tr>
      <td><pre>(.m o)</pre></td>
      <td><pre>(. o m)</pre></td>
    </tr>
    <tr>
      <td><pre>(.m o 1 2)</pre></td>
      <td><pre>(. o m 1 2)</pre></td>
    </tr>
  </tbody>
</table>

## Examples

We can access the JavaScript properties of a string:

```js
// JavaScript
var m = "Hello World";
m.length;
//=> 11
```

```clj
;; ClojureScript
(def m "Hello World")
(.-length m)
;;=> 11
```

We can also call member functions on the string:

```js
// JavaScript
m.toUpperCase();
//=> "HELLO WORLD"

m.replace("H", "");
//=> "ello World";
```

```clj
;; ClojureScript
(.toUpperCase m)
;;=> "HELLO WORLD"

(.replace m "H" "")
;;=> "ello World"
```

Create a JavaScript object `o`:

```clj
(def o #js {:foo "bar"})
```

You can get the value at property `"foo"` with any of the following:

```clj
(. o -foo)
;;=> "bar"

(.-foo o)
;;=> "bar"

(aget o "foo")
;;=> "bar"
```
