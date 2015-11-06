## cljs.test/async



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" title="Added in 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__async__ done & body)<br>
</samp>

---





Source docstring:

```
Wraps body as a CPS function that can be returned from a test to
continue asynchronously.  Binds done to a function that must be
invoked once and from an async context after any assertions.

(deftest example-with-timeout
  (async done
    (js/setTimeout (fn []
                     ;; make assertions in async context...
                     (done) ;; ...then call done
                     )
                   0)))
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.145/src/main/cljs/cljs/test.clj#L222-L239):

```clj
(defmacro async
  [done & body]
  `(reify
     cljs.test/IAsyncTest
     cljs.core/IFn
     (~'-invoke [_# ~done]
       ~@body)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.145
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[test.clj:222-239](https://github.com/clojure/clojurescript/blob/r1.7.145/src/main/cljs/cljs/test.clj#L222-L239)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.test/async` @ crossclj](http://crossclj.info/fun/cljs.test/async.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test/async.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.test",
 :name "async",
 :signature ["[done & body]"],
 :history [["+" "0.0-2814"]],
 :type "macro",
 :full-name-encode "cljs.test/async",
 :source {:code "(defmacro async\n  [done & body]\n  `(reify\n     cljs.test/IAsyncTest\n     cljs.core/IFn\n     (~'-invoke [_# ~done]\n       ~@body)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.145",
          :filename "src/main/cljs/cljs/test.clj",
          :lines [222 239]},
 :full-name "cljs.test/async",
 :docstring "Wraps body as a CPS function that can be returned from a test to\ncontinue asynchronously.  Binds done to a function that must be\ninvoked once and from an async context after any assertions.\n\n(deftest example-with-timeout\n  (async done\n    (js/setTimeout (fn []\n                     ;; make assertions in async context...\n                     (done) ;; ...then call done\n                     )\n                   0)))"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/async"]))
```

-->
