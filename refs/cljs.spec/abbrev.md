## cljs.spec/abbrev



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(abbrev form)</samp><br>

---

 <samp>
(__abbrev__ form)<br>
</samp>

---







Source code @ [github]():

```clj
(defn abbrev [form]
  (cond
    (seq? form)
    (walk/postwalk (fn [form]
                     (cond
                       (c/and (symbol? form) (namespace form))
                       (-> form name symbol)

                       (c/and (seq? form) (= 'fn (first form)) (= '[%] (second form)))
                       (last form)

                       :else form))
                   form)

    (c/and (symbol? form) (namespace form))
    (-> form name symbol)

    :else form))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.spec/abbrev` @ crossclj](http://crossclj.info/fun/cljs.spec.cljs/abbrev.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/abbrev.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec",
 :name "abbrev",
 :signature ["[form]"],
 :name-encode "abbrev",
 :history [["+" "1.9.14"]],
 :type "function",
 :full-name-encode "cljs.spec/abbrev",
 :source {:code "(defn abbrev [form]\n  (cond\n    (seq? form)\n    (walk/postwalk (fn [form]\n                     (cond\n                       (c/and (symbol? form) (namespace form))\n                       (-> form name symbol)\n\n                       (c/and (seq? form) (= 'fn (first form)) (= '[%] (second form)))\n                       (last form)\n\n                       :else form))\n                   form)\n\n    (c/and (symbol? form) (namespace form))\n    (-> form name symbol)\n\n    :else form))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/cljs/spec.cljs",
          :lines [112 129],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/cljs/spec.cljs#L112-L129"},
 :usage ["(abbrev form)"],
 :full-name "cljs.spec/abbrev",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/abbrev.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec/abbrev"]))
```

-->
