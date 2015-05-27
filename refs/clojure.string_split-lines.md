## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.string/split-lines

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.string/split-lines</samp>](http://clojure.github.io/clojure/branch-master/clojure.string-api.html#clojure.string/split-lines)
</td>
</tr>
</table>

 <samp>
(__split-lines__ s)<br>
</samp>

```
Splits s on 
 or 
.
```

---

 <pre>
clojurescript @ r1806
└── src
    └── cljs
        └── clojure
            └── <ins>[string.cljs:101-104](https://github.com/clojure/clojurescript/blob/r1806/src/cljs/clojure/string.cljs#L101-L104)</ins>
</pre>

```clj
(defn split-lines
  [s]
  (split s #"\n|\r\n"))
```


---

```clj
{:ns "clojure.string",
 :name "split-lines",
 :signature ["[s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.string_split-lines",
 :source {:code "(defn split-lines\n  [s]\n  (split s #\"\\n|\\r\\n\"))",
          :filename "clojurescript/src/cljs/clojure/string.cljs",
          :lines [101 104],
          :link "https://github.com/clojure/clojurescript/blob/r1806/src/cljs/clojure/string.cljs#L101-L104"},
 :full-name "clojure.string/split-lines",
 :clj-symbol "clojure.string/split-lines",
 :docstring "Splits s on \n or \r\n."}

```
