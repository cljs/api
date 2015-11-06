## cljs.repl.browser/parse-stacktrace



 <table border="1">
<tr>
<td>multimethod</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3053"><img valign="middle" alt="[+] 0.0-3053" title="Added in 0.0-3053" src="https://img.shields.io/badge/+-0.0--3053-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__parse-stacktrace__ repl-env st err opts)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3115/src/clj/cljs/repl/browser.clj#L191):

```clj
(defmulti parse-stacktrace (fn [repl-env st err opts] (:ua-product err)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3115
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:191](https://github.com/clojure/clojurescript/blob/r3115/src/clj/cljs/repl/browser.clj#L191)</ins>
</pre>

-->

---

Dispatch method @ [github](https://github.com/clojure/clojurescript/blob/r3115/src/clj/cljs/repl/browser.clj#L193-L194):

```clj
(defmethod parse-stacktrace :default
  [repl-env st err opts] st)
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3115
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:193-194](https://github.com/clojure/clojurescript/blob/r3115/src/clj/cljs/repl/browser.clj#L193-L194)</ins>
</pre>
-->

---
Dispatch method @ [github](https://github.com/clojure/clojurescript/blob/r3115/src/clj/cljs/repl/browser.clj#L255-L263):

```clj
(defmethod parse-stacktrace :chrome
  [repl-env st err opts]
  (->> st
    string/split-lines
    (drop-while #(.startsWith % "Error"))
    (take-while #(not (.startsWith % "    at eval")))
    (map #(chrome-st-el->frame % opts))
    (remove nil?)
    vec))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3115
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:255-263](https://github.com/clojure/clojurescript/blob/r3115/src/clj/cljs/repl/browser.clj#L255-L263)</ins>
</pre>
-->

---
Dispatch method @ [github](https://github.com/clojure/clojurescript/blob/r3115/src/clj/cljs/repl/browser.clj#L322-L331):

```clj
(defmethod parse-stacktrace :safari
  [repl-env st err opts]
  (->> st
    string/split-lines
    (drop-while #(.startsWith % "Error"))
    (take-while #(not (.startsWith % "eval code")))
    (remove string/blank?)
    (map #(safari-st-el->frame % opts))
    (remove nil?)
    vec))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3115
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:322-331](https://github.com/clojure/clojurescript/blob/r3115/src/clj/cljs/repl/browser.clj#L322-L331)</ins>
</pre>
-->

---
Dispatch method @ [github](https://github.com/clojure/clojurescript/blob/r3115/src/clj/cljs/repl/browser.clj#L417-L426):

```clj
(defmethod parse-stacktrace :firefox
  [repl-env st err opts]
  (->> st
    string/split-lines
    (drop-while #(.startsWith % "Error"))
    (take-while #(= (.indexOf % "> eval") -1))
    (remove string/blank?)
    (map #(firefox-st-el->frame % opts))
    (remove nil?)
    vec))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3115
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:417-426](https://github.com/clojure/clojurescript/blob/r3115/src/clj/cljs/repl/browser.clj#L417-L426)</ins>
</pre>
-->

---


###### External doc links:

[`cljs.repl.browser/parse-stacktrace` @ crossclj](http://crossclj.info/fun/cljs.repl.browser/parse-stacktrace.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser/parse-stacktrace.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.browser",
 :name "parse-stacktrace",
 :signature ["[repl-env st err opts]"],
 :history [["+" "0.0-3053"]],
 :type "multimethod",
 :full-name-encode "cljs.repl.browser/parse-stacktrace",
 :source {:code "(defmulti parse-stacktrace (fn [repl-env st err opts] (:ua-product err)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3115",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [191]},
 :extra-sources ({:code "(defmethod parse-stacktrace :default\n  [repl-env st err opts] st)",
                  :title "Dispatch method",
                  :repo "clojurescript",
                  :tag "r3115",
                  :filename "src/clj/cljs/repl/browser.clj",
                  :lines [193 194]}
                 {:code "(defmethod parse-stacktrace :chrome\n  [repl-env st err opts]\n  (->> st\n    string/split-lines\n    (drop-while #(.startsWith % \"Error\"))\n    (take-while #(not (.startsWith % \"    at eval\")))\n    (map #(chrome-st-el->frame % opts))\n    (remove nil?)\n    vec))",
                  :title "Dispatch method",
                  :repo "clojurescript",
                  :tag "r3115",
                  :filename "src/clj/cljs/repl/browser.clj",
                  :lines [255 263]}
                 {:code "(defmethod parse-stacktrace :safari\n  [repl-env st err opts]\n  (->> st\n    string/split-lines\n    (drop-while #(.startsWith % \"Error\"))\n    (take-while #(not (.startsWith % \"eval code\")))\n    (remove string/blank?)\n    (map #(safari-st-el->frame % opts))\n    (remove nil?)\n    vec))",
                  :title "Dispatch method",
                  :repo "clojurescript",
                  :tag "r3115",
                  :filename "src/clj/cljs/repl/browser.clj",
                  :lines [322 331]}
                 {:code "(defmethod parse-stacktrace :firefox\n  [repl-env st err opts]\n  (->> st\n    string/split-lines\n    (drop-while #(.startsWith % \"Error\"))\n    (take-while #(= (.indexOf % \"> eval\") -1))\n    (remove string/blank?)\n    (map #(firefox-st-el->frame % opts))\n    (remove nil?)\n    vec))",
                  :title "Dispatch method",
                  :repo "clojurescript",
                  :tag "r3115",
                  :filename "src/clj/cljs/repl/browser.clj",
                  :lines [417 426]}),
 :full-name "cljs.repl.browser/parse-stacktrace"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/parse-stacktrace"]))
```

-->
