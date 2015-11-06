## cljs.core/prn-str-with-opts



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1011"><img valign="middle" alt="[+] 0.0-1011" title="Added in 0.0-1011" src="https://img.shields.io/badge/+-0.0--1011-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__prn-str-with-opts__ objs opts)<br>
</samp>

---





Source docstring:

```
Same as pr-str-with-opts followed by (newline)
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2138/src/cljs/cljs/core.cljs#L6840-L6847):

```clj
(defn prn-str-with-opts
  [objs opts]
  (if (empty? objs)
    "\n"
    (let [sb (pr-sb-with-opts objs opts)]
      (.append sb \newline)
      (str sb))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2138
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6840-6847](https://github.com/clojure/clojurescript/blob/r2138/src/cljs/cljs/core.cljs#L6840-L6847)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/prn-str-with-opts` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/prn-str-with-opts.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/prn-str-with-opts.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "prn-str-with-opts",
 :signature ["[objs opts]"],
 :history [["+" "0.0-1011"]],
 :type "function",
 :full-name-encode "cljs.core/prn-str-with-opts",
 :source {:code "(defn prn-str-with-opts\n  [objs opts]\n  (if (empty? objs)\n    \"\\n\"\n    (let [sb (pr-sb-with-opts objs opts)]\n      (.append sb \\newline)\n      (str sb))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2138",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6840 6847]},
 :full-name "cljs.core/prn-str-with-opts",
 :docstring "Same as pr-str-with-opts followed by (newline)"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/prn-str-with-opts"]))
```

-->
