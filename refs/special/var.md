## var



 <table border="1">
<tr>
<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/var</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/var)
</td>
</tr>
</table>


 <samp>
(__var__ symbol)<br>
</samp>

---





Source docstring:

```
The symbol must resolve to a var, and the Var object
itself (not its value) is returned. The reader macro #'x expands to (var x).
```


Parser code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.170/src/main/clojure/cljs/analyzer.cljc#L950-L956):

```clj
(defmethod parse 'var
  [op env [_ sym :as form] _ _]
  (merge
    {:env env
     :op :var-special
     :form form}
    (var-ast env sym)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.170
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[analyzer.cljc:950-956](https://github.com/clojure/clojurescript/blob/r1.7.170/src/main/clojure/cljs/analyzer.cljc#L950-L956)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/var` @ clojuredocs](http://clojuredocs.org/clojure.core/var)<br>
[`clojure.core/var` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/var/)<br>
[`clojure.core/var` @ crossclj](http://crossclj.info/fun/clojure.core/var.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special/var.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "special",
 :name "var",
 :signature ["[symbol]"],
 :history [["+" "0.0-2496"]],
 :type "special form",
 :full-name-encode "special/var",
 :source {:code "(defmethod parse 'var\n  [op env [_ sym :as form] _ _]\n  (merge\n    {:env env\n     :op :var-special\n     :form form}\n    (var-ast env sym)))",
          :title "Parser code",
          :repo "clojurescript",
          :tag "r1.7.170",
          :filename "src/main/clojure/cljs/analyzer.cljc",
          :lines [950 956]},
 :full-name "special/var",
 :clj-symbol "clojure.core/var",
 :docstring "The symbol must resolve to a var, and the Var object\nitself (not its value) is returned. The reader macro #'x expands to (var x)."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/var"]))
```

-->
