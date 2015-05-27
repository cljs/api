## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> special/finally

 <table border="1">
<tr>
<td>special form</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/finally</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/finally)
</td>
</tr>
</table>

 <samp>
(__finally__ expr\*)<br>
</samp>

```
(try expr* catch-clause* finally-clause?)

 Special Form

 catch-clause => (catch protoname name expr*)
 finally-clause => (finally expr*)

Catches and handles JavaScript exceptions.
```

---

 <pre>
clojurescript @ r971
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:501-529](https://github.com/clojure/clojurescript/blob/r971/src/clj/cljs/core.clj#L501-L529)</ins>
</pre>

```clj
(defmacro try
  [& forms]
  (let [catch? #(and (list? %) (= (first %) 'catch))
        [body catches] (split-with (complement catch?) forms)
        [catches fin] (split-with catch? catches)
        e (gensym "e")]
    (assert (every? #(clojure.core/> (count %) 2) catches) "catch block must specify a prototype and a name")
    (if (seq catches)
      `(~'try*
        ~@body
        (catch ~e
            (cond
             ~@(mapcat
                (fn [[_ type name & cb]]
                  `[(instance? ~type ~e) (let [~name ~e] ~@cb)])
                catches)
             :else (throw ~e)))
        ~@fin)
      `(~'try*
        ~@body
        ~@fin))))
```


---

```clj
{:ns "special",
 :name "finally",
 :signature ["[expr*]"],
 :history [["+" "0.0-927"]],
 :type "special form",
 :full-name-encode "special_finally",
 :source {:code "(defmacro try\n  [& forms]\n  (let [catch? #(and (list? %) (= (first %) 'catch))\n        [body catches] (split-with (complement catch?) forms)\n        [catches fin] (split-with catch? catches)\n        e (gensym \"e\")]\n    (assert (every? #(clojure.core/> (count %) 2) catches) \"catch block must specify a prototype and a name\")\n    (if (seq catches)\n      `(~'try*\n        ~@body\n        (catch ~e\n            (cond\n             ~@(mapcat\n                (fn [[_ type name & cb]]\n                  `[(instance? ~type ~e) (let [~name ~e] ~@cb)])\n                catches)\n             :else (throw ~e)))\n        ~@fin)\n      `(~'try*\n        ~@body\n        ~@fin))))",
          :filename "clojurescript/src/clj/cljs/core.clj",
          :lines [501 529],
          :link "https://github.com/clojure/clojurescript/blob/r971/src/clj/cljs/core.clj#L501-L529"},
 :full-name "special/finally",
 :clj-symbol "clojure.core/finally",
 :docstring "(try expr* catch-clause* finally-clause?)\n\n Special Form\n\n catch-clause => (catch protoname name expr*)\n finally-clause => (finally expr*)\n\nCatches and handles JavaScript exceptions."}

```
