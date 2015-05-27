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
clojurescript @ r1450
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:978-981](https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L978-L981)</ins>
</pre>

```clj
(defn ^boolean string? [x]
  (and ^boolean (goog/isString x)
       (not (or (identical? (.charAt x 0) \uFDD0)
                (identical? (.charAt x 0) \uFDD1)))))
```


---

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "string?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_string_QMARK_",
 :source {:code "(defn ^boolean string? [x]\n  (and ^boolean (goog/isString x)\n       (not (or (identical? (.charAt x 0) \\uFDD0)\n                (identical? (.charAt x 0) \\uFDD1)))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [978 981],
          :link "https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L978-L981"},
 :full-name "cljs.core/string?",
 :clj-symbol "clojure.core/string?"}

```
