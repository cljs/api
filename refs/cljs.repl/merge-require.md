## ~~cljs.repl/merge-require~~



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2629"><img valign="middle" alt="[+] 0.0-2629" title="Added in 0.0-2629" src="https://img.shields.io/badge/+-0.0--2629-lightgrey.svg"></a> <a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2655"><img valign="middle" alt="[×] 0.0-2655" title="Removed in 0.0-2655" src="https://img.shields.io/badge/×-0.0--2655-red.svg"></a> </td>
</tr>
</table>

<samp>(merge-require requires \[lib :as spec\])</samp><br>

---

 <samp>
(__merge-require__ requires \[lib :as spec\])<br>
</samp>

---







Source code @ [github]():

```clj
(defn merge-require [requires [lib :as spec]]
  (let [[before [match & after]]
        (split-with
          (fn [[lib' & _]]
            (not= lib lib'))
          requires)]
    (if (nil? match)
      ;; no match, append to end
      (concat requires [spec])
      (if (= match spec)
        ;; dupe
        requires
        ;; merge
        (concat before [(merge-spec match spec)] after)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.repl/merge-require` @ crossclj](http://crossclj.info/fun/cljs.repl/merge-require.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/merge-require.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl",
 :name "merge-require",
 :signature ["[requires [lib :as spec]]"],
 :history [["+" "0.0-2629"] ["-" "0.0-2655"]],
 :type "function",
 :full-name-encode "cljs.repl/merge-require",
 :source {:code "(defn merge-require [requires [lib :as spec]]\n  (let [[before [match & after]]\n        (split-with\n          (fn [[lib' & _]]\n            (not= lib lib'))\n          requires)]\n    (if (nil? match)\n      ;; no match, append to end\n      (concat requires [spec])\n      (if (= match spec)\n        ;; dupe\n        requires\n        ;; merge\n        (concat before [(merge-spec match spec)] after)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2644",
          :filename "src/clj/cljs/repl.clj",
          :lines [211 224]},
 :usage ["(merge-require requires [lib :as spec])"],
 :full-name "cljs.repl/merge-require",
 :removed {:in "0.0-2655", :last-seen "0.0-2644"}}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/merge-require"]))
```

-->
