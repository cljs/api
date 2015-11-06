## cljs.pprint/deftype



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" title="Added in 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__deftype__ type-name & fields)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3269/src/main/cljs/cljs/pprint.clj#L39-L48):

```clj
(defmacro deftype
  [type-name & fields]
  (let [name-str (name type-name)
        fields (map (comp symbol name) fields)]
    `(do
       (defrecord ~type-name [~'type-tag ~@fields])
       (defn- ~(symbol (str "make-" name-str))
         ~(vec fields)
         (~(symbol (str type-name ".")) ~(keyword name-str) ~@fields))
       (defn- ~(symbol (str name-str "?")) [x#] (= (:type-tag x#) ~(keyword name-str))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3269
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.clj:39-48](https://github.com/clojure/clojurescript/blob/r3269/src/main/cljs/cljs/pprint.clj#L39-L48)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.pprint/deftype` @ crossclj](http://crossclj.info/fun/cljs.pprint/deftype.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint/deftype.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.pprint",
 :name "deftype",
 :type "macro",
 :signature ["[type-name & fields]"],
 :source {:code "(defmacro deftype\n  [type-name & fields]\n  (let [name-str (name type-name)\n        fields (map (comp symbol name) fields)]\n    `(do\n       (defrecord ~type-name [~'type-tag ~@fields])\n       (defn- ~(symbol (str \"make-\" name-str))\n         ~(vec fields)\n         (~(symbol (str type-name \".\")) ~(keyword name-str) ~@fields))\n       (defn- ~(symbol (str name-str \"?\")) [x#] (= (:type-tag x#) ~(keyword name-str))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3269",
          :filename "src/main/cljs/cljs/pprint.clj",
          :lines [39 48]},
 :full-name "cljs.pprint/deftype",
 :full-name-encode "cljs.pprint/deftype",
 :history [["+" "0.0-3255"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/deftype"]))
```

-->
