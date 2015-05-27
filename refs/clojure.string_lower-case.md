## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.string/lower-case

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.string/lower-case</samp>](http://clojure.github.io/clojure/branch-master/clojure.string-api.html#clojure.string/lower-case)
</td>
</tr>
</table>

 <samp>
(__lower-case__ s)<br>
</samp>

```
Converts string to all lower-case.
```

---

 <pre>
clojurescript @ r1586
└── src
    └── cljs
        └── clojure
            └── <ins>[string.cljs:58-61](https://github.com/clojure/clojurescript/blob/r1586/src/cljs/clojure/string.cljs#L58-L61)</ins>
</pre>

```clj
(defn lower-case
  [s]
  (.toLowerCase s))
```


---

```clj
{:ns "clojure.string",
 :name "lower-case",
 :signature ["[s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.string_lower-case",
 :source {:code "(defn lower-case\n  [s]\n  (.toLowerCase s))",
          :filename "clojurescript/src/cljs/clojure/string.cljs",
          :lines [58 61],
          :link "https://github.com/clojure/clojurescript/blob/r1586/src/cljs/clojure/string.cljs#L58-L61"},
 :full-name "clojure.string/lower-case",
 :clj-symbol "clojure.string/lower-case",
 :docstring "Converts string to all lower-case."}

```
