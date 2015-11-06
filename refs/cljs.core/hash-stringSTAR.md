## cljs.core/hash-string\*



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2261"><img valign="middle" alt="[+] 0.0-2261" title="Added in 0.0-2261" src="https://img.shields.io/badge/+-0.0--2261-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__hash-string\*__ s)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3255/src/main/cljs/cljs/core.cljs#L727-L736):

```clj
(defn hash-string* [s]
  (if-not (nil? s)
    (let [len (alength s)]
      (if (pos? len)
        (loop [i 0 hash 0]
          (if (< i len)
            (recur (inc i) (+ (imul 31 hash) (.charCodeAt s i)))
            hash))
        0))
    0))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3255
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:727-736](https://github.com/clojure/clojurescript/blob/r3255/src/main/cljs/cljs/core.cljs#L727-L736)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/hash-string*` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/hash-string*.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/hash-stringSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "hash-string*",
 :type "function",
 :signature ["[s]"],
 :source {:code "(defn hash-string* [s]\n  (if-not (nil? s)\n    (let [len (alength s)]\n      (if (pos? len)\n        (loop [i 0 hash 0]\n          (if (< i len)\n            (recur (inc i) (+ (imul 31 hash) (.charCodeAt s i)))\n            hash))\n        0))\n    0))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3255",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [727 736]},
 :full-name "cljs.core/hash-string*",
 :full-name-encode "cljs.core/hash-stringSTAR",
 :history [["+" "0.0-2261"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/hash-string*"]))
```

-->
