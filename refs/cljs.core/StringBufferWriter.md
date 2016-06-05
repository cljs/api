## cljs.core/StringBufferWriter



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" title="Added in 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(StringBufferWriter. sb)</samp><br>

---

 <samp>
(__StringBufferWriter.__ sb)<br>
</samp>

---







Source code @ [github]():

```clj
(deftype StringBufferWriter [sb]
  IWriter
  (-write [_ s] (.append sb s))
  (-flush [_] nil))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.core/StringBufferWriter` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/StringBufferWriter.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/StringBufferWriter.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "StringBufferWriter",
 :signature ["[sb]"],
 :name-encode "StringBufferWriter",
 :history [["+" "0.0-1503"]],
 :type "type",
 :full-name-encode "cljs.core/StringBufferWriter",
 :source {:code "(deftype StringBufferWriter [sb]\n  IWriter\n  (-write [_ s] (.append sb s))\n  (-flush [_] nil))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [766 769],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/cljs/core.cljs#L766-L769"},
 :usage ["(StringBufferWriter. sb)"],
 :full-name "cljs.core/StringBufferWriter",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/StringBufferWriter.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/StringBufferWriter"]))
```

-->
