## cljs.spec/unstrument



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec/unstrument</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/unstrument)
</td>
</tr>
</table>

<samp>(unstrument v)</samp><br>

---

 <samp>
(__unstrument__ v)<br>
</samp>

---





Source docstring:

```
Undoes instrument on the var at v, a var or symbol. Idempotent.
```


Source code @ [github]():

```clj
(defmacro unstrument
  "Undoes instrument on the var at v, a var or symbol. Idempotent."[v]
  (let [v   (if-not (seq? v) (list 'var v) v)
        sym (second v)]
    `(when-let [raw# (cljs.spec/unstrument* ~v)]
       (set! ~sym raw#)
       ~v)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec/unstrument` @ clojuredocs](http://clojuredocs.org/clojure.spec/unstrument)<br>
[`clojure.spec/unstrument` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec/unstrument/)<br>
[`clojure.spec/unstrument` @ crossclj](http://crossclj.info/fun/clojure.spec/unstrument.html)<br>
[`cljs.spec/unstrument` @ crossclj](http://crossclj.info/fun/cljs.spec/unstrument.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/unstrument.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec",
 :name "unstrument",
 :signature ["[v]"],
 :name-encode "unstrument",
 :history [["+" "1.9.14"]],
 :type "macro",
 :clj-equiv {:full-name "clojure.spec/unstrument",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/unstrument"},
 :full-name-encode "cljs.spec/unstrument",
 :source {:code "(defmacro unstrument\n  \"Undoes instrument on the var at v, a var or symbol. Idempotent.\"[v]\n  (let [v   (if-not (seq? v) (list 'var v) v)\n        sym (second v)]\n    `(when-let [raw# (cljs.spec/unstrument* ~v)]\n       (set! ~sym raw#)\n       ~v)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/cljs/spec.cljc",
          :lines [391 397],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/cljs/spec.cljc#L391-L397"},
 :usage ["(unstrument v)"],
 :full-name "cljs.spec/unstrument",
 :docstring "Undoes instrument on the var at v, a var or symbol. Idempotent.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/unstrument.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec/unstrument"]))
```

-->
