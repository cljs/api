## cljs.core/Namespace



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.10"><img valign="middle" alt="[+] 1.7.10" title="Added in 1.7.10" src="https://img.shields.io/badge/+-1.7.10-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/Namespace</samp>](https://github.com/clojure/clojure/blob/clojure-1.8.0/src/jvm/clojure/lang/Namespace.java)
</td>
</tr>
</table>

<samp>(Namespace. obj name)</samp><br>

---

 <samp>
(__Namespace.__ obj name)<br>
</samp>

---







Source code @ [github]():

```clj
(deftype Namespace [obj name]
  Object
  (findInternedVar [this sym]
    (let [k (munge (str sym))]
      (when ^boolean (gobject/containsKey obj k)
        (let [var-sym (symbol (str name) (str sym))
              var-meta {:ns this}]
          (Var. (ns-lookup obj k) var-sym var-meta)))))
  (getName [_] name)
  (toString [_]
    (str name))
  IEquiv
  (-equiv [_ other]
    (if (instance? Namespace other)
      (= name (.-name other))
      false))
  IHash
  (-hash [_]
    (hash name)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.lang/Namespace` @ clojuredocs](http://clojuredocs.org/clojure.lang/Namespace)<br>
[`clojure.lang/Namespace` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/Namespace/)<br>
[`clojure.lang/Namespace` @ crossclj](http://crossclj.info/fun/clojure.lang/Namespace.html)<br>
[`cljs.core/Namespace` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/Namespace.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/Namespace.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "Namespace",
 :signature ["[obj name]"],
 :name-encode "Namespace",
 :history [["+" "1.7.10"]],
 :type "type",
 :clj-equiv {:full-name "clojure.lang/Namespace",
             :url "https://github.com/clojure/clojure/blob/clojure-1.8.0/src/jvm/clojure/lang/Namespace.java"},
 :full-name-encode "cljs.core/Namespace",
 :source {:code "(deftype Namespace [obj name]\n  Object\n  (findInternedVar [this sym]\n    (let [k (munge (str sym))]\n      (when ^boolean (gobject/containsKey obj k)\n        (let [var-sym (symbol (str name) (str sym))\n              var-meta {:ns this}]\n          (Var. (ns-lookup obj k) var-sym var-meta)))))\n  (getName [_] name)\n  (toString [_]\n    (str name))\n  IEquiv\n  (-equiv [_ other]\n    (if (instance? Namespace other)\n      (= name (.-name other))\n      false))\n  IHash\n  (-hash [_]\n    (hash name)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.51",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [10354 10372],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/cljs/cljs/core.cljs#L10354-L10372"},
 :usage ["(Namespace. obj name)"],
 :full-name "cljs.core/Namespace",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/Namespace.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/Namespace"]))
```

-->
