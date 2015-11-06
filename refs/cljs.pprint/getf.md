## cljs.pprint/getf



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" title="Added in 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__getf__ sym)<br>
</samp>

---





Source docstring:

```
Get the value of the field a named by the argument (which should be a keyword).
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3263/src/main/cljs/cljs/pprint.clj#L27-L30):

```clj
(defmacro getf
  [sym]
  `(~sym @@~'this))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3263
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.clj:27-30](https://github.com/clojure/clojurescript/blob/r3263/src/main/cljs/cljs/pprint.clj#L27-L30)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.pprint/getf` @ crossclj](http://crossclj.info/fun/cljs.pprint/getf.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint/getf.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.pprint",
 :name "getf",
 :signature ["[sym]"],
 :history [["+" "0.0-3255"]],
 :type "macro",
 :full-name-encode "cljs.pprint/getf",
 :source {:code "(defmacro getf\n  [sym]\n  `(~sym @@~'this))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3263",
          :filename "src/main/cljs/cljs/pprint.clj",
          :lines [27 30]},
 :full-name "cljs.pprint/getf",
 :docstring "Get the value of the field a named by the argument (which should be a keyword)."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/getf"]))
```

-->
