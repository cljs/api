## cljs.core/random-uuid



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3308"><img valign="middle" alt="[+] 0.0-3308" title="Added in 0.0-3308" src="https://img.shields.io/badge/+-0.0--3308-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__random-uuid__)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.8.34/src/main/cljs/cljs/core.cljs#L10111-L10122):

```clj
(defn random-uuid []
  (letfn [(hex [] (.toString (rand-int 16) 16))]
    (let [rhex (.toString (bit-or 0x8 (bit-and 0x3 (rand-int 16))) 16)]
      (uuid
        (str (hex) (hex) (hex) (hex)
             (hex) (hex) (hex) (hex) "-"
             (hex) (hex) (hex) (hex) "-"
             "4"   (hex) (hex) (hex) "-"
             rhex  (hex) (hex) (hex) "-"
             (hex) (hex) (hex) (hex)
             (hex) (hex) (hex) (hex)
             (hex) (hex) (hex) (hex))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.8.34
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:10111-10122](https://github.com/clojure/clojurescript/blob/r1.8.34/src/main/cljs/cljs/core.cljs#L10111-L10122)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/random-uuid` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/random-uuid.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/random-uuid.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "random-uuid",
 :type "function",
 :signature ["[]"],
 :source {:code "(defn random-uuid []\n  (letfn [(hex [] (.toString (rand-int 16) 16))]\n    (let [rhex (.toString (bit-or 0x8 (bit-and 0x3 (rand-int 16))) 16)]\n      (uuid\n        (str (hex) (hex) (hex) (hex)\n             (hex) (hex) (hex) (hex) \"-\"\n             (hex) (hex) (hex) (hex) \"-\"\n             \"4\"   (hex) (hex) (hex) \"-\"\n             rhex  (hex) (hex) (hex) \"-\"\n             (hex) (hex) (hex) (hex)\n             (hex) (hex) (hex) (hex)\n             (hex) (hex) (hex) (hex))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.34",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [10111 10122]},
 :full-name "cljs.core/random-uuid",
 :full-name-encode "cljs.core/random-uuid",
 :history [["+" "0.0-3308"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/random-uuid"]))
```

-->
