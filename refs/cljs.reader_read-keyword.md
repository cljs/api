## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/read-keyword

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__read-keyword__ reader initch)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1803
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:327-341](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/reader.cljs#L327-L341)</ins>
</pre>

```clj
(defn read-keyword
  [reader initch]
  (let [token (read-token reader (read-char reader))
        a (re-matches* symbol-pattern token)
        token (aget a 0)
        ns (aget a 1)
        name (aget a 2)]
    (if (or (and (not (undefined? ns))
                 (identical? (. ns (substring (- (.-length ns) 2) (.-length ns))) ":/"))
            (identical? (aget name (dec (.-length name))) ":")
            (not (== (.indexOf token "::" 1) -1)))
      (reader-error reader "Invalid token: " token)
      (if (and (not (nil? ns)) (> (.-length ns) 0))
        (keyword (.substring ns 0 (.indexOf ns "/")) name)
        (keyword token)))))
```


---

```clj
{:full-name "cljs.reader/read-keyword",
 :ns "cljs.reader",
 :name "read-keyword",
 :type "function",
 :signature ["[reader initch]"],
 :source {:code "(defn read-keyword\n  [reader initch]\n  (let [token (read-token reader (read-char reader))\n        a (re-matches* symbol-pattern token)\n        token (aget a 0)\n        ns (aget a 1)\n        name (aget a 2)]\n    (if (or (and (not (undefined? ns))\n                 (identical? (. ns (substring (- (.-length ns) 2) (.-length ns))) \":/\"))\n            (identical? (aget name (dec (.-length name))) \":\")\n            (not (== (.indexOf token \"::\" 1) -1)))\n      (reader-error reader \"Invalid token: \" token)\n      (if (and (not (nil? ns)) (> (.-length ns) 0))\n        (keyword (.substring ns 0 (.indexOf ns \"/\")) name)\n        (keyword token)))))",
          :filename "clojurescript/src/cljs/cljs/reader.cljs",
          :lines [327 341],
          :link "https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/reader.cljs#L327-L341"},
 :full-name-encode "cljs.reader_read-keyword",
 :history [["+" "0.0-927"]]}

```
