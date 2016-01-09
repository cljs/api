## cljs.core/demunge



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.10"><img valign="middle" alt="[+] 1.7.10" title="Added in 1.7.10" src="https://img.shields.io/badge/+-1.7.10-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__demunge__ name)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.228/src/main/cljs/cljs/core.cljs#L10098-L10103):

```clj
(defn demunge [name]
  ((if (symbol? name) symbol str)
    (let [name' (str name)]
      (if (identical? name' "_DOT__DOT_")
        ".."
        (demunge-str (str name))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.228
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:10098-10103](https://github.com/clojure/clojurescript/blob/r1.7.228/src/main/cljs/cljs/core.cljs#L10098-L10103)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/demunge` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/demunge.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/demunge.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "demunge",
 :type "function",
 :signature ["[name]"],
 :source {:code "(defn demunge [name]\n  ((if (symbol? name) symbol str)\n    (let [name' (str name)]\n      (if (identical? name' \"_DOT__DOT_\")\n        \"..\"\n        (demunge-str (str name))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.228",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [10098 10103]},
 :full-name "cljs.core/demunge",
 :full-name-encode "cljs.core/demunge",
 :history [["+" "1.7.10"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/demunge"]))
```

-->
