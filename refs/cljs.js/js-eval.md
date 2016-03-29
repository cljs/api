## cljs.js/js-eval



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.10"><img valign="middle" alt="[+] 1.7.10" title="Added in 1.7.10" src="https://img.shields.io/badge/+-1.7.10-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(js-eval {:keys \[source\], :as resource})</samp><br>

---

 <samp>
(__js-eval__ {:keys \[source\], :as resource})<br>
</samp>

---





Source docstring:

```
A default JavaScript evaluation function.
```


Source code @ [github]():

```clj
(defn js-eval
  [{:keys [source] :as resource}]
  (js/eval source))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.js/js-eval` @ crossclj](http://crossclj.info/fun/cljs.js.cljs/js-eval.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.js/js-eval.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.js",
 :name "js-eval",
 :signature ["[{:keys [source], :as resource}]"],
 :name-encode "js-eval",
 :history [["+" "1.7.10"]],
 :type "function",
 :full-name-encode "cljs.js/js-eval",
 :source {:code "(defn js-eval\n  [{:keys [source] :as resource}]\n  (js/eval source))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.40",
          :filename "src/main/cljs/cljs/js.cljs",
          :lines [101 104],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.40/src/main/cljs/cljs/js.cljs#L101-L104"},
 :usage ["(js-eval {:keys [source], :as resource})"],
 :full-name "cljs.js/js-eval",
 :docstring "A default JavaScript evaluation function.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.js/js-eval.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.js/js-eval"]))
```

-->
