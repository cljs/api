## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> special/js\*

 <table border="1">
<tr>
<td>special form</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r971
└── src
    └── clj
        └── cljs
            └── <ins>[compiler.clj:958-979](https://github.com/clojure/clojurescript/blob/r971/src/clj/cljs/compiler.clj#L958-L979)</ins>
</pre>

```clj
(defmethod parse 'js*
  [op env [_ form & args] _]
  (assert (string? form))
  (if args
    (disallowing-recur
     (let [seg (fn seg [^String s]
                 (let [idx (.indexOf s "~{")]
                   (if (= -1 idx)
                     (list s)
                     (let [end (.indexOf s "}" idx)]
                       (cons (subs s 0 idx) (seg (subs s (inc end))))))))
           enve (assoc env :context :expr)
           argexprs (vec (map #(analyze enve %) args))]
       {:env env :op :js :segs (seg form) :args argexprs :children argexprs}))
    (let [interp (fn interp [^String s]
                   (let [idx (.indexOf s "~{")]
                     (if (= -1 idx)
                       (list s)
                       (let [end (.indexOf s "}" idx)
                             inner (:name (resolve-existing-var env (symbol (subs s (+ 2 idx) end))))]
                         (cons (subs s 0 idx) (cons inner (interp (subs s (inc end)))))))))]
      {:env env :op :js :code (apply str (interp form))})))
```


---

```clj
{:full-name "special/js*",
 :ns "special",
 :name "js*",
 :type "special form",
 :source {:code "(defmethod parse 'js*\n  [op env [_ form & args] _]\n  (assert (string? form))\n  (if args\n    (disallowing-recur\n     (let [seg (fn seg [^String s]\n                 (let [idx (.indexOf s \"~{\")]\n                   (if (= -1 idx)\n                     (list s)\n                     (let [end (.indexOf s \"}\" idx)]\n                       (cons (subs s 0 idx) (seg (subs s (inc end))))))))\n           enve (assoc env :context :expr)\n           argexprs (vec (map #(analyze enve %) args))]\n       {:env env :op :js :segs (seg form) :args argexprs :children argexprs}))\n    (let [interp (fn interp [^String s]\n                   (let [idx (.indexOf s \"~{\")]\n                     (if (= -1 idx)\n                       (list s)\n                       (let [end (.indexOf s \"}\" idx)\n                             inner (:name (resolve-existing-var env (symbol (subs s (+ 2 idx) end))))]\n                         (cons (subs s 0 idx) (cons inner (interp (subs s (inc end)))))))))]\n      {:env env :op :js :code (apply str (interp form))})))",
          :filename "clojurescript/src/clj/cljs/compiler.clj",
          :lines [958 979],
          :link "https://github.com/clojure/clojurescript/blob/r971/src/clj/cljs/compiler.clj#L958-L979"},
 :full-name-encode "special_js_STAR_",
 :history [["+" "0.0-927"]]}

```
