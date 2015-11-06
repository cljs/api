## cljs.reader/read-past



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__read-past__ pred rdr)<br>
</samp>

---





Source docstring:

```
Read until first character that doesn't match pred, returning
char.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2322/src/cljs/cljs/reader.cljs#L215-L222):

```clj
(defn read-past
  [pred rdr]
  (loop [ch (read-char rdr)]
    (if (pred ch)
      (recur (read-char rdr))
      ch)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2322
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:215-222](https://github.com/clojure/clojurescript/blob/r2322/src/cljs/cljs/reader.cljs#L215-L222)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.reader/read-past` @ crossclj](http://crossclj.info/fun/cljs.reader.cljs/read-past.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader/read-past.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.reader",
 :name "read-past",
 :signature ["[pred rdr]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.reader/read-past",
 :source {:code "(defn read-past\n  [pred rdr]\n  (loop [ch (read-char rdr)]\n    (if (pred ch)\n      (recur (read-char rdr))\n      ch)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2322",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [215 222]},
 :full-name "cljs.reader/read-past",
 :docstring "Read until first character that doesn't match pred, returning\nchar."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/read-past"]))
```

-->
