## cljs.core/delay?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/delay?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/delay?)
</td>
</tr>
</table>


 <samp>
(__delay?__ x)<br>
</samp>

---





Source docstring:

```
returns true if x is a Delay created with delay
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.8.34/src/main/cljs/cljs/core.cljs#L9440-L9442):

```clj
(defn ^boolean delay?
  [x] (instance? Delay x))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.8.34
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:9440-9442](https://github.com/clojure/clojurescript/blob/r1.8.34/src/main/cljs/cljs/core.cljs#L9440-L9442)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/delay?` @ clojuredocs](http://clojuredocs.org/clojure.core/delay_q)<br>
[`clojure.core/delay?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/delay%3F/)<br>
[`clojure.core/delay?` @ crossclj](http://crossclj.info/fun/clojure.core/delay%3F.html)<br>
[`cljs.core/delay?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/delay%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/delayQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "delay?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core/delayQMARK",
 :source {:code "(defn ^boolean delay?\n  [x] (instance? Delay x))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.34",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [9440 9442]},
 :full-name "cljs.core/delay?",
 :clj-symbol "clojure.core/delay?",
 :docstring "returns true if x is a Delay created with delay"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/delay?"]))
```

-->
