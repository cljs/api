## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/read-string

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/read-string</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/read-string)
</td>
</tr>
</table>

 <samp>
(__read-string__ s)<br>
</samp>

```
Reads one object from the string s
```

---

 <pre>
clojurescript @ r1576
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:434-438](https://github.com/clojure/clojurescript/blob/r1576/src/cljs/cljs/reader.cljs#L434-L438)</ins>
</pre>

```clj
(defn read-string
  [s]
  (let [r (push-back-reader s)]
    (read r true nil false)))
```


---

```clj
{:ns "cljs.reader",
 :name "read-string",
 :signature ["[s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.reader_read-string",
 :source {:code "(defn read-string\n  [s]\n  (let [r (push-back-reader s)]\n    (read r true nil false)))",
          :filename "clojurescript/src/cljs/cljs/reader.cljs",
          :lines [434 438],
          :link "https://github.com/clojure/clojurescript/blob/r1576/src/cljs/cljs/reader.cljs#L434-L438"},
 :full-name "cljs.reader/read-string",
 :clj-symbol "clojure.core/read-string",
 :docstring "Reads one object from the string s"}

```
