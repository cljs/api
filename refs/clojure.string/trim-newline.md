## clojure.string/trim-newline



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.string/trim-newline</samp>](http://clojure.github.io/clojure/branch-master/clojure.string-api.html#clojure.string/trim-newline)
</td>
</tr>
</table>


 <samp>
(__trim-newline__ s)<br>
</samp>

---

Removes all trailing newline `\n` or return `\r` characters from string.

Similar to Perl's chomp.



---




Source docstring:

```
Removes all trailing newline \n or return \r characters from
string.  Similar to Perl's chomp.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3263/src/main/cljs/clojure/string.cljs#L162-L172):

```clj
(defn trim-newline
  [s]
  (loop [index (.-length s)]
    (if (zero? index)
      ""
      (let [ch (get s (dec index))]
        (if (or (= ch \newline) (= ch \return))
          (recur (dec index))
          (.substring s 0 index))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3263
└── src
    └── main
        └── cljs
            └── clojure
                └── <ins>[string.cljs:162-172](https://github.com/clojure/clojurescript/blob/r3263/src/main/cljs/clojure/string.cljs#L162-L172)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.string/trim-newline` @ clojuredocs](http://clojuredocs.org/clojure.string/trim-newline)<br>
[`clojure.string/trim-newline` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.string/trim-newline/)<br>
[`clojure.string/trim-newline` @ crossclj](http://crossclj.info/fun/clojure.string/trim-newline.html)<br>
[`clojure.string/trim-newline` @ crossclj](http://crossclj.info/fun/clojure.string.cljs/trim-newline.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.string/trim-newline.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Removes all trailing newline `\\n` or return `\\r` characters from string.\n\nSimilar to Perl's chomp.",
 :ns "clojure.string",
 :name "trim-newline",
 :signature ["[s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.string/trim-newline",
 :source {:code "(defn trim-newline\n  [s]\n  (loop [index (.-length s)]\n    (if (zero? index)\n      \"\"\n      (let [ch (get s (dec index))]\n        (if (or (= ch \\newline) (= ch \\return))\n          (recur (dec index))\n          (.substring s 0 index))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3263",
          :filename "src/main/cljs/clojure/string.cljs",
          :lines [162 172]},
 :full-name "clojure.string/trim-newline",
 :clj-symbol "clojure.string/trim-newline",
 :docstring "Removes all trailing newline \\n or return \\r characters from\nstring.  Similar to Perl's chomp."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.string/trim-newline"]))
```

-->
