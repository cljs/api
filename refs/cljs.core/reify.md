## cljs.core/reify



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/reify</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/reify)
</td>
</tr>
</table>


 <samp>
(__reify__ & impls)<br>
</samp>

---





Source docstring:

```
reify is a macro with the following structure:

(reify options* specs*)

 Currently there are no options.

 Each spec consists of the protocol name followed by zero
 or more method bodies:

 protocol
 (methodName [args+] body)*

 Methods should be supplied for all methods of the desired
 protocol(s). You can also define overrides for Object methods. Note that
 the first parameter must be supplied to correspond to the target object
 ('this' in JavaScript parlance). Note also that recur calls
 to the method head should *not* pass the target object, it will be supplied
 automatically and can not be substituted.

 recur works to method heads The method bodies of reify are lexical
 closures, and can refer to the surrounding local scope:

 (str (let [f "foo"]
      (reify Object
        (toString [this] f))))
 == "foo"

 (seq (let [f "foo"]
      (reify ISeqable
        (-seq [this] (-seq f)))))
 == (\f \o \o))

 reify always implements IMeta and IWithMeta and transfers meta
 data of the form to the created object.

 (meta ^{:k :v} (reify Object (toString [this] "foo")))
 == {:k :v}
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3053/src/clj/cljs/core.clj#L620-L674):

```clj
(defmacro reify
  [& impls]
  (let [t        (with-meta (gensym "t") {:anonymous true})
        meta-sym (gensym "meta")
        this-sym (gensym "_")
        locals   (keys (:locals &env))
        ns       (-> &env :ns :name)
        munge    cljs.compiler/munge]
    `(do
       (when-not (exists? ~(symbol (core/str ns) (core/str t)))
         (deftype ~t [~@locals ~meta-sym]
           IWithMeta
           (~'-with-meta [~this-sym ~meta-sym]
             (new ~t ~@locals ~meta-sym))
           IMeta
           (~'-meta [~this-sym] ~meta-sym)
           ~@impls))
       (new ~t ~@locals ~(ana/elide-reader-meta (meta &form))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3053
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:620-674](https://github.com/clojure/clojurescript/blob/r3053/src/clj/cljs/core.clj#L620-L674)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/reify` @ clojuredocs](http://clojuredocs.org/clojure.core/reify)<br>
[`clojure.core/reify` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/reify/)<br>
[`clojure.core/reify` @ crossclj](http://crossclj.info/fun/clojure.core/reify.html)<br>
[`cljs.core/reify` @ crossclj](http://crossclj.info/fun/cljs.core/reify.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/reify.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "reify",
 :signature ["[& impls]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core/reify",
 :source {:code "(defmacro reify\n  [& impls]\n  (let [t        (with-meta (gensym \"t\") {:anonymous true})\n        meta-sym (gensym \"meta\")\n        this-sym (gensym \"_\")\n        locals   (keys (:locals &env))\n        ns       (-> &env :ns :name)\n        munge    cljs.compiler/munge]\n    `(do\n       (when-not (exists? ~(symbol (core/str ns) (core/str t)))\n         (deftype ~t [~@locals ~meta-sym]\n           IWithMeta\n           (~'-with-meta [~this-sym ~meta-sym]\n             (new ~t ~@locals ~meta-sym))\n           IMeta\n           (~'-meta [~this-sym] ~meta-sym)\n           ~@impls))\n       (new ~t ~@locals ~(ana/elide-reader-meta (meta &form))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3053",
          :filename "src/clj/cljs/core.clj",
          :lines [620 674]},
 :full-name "cljs.core/reify",
 :clj-symbol "clojure.core/reify",
 :docstring "reify is a macro with the following structure:\n\n(reify options* specs*)\n\n Currently there are no options.\n\n Each spec consists of the protocol name followed by zero\n or more method bodies:\n\n protocol\n (methodName [args+] body)*\n\n Methods should be supplied for all methods of the desired\n protocol(s). You can also define overrides for Object methods. Note that\n the first parameter must be supplied to correspond to the target object\n ('this' in JavaScript parlance). Note also that recur calls\n to the method head should *not* pass the target object, it will be supplied\n automatically and can not be substituted.\n\n recur works to method heads The method bodies of reify are lexical\n closures, and can refer to the surrounding local scope:\n\n (str (let [f \"foo\"]\n      (reify Object\n        (toString [this] f))))\n == \"foo\"\n\n (seq (let [f \"foo\"]\n      (reify ISeqable\n        (-seq [this] (-seq f)))))\n == (\\f \\o \\o))\n\n reify always implements IMeta and IWithMeta and transfers meta\n data of the form to the created object.\n\n (meta ^{:k :v} (reify Object (toString [this] \"foo\")))\n == {:k :v}"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/reify"]))
```

-->
