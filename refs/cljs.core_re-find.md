## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/re-find

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/re-find</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/re-find)
</td>
</tr>
</table>

 <samp>
(__re-find__ re s)<br>
</samp>

```
Returns the first regex match, if any, of s to re, using
re.exec(s). Returns a vector, containing first the matching
substring, then any capturing groups if the regular expression contains
capturing groups.
```

---

 <pre>
clojurescript @ r1834
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6459-6469](https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L6459-L6469)</ins>
</pre>

```clj
(defn re-find
  [re s]
  (let [matches (.exec re s)]
    (when-not (nil? matches)
      (if (== (count matches) 1)
        (first matches)
        (vec matches)))))
```


---

```clj
{:ns "cljs.core",
 :name "re-find",
 :signature ["[re s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_re-find",
 :source {:code "(defn re-find\n  [re s]\n  (let [matches (.exec re s)]\n    (when-not (nil? matches)\n      (if (== (count matches) 1)\n        (first matches)\n        (vec matches)))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [6459 6469],
          :link "https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L6459-L6469"},
 :full-name "cljs.core/re-find",
 :clj-symbol "clojure.core/re-find",
 :docstring "Returns the first regex match, if any, of s to re, using\nre.exec(s). Returns a vector, containing first the matching\nsubstring, then any capturing groups if the regular expression contains\ncapturing groups."}

```
