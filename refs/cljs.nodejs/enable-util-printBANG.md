## cljs.nodejs/enable-util-print!



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2156"><img valign="middle" alt="[+] 0.0-2156" title="Added in 0.0-2156" src="https://img.shields.io/badge/+-0.0--2156-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__enable-util-print!__)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2725/src/cljs/cljs/nodejs.cljs#L19-L20):

```clj
(defn enable-util-print! []
  (set! *print-fn* (.-print (require "util"))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2725
└── src
    └── cljs
        └── cljs
            └── <ins>[nodejs.cljs:19-20](https://github.com/clojure/clojurescript/blob/r2725/src/cljs/cljs/nodejs.cljs#L19-L20)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.nodejs/enable-util-print!` @ crossclj](http://crossclj.info/fun/cljs.nodejs.cljs/enable-util-print%21.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.nodejs/enable-util-printBANG.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.nodejs",
 :name "enable-util-print!",
 :type "function",
 :signature ["[]"],
 :source {:code "(defn enable-util-print! []\n  (set! *print-fn* (.-print (require \"util\"))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2725",
          :filename "src/cljs/cljs/nodejs.cljs",
          :lines [19 20]},
 :full-name "cljs.nodejs/enable-util-print!",
 :full-name-encode "cljs.nodejs/enable-util-printBANG",
 :history [["+" "0.0-2156"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.nodejs/enable-util-print!"]))
```

-->
