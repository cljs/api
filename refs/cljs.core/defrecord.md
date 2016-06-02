## cljs.core/defrecord



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/defrecord</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/defrecord)
</td>
</tr>
</table>

<samp>(defrecord rsym fields & impls)</samp><br>

---

 <samp>
(__defrecord__ rsym fields & impls)<br>
</samp>

---





Source docstring:

```
(defrecord name [fields*]  options* specs*)

Currently there are no options.

Each spec consists of a protocol or interface name followed by zero
or more method bodies:

protocol-or-Object
(methodName [args*] body)*

The record will have the (immutable) fields named by
fields, which can have type hints. Protocols and methods
are optional. The only methods that can be supplied are those
declared in the protocols.  Note that method bodies are
not closures, the local environment includes only the named fields,
and those fields can be accessed directly.

Method definitions take the form:

(methodname [args*] body)

The argument and return types can be hinted on the arg and
methodname symbols. If not supplied, they will be inferred, so type
hints should be reserved for disambiguation.

Methods should be supplied for all methods of the desired
protocol(s). You can also define overrides for
methods of Object. Note that a parameter must be supplied to
correspond to the target object ('this' in JavaScript parlance). Note also
that recur calls to the method head should *not* pass the target object, it
will be supplied automatically and can not be substituted.

In the method bodies, the (unqualified) name can be used to name the
class (for calls to new, instance? etc).

The type will have implementations of several ClojureScript
protocol generated automatically: IMeta/IWithMeta (metadata support) and
IMap, etc.

In addition, defrecord will define type-and-value-based =,
and will define ClojureScript IHash and IEquiv.

Two constructors will be defined, one taking the designated fields
followed by a metadata map (nil for none) and an extension field
map (nil for none), and one taking only the fields (using nil for
meta and extension fields). Note that the field names __meta
and __extmap are currently reserved and should not be used when
defining your own records.

Given (defrecord TypeName ...), two factory functions will be
defined: ->TypeName, taking positional parameters for the fields,
and map->TypeName, taking a map of keywords to field values.
```


Source code @ [github]():

```clj
(core/defmacro defrecord
  [rsym fields & impls]
  (validate-fields "defrecord" rsym fields)
  (core/let [rsym (vary-meta rsym assoc :internal-ctor true)
             r    (vary-meta
                    (:name (cljs.analyzer/resolve-var (dissoc &env :locals) rsym))
                    assoc :internal-ctor true)]
    `(let []
       ~(emit-defrecord &env rsym r fields impls)
       (set! (.-getBasis ~r) (fn [] '[~@fields]))
       (set! (.-cljs$lang$type ~r) true)
       (set! (.-cljs$lang$ctorPrSeq ~r) (fn [this#] (cljs.core/list ~(core/str r))))
       (set! (.-cljs$lang$ctorPrWriter ~r) (fn [this# writer#] (-write writer# ~(core/str r))))
       ~(build-positional-factory rsym r fields)
       ~(build-map-factory rsym r fields)
       ~r)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.core/defrecord` @ clojuredocs](http://clojuredocs.org/clojure.core/defrecord)<br>
[`clojure.core/defrecord` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/defrecord/)<br>
[`clojure.core/defrecord` @ crossclj](http://crossclj.info/fun/clojure.core/defrecord.html)<br>
[`cljs.core/defrecord` @ crossclj](http://crossclj.info/fun/cljs.core/defrecord.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/defrecord.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "defrecord",
 :signature ["[rsym fields & impls]"],
 :name-encode "defrecord",
 :history [["+" "0.0-927"]],
 :type "macro",
 :clj-equiv {:full-name "clojure.core/defrecord",
             :url "http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/defrecord"},
 :full-name-encode "cljs.core/defrecord",
 :source {:code "(core/defmacro defrecord\n  [rsym fields & impls]\n  (validate-fields \"defrecord\" rsym fields)\n  (core/let [rsym (vary-meta rsym assoc :internal-ctor true)\n             r    (vary-meta\n                    (:name (cljs.analyzer/resolve-var (dissoc &env :locals) rsym))\n                    assoc :internal-ctor true)]\n    `(let []\n       ~(emit-defrecord &env rsym r fields impls)\n       (set! (.-getBasis ~r) (fn [] '[~@fields]))\n       (set! (.-cljs$lang$type ~r) true)\n       (set! (.-cljs$lang$ctorPrSeq ~r) (fn [this#] (cljs.core/list ~(core/str r))))\n       (set! (.-cljs$lang$ctorPrWriter ~r) (fn [this# writer#] (-write writer# ~(core/str r))))\n       ~(build-positional-factory rsym r fields)\n       ~(build-map-factory rsym r fields)\n       ~r)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/clojure/cljs/core.cljc",
          :lines [1777 1844],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/clojure/cljs/core.cljc#L1777-L1844"},
 :usage ["(defrecord rsym fields & impls)"],
 :full-name "cljs.core/defrecord",
 :docstring "(defrecord name [fields*]  options* specs*)\n\nCurrently there are no options.\n\nEach spec consists of a protocol or interface name followed by zero\nor more method bodies:\n\nprotocol-or-Object\n(methodName [args*] body)*\n\nThe record will have the (immutable) fields named by\nfields, which can have type hints. Protocols and methods\nare optional. The only methods that can be supplied are those\ndeclared in the protocols.  Note that method bodies are\nnot closures, the local environment includes only the named fields,\nand those fields can be accessed directly.\n\nMethod definitions take the form:\n\n(methodname [args*] body)\n\nThe argument and return types can be hinted on the arg and\nmethodname symbols. If not supplied, they will be inferred, so type\nhints should be reserved for disambiguation.\n\nMethods should be supplied for all methods of the desired\nprotocol(s). You can also define overrides for\nmethods of Object. Note that a parameter must be supplied to\ncorrespond to the target object ('this' in JavaScript parlance). Note also\nthat recur calls to the method head should *not* pass the target object, it\nwill be supplied automatically and can not be substituted.\n\nIn the method bodies, the (unqualified) name can be used to name the\nclass (for calls to new, instance? etc).\n\nThe type will have implementations of several ClojureScript\nprotocol generated automatically: IMeta/IWithMeta (metadata support) and\nIMap, etc.\n\nIn addition, defrecord will define type-and-value-based =,\nand will define ClojureScript IHash and IEquiv.\n\nTwo constructors will be defined, one taking the designated fields\nfollowed by a metadata map (nil for none) and an extension field\nmap (nil for none), and one taking only the fields (using nil for\nmeta and extension fields). Note that the field names __meta\nand __extmap are currently reserved and should not be used when\ndefining your own records.\n\nGiven (defrecord TypeName ...), two factory functions will be\ndefined: ->TypeName, taking positional parameters for the fields,\nand map->TypeName, taking a map of keywords to field values.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/defrecord.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/defrecord"]))
```

-->
