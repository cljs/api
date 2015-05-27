## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/pr-str\*

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1806"><img valign="middle" alt="[+] 0.0-1806" src="https://img.shields.io/badge/+-0.0--1806-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__pr-str\*__ obj)<br>
</samp>

```
Support so that collections can implement toString without
loading all the printing machinery.
```

---

 <pre>
clojurescript @ r1806
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:352-360](https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L352-L360)</ins>
</pre>

```clj
(defn pr-str*
  [^not-native obj]
  (let [sb (gstring/StringBuffer.)
        writer (StringBufferWriter. sb)]
    (-pr-writer obj writer (pr-opts))
    (-flush writer)
    (str sb)))
```


---

```clj
{:full-name "cljs.core/pr-str*",
 :ns "cljs.core",
 :name "pr-str*",
 :docstring "Support so that collections can implement toString without\nloading all the printing machinery.",
 :type "function",
 :signature ["[obj]"],
 :source {:code "(defn pr-str*\n  [^not-native obj]\n  (let [sb (gstring/StringBuffer.)\n        writer (StringBufferWriter. sb)]\n    (-pr-writer obj writer (pr-opts))\n    (-flush writer)\n    (str sb)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [352 360],
          :link "https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L352-L360"},
 :full-name-encode "cljs.core_pr-str_STAR_",
 :history [["+" "0.0-1806"]]}

```
