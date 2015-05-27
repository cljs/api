## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> special/ns

 <table border="1">
<tr>
<td>special form</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/ns</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ns)
</td>
</tr>
</table>

 <samp>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1834
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:608-711](https://github.com/clojure/clojurescript/blob/r1834/src/clj/cljs/analyzer.clj#L608-L711)</ins>
</pre>

```clj
(defmethod parse 'ns
  [_ env [_ name & args :as form] _]
  (assert (symbol? name) "Namespaces must be named by a symbol.")
  (let [docstring (if (string? (first args)) (first args) nil)
        args      (if docstring (next args) args)
        excludes
        (reduce (fn [s [k exclude xs]]
                  (if (= k :refer-clojure)
                    (do
                      (assert (= exclude :exclude) "Only [:refer-clojure :exclude (names)] form supported")
                      (assert (not (seq s)) "Only one :refer-clojure form is allowed per namespace definition")
                      (into s xs))
                    s))
                #{} args)
        deps (atom #{})
        aliases (atom {:fns #{} :macros #{}})
        valid-forms (atom #{:use :use-macros :require :require-macros :import})
        error-msg (fn [spec msg] (str msg "; offending spec: " (pr-str spec)))
        parse-require-spec (fn parse-require-spec [macros? spec]
                             (assert (or (symbol? spec) (vector? spec))
                                     (error-msg spec "Only [lib.ns & options] and lib.ns specs supported in :require / :require-macros"))
                             (when (vector? spec)
                               (assert (symbol? (first spec))
                                       (error-msg spec "Library name must be specified as a symbol in :require / :require-macros"))
                               (assert (odd? (count spec))
                                       (error-msg spec "Only :as alias and :refer (names) options supported in :require"))
                               (assert (every? #{:as :refer} (map first (partition 2 (next spec))))
                                       (error-msg spec "Only :as and :refer options supported in :require / :require-macros"))
                               (assert (let [fs (frequencies (next spec))]
                                         (and (<= (fs :as 0) 1)
                                              (<= (fs :refer 0) 1)))
                                       (error-msg spec "Each of :as and :refer options may only be specified once in :require / :require-macros")))
                             (if (symbol? spec)
                               (recur macros? [spec])
                               (let [[lib & opts] spec
                                     {alias :as referred :refer :or {alias lib}} (apply hash-map opts)
                                     [rk uk] (if macros? [:require-macros :use-macros] [:require :use])]
                                 (when alias
                                   ;; we need to create a fake namespace so the reader knows about aliases
                                   ;; for resolving keywords like ::f/bar
                                   (binding [*ns* (create-ns name)]
                                     (let [^clojure.lang.Namespace ns (create-ns lib)]
                                       (clojure.core/alias alias (.name ns))))
                                   (let [alias-type (if macros? :macros :fns)]
                                     (assert (not (contains? (alias-type @aliases)
                                                             alias))
                                             (error-msg spec ":as alias must be unique"))
                                     (swap! aliases
                                            update-in [alias-type]
                                            conj alias)))
                                 (assert (or (symbol? alias) (nil? alias))
                                         (error-msg spec ":as must be followed by a symbol in :require / :require-macros"))
                                 (assert (or (and (sequential? referred) (every? symbol? referred))
                                             (nil? referred))
                                         (error-msg spec ":refer must be followed by a sequence of symbols in :require / :require-macros"))
                                 (when-not macros?
                                   (swap! deps conj lib))
                                 (merge (when alias {rk {alias lib}})
                                        (when referred {uk (apply hash-map (interleave referred (repeat lib)))})))))
        use->require (fn use->require [[lib kw referred :as spec]]
                       (assert (and (symbol? lib) (= :only kw) (sequential? referred) (every? symbol? referred))
                               (error-msg spec "Only [lib.ns :only (names)] specs supported in :use / :use-macros"))
                       [lib :refer referred])
        parse-import-spec (fn parse-import-spec [spec]
                            (assert (and (symbol? spec) (nil? (namespace spec)))
                                    (error-msg spec "Only lib.Ctor specs supported in :import"))
                            (swap! deps conj spec)
                            (let [ctor-sym (symbol (last (string/split (str spec) #"\.")))]
                              {:import  {ctor-sym spec}
                               :require {ctor-sym spec}}))
        spec-parsers {:require        (partial parse-require-spec false)
                      :require-macros (partial parse-require-spec true)
                      :use            (comp (partial parse-require-spec false) use->require)
                      :use-macros     (comp (partial parse-require-spec true) use->require)
                      :import         parse-import-spec}
        {uses :use requires :require uses-macros :use-macros requires-macros :require-macros imports :import :as params}
        (reduce (fn [m [k & libs]]
                  (assert (#{:use :use-macros :require :require-macros :import} k)
                          "Only :refer-clojure, :require, :require-macros, :use and :use-macros libspecs supported")
                  (assert (@valid-forms k)
                          (str "Only one " k " form is allowed per namespace definition"))
                  (swap! valid-forms disj k)
                  (apply merge-with merge m (map (spec-parsers k) libs)))
                {} (remove (fn [[r]] (= r :refer-clojure)) args))]
    (when (seq @deps)
      (analyze-deps @deps))
    (set! *cljs-ns* name)
    (load-core)
    (doseq [nsym (concat (vals requires-macros) (vals uses-macros))]
      (clojure.core/require nsym))
    (swap! namespaces #(-> %
                           (assoc-in [name :name] name)
                           (assoc-in [name :doc] docstring)
                           (assoc-in [name :excludes] excludes)
                           (assoc-in [name :uses] uses)
                           (assoc-in [name :requires] requires)
                           (assoc-in [name :uses-macros] uses-macros)
                           (assoc-in [name :requires-macros]
                                     (into {} (map (fn [[alias nsym]]
                                                     [alias (find-ns nsym)])
                                                   requires-macros)))
                           (assoc-in [name :imports] imports)))
    {:env env :op :ns :form form :name name :doc docstring :uses uses :requires requires :imports imports
     :uses-macros uses-macros :requires-macros requires-macros :excludes excludes}))
```


---

```clj
{:full-name "special/ns",
 :ns "special",
 :name "ns",
 :type "special form",
 :source {:code "(defmethod parse 'ns\n  [_ env [_ name & args :as form] _]\n  (assert (symbol? name) \"Namespaces must be named by a symbol.\")\n  (let [docstring (if (string? (first args)) (first args) nil)\n        args      (if docstring (next args) args)\n        excludes\n        (reduce (fn [s [k exclude xs]]\n                  (if (= k :refer-clojure)\n                    (do\n                      (assert (= exclude :exclude) \"Only [:refer-clojure :exclude (names)] form supported\")\n                      (assert (not (seq s)) \"Only one :refer-clojure form is allowed per namespace definition\")\n                      (into s xs))\n                    s))\n                #{} args)\n        deps (atom #{})\n        aliases (atom {:fns #{} :macros #{}})\n        valid-forms (atom #{:use :use-macros :require :require-macros :import})\n        error-msg (fn [spec msg] (str msg \"; offending spec: \" (pr-str spec)))\n        parse-require-spec (fn parse-require-spec [macros? spec]\n                             (assert (or (symbol? spec) (vector? spec))\n                                     (error-msg spec \"Only [lib.ns & options] and lib.ns specs supported in :require / :require-macros\"))\n                             (when (vector? spec)\n                               (assert (symbol? (first spec))\n                                       (error-msg spec \"Library name must be specified as a symbol in :require / :require-macros\"))\n                               (assert (odd? (count spec))\n                                       (error-msg spec \"Only :as alias and :refer (names) options supported in :require\"))\n                               (assert (every? #{:as :refer} (map first (partition 2 (next spec))))\n                                       (error-msg spec \"Only :as and :refer options supported in :require / :require-macros\"))\n                               (assert (let [fs (frequencies (next spec))]\n                                         (and (<= (fs :as 0) 1)\n                                              (<= (fs :refer 0) 1)))\n                                       (error-msg spec \"Each of :as and :refer options may only be specified once in :require / :require-macros\")))\n                             (if (symbol? spec)\n                               (recur macros? [spec])\n                               (let [[lib & opts] spec\n                                     {alias :as referred :refer :or {alias lib}} (apply hash-map opts)\n                                     [rk uk] (if macros? [:require-macros :use-macros] [:require :use])]\n                                 (when alias\n                                   ;; we need to create a fake namespace so the reader knows about aliases\n                                   ;; for resolving keywords like ::f/bar\n                                   (binding [*ns* (create-ns name)]\n                                     (let [^clojure.lang.Namespace ns (create-ns lib)]\n                                       (clojure.core/alias alias (.name ns))))\n                                   (let [alias-type (if macros? :macros :fns)]\n                                     (assert (not (contains? (alias-type @aliases)\n                                                             alias))\n                                             (error-msg spec \":as alias must be unique\"))\n                                     (swap! aliases\n                                            update-in [alias-type]\n                                            conj alias)))\n                                 (assert (or (symbol? alias) (nil? alias))\n                                         (error-msg spec \":as must be followed by a symbol in :require / :require-macros\"))\n                                 (assert (or (and (sequential? referred) (every? symbol? referred))\n                                             (nil? referred))\n                                         (error-msg spec \":refer must be followed by a sequence of symbols in :require / :require-macros\"))\n                                 (when-not macros?\n                                   (swap! deps conj lib))\n                                 (merge (when alias {rk {alias lib}})\n                                        (when referred {uk (apply hash-map (interleave referred (repeat lib)))})))))\n        use->require (fn use->require [[lib kw referred :as spec]]\n                       (assert (and (symbol? lib) (= :only kw) (sequential? referred) (every? symbol? referred))\n                               (error-msg spec \"Only [lib.ns :only (names)] specs supported in :use / :use-macros\"))\n                       [lib :refer referred])\n        parse-import-spec (fn parse-import-spec [spec]\n                            (assert (and (symbol? spec) (nil? (namespace spec)))\n                                    (error-msg spec \"Only lib.Ctor specs supported in :import\"))\n                            (swap! deps conj spec)\n                            (let [ctor-sym (symbol (last (string/split (str spec) #\"\\.\")))]\n                              {:import  {ctor-sym spec}\n                               :require {ctor-sym spec}}))\n        spec-parsers {:require        (partial parse-require-spec false)\n                      :require-macros (partial parse-require-spec true)\n                      :use            (comp (partial parse-require-spec false) use->require)\n                      :use-macros     (comp (partial parse-require-spec true) use->require)\n                      :import         parse-import-spec}\n        {uses :use requires :require uses-macros :use-macros requires-macros :require-macros imports :import :as params}\n        (reduce (fn [m [k & libs]]\n                  (assert (#{:use :use-macros :require :require-macros :import} k)\n                          \"Only :refer-clojure, :require, :require-macros, :use and :use-macros libspecs supported\")\n                  (assert (@valid-forms k)\n                          (str \"Only one \" k \" form is allowed per namespace definition\"))\n                  (swap! valid-forms disj k)\n                  (apply merge-with merge m (map (spec-parsers k) libs)))\n                {} (remove (fn [[r]] (= r :refer-clojure)) args))]\n    (when (seq @deps)\n      (analyze-deps @deps))\n    (set! *cljs-ns* name)\n    (load-core)\n    (doseq [nsym (concat (vals requires-macros) (vals uses-macros))]\n      (clojure.core/require nsym))\n    (swap! namespaces #(-> %\n                           (assoc-in [name :name] name)\n                           (assoc-in [name :doc] docstring)\n                           (assoc-in [name :excludes] excludes)\n                           (assoc-in [name :uses] uses)\n                           (assoc-in [name :requires] requires)\n                           (assoc-in [name :uses-macros] uses-macros)\n                           (assoc-in [name :requires-macros]\n                                     (into {} (map (fn [[alias nsym]]\n                                                     [alias (find-ns nsym)])\n                                                   requires-macros)))\n                           (assoc-in [name :imports] imports)))\n    {:env env :op :ns :form form :name name :doc docstring :uses uses :requires requires :imports imports\n     :uses-macros uses-macros :requires-macros requires-macros :excludes excludes}))",
          :filename "clojurescript/src/clj/cljs/analyzer.clj",
          :lines [608 711],
          :link "https://github.com/clojure/clojurescript/blob/r1834/src/clj/cljs/analyzer.clj#L608-L711"},
 :full-name-encode "special_ns",
 :clj-symbol "clojure.core/ns",
 :history [["+" "0.0-927"]]}

```
