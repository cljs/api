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
clojurescript @ r1449
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:73-76](https://github.com/clojure/clojurescript/blob/r1449/src/cljs/cljs/core.cljs#L73-L76)</ins>
</pre>

```clj
(defn aclone
  [array-like]
  (.slice array-like))
```


---

 <pre>
clojurescript @ r1449
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:990-991](https://github.com/clojure/clojurescript/blob/r1449/src/clj/cljs/core.clj#L990-L991)</ins>
</pre>

```clj
(defmacro aclone [a]
  (list 'js* "~{}.slice()" a))
```

---

```clj
{:ns "cljs.core",
 :name "aclone",
 :signature ["[array-like]"],
 :shadowed-sources ({:code "(defmacro aclone [a]\n  (list 'js* \"~{}.slice()\" a))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [990 991],
                     :link "https://github.com/clojure/clojurescript/blob/r1449/src/clj/cljs/core.clj#L990-L991"}),
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_aclone",
 :source {:code "(defn aclone\n  [array-like]\n  (.slice array-like))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [73 76],
          :link "https://github.com/clojure/clojurescript/blob/r1449/src/cljs/cljs/core.cljs#L73-L76"},
 :full-name "cljs.core/aclone",
 :clj-symbol "clojure.core/aclone",
 :docstring "Returns a javascript array, cloned from the passed in array"}

```
