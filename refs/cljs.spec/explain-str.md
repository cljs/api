## cljs.spec/explain-str



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(explain-str spec x)</samp><br>

---

 <samp>
(__explain-str__ spec x)<br>
</samp>

---





Source docstring:

```
Given a spec and a value that fails to conform, returns an explanation as a string.
```


Source code @ [github]():

```clj
(defn explain-str
  [spec x]
  (with-out-str (explain spec x)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.spec/explain-str` @ crossclj](http://crossclj.info/fun/cljs.spec.cljs/explain-str.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/explain-str.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec",
 :name "explain-str",
 :signature ["[spec x]"],
 :name-encode "explain-str",
 :history [["+" "1.9.14"]],
 :type "function",
 :full-name-encode "cljs.spec/explain-str",
 :source {:code "(defn explain-str\n  [spec x]\n  (with-out-str (explain spec x)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/cljs/spec.cljs",
          :lines [195 198],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/cljs/spec.cljs#L195-L198"},
 :usage ["(explain-str spec x)"],
 :full-name "cljs.spec/explain-str",
 :docstring "Given a spec and a value that fails to conform, returns an explanation as a string.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/explain-str.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec/explain-str"]))
```

-->
