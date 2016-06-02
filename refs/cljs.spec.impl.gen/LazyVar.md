## cljs.spec.impl.gen/LazyVar



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(LazyVar. f cached)</samp><br>

---

 <samp>
(__LazyVar.__ f cached)<br>
</samp>

---







Source code @ [github]():

```clj
(deftype LazyVar [f ^:mutable cached]
  IDeref
  (-deref [this]
    (if-not (nil? cached)
      cached
      (let [x (f)]
        (when-not (nil? x)
          (set! cached x))
        x))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.spec.impl.gen/LazyVar` @ crossclj](http://crossclj.info/fun/cljs.spec.impl.gen.cljs/LazyVar.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec.impl.gen/LazyVar.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec.impl.gen",
 :name "LazyVar",
 :signature ["[f cached]"],
 :name-encode "LazyVar",
 :history [["+" "1.9.14"]],
 :type "type",
 :full-name-encode "cljs.spec.impl.gen/LazyVar",
 :source {:code "(deftype LazyVar [f ^:mutable cached]\n  IDeref\n  (-deref [this]\n    (if-not (nil? cached)\n      cached\n      (let [x (f)]\n        (when-not (nil? x)\n          (set! cached x))\n        x))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/cljs/spec/impl/gen.cljs",
          :lines [16 24],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/cljs/spec/impl/gen.cljs#L16-L24"},
 :usage ["(LazyVar. f cached)"],
 :full-name "cljs.spec.impl.gen/LazyVar",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec.impl.gen/LazyVar.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec.impl.gen/LazyVar"]))
```

-->
