## cljs.repl/default-special-fns



 <table border="1">
<tr>
<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-993"><img valign="middle" alt="[+] 0.0-993" title="Added in 0.0-993" src="https://img.shields.io/badge/+-0.0--993-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github]():

```clj
(def default-special-fns
  (let [load-file-fn
        (fn self
          ([repl-env env form]
            (self repl-env env form nil))
          ([repl-env env [_ file :as form] opts]
            (load-file repl-env file opts)))
        in-ns-fn
        (fn self
          ([repl-env env form]
           (self repl-env env form nil))
          ([repl-env env [_ [quote ns-name] :as form] _]
            ;; guard against craziness like '5 which wreaks havoc
           (when-not (and (= quote 'quote) (symbol? ns-name))
             (throw (IllegalArgumentException. "Argument to in-ns must be a symbol.")))
           (when-not (ana/get-namespace ns-name)
             (swap! env/*compiler* assoc-in [::ana/namespaces ns-name] {:name ns-name})
             (-evaluate repl-env "<cljs repl>" 1
               (str "goog.provide('" (comp/munge ns-name) "');")))
           (set! ana/*cljs-ns* ns-name)))]
    (wrap-special-fns wrap-self
     {'in-ns in-ns-fn
      'clojure.core/in-ns in-ns-fn
      'require
      (fn self
        ([repl-env env form]
         (self repl-env env form nil))
        ([repl-env env [_ & specs :as form] opts]
         (let [is-self-require? (self-require? specs)
               [target-ns restore-ns]
               (if-not is-self-require?
                 [ana/*cljs-ns* nil]
                 ['cljs.user ana/*cljs-ns*])]
           (evaluate-form repl-env env "<cljs repl>"
                          (with-meta
                            `(~'ns ~target-ns
                               (:require ~@(-> specs canonicalize-specs decorate-specs)))
                            {:merge true :line 1 :column 1})
                          identity opts)
           (when is-self-require?
             (set! ana/*cljs-ns* restore-ns)))))
      'require-macros
      (fn self
        ([repl-env env form]
         (self repl-env env form nil))
        ([repl-env env [_ & specs :as form] opts]
         (evaluate-form repl-env env "<cljs repl>"
                        (with-meta
                          `(~'ns ~ana/*cljs-ns*
                             (:require-macros ~@(-> specs canonicalize-specs decorate-specs)))
                          {:merge true :line 1 :column 1})
                        identity opts)))
      'import
      (fn self
        ([repl-env env form]
         (self repl-env env form nil))
        ([repl-env env [_ & specs :as form] opts]
         (evaluate-form repl-env env "<cljs repl>"
                        (with-meta
                          `(~'ns ~ana/*cljs-ns*
                             (:import
                              ~@(map
                                 (fn [quoted-spec-or-kw]
                                   (if (keyword? quoted-spec-or-kw)
                                     quoted-spec-or-kw
                                     (second quoted-spec-or-kw)))
                                 specs)))
                          {:merge true :line 1 :column 1})
                        identity opts)))
      'load-file load-file-fn
      'clojure.core/load-file load-file-fn
      'load-namespace
      (fn self
        ([repl-env env form]
         (self env repl-env form nil))
        ([repl-env env [_ ns :as form] opts]
         (load-namespace repl-env ns opts)))})))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.repl/default-special-fns` @ crossclj](http://crossclj.info/fun/cljs.repl/default-special-fns.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/default-special-fns.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl",
 :name "default-special-fns",
 :name-encode "default-special-fns",
 :history [["+" "0.0-993"]],
 :type "var",
 :full-name-encode "cljs.repl/default-special-fns",
 :source {:code "(def default-special-fns\n  (let [load-file-fn\n        (fn self\n          ([repl-env env form]\n            (self repl-env env form nil))\n          ([repl-env env [_ file :as form] opts]\n            (load-file repl-env file opts)))\n        in-ns-fn\n        (fn self\n          ([repl-env env form]\n           (self repl-env env form nil))\n          ([repl-env env [_ [quote ns-name] :as form] _]\n            ;; guard against craziness like '5 which wreaks havoc\n           (when-not (and (= quote 'quote) (symbol? ns-name))\n             (throw (IllegalArgumentException. \"Argument to in-ns must be a symbol.\")))\n           (when-not (ana/get-namespace ns-name)\n             (swap! env/*compiler* assoc-in [::ana/namespaces ns-name] {:name ns-name})\n             (-evaluate repl-env \"<cljs repl>\" 1\n               (str \"goog.provide('\" (comp/munge ns-name) \"');\")))\n           (set! ana/*cljs-ns* ns-name)))]\n    (wrap-special-fns wrap-self\n     {'in-ns in-ns-fn\n      'clojure.core/in-ns in-ns-fn\n      'require\n      (fn self\n        ([repl-env env form]\n         (self repl-env env form nil))\n        ([repl-env env [_ & specs :as form] opts]\n         (let [is-self-require? (self-require? specs)\n               [target-ns restore-ns]\n               (if-not is-self-require?\n                 [ana/*cljs-ns* nil]\n                 ['cljs.user ana/*cljs-ns*])]\n           (evaluate-form repl-env env \"<cljs repl>\"\n                          (with-meta\n                            `(~'ns ~target-ns\n                               (:require ~@(-> specs canonicalize-specs decorate-specs)))\n                            {:merge true :line 1 :column 1})\n                          identity opts)\n           (when is-self-require?\n             (set! ana/*cljs-ns* restore-ns)))))\n      'require-macros\n      (fn self\n        ([repl-env env form]\n         (self repl-env env form nil))\n        ([repl-env env [_ & specs :as form] opts]\n         (evaluate-form repl-env env \"<cljs repl>\"\n                        (with-meta\n                          `(~'ns ~ana/*cljs-ns*\n                             (:require-macros ~@(-> specs canonicalize-specs decorate-specs)))\n                          {:merge true :line 1 :column 1})\n                        identity opts)))\n      'import\n      (fn self\n        ([repl-env env form]\n         (self repl-env env form nil))\n        ([repl-env env [_ & specs :as form] opts]\n         (evaluate-form repl-env env \"<cljs repl>\"\n                        (with-meta\n                          `(~'ns ~ana/*cljs-ns*\n                             (:import\n                              ~@(map\n                                 (fn [quoted-spec-or-kw]\n                                   (if (keyword? quoted-spec-or-kw)\n                                     quoted-spec-or-kw\n                                     (second quoted-spec-or-kw)))\n                                 specs)))\n                          {:merge true :line 1 :column 1})\n                        identity opts)))\n      'load-file load-file-fn\n      'clojure.core/load-file load-file-fn\n      'load-namespace\n      (fn self\n        ([repl-env env form]\n         (self env repl-env form nil))\n        ([repl-env env [_ ns :as form] opts]\n         (load-namespace repl-env ns opts)))})))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.40",
          :filename "src/main/clojure/cljs/repl.cljc",
          :lines [651 727],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.40/src/main/clojure/cljs/repl.cljc#L651-L727"},
 :full-name "cljs.repl/default-special-fns",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/default-special-fns.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/default-special-fns"]))
```

-->
