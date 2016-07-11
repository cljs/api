---
name: syntax/keyword-qualify
display: ":: keyword"
see also:
  - syntax/keyword
  - cljs.core/keyword
  - cljs.core/keyword?
---

## Summary

## Details

Keywords starting with `::` will evaluate to regular keywords with a namespace qualification.
The namespace will resolve to either of the following:

- current namespace if none is specified
- given namespace if it exists
- full namespace if the given one is an alias
- reader error if given namespace doesn't exist

## Examples

If we are in the `user` namespace:

```clj
::foo
;;=> :user/foo
```

We can use namespace aliases:

```clj
(require '[example.util :as util])

::util/foo
;;=> :example.util/foo
```

Existing namespaces will resolve normally:

```clj
::cljs.core/foo
;;=> :cljs.core/foo
```

Non-existing namespaces will throw a reader exception:

```clj
::foo/bar
;; clojure.lang.ExceptionInfo: Invalid token: ::foo/bar {:type :reader-exception, ...
```

## Usage
::foo
::foo/bar
