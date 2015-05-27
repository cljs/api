## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/aclone

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/aclone</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/aclone)
</td>
</tr>
</table>

 <samp>
(__aclone__ array-like)<br>
</samp>

```
Returns a javascript array, cloned from the passed in array
```

---

 <pre>
clojurescript @ r993
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:65-69](https://github.com/clojure/clojurescript/blob/r993/src/cljs/cljs/core.cljs#L65-L69)</ins>
</pre>

```clj
(defn aclone
  [array-like]
  #_(goog.array.clone array-like)
  (js* "Array.prototype.slice.call(~{array-like})"))
```


---

```clj
{:ns "cljs.core",
 :name "aclone",
 :signature ["[array-like]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_aclone",
 :source {:code "(defn aclone\n  [array-like]\n  #_(goog.array.clone array-like)\n  (js* \"Array.prototype.slice.call(~{array-like})\"))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [65 69],
          :link "https://github.com/clojure/clojurescript/blob/r993/src/cljs/cljs/core.cljs#L65-L69"},
 :full-name "cljs.core/aclone",
 :clj-symbol "clojure.core/aclone",
 :docstring "Returns a javascript array, cloned from the passed in array"}

```
