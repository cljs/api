## cljs.core/pr



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/pr</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/pr)
</td>
</tr>
</table>


 <samp>
(__pr__ & objs)<br>
</samp>

---





Source docstring:

```
Prints the object(s) using string-print.  Prints the
object(s), separated by spaces if there is more than one.
By default, pr and prn print in a way that objects can be
read by the reader
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3117/src/cljs/cljs/core.cljs#L8597-L8603):

```clj
(defn pr
  [& objs]
  (pr-with-opts objs (pr-opts)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3117
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8597-8603](https://github.com/clojure/clojurescript/blob/r3117/src/cljs/cljs/core.cljs#L8597-L8603)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/pr` @ clojuredocs](http://clojuredocs.org/clojure.core/pr)<br>
[`clojure.core/pr` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/pr/)<br>
[`clojure.core/pr` @ crossclj](http://crossclj.info/fun/clojure.core/pr.html)<br>
[`cljs.core/pr` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/pr.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/pr.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "pr",
 :signature ["[& objs]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core/pr",
 :source {:code "(defn pr\n  [& objs]\n  (pr-with-opts objs (pr-opts)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3117",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8597 8603]},
 :full-name "cljs.core/pr",
 :clj-symbol "clojure.core/pr",
 :docstring "Prints the object(s) using string-print.  Prints the\nobject(s), separated by spaces if there is more than one.\nBy default, pr and prn print in a way that objects can be\nread by the reader"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/pr"]))
```

-->
