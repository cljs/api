## cljs.spec/instrument



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec/instrument</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/instrument)
</td>
</tr>
</table>

<samp>(instrument v)</samp><br>

---

 <samp>
(__instrument__ v)<br>
</samp>

---





Source docstring:

```
Instruments the var at v, a var or symbol, to check specs
registered with fdef. Wraps the fn at v to check :args/:ret/:fn
specs, if they exist, throwing an ex-info with explain-data if a
check fails. Idempotent.
```


Source code @ [github]():

```clj
(defmacro instrument
  [v]
  (let [v   (if-not (seq? v) (list 'var v) v)
        sym (second v)]
    `(when-let [checked# (cljs.spec/instrument* ~v)]
       (set! ~sym checked#)
       ~v)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec/instrument` @ clojuredocs](http://clojuredocs.org/clojure.spec/instrument)<br>
[`clojure.spec/instrument` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec/instrument/)<br>
[`clojure.spec/instrument` @ crossclj](http://crossclj.info/fun/clojure.spec/instrument.html)<br>
[`cljs.spec/instrument` @ crossclj](http://crossclj.info/fun/cljs.spec/instrument.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/instrument.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec",
 :name "instrument",
 :signature ["[v]"],
 :name-encode "instrument",
 :history [["+" "1.9.14"]],
 :type "macro",
 :clj-equiv {:full-name "clojure.spec/instrument",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/instrument"},
 :full-name-encode "cljs.spec/instrument",
 :source {:code "(defmacro instrument\n  [v]\n  (let [v   (if-not (seq? v) (list 'var v) v)\n        sym (second v)]\n    `(when-let [checked# (cljs.spec/instrument* ~v)]\n       (set! ~sym checked#)\n       ~v)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/cljs/spec.cljc",
          :lines [379 389],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/cljs/spec.cljc#L379-L389"},
 :usage ["(instrument v)"],
 :full-name "cljs.spec/instrument",
 :docstring "Instruments the var at v, a var or symbol, to check specs\nregistered with fdef. Wraps the fn at v to check :args/:ret/:fn\nspecs, if they exist, throwing an ex-info with explain-data if a\ncheck fails. Idempotent.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/instrument.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec/instrument"]))
```

-->
