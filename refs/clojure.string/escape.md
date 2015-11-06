## clojure.string/escape



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.string/escape</samp>](http://clojure.github.io/clojure/branch-master/clojure.string-api.html#clojure.string/escape)
</td>
</tr>
</table>


 <samp>
(__escape__ s cmap)<br>
</samp>

---

Return a new string, using `cmap` to escape each character `ch` from `s` as follows:

If `(cmap ch)` is nil, append ch to the new string.

If `(cmap ch)` is non-nil, append `(str (cmap ch))` instead.



---




Source docstring:

```
Return a new string, using cmap to escape each character ch
from s as follows:

If (cmap ch) is nil, append ch to the new string.
If (cmap ch) is non-nil, append (str (cmap ch)) instead.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r927/src/cljs/clojure/string.cljs#L144-L160):

```clj
(defn escape
  [s cmap]
  (let [buffer (gstring/StringBuffer.)
        length (.-length s)]
    (loop [index 0]
      (if (= length index)
        (. buffer (toString))
        (let [ch (.charAt s index)]
          (if-let [replacement (get cmap ch)]
            (.append buffer (str replacement))
            (.append buffer ch))
          (recur (inc index)))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r927
└── src
    └── cljs
        └── clojure
            └── <ins>[string.cljs:144-160](https://github.com/clojure/clojurescript/blob/r927/src/cljs/clojure/string.cljs#L144-L160)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.string/escape` @ clojuredocs](http://clojuredocs.org/clojure.string/escape)<br>
[`clojure.string/escape` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.string/escape/)<br>
[`clojure.string/escape` @ crossclj](http://crossclj.info/fun/clojure.string/escape.html)<br>
[`clojure.string/escape` @ crossclj](http://crossclj.info/fun/clojure.string.cljs/escape.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.string/escape.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Return a new string, using `cmap` to escape each character `ch` from `s` as follows:\n\nIf `(cmap ch)` is nil, append ch to the new string.\n\nIf `(cmap ch)` is non-nil, append `(str (cmap ch))` instead.",
 :ns "clojure.string",
 :name "escape",
 :signature ["[s cmap]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.string/escape",
 :source {:code "(defn escape\n  [s cmap]\n  (let [buffer (gstring/StringBuffer.)\n        length (.-length s)]\n    (loop [index 0]\n      (if (= length index)\n        (. buffer (toString))\n        (let [ch (.charAt s index)]\n          (if-let [replacement (get cmap ch)]\n            (.append buffer (str replacement))\n            (.append buffer ch))\n          (recur (inc index)))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r927",
          :filename "src/cljs/clojure/string.cljs",
          :lines [144 160]},
 :full-name "clojure.string/escape",
 :clj-symbol "clojure.string/escape",
 :docstring "Return a new string, using cmap to escape each character ch\nfrom s as follows:\n\nIf (cmap ch) is nil, append ch to the new string.\nIf (cmap ch) is non-nil, append (str (cmap ch)) instead."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.string/escape"]))
```

-->
