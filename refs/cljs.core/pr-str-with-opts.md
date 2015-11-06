## cljs.core/pr-str-with-opts



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__pr-str-with-opts__ objs opts)<br>
</samp>

---





Source docstring:

```
Prints a sequence of objects to a string, observing all the
options given in opts
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2342/src/cljs/cljs/core.cljs#L7836-L7842):

```clj
(defn pr-str-with-opts
  [objs opts]
  (if (empty? objs)
    ""
    (str (pr-sb-with-opts objs opts))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2342
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7836-7842](https://github.com/clojure/clojurescript/blob/r2342/src/cljs/cljs/core.cljs#L7836-L7842)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/pr-str-with-opts` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/pr-str-with-opts.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/pr-str-with-opts.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "pr-str-with-opts",
 :signature ["[objs opts]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core/pr-str-with-opts",
 :source {:code "(defn pr-str-with-opts\n  [objs opts]\n  (if (empty? objs)\n    \"\"\n    (str (pr-sb-with-opts objs opts))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2342",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7836 7842]},
 :full-name "cljs.core/pr-str-with-opts",
 :docstring "Prints a sequence of objects to a string, observing all the\noptions given in opts"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/pr-str-with-opts"]))
```

-->
