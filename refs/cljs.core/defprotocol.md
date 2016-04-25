## cljs.core/defprotocol



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/defprotocol</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/defprotocol)
</td>
</tr>
</table>

<samp>(defprotocol psym & doc+methods)</samp><br>

---

 <samp>
(__defprotocol__ psym & doc+methods)<br>
</samp>

---





Source docstring:

```
A protocol is a named set of named methods and their signatures:

(defprotocol AProtocolName
  ;optional doc string
  "A doc string for AProtocol abstraction"

;method signatures
  (bar [this a b] "bar docs")
  (baz [this a] [this a b] [this a b c] "baz docs"))

No implementations are provided. Docs can be specified for the
protocol overall and for each method. The above yields a set of
polymorphic functions and a protocol object. All are
namespace-qualified by the ns enclosing the definition The resulting
functions dispatch on the type of their first argument, which is
required and corresponds to the implicit target object ('this' in
JavaScript parlance). defprotocol is dynamic, has no special compile-time
effect, and defines no new types.

(defprotocol P
  (foo [this])
  (bar-me [this] [this y]))

(deftype Foo [a b c]
  P
  (foo [this] a)
  (bar-me [this] b)
  (bar-me [this y] (+ c y)))

(bar-me (Foo. 1 2 3) 42)
=> 45

(foo
  (let [x 42]
    (reify P
      (foo [this] 17)
      (bar-me [this] x)
      (bar-me [this y] x))))
=> 17
```


Source code @ [github]():

