## cljs.pprint/pprint-indent



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" title="Added in 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.pprint/pprint-indent</samp>](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/pprint-indent)
</td>
</tr>
</table>

<samp>(pprint-indent relative-to n)</samp><br>

---

 <samp>
(__pprint-indent__ relative-to n)<br>
</samp>

---





Source docstring:

```
Create an indent at this point in the pretty printing stream. This defines how
following lines are indented. relative-to can be either :block or :current depending
whether the indent should be computed relative to the start of the logical block or
the current column position. n is an offset.

This function is intended for use when writing custom dispatch functions.

Output is sent to *out* which must be a pretty printing writer.
```


Source code @ [github]():

```clj
(defn pprint-indent
  [relative-to n]
  (check-enumerated-arg relative-to #{:block :current})
  (indent *out* relative-to n))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.pprint/pprint-indent` @ clojuredocs](http://clojuredocs.org/clojure.pprint/pprint-indent)<br>
[`clojure.pprint/pprint-indent` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.pprint/pprint-indent/)<br>
[`clojure.pprint/pprint-indent` @ crossclj](http://crossclj.info/fun/clojure.pprint/pprint-indent.html)<br>
[`cljs.pprint/pprint-indent` @ crossclj](http://crossclj.info/fun/cljs.pprint.cljs/pprint-indent.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint/pprint-indent.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.pprint",
 :name "pprint-indent",
 :signature ["[relative-to n]"],
 :name-encode "pprint-indent",
 :history [["+" "0.0-3255"]],
 :type "function",
 :clj-equiv {:full-name "clojure.pprint/pprint-indent",
             :url "http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/pprint-indent"},
 :full-name-encode "cljs.pprint/pprint-indent",
 :source {:code "(defn pprint-indent\n  [relative-to n]\n  (check-enumerated-arg relative-to #{:block :current})\n  (indent *out* relative-to n))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.40",
          :filename "src/main/cljs/cljs/pprint.cljs",
          :lines [852 863],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.40/src/main/cljs/cljs/pprint.cljs#L852-L863"},
 :usage ["(pprint-indent relative-to n)"],
 :full-name "cljs.pprint/pprint-indent",
 :docstring "Create an indent at this point in the pretty printing stream. This defines how\nfollowing lines are indented. relative-to can be either :block or :current depending\nwhether the indent should be computed relative to the start of the logical block or\nthe current column position. n is an offset.\n\nThis function is intended for use when writing custom dispatch functions.\n\nOutput is sent to *out* which must be a pretty printing writer.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint/pprint-indent.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/pprint-indent"]))
```

-->
