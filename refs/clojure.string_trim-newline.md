## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.string/trim-newline

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.string/trim-newline</samp>](http://clojure.github.io/clojure/branch-master/clojure.string-api.html#clojure.string/trim-newline)
</td>
</tr>
</table>

 <samp>
(__trim-newline__ s)<br>
</samp>

```
Removes all trailing newline \n or return \r characters from
string.  Similar to Perl's chomp.
```

---

 <pre>
clojurescript @ r1834
└── src
    └── cljs
        └── clojure
            └── <ins>[string.cljs:121-131](https://github.com/clojure/clojurescript/blob/r1834/src/cljs/clojure/string.cljs#L121-L131)</ins>
</pre>

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


---

```clj
{:ns "clojure.string",
 :name "trim-newline",
 :signature ["[s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.string_trim-newline",
 :source {:code "(defn trim-newline\n  [s]\n  (loop [index (.-length s)]\n    (if (zero? index)\n      \"\"\n      (let [ch (get s (dec index))]\n        (if (or (= ch \\newline) (= ch \\return))\n          (recur (dec index))\n          (.substring s 0 index))))))",
          :filename "clojurescript/src/cljs/clojure/string.cljs",
          :lines [121 131],
          :link "https://github.com/clojure/clojurescript/blob/r1834/src/cljs/clojure/string.cljs#L121-L131"},
 :full-name "clojure.string/trim-newline",
 :clj-symbol "clojure.string/trim-newline",
 :docstring "Removes all trailing newline \\n or return \\r characters from\nstring.  Similar to Perl's chomp."}

```
