## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.string/trimr

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.string/trimr</samp>](http://clojure.github.io/clojure/branch-master/clojure.string-api.html#clojure.string/trimr)
</td>
</tr>
</table>

 <samp>
(__trimr__ s)<br>
</samp>

```
Removes whitespace from the right side of string.
```

---

 <pre>
clojurescript @ r1503
└── src
    └── cljs
        └── clojure
            └── <ins>[string.cljs:116-119](https://github.com/clojure/clojurescript/blob/r1503/src/cljs/clojure/string.cljs#L116-L119)</ins>
</pre>

```clj
(defn trimr
    [s]
    (gstring/trimRight s))
```


---

```clj
{:ns "clojure.string",
 :name "trimr",
 :signature ["[s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.string_trimr",
 :source {:code "(defn trimr\n    [s]\n    (gstring/trimRight s))",
          :filename "clojurescript/src/cljs/clojure/string.cljs",
          :lines [116 119],
          :link "https://github.com/clojure/clojurescript/blob/r1503/src/cljs/clojure/string.cljs#L116-L119"},
 :full-name "clojure.string/trimr",
 :clj-symbol "clojure.string/trimr",
 :docstring "Removes whitespace from the right side of string."}

```
