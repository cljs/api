---
name: compiler-options/foreign-libs
see also:
  - compiler-options/npm-deps
  - compiler-options/libs
---

## Summary

Allows you to include and convert JavaScript libraries that are not proper Google Closure
namespaces—if they are, use [doc:compiler-options/libs] instead.
For an easier way to include libraries from npm use
[doc:compiler-options/npm-deps].

```clj
:foreign-libs
[{:file "local/file.js"         ;; file path or URL
  :provides ["my.example"]      ;; assign a fake namespace

  ;; optional keys
  :file-min "local/file.min.js" ;; used for :advanced optimizations
  :module-type ...              ;; :commonjs, :amd, or :es6
  :requires ["foo.bar"]         ;; inferred if :module-type supplied
  :preprocess ...}]             ;; custom preprocessor (e.g. JSX)
```

## Details

Be sure that each `:file` url returns an HTTP Code 200.

Required keys:

- `:file` Indicates the file path or URL to the library
- `:provides` A synthetic namespace that is associated with the library. This is typically a vector with a single string, but it has the capability of specifying multiple namespaces (typically used only by Google Closure libraries).

Optional keys:

- `:file-min` Indicates the file path or URL to the minified variant of the library, used for `:advanced` or `:simple` optimizations
- `:requires` A vector explicitly identifying dependencies (:provides values from other foreign libs); used to form a topological sort honoring dependencies.
- `:module-type` indicates that the foreign lib uses a given module system. Can be one of `:commonjs`, `:amd`, `:es6`. Note that if supplied, `:requires` is not used (as it is implicitly determined). For more info see [JavaScript Module Support (Alpha)](https://clojurescript.org/reference/javascript-module-support).
- `:preprocess` Used to preprocess / transform code in other dialects (JSX, etc.). A `defmethod` for `cljs.clojure/js-transforms` must be provided that matches the supplied value in order to effect the desired code transformation. For more info see [JavaScript Library Preprocessing](https://clojurescript.org/reference/javascript-library-preprocessing).

## Examples

To use the foreign library in the summary example:

```clj
(require 'my.example)

;; If my.example is a single exported function:
(my.example)

;; If my.example has an exported foo function:
(my.example/foo)
```

<!-- AUTO-GENERATED docfile links for github -->
[doc:compiler-options/libs]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/libs.md
[doc:compiler-options/npm-deps]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/npm-deps.md
