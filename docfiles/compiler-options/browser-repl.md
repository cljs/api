---
name: compiler-options/browser-repl
see also:
---

## Summary

Preload code necessary for connecting to the natively supported browser REPL.
Defaults to false.

```clj
:browser-repl true
```

## Details

When true, adds `clojure.browser.repl/preload` to [doc:compiler-options/preloads].

The natively supported browser REPL must be started from a custom script in
Clojure. Start the REPL by calling [doc:cljs.repl/repl] with the result of
[doc:cljs.repl.browser/repl-env]:

```clj
;; ClojureScript compiler script (in Clojure)

(require 'cljs.repl)
(require 'cljs.repl.browser)

(cljs.repl/repl (cljs.repl.browser/repl-env)
  :watch "src"
  :output-dir "out")
```

## Examples

<!-- AUTO-GENERATED docfile links for github -->
[doc:compiler-options/preloads]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/preloads.md
[doc:cljs.repl/repl]:https://github.com/cljs/api/blob/master/docfiles/cljs.repl/repl.md
[doc:cljs.repl.browser/repl-env]:https://github.com/cljs/api/blob/master/docfiles/cljs.repl.browser/repl-env.md
