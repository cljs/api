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







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3308/src/main/cljs/cljs/nodejs.cljs#L18-L22):

```clj
(defn enable-util-print! []
  (set! *print-newline* false)
  (set! *print-fn*
    (fn [& args]
      (.apply (.-log js/console) js/console (into-array args)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3308
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[nodejs.cljs:18-22](https://github.com/clojure/clojurescript/blob/r3308/src/main/cljs/cljs/nodejs.cljs#L18-L22)</ins>
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
 :source {:code "(defn enable-util-print! []\n  (set! *print-newline* false)\n  (set! *print-fn*\n    (fn [& args]\n      (.apply (.-log js/console) js/console (into-array args)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3308",
          :filename "src/main/cljs/cljs/nodejs.cljs",
          :lines [18 22]},
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
