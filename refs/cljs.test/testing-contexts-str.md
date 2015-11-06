## cljs.test/testing-contexts-str



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.test/testing-contexts-str</samp>](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/testing-contexts-str)
</td>
</tr>
</table>


 <samp>
(__testing-contexts-str__)<br>
</samp>

---





Source docstring:

```
Returns a string representation of the current test context. Joins
strings in *testing-contexts* with spaces.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2719/src/cljs/cljs/test.cljs#L248-L252):

```clj
(defn testing-contexts-str
  []
  (apply str (interpose " " (reverse (:testing-contexts (get-current-env))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2719
└── src
    └── cljs
        └── cljs
            └── <ins>[test.cljs:248-252](https://github.com/clojure/clojurescript/blob/r2719/src/cljs/cljs/test.cljs#L248-L252)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.test/testing-contexts-str` @ clojuredocs](http://clojuredocs.org/clojure.test/testing-contexts-str)<br>
[`clojure.test/testing-contexts-str` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.test/testing-contexts-str/)<br>
[`clojure.test/testing-contexts-str` @ crossclj](http://crossclj.info/fun/clojure.test/testing-contexts-str.html)<br>
[`cljs.test/testing-contexts-str` @ crossclj](http://crossclj.info/fun/cljs.test.cljs/testing-contexts-str.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test/testing-contexts-str.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.test",
 :name "testing-contexts-str",
 :signature ["[]"],
 :history [["+" "0.0-2496"]],
 :type "function",
 :full-name-encode "cljs.test/testing-contexts-str",
 :source {:code "(defn testing-contexts-str\n  []\n  (apply str (interpose \" \" (reverse (:testing-contexts (get-current-env))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2719",
          :filename "src/cljs/cljs/test.cljs",
          :lines [248 252]},
 :full-name "cljs.test/testing-contexts-str",
 :clj-symbol "clojure.test/testing-contexts-str",
 :docstring "Returns a string representation of the current test context. Joins\nstrings in *testing-contexts* with spaces."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/testing-contexts-str"]))
```

-->
