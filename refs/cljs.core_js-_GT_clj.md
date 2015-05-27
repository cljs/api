## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/js->clj

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__js->clj__ x & opts)<br>
</samp>

```
Recursively transforms JavaScript arrays into ClojureScript
vectors, and JavaScript objects into ClojureScript maps.  With
option ':keywordize-keys true' will convert object fields from
strings to keywords.
```

---

 <pre>
clojurescript @ r1552
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6955-6961](https://github.com/clojure/clojurescript/blob/r1552/src/cljs/cljs/core.cljs#L6955-L6961)</ins>
</pre>

```clj
(defn js->clj
  [x & opts]
  (-js->clj x (apply array-map opts)))
```


---

```clj
{:full-name "cljs.core/js->clj",
 :ns "cljs.core",
 :name "js->clj",
 :docstring "Recursively transforms JavaScript arrays into ClojureScript\nvectors, and JavaScript objects into ClojureScript maps.  With\noption ':keywordize-keys true' will convert object fields from\nstrings to keywords.",
 :type "function",
 :signature ["[x & opts]"],
 :source {:code "(defn js->clj\n  [x & opts]\n  (-js->clj x (apply array-map opts)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [6955 6961],
          :link "https://github.com/clojure/clojurescript/blob/r1552/src/cljs/cljs/core.cljs#L6955-L6961"},
 :full-name-encode "cljs.core_js-_GT_clj",
 :history [["+" "0.0-927"]]}

```
