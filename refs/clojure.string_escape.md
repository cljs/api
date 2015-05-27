## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.string/escape

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.string/escape</samp>](http://clojure.github.io/clojure/branch-master/clojure.string-api.html#clojure.string/escape)
</td>
</tr>
</table>

 <samp>
(__escape__ s cmap)<br>
</samp>

```
Return a new string, using cmap to escape each character ch
from s as follows:

If (cmap ch) is nil, append ch to the new string.
If (cmap ch) is non-nil, append (str (cmap ch)) instead.
```

---

 <pre>
clojurescript @ r1443
└── src
    └── cljs
        └── clojure
            └── <ins>[string.cljs:144-160](https://github.com/clojure/clojurescript/blob/r1443/src/cljs/clojure/string.cljs#L144-L160)</ins>
</pre>

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


---

```clj
{:ns "clojure.string",
 :name "escape",
 :signature ["[s cmap]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.string_escape",
 :source {:code "(defn escape\n  [s cmap]\n  (let [buffer (gstring/StringBuffer.)\n        length (.-length s)]\n    (loop [index 0]\n      (if (= length index)\n        (. buffer (toString))\n        (let [ch (.charAt s index)]\n          (if-let [replacement (get cmap ch)]\n            (.append buffer (str replacement))\n            (.append buffer ch))\n          (recur (inc index)))))))",
          :filename "clojurescript/src/cljs/clojure/string.cljs",
          :lines [144 160],
          :link "https://github.com/clojure/clojurescript/blob/r1443/src/cljs/clojure/string.cljs#L144-L160"},
 :full-name "clojure.string/escape",
 :clj-symbol "clojure.string/escape",
 :docstring "Return a new string, using cmap to escape each character ch\nfrom s as follows:\n\nIf (cmap ch) is nil, append ch to the new string.\nIf (cmap ch) is non-nil, append (str (cmap ch)) instead."}

```
