## cljs.core/print-str



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1011"><img valign="middle" alt="[+] 0.0-1011" title="Added in 0.0-1011" src="https://img.shields.io/badge/+-0.0--1011-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/print-str</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/print-str)
</td>
</tr>
</table>

<samp>(print-str & objs)</samp><br>

---

 <samp>
(__print-str__ & objs)<br>
</samp>

---





Source docstring:

```
print to a string, returning it
```


Source code @ [github]():

```clj
(defn print-str
  [& objs]
  (pr-str-with-opts objs (assoc (pr-opts) :readably false)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.core/print-str` @ clojuredocs](http://clojuredocs.org/clojure.core/print-str)<br>
[`clojure.core/print-str` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/print-str/)<br>
[`clojure.core/print-str` @ crossclj](http://crossclj.info/fun/clojure.core/print-str.html)<br>
[`cljs.core/print-str` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/print-str.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/print-str.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "print-str",
 :signature ["[& objs]"],
 :name-encode "print-str",
 :history [["+" "0.0-1011"]],
 :type "function",
 :clj-equiv {:full-name "clojure.core/print-str",
             :url "http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/print-str"},
 :full-name-encode "cljs.core/print-str",
 :source {:code "(defn print-str\n  [& objs]\n  (pr-str-with-opts objs (assoc (pr-opts) :readably false)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [9201 9204],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/cljs/core.cljs#L9201-L9204"},
 :usage ["(print-str & objs)"],
 :full-name "cljs.core/print-str",
 :docstring "print to a string, returning it",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/print-str.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/print-str"]))
```

-->