```clj
(core/defmacro defprotocol
  [psym & doc+methods]
  (core/let [p (:name (cljs.analyzer/resolve-var (dissoc &env :locals) psym))
             [doc methods] (if (core/string? (first doc+methods))
                             [(first doc+methods) (next doc+methods)]
                             [nil doc+methods])
             psym (vary-meta psym assoc
                    :doc doc
                    :protocol-symbol true)
             ns-name (core/-> &env :ns :name)
             fqn (core/fn [n] (symbol (core/str ns-name "." n)))
             prefix (protocol-prefix p)
             _ (core/doseq [[mname & arities] methods]
                 (core/when (some #{0} (map count (filter vector? arities)))
                   (throw
                     #?(:clj (Exception.
                               (core/str "Invalid protocol, " psym
                                 " defines method " mname " with arity 0"))
                        :cljs (js/Error.
                                (core/str "Invalid protocol, " psym
                                  " defines method " mname " with arity 0"))))))
             expand-sig (core/fn [fname slot sig]
                          `(~sig
                             (if (and (not (nil? ~(first sig)))
                                      (not (nil? (. ~(first sig) ~(symbol (core/str "-" slot)))))) ;; Property access needed here.
                               (. ~(first sig) ~slot ~@sig)
                               (let [x# (if (nil? ~(first sig)) nil ~(first sig))
                                     m# (aget ~(fqn fname) (goog/typeOf x#))]
                                 (if-not (nil? m#)
                                   (m# ~@sig)
                                   (let [m# (aget ~(fqn fname) "_")]
                                     (if-not (nil? m#)
                                       (m# ~@sig)
                                       (throw
                                         (missing-protocol
                                           ~(core/str psym "." fname) ~(first sig))))))))))
             psym (core/-> psym
                    (vary-meta update-in [:jsdoc] conj
                      "@interface")
                    (vary-meta assoc-in [:protocol-info :methods]
                      (into {}
                        (map
                          (core/fn [[fname & sigs]]
                            (core/let [doc (core/as-> (last sigs) doc
                                             (core/when (core/string? doc) doc))
                                       sigs (take-while vector? sigs)]
                              [(vary-meta fname assoc :doc doc)
                               (vec sigs)]))
                          methods))))
             method (core/fn [[fname & sigs]]
                      (core/let [doc (core/as-> (last sigs) doc
                                       (core/when (core/string? doc) doc))
                                 sigs (take-while vector? sigs)
                                 amp (core/when (some #{'&} (apply concat sigs))
                                       (cljs.analyzer/warning
                                        :protocol-with-variadic-method
                                        &env {:protocol psym :name fname}))
                                 slot (symbol (core/str prefix (name fname)))
                                 fname (vary-meta fname assoc
                                         :protocol p
                                         :doc doc)]
                        `(defn ~fname
                           ~@(map (core/fn [sig]
                                    (expand-sig fname
                                      (symbol (core/str slot "$arity$" (count sig)))
                                      sig))
                               sigs))))]
    `(do
       (set! ~'*unchecked-if* true)
       (def ~psym (~'js* "function(){}"))
       ~@(map method methods)
       (set! ~'*unchecked-if* false))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.core/defprotocol` @ clojuredocs](http://clojuredocs.org/clojure.core/defprotocol)<br>
[`clojure.core/defprotocol` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/defprotocol/)<br>
[`clojure.core/defprotocol` @ crossclj](http://crossclj.info/fun/clojure.core/defprotocol.html)<br>
[`cljs.core/defprotocol` @ crossclj](http://crossclj.info/fun/cljs.core/defprotocol.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/defprotocol.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "defprotocol",
 :signature ["[psym & doc+methods]"],
 :name-encode "defprotocol",
 :history [["+" "0.0-927"]],
 :type "macro",
 :clj-equiv {:full-name "clojure.core/defprotocol",
             :url "http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/defprotocol"},
 :full-name-encode "cljs.core/defprotocol",
 :source {:code "(core/defmacro defprotocol\n  [psym & doc+methods]\n  (core/let [p (:name (cljs.analyzer/resolve-var (dissoc &env :locals) psym))\n             [doc methods] (if (core/string? (first doc+methods))\n                             [(first doc+methods) (next doc+methods)]\n                             [nil doc+methods])\n             psym (vary-meta psym assoc\n                    :doc doc\n                    :protocol-symbol true)\n             ns-name (core/-> &env :ns :name)\n             fqn (core/fn [n] (symbol (core/str ns-name \".\" n)))\n             prefix (protocol-prefix p)\n             _ (core/doseq [[mname & arities] methods]\n                 (core/when (some #{0} (map count (filter vector? arities)))\n                   (throw\n                     #?(:clj (Exception.\n                               (core/str \"Invalid protocol, \" psym\n                                 \" defines method \" mname \" with arity 0\"))\n                        :cljs (js/Error.\n                                (core/str \"Invalid protocol, \" psym\n                                  \" defines method \" mname \" with arity 0\"))))))\n             expand-sig (core/fn [fname slot sig]\n                          `(~sig\n                             (if (and (not (nil? ~(first sig)))\n                                      (not (nil? (. ~(first sig) ~(symbol (core/str \"-\" slot)))))) ;; Property access needed here.\n                               (. ~(first sig) ~slot ~@sig)\n                               (let [x# (if (nil? ~(first sig)) nil ~(first sig))\n                                     m# (aget ~(fqn fname) (goog/typeOf x#))]\n                                 (if-not (nil? m#)\n                                   (m# ~@sig)\n                                   (let [m# (aget ~(fqn fname) \"_\")]\n                                     (if-not (nil? m#)\n                                       (m# ~@sig)\n                                       (throw\n                                         (missing-protocol\n                                           ~(core/str psym \".\" fname) ~(first sig))))))))))\n             psym (core/-> psym\n                    (vary-meta update-in [:jsdoc] conj\n                      \"@interface\")\n                    (vary-meta assoc-in [:protocol-info :methods]\n                      (into {}\n                        (map\n                          (core/fn [[fname & sigs]]\n                            (core/let [doc (core/as-> (last sigs) doc\n                                             (core/when (core/string? doc) doc))\n                                       sigs (take-while vector? sigs)]\n                              [(vary-meta fname assoc :doc doc)\n                               (vec sigs)]))\n                          methods))))\n             method (core/fn [[fname & sigs]]\n                      (core/let [doc (core/as-> (last sigs) doc\n                                       (core/when (core/string? doc) doc))\n                                 sigs (take-while vector? sigs)\n                                 amp (core/when (some #{'&} (apply concat sigs))\n                                       (cljs.analyzer/warning\n                                        :protocol-with-variadic-method\n                                        &env {:protocol psym :name fname}))\n                                 slot (symbol (core/str prefix (name fname)))\n                                 fname (vary-meta fname assoc\n                                         :protocol p\n                                         :doc doc)]\n                        `(defn ~fname\n                           ~@(map (core/fn [sig]\n                                    (expand-sig fname\n                                      (symbol (core/str slot \"$arity$\" (count sig)))\n                                      sig))\n                               sigs))))]\n    `(do\n       (set! ~'*unchecked-if* true)\n       (def ~psym (~'js* \"function(){}\"))\n       ~@(map method methods)\n       (set! ~'*unchecked-if* false))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.51",
          :filename "src/main/clojure/cljs/core.cljc",
          :lines [1843 1953],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/clojure/cljs/core.cljc#L1843-L1953"},
 :usage ["(defprotocol psym & doc+methods)"],
 :full-name "cljs.core/defprotocol",
 :docstring "A protocol is a named set of named methods and their signatures:\n\n(defprotocol AProtocolName\n  ;optional doc string\n  \"A doc string for AProtocol abstraction\"\n\n;method signatures\n  (bar [this a b] \"bar docs\")\n  (baz [this a] [this a b] [this a b c] \"baz docs\"))\n\nNo implementations are provided. Docs can be specified for the\nprotocol overall and for each method. The above yields a set of\npolymorphic functions and a protocol object. All are\nnamespace-qualified by the ns enclosing the definition The resulting\nfunctions dispatch on the type of their first argument, which is\nrequired and corresponds to the implicit target object ('this' in\nJavaScript parlance). defprotocol is dynamic, has no special compile-time\neffect, and defines no new types.\n\n(defprotocol P\n  (foo [this])\n  (bar-me [this] [this y]))\n\n(deftype Foo [a b c]\n  P\n  (foo [this] a)\n  (bar-me [this] b)\n  (bar-me [this y] (+ c y)))\n\n(bar-me (Foo. 1 2 3) 42)\n=> 45\n\n(foo\n  (let [x 42]\n    (reify P\n      (foo [this] 17)\n      (bar-me [this] x)\n      (bar-me [this y] x))))\n=> 17",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/defprotocol.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/defprotocol"]))
```

-->
