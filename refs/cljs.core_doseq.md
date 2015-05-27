## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/doseq

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/doseq</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/doseq)
</td>
</tr>
</table>

 <samp>
(__doseq__ seq-exprs & body)<br>
</samp>

```
Repeatedly executes body (presumably for side-effects) with
bindings and filtering as provided by "for".  Does not retain
the head of the sequence. Returns nil.
```

---

 <pre>
clojurescript @ r1820
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1110-1164](https://github.com/clojure/clojurescript/blob/r1820/src/clj/cljs/core.clj#L1110-L1164)</ins>
</pre>

```clj
(defmacro doseq
  [seq-exprs & body]
  (assert-args doseq
     (vector? seq-exprs) "a vector for its binding"
     (even? (count seq-exprs)) "an even number of forms in binding vector")
  (let [err (fn [& msg] (throw (ex-info (apply core/str msg) {})))
        step (fn step [recform exprs]
               (if-not exprs
                 [true `(do ~@body)]
                 (let [k (first exprs)
                       v (second exprs)

                       seqsym (gensym "seq__")
                       recform (if (keyword? k) recform `(recur (next ~seqsym) nil 0 0))
                       steppair (step recform (nnext exprs))
                       needrec (steppair 0)
                       subform (steppair 1)]
                   (cond
                     (= k :let) [needrec `(let ~v ~subform)]
                     (= k :while) [false `(when ~v
                                            ~subform
                                            ~@(when needrec [recform]))]
                     (= k :when) [false `(if ~v
                                           (do
                                             ~subform
                                             ~@(when needrec [recform]))
                                           ~recform)]
                     (keyword? k) (err "Invalid 'doseq' keyword" k)
                     :else (let [chunksym (with-meta (gensym "chunk__")
                                            {:tag 'not-native})
                                 countsym (gensym "count__")
                                 isym     (gensym "i__")
                                 recform-chunk  `(recur ~seqsym ~chunksym ~countsym (unchecked-inc ~isym))
                                 steppair-chunk (step recform-chunk (nnext exprs))
                                 subform-chunk  (steppair-chunk 1)]
                             [true `(loop [~seqsym   (seq ~v)
                                           ~chunksym nil
                                           ~countsym 0
                                           ~isym     0]
                                      (if (coercive-boolean (< ~isym ~countsym))
                                        (let [~k (-nth ~chunksym ~isym)]
                                          ~subform-chunk
                                          ~@(when needrec [recform-chunk]))
                                        (when-let [~seqsym (seq ~seqsym)]
                                          (if (chunked-seq? ~seqsym)
                                            (let [c# (chunk-first ~seqsym)]
                                              (recur (chunk-rest ~seqsym) c#
                                                     (count c#) 0))
                                            (let [~k (first ~seqsym)]
                                              ~subform
                                              ~@(when needrec [recform]))))))])))))]
    (nth (step nil (seq seq-exprs)) 1)))
```


---

```clj
{:ns "cljs.core",
 :name "doseq",
 :signature ["[seq-exprs & body]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_doseq",
 :source {:code "(defmacro doseq\n  [seq-exprs & body]\n  (assert-args doseq\n     (vector? seq-exprs) \"a vector for its binding\"\n     (even? (count seq-exprs)) \"an even number of forms in binding vector\")\n  (let [err (fn [& msg] (throw (ex-info (apply core/str msg) {})))\n        step (fn step [recform exprs]\n               (if-not exprs\n                 [true `(do ~@body)]\n                 (let [k (first exprs)\n                       v (second exprs)\n\n                       seqsym (gensym \"seq__\")\n                       recform (if (keyword? k) recform `(recur (next ~seqsym) nil 0 0))\n                       steppair (step recform (nnext exprs))\n                       needrec (steppair 0)\n                       subform (steppair 1)]\n                   (cond\n                     (= k :let) [needrec `(let ~v ~subform)]\n                     (= k :while) [false `(when ~v\n                                            ~subform\n                                            ~@(when needrec [recform]))]\n                     (= k :when) [false `(if ~v\n                                           (do\n                                             ~subform\n                                             ~@(when needrec [recform]))\n                                           ~recform)]\n                     (keyword? k) (err \"Invalid 'doseq' keyword\" k)\n                     :else (let [chunksym (with-meta (gensym \"chunk__\")\n                                            {:tag 'not-native})\n                                 countsym (gensym \"count__\")\n                                 isym     (gensym \"i__\")\n                                 recform-chunk  `(recur ~seqsym ~chunksym ~countsym (unchecked-inc ~isym))\n                                 steppair-chunk (step recform-chunk (nnext exprs))\n                                 subform-chunk  (steppair-chunk 1)]\n                             [true `(loop [~seqsym   (seq ~v)\n                                           ~chunksym nil\n                                           ~countsym 0\n                                           ~isym     0]\n                                      (if (coercive-boolean (< ~isym ~countsym))\n                                        (let [~k (-nth ~chunksym ~isym)]\n                                          ~subform-chunk\n                                          ~@(when needrec [recform-chunk]))\n                                        (when-let [~seqsym (seq ~seqsym)]\n                                          (if (chunked-seq? ~seqsym)\n                                            (let [c# (chunk-first ~seqsym)]\n                                              (recur (chunk-rest ~seqsym) c#\n                                                     (count c#) 0))\n                                            (let [~k (first ~seqsym)]\n                                              ~subform\n                                              ~@(when needrec [recform]))))))])))))]\n    (nth (step nil (seq seq-exprs)) 1)))",
          :filename "clojurescript/src/clj/cljs/core.clj",
          :lines [1110 1164],
          :link "https://github.com/clojure/clojurescript/blob/r1820/src/clj/cljs/core.clj#L1110-L1164"},
 :full-name "cljs.core/doseq",
 :clj-symbol "clojure.core/doseq",
 :docstring "Repeatedly executes body (presumably for side-effects) with\nbindings and filtering as provided by \"for\".  Does not retain\nthe head of the sequence. Returns nil."}

```
