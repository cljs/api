## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/string?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/string?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/string?)
</td>
</tr>
</table>

 <samp>
(__string?__ x)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r971
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:668-671](https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L668-L671)</ins>
</pre>

```clj
(defn string? [x]
  (and (goog/isString x)
       (not (or (= (.charAt x 0) \uFDD0)
                (= (.charAt x 0) \uFDD1)))))
```


---

```clj
{:full-name "cljs.core/string?",
 :ns "cljs.core",
 :name "string?",
 :type "function",
 :signature ["[x]"],
 :source {:code "(defn string? [x]\n  (and (goog/isString x)\n       (not (or (= (.charAt x 0) \\uFDD0)\n                (= (.charAt x 0) \\uFDD1)))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [668 671],
          :link "https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L668-L671"},
 :full-name-encode "cljs.core_string_QMARK_",
 :clj-symbol "clojure.core/string?",
 :history [["+" "0.0-927"]]}

```
