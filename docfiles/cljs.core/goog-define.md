---
name: cljs.core/goog-define
see also:
  - cljs.core/def
  - compiler-options/closure-defines
---

## Summary

Use instead of [doc:cljs.core/def] when you want to configure its value at
compile-time with the [doc:compiler-options/closure-defines] compiler option.
Must be a string, number, or boolean.

## Details

You can use compile-time constants to signal code to remove from your build,
with [doc:compiler-options/optimizations] `:advanced`.

To make this work for booleans, the compiler needs some explicit hinting:

```clj
(goog-define ^boolean DEBUG true)
;;           ^^^^^^^^ mark as boolean to allow compiler to optimize

(when DEBUG
  (println "Hello World")) ;; <-- removed from build when DEBUG is false
```

To make this work for strings, the compiler needs an explicit [doc:cljs.core/identical?] comparison:

```clj
(goog-define LOCALE "en")

(def messages
  (cond
    (identical? LOCALE "nl") i18n.nl/messages  ;; <-- removed from build when unused
    (identical? LOCALE "fr") i18n.fr/messages  ;; <-- removed from build when unused
    :else i18n.en/messages))
```

## Examples

<!-- AUTO-GENERATED docfile links for github -->
[doc:cljs.core/identical?]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/identicalQMARK.md
[doc:compiler-options/optimizations]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/optimizations.md
[doc:compiler-options/closure-defines]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/closure-defines.md
[doc:cljs.core/def]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/def.md
