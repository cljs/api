## cljs.core/RangedIterator



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2371"><img valign="middle" alt="[+] 0.0-2371" title="Added in 0.0-2371" src="https://img.shields.io/badge/+-0.0--2371-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(RangedIterator. i base arr v start end)</samp><br>

---

 <samp>
(__RangedIterator.__ i base arr v start end)<br>
</samp>

---







Source code @ [github]():

```clj
(deftype RangedIterator [^:mutable i ^:mutable base ^:mutable arr v start end]
  Object
  (hasNext [this]
    (< i end))
  (next [this]
    (when (== (- i base) 32)
      (set! arr (unchecked-array-for v i))
      (set! base (+ base 32)))
    (let [ret (aget arr (bit-and i 0x01f))]
      (set! i (inc i))
      ret)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.core/RangedIterator` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/RangedIterator.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/RangedIterator.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "RangedIterator",
 :signature ["[i base arr v start end]"],
 :name-encode "RangedIterator",
 :history [["+" "0.0-2371"]],
 :type "type",
 :full-name-encode "cljs.core/RangedIterator",
 :source {:code "(deftype RangedIterator [^:mutable i ^:mutable base ^:mutable arr v start end]\n  Object\n  (hasNext [this]\n    (< i end))\n  (next [this]\n    (when (== (- i base) 32)\n      (set! arr (unchecked-array-for v i))\n      (set! base (+ base 32)))\n    (let [ret (aget arr (bit-and i 0x01f))]\n      (set! i (inc i))\n      ret)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.40",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [4843 4853],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.40/src/main/cljs/cljs/core.cljs#L4843-L4853"},
 :usage ["(RangedIterator. i base arr v start end)"],
 :full-name "cljs.core/RangedIterator",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/RangedIterator.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/RangedIterator"]))
```

-->
