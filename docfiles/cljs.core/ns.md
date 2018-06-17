---
name: cljs.core/ns
see also:
  - cljs.core/in-ns
  - cljs.core/load-namespace
  - cljs.core/import
  - cljs.core/require
  - cljs.core/require-macros
---

## Summary

## Details

Sets the namespace of the file.

`ns` must be the first form in a `.cljs` file and there can only be one `ns`
declaration per file. Namespaces must match the file name of their respective
`.cljs` files, with the exception that dashes in namespaces become underscores
in filenames. Thus, `(ns foo.bar-biz.baz)` should be the first form in file
`foo/bar_biz/baz.cljs`.

`references` can be zero or more forms used to import other namespaces, symbols,
and libraries into the current namespace.

```clj
(ns example.core

  ;; for excluding or renaming clojure symbols
  (:refer-clojure
    :exclude []
    :rename {})

  ;; for importing goog classes and enums
  (:import
    lib.ns
    (lib.ns Ctor*))

  (:require
    lib.ns
    [lib.ns :refer []
            :refer-macros []
            :rename {}
            :include-macros true|false
            :as alias]
    :reload
    :reload-all)

  (:use
    lib.ns
    [lib.ns :only []
            :rename {}]
    :reload
    :reload-all)

  (:require-macros
    lib.ns
    [lib.ns :refer []
            :rename {}
            :as alias]
    :reload
    :reload-all)

  (:use-macros
    lib.ns
    [lib.ns :only []
            :rename {}]
    :reload
    :reload-all))
```

## Examples
