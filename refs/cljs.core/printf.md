## ~~cljs.core/printf~~



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1443"><img valign="middle" alt="[+] 0.0-1443" title="Added in 0.0-1443" src="https://img.shields.io/badge/+-0.0--1443-lightgrey.svg"></a> <a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1885"><img valign="middle" alt="[×] 0.0-1885" title="Removed in 0.0-1885" src="https://img.shields.io/badge/×-0.0--1885-red.svg"></a> </td>
</tr>
</table>

<samp>(printf fmt & args)</samp><br>

---

 <samp>
(__printf__ fmt & args)<br>
</samp>

---





Source docstring:

```
Prints formatted output, as per format
```


Source code @ [github]():

```clj
(defn printf
  [fmt & args]
  (print (apply format fmt args)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.core/printf` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/printf.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/printf.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "printf",
 :signature ["[fmt & args]"],
 :history [["+" "0.0-1443"] ["-" "0.0-1885"]],
 :type "function",
 :full-name-encode "cljs.core/printf",
 :source {:code "(defn printf\n  [fmt & args]\n  (print (apply format fmt args)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1878",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6758 6761]},
 :usage ["(printf fmt & args)"],
 :full-name "cljs.core/printf",
 :clj-symbol "clojure.core/printf",
 :docstring "Prints formatted output, as per format",
 :removed {:in "0.0-1885", :last-seen "0.0-1878"}}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/printf"]))
```

-->
