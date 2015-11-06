## cljs.core/defn



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/defn</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/defn)
</td>
</tr>
</table>


 <samp>
(__defn__ name doc-string? attr-map? \[params\*\] prepost-map? body)<br>
</samp>
 <samp>
(__defn__ name doc-string? attr-map? (\[params\*\] prepost-map? body) + attr-map?)<br>
</samp>

---

Defines a function.

`doc-string?` is an optional documentation string.

`attr-map?` is an optional map of [metadata](http://clojure.org/metadata) to
attach to the global variable name.

`prepost-map?` is an optional map with optional keys `:pre` and `:post` that
contain collections of [pre or post conditions](http://blog.fogus.me/2009/12/21/clojures-pre-and-post/)
for the function.

<table class="code-tbl-9bef6">
  <thead>
    <tr>
      <th>Code</th>
      <th>Expands To</th></tr></thead>
  <tbody>
    <tr>
      <td><pre>
(defn foo [a b c]
  (\* a b c))</pre></td>
      <td><pre>
(def foo
  (fn [a b c]
    (\* a b c)))</pre></td></tr></tbody></table>



---


###### See Also:

[`def`](../special/def.md)<br>
[`cljs.core/defn-`](../cljs.core/defn-.md)<br>
[`cljs.core/defmacro`](../cljs.core/defmacro.md)<br>
[`cljs.core/fn`](../cljs.core/fn.md)<br>

---


Source docstring:

```
Same as (def name (core/fn [params* ] exprs*)) or (def
 name (core/fn ([params* ] exprs*)+)) with any doc-string or attrs added
 to the var metadata. prepost-map defines a map with optional keys
 :pre and :post that contain collections of pre or post conditions.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.107/src/main/clojure/cljs/core.cljc#L2786-L2856):

```clj
(def
  ^{:doc "Same as (def name (core/fn [params* ] exprs*)) or (def
    name (core/fn ([params* ] exprs*)+)) with any doc-string or attrs added
    to the var metadata. prepost-map defines a map with optional keys
    :pre and :post that contain collections of pre or post conditions."
    :arglists '([name doc-string? attr-map? [params*] prepost-map? body]
                 [name doc-string? attr-map? ([params*] prepost-map? body)+ attr-map?])}
  defn (core/fn defn [&form &env name & fdecl]
         ;; Note: Cannot delegate this check to def because of the call to (with-meta name ..)
         (if (core/instance? #?(:clj clojure.lang.Symbol :cljs Symbol) name)
           nil
           (throw
             #?(:clj (IllegalArgumentException. "First argument to defn must be a symbol")
                :cljs (js/Error. "First argument to defn must be a symbol"))))
         (core/let [m (if (core/string? (first fdecl))
                        {:doc (first fdecl)}
                        {})
                    fdecl (if (core/string? (first fdecl))
                            (next fdecl)
                            fdecl)
                    m (if (map? (first fdecl))
                        (conj m (first fdecl))
                        m)
                    fdecl (if (map? (first fdecl))
                            (next fdecl)
                            fdecl)
                    fdecl (if (vector? (first fdecl))
                            (core/list fdecl)
                            fdecl)
                    m (if (map? (last fdecl))
                        (conj m (last fdecl))
                        m)
                    fdecl (if (map? (last fdecl))
                            (butlast fdecl)
                            fdecl)
                    m (conj {:arglists (core/list 'quote (sigs fdecl))} m)
                    ;; no support for :inline
                    ;m (core/let [inline (:inline m)
                    ;             ifn (first inline)
                    ;             iname (second inline)]
                    ;    ;; same as: (if (and (= 'fn ifn) (not (symbol? iname))) ...)
                    ;    (if (if #?(:clj (clojure.lang.Util/equiv 'fn ifn)
                    ;               :cljs (= 'fn ifn))
                    ;          (if #?(:clj (core/instance? clojure.lang.Symbol iname)
                    ;                 :cljs (core/instance? Symbol iname)) false true))
                    ;      ;; inserts the same fn name to the inline fn if it does not have one
                    ;      (assoc m
                    ;        :inline (cons ifn
                    ;                  (cons (clojure.lang.Symbol/intern
                    ;                          (.concat (.getName ^clojure.lang.Symbol name) "__inliner"))
                    ;                    (next inline))))
                    ;      m))
                    m (conj (if (meta name) (meta name) {}) m)]
           (core/cond
             (multi-arity-fn? fdecl)
             (multi-arity-fn name
               (if (comp/checking-types?)
                 (update-in m [:jsdoc] conj "@param {...*} var_args")
                 m) fdecl)

             (variadic-fn? fdecl)
             (variadic-fn name
               (if (comp/checking-types?)
                 (update-in m [:jsdoc] conj "@param {...*} var_args")
                 m) fdecl)

             :else
             (core/list 'def (with-meta name m)
               ;;todo - restore propagation of fn name
               ;;must figure out how to convey primitive hints to self calls first
               (cons `fn fdecl))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.107
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[core.cljc:2786-2856](https://github.com/clojure/clojurescript/blob/r1.7.107/src/main/clojure/cljs/core.cljc#L2786-L2856)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/defn` @ clojuredocs](http://clojuredocs.org/clojure.core/defn)<br>
[`clojure.core/defn` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/defn/)<br>
[`clojure.core/defn` @ crossclj](http://crossclj.info/fun/clojure.core/defn.html)<br>
[`cljs.core/defn` @ crossclj](http://crossclj.info/fun/cljs.core/defn.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/defn.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Defines a function.\n\n`doc-string?` is an optional documentation string.\n\n`attr-map?` is an optional map of [metadata](http://clojure.org/metadata) to\nattach to the global variable name.\n\n`prepost-map?` is an optional map with optional keys `:pre` and `:post` that\ncontain collections of [pre or post conditions](http://blog.fogus.me/2009/12/21/clojures-pre-and-post/)\nfor the function.\n\n<table class=\"code-tbl-9bef6\">\n  <thead>\n    <tr>\n      <th>Code</th>\n      <th>Expands To</th></tr></thead>\n  <tbody>\n    <tr>\n      <td><pre>\n(defn foo [a b c]\n  (\\* a b c))</pre></td>\n      <td><pre>\n(def foo\n  (fn [a b c]\n    (\\* a b c)))</pre></td></tr></tbody></table>",
 :ns "cljs.core",
 :name "defn",
 :signature ["[name doc-string? attr-map? [params*] prepost-map? body]"
             "[name doc-string? attr-map? ([params*] prepost-map? body) + attr-map?]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :related ["special/def"
           "cljs.core/defn-"
           "cljs.core/defmacro"
           "cljs.core/fn"],
 :full-name-encode "cljs.core/defn",
 :source {:code "(def\n  ^{:doc \"Same as (def name (core/fn [params* ] exprs*)) or (def\n    name (core/fn ([params* ] exprs*)+)) with any doc-string or attrs added\n    to the var metadata. prepost-map defines a map with optional keys\n    :pre and :post that contain collections of pre or post conditions.\"\n    :arglists '([name doc-string? attr-map? [params*] prepost-map? body]\n                 [name doc-string? attr-map? ([params*] prepost-map? body)+ attr-map?])}\n  defn (core/fn defn [&form &env name & fdecl]\n         ;; Note: Cannot delegate this check to def because of the call to (with-meta name ..)\n         (if (core/instance? #?(:clj clojure.lang.Symbol :cljs Symbol) name)\n           nil\n           (throw\n             #?(:clj (IllegalArgumentException. \"First argument to defn must be a symbol\")\n                :cljs (js/Error. \"First argument to defn must be a symbol\"))))\n         (core/let [m (if (core/string? (first fdecl))\n                        {:doc (first fdecl)}\n                        {})\n                    fdecl (if (core/string? (first fdecl))\n                            (next fdecl)\n                            fdecl)\n                    m (if (map? (first fdecl))\n                        (conj m (first fdecl))\n                        m)\n                    fdecl (if (map? (first fdecl))\n                            (next fdecl)\n                            fdecl)\n                    fdecl (if (vector? (first fdecl))\n                            (core/list fdecl)\n                            fdecl)\n                    m (if (map? (last fdecl))\n                        (conj m (last fdecl))\n                        m)\n                    fdecl (if (map? (last fdecl))\n                            (butlast fdecl)\n                            fdecl)\n                    m (conj {:arglists (core/list 'quote (sigs fdecl))} m)\n                    ;; no support for :inline\n                    ;m (core/let [inline (:inline m)\n                    ;             ifn (first inline)\n                    ;             iname (second inline)]\n                    ;    ;; same as: (if (and (= 'fn ifn) (not (symbol? iname))) ...)\n                    ;    (if (if #?(:clj (clojure.lang.Util/equiv 'fn ifn)\n                    ;               :cljs (= 'fn ifn))\n                    ;          (if #?(:clj (core/instance? clojure.lang.Symbol iname)\n                    ;                 :cljs (core/instance? Symbol iname)) false true))\n                    ;      ;; inserts the same fn name to the inline fn if it does not have one\n                    ;      (assoc m\n                    ;        :inline (cons ifn\n                    ;                  (cons (clojure.lang.Symbol/intern\n                    ;                          (.concat (.getName ^clojure.lang.Symbol name) \"__inliner\"))\n                    ;                    (next inline))))\n                    ;      m))\n                    m (conj (if (meta name) (meta name) {}) m)]\n           (core/cond\n             (multi-arity-fn? fdecl)\n             (multi-arity-fn name\n               (if (comp/checking-types?)\n                 (update-in m [:jsdoc] conj \"@param {...*} var_args\")\n                 m) fdecl)\n\n             (variadic-fn? fdecl)\n             (variadic-fn name\n               (if (comp/checking-types?)\n                 (update-in m [:jsdoc] conj \"@param {...*} var_args\")\n                 m) fdecl)\n\n             :else\n             (core/list 'def (with-meta name m)\n               ;;todo - restore propagation of fn name\n               ;;must figure out how to convey primitive hints to self calls first\n               (cons `fn fdecl))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.107",
          :filename "src/main/clojure/cljs/core.cljc",
          :lines [2786 2856]},
 :full-name "cljs.core/defn",
 :clj-symbol "clojure.core/defn",
 :docstring "Same as (def name (core/fn [params* ] exprs*)) or (def\n name (core/fn ([params* ] exprs*)+)) with any doc-string or attrs added\n to the var metadata. prepost-map defines a map with optional keys\n :pre and :post that contain collections of pre or post conditions."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/defn"]))
```

-->
