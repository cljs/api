## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.string/reverse

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.string/reverse</samp>](http://clojure.github.io/clojure/branch-master/clojure.string-api.html#clojure.string/reverse)
</td>
</tr>
</table>

 <samp>
(__reverse__ s)<br>
</samp>

```
Returns s with its characters reversed.
```

---

 <pre>
clojurescript @ r1806
└── src
    └── cljs
        └── clojure
            └── <ins>[string.cljs:18-21](https://github.com/clojure/clojurescript/blob/r1806/src/cljs/clojure/string.cljs#L18-L21)</ins>
</pre>

```clj
(defn reverse
  [s]
  (.. s (split "") (reverse) (join "")))
```


---

```clj
{:ns "clojure.string",
 :name "reverse",
 :signature ["[s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.string_reverse",
 :source {:code "(defn reverse\n  [s]\n  (.. s (split \"\") (reverse) (join \"\")))",
          :filename "clojurescript/src/cljs/clojure/string.cljs",
          :lines [18 21],
          :link "https://github.com/clojure/clojurescript/blob/r1806/src/cljs/clojure/string.cljs#L18-L21"},
 :full-name "clojure.string/reverse",
 :clj-symbol "clojure.string/reverse",
 :docstring "Returns s with its characters reversed."}

```
