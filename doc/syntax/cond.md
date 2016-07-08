## Name
syntax/cond

## Display
#? reader conditional

## Usage
#?(...)

## Description

(Only allowed in `.cljc` files or the REPL)

Allows the reader to conditionally select from the given list of forms
depending on available "feature" keys.  For example:

```clj
#?(:clj "Clojure"
   :cljs "ClojureScript")
```

ClojureScript's reader is configured with the `:cljs` feature key, making the
expression above read as `"ClojureScript"`.  Clojure's reader is
similarly configured with the `:clj` key.

This essentially allows us to write portable code for use in both Clojure and
ClojureScript.

### For Macros

Reader conditionals are especially important when writing macros in
ClojureScript, since the macros may be handed off to Clojure for evaluation,
depending on the ClojureScript compiler version:

| compiler version  | macros evaluated by |
|-------------------|---------------------|
| ClojureScript JVM | Clojure             |
| ClojureScript JS  | ClojureScript       |

Thus, reader conditionals allow us to account for differences in both versions
of the compiler.  See [doc:cljs.core/defmacro] for details.

## Related
syntax/cond-splicing

## Example#eec90f

```clj
#?(:clj "Clojure" :cljs "ClojureScript")
;;=> "ClojureScript"
```

A function that works in Clojure and ClojureScript ([source]):

[source]:https://github.com/lymingtonprecision/route-ccrs/blob/c579aea05504736f2cfbd31c3c755f7e25fdad77/src/route_ccrs/manufacturing_methods.cljc#L8-L10

```clj
(defn str->int [s]
  #?(:clj  (java.lang.Integer/parseInt s)
     :cljs (js/parseInt s)))

(str->int "123")
;;=> 123
```
