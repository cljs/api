## clojure.string/capitalize



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.string/capitalize</samp>](http://clojure.github.io/clojure/branch-master/clojure.string-api.html#clojure.string/capitalize)
</td>
</tr>
</table>


 <samp>
(__capitalize__ s)<br>
</samp>

---

Converts first character of the string to upper-case, all other characters to
lower-case.



---




Source docstring:

```
Converts first character of the string to upper-case, all other
characters to lower-case.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1853/src/cljs/clojure/string.cljs#L63-L70):

```clj
(defn capitalize
  [s]
  (if (< (count s) 2)
    (upper-case s)
    (str (upper-case (subs s 0 1))
         (lower-case (subs s 1)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1853
└── src
    └── cljs
        └── clojure
            └── <ins>[string.cljs:63-70](https://github.com/clojure/clojurescript/blob/r1853/src/cljs/clojure/string.cljs#L63-L70)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.string/capitalize` @ clojuredocs](http://clojuredocs.org/clojure.string/capitalize)<br>
[`clojure.string/capitalize` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.string/capitalize/)<br>
[`clojure.string/capitalize` @ crossclj](http://crossclj.info/fun/clojure.string/capitalize.html)<br>
[`clojure.string/capitalize` @ crossclj](http://crossclj.info/fun/clojure.string.cljs/capitalize.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.string/capitalize.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Converts first character of the string to upper-case, all other characters to\nlower-case.",
 :ns "clojure.string",
 :name "capitalize",
 :signature ["[s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.string/capitalize",
 :source {:code "(defn capitalize\n  [s]\n  (if (< (count s) 2)\n    (upper-case s)\n    (str (upper-case (subs s 0 1))\n         (lower-case (subs s 1)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1853",
          :filename "src/cljs/clojure/string.cljs",
          :lines [63 70]},
 :full-name "clojure.string/capitalize",
 :clj-symbol "clojure.string/capitalize",
 :docstring "Converts first character of the string to upper-case, all other\ncharacters to lower-case."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.string/capitalize"]))
```

-->
