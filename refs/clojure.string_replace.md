## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.string/replace

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.string/replace</samp>](http://clojure.github.io/clojure/branch-master/clojure.string-api.html#clojure.string/replace)
</td>
</tr>
</table>

 <samp>
(__replace__ s match replacement)<br>
</samp>

```
Replaces all instance of match with replacement in s.
match/replacement can be:

string / string
pattern / (string or function of match).
```

---

 <pre>
clojurescript @ r1211
└── src
    └── cljs
        └── clojure
            └── <ins>[string.cljs:23-34](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/clojure/string.cljs#L23-L34)</ins>
</pre>

```clj
(defn replace
  [s match replacement]
  (cond (string? match)
        (.replace s (js/RegExp. (gstring/regExpEscape match) "g") replacement)
        (.hasOwnProperty match "source")
        (.replace s (js/RegExp. (.-source match) "g") replacement)
        :else (throw (str "Invalid match arg: " match))))
```


---

```clj
{:ns "clojure.string",
 :name "replace",
 :signature ["[s match replacement]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.string_replace",
 :source {:code "(defn replace\n  [s match replacement]\n  (cond (string? match)\n        (.replace s (js/RegExp. (gstring/regExpEscape match) \"g\") replacement)\n        (.hasOwnProperty match \"source\")\n        (.replace s (js/RegExp. (.-source match) \"g\") replacement)\n        :else (throw (str \"Invalid match arg: \" match))))",
          :filename "clojurescript/src/cljs/clojure/string.cljs",
          :lines [23 34],
          :link "https://github.com/clojure/clojurescript/blob/r1211/src/cljs/clojure/string.cljs#L23-L34"},
 :full-name "clojure.string/replace",
 :clj-symbol "clojure.string/replace",
 :docstring "Replaces all instance of match with replacement in s.\nmatch/replacement can be:\n\nstring / string\npattern / (string or function of match)."}

```
