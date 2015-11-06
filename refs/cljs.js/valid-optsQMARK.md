## ~~cljs.js/valid-opts?~~



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.10"><img valign="middle" alt="[+] 1.7.10" title="Added in 1.7.10" src="https://img.shields.io/badge/+-1.7.10-lightgrey.svg"></a> <a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.48"><img valign="middle" alt="[×] 1.7.48" title="Removed in 1.7.48" src="https://img.shields.io/badge/×-1.7.48-red.svg"></a> </td>
</tr>
</table>


 <samp>
(__valid-opts?__ x)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.28/src/main/cljs/cljs/js.cljs#L47-L48):

```clj
(defn valid-opts? [x]
  (or (nil? x) (map? x)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.28
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[js.cljs:47-48](https://github.com/clojure/clojurescript/blob/r1.7.28/src/main/cljs/cljs/js.cljs#L47-L48)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.js/valid-opts?` @ crossclj](http://crossclj.info/fun/cljs.js.cljs/valid-opts%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.js/valid-optsQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.js",
 :name "valid-opts?",
 :signature ["[x]"],
 :history [["+" "1.7.10"] ["-" "1.7.48"]],
 :type "function",
 :full-name-encode "cljs.js/valid-optsQMARK",
 :source {:code "(defn valid-opts? [x]\n  (or (nil? x) (map? x)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.28",
          :filename "src/main/cljs/cljs/js.cljs",
          :lines [47 48]},
 :full-name "cljs.js/valid-opts?",
 :removed {:in "1.7.48", :last-seen "1.7.28"}}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.js/valid-opts?"]))
```

-->
