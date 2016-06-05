## cljs.core/MetaFn



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2234"><img valign="middle" alt="[+] 0.0-2234" title="Added in 0.0-2234" src="https://img.shields.io/badge/+-0.0--2234-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(MetaFn. afn meta)</samp><br>

---

 <samp>
(__MetaFn.__ afn meta)<br>
</samp>

---







Source code @ [github]():

```clj
(deftype MetaFn [afn meta]
  IMeta
  (-meta [_] meta)
  IWithMeta
  (-with-meta [_ new-meta]
    (MetaFn. afn new-meta))
  Fn
  IFn
  (-invoke [_]
    (afn))
  (-invoke [_ a]
    (afn a))
  (-invoke [_ a b]
    (afn a b))
  (-invoke [_ a b c]
    (afn a b c))
  (-invoke [_ a b c d]
    (afn a b c d))
  (-invoke [_ a b c d e]
    (afn a b c d e))
  (-invoke [_ a b c d e f]
    (afn a b c d e f))
  (-invoke [_ a b c d e f g]
    (afn a b c d e f g))
  (-invoke [_ a b c d e f g h]
    (afn a b c d e f g h))
  (-invoke [_ a b c d e f g h i]
    (afn a b c d e f g h i))
  (-invoke [_ a b c d e f g h i j]
    (afn a b c d e f g h i j))
  (-invoke [_ a b c d e f g h i j k]
    (afn a b c d e f g h i j k))
  (-invoke [_ a b c d e f g h i j k l]
    (afn a b c d e f g h i j k l))
  (-invoke [_ a b c d e f g h i j k l m]
    (afn a b c d e f g h i j k l m))
  (-invoke [_ a b c d e f g h i j k l m n]
    (afn a b c d e f g h i j k l m n))
  (-invoke [_ a b c d e f g h i j k l m n o]
    (afn a b c d e f g h i j k l m n o))
  (-invoke [_ a b c d e f g h i j k l m n o p]
    (afn a b c d e f g h i j k l m n o p))
  (-invoke [_ a b c d e f g h i j k l m n o p q]
    (afn a b c d e f g h i j k l m n o p q))
  (-invoke [_ a b c d e f g h i j k l m n o p q r]
    (afn a b c d e f g h i j k l m n o p q r))
  (-invoke [_ a b c d e f g h i j k l m n o p q r s]
    (afn a b c d e f g h i j k l m n o p q r s))
  (-invoke [_ a b c d e f g h i j k l m n o p q r s t]
    (afn a b c d e f g h i j k l m n o p q r s t))
  (-invoke [_ a b c d e f g h i j k l m n o p q r s t rest]
    (apply afn a b c d e f g h i j k l m n o p q r s t rest)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.core/MetaFn` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/MetaFn.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/MetaFn.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "MetaFn",
 :signature ["[afn meta]"],
 :name-encode "MetaFn",
 :history [["+" "0.0-2234"]],
 :type "type",
 :full-name-encode "cljs.core/MetaFn",
 :source {:code "(deftype MetaFn [afn meta]\n  IMeta\n  (-meta [_] meta)\n  IWithMeta\n  (-with-meta [_ new-meta]\n    (MetaFn. afn new-meta))\n  Fn\n  IFn\n  (-invoke [_]\n    (afn))\n  (-invoke [_ a]\n    (afn a))\n  (-invoke [_ a b]\n    (afn a b))\n  (-invoke [_ a b c]\n    (afn a b c))\n  (-invoke [_ a b c d]\n    (afn a b c d))\n  (-invoke [_ a b c d e]\n    (afn a b c d e))\n  (-invoke [_ a b c d e f]\n    (afn a b c d e f))\n  (-invoke [_ a b c d e f g]\n    (afn a b c d e f g))\n  (-invoke [_ a b c d e f g h]\n    (afn a b c d e f g h))\n  (-invoke [_ a b c d e f g h i]\n    (afn a b c d e f g h i))\n  (-invoke [_ a b c d e f g h i j]\n    (afn a b c d e f g h i j))\n  (-invoke [_ a b c d e f g h i j k]\n    (afn a b c d e f g h i j k))\n  (-invoke [_ a b c d e f g h i j k l]\n    (afn a b c d e f g h i j k l))\n  (-invoke [_ a b c d e f g h i j k l m]\n    (afn a b c d e f g h i j k l m))\n  (-invoke [_ a b c d e f g h i j k l m n]\n    (afn a b c d e f g h i j k l m n))\n  (-invoke [_ a b c d e f g h i j k l m n o]\n    (afn a b c d e f g h i j k l m n o))\n  (-invoke [_ a b c d e f g h i j k l m n o p]\n    (afn a b c d e f g h i j k l m n o p))\n  (-invoke [_ a b c d e f g h i j k l m n o p q]\n    (afn a b c d e f g h i j k l m n o p q))\n  (-invoke [_ a b c d e f g h i j k l m n o p q r]\n    (afn a b c d e f g h i j k l m n o p q r))\n  (-invoke [_ a b c d e f g h i j k l m n o p q r s]\n    (afn a b c d e f g h i j k l m n o p q r s))\n  (-invoke [_ a b c d e f g h i j k l m n o p q r s t]\n    (afn a b c d e f g h i j k l m n o p q r s t))\n  (-invoke [_ a b c d e f g h i j k l m n o p q r s t rest]\n    (apply afn a b c d e f g h i j k l m n o p q r s t rest)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [1862 1913],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/cljs/core.cljs#L1862-L1913"},
 :usage ["(MetaFn. afn meta)"],
 :full-name "cljs.core/MetaFn",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/MetaFn.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/MetaFn"]))
```

-->
