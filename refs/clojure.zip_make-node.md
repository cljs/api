## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.zip/make-node

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/make-node</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/make-node)
</td>
</tr>
</table>

 <samp>
(__make-node__ loc node children)<br>
</samp>

```
Returns a new branch node, given an existing node and new
children. The loc is only used to supply the constructor.
```

---

 <pre>
clojurescript @ r1443
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:76-80](https://github.com/clojure/clojurescript/blob/r1443/src/cljs/clojure/zip.cljs#L76-L80)</ins>
</pre>

```clj
(defn make-node
  [loc node children]
    ((:zip/make-node (meta loc)) node children))
```


---

```clj
{:ns "clojure.zip",
 :name "make-node",
 :signature ["[loc node children]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip_make-node",
 :source {:code "(defn make-node\n  [loc node children]\n    ((:zip/make-node (meta loc)) node children))",
          :filename "clojurescript/src/cljs/clojure/zip.cljs",
          :lines [76 80],
          :link "https://github.com/clojure/clojurescript/blob/r1443/src/cljs/clojure/zip.cljs#L76-L80"},
 :full-name "clojure.zip/make-node",
 :clj-symbol "clojure.zip/make-node",
 :docstring "Returns a new branch node, given an existing node and new\nchildren. The loc is only used to supply the constructor."}

```
