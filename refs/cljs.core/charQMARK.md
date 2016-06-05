## cljs.core/char?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.10"><img valign="middle" alt="[+] 1.7.10" title="Added in 1.7.10" src="https://img.shields.io/badge/+-1.7.10-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/char?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/char?)
</td>
</tr>
</table>

<samp>(char? x)</samp><br>

---

 <samp>
(__char?__ x)<br>
</samp>

---





Source docstring:

```
Returns true if x is a JavaScript char.
```


Source code @ [github]():

```clj
(defn ^boolean char?
  [x]
  (gstring/isUnicodeChar x))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.core/char?` @ clojuredocs](http://clojuredocs.org/clojure.core/char_q)<br>
[`clojure.core/char?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/char%3F/)<br>
[`clojure.core/char?` @ crossclj](http://crossclj.info/fun/clojure.core/char%3F.html)<br>
[`cljs.core/char?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/char%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/charQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "char?",
 :signature ["[x]"],
 :name-encode "charQMARK",
 :history [["+" "1.7.10"]],
 :type "function",
 :clj-equiv {:full-name "clojure.core/char?",
             :url "http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/char?"},
 :full-name-encode "cljs.core/charQMARK",
 :source {:code "(defn ^boolean char?\n  [x]\n  (gstring/isUnicodeChar x))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [227 230],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/cljs/core.cljs#L227-L230"},
 :usage ["(char? x)"],
 :full-name "cljs.core/char?",
 :docstring "Returns true if x is a JavaScript char.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/charQMARK.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/char?"]))
```

-->
