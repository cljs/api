## clojure.string/last-index-of



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.145"><img valign="middle" alt="[+] 1.7.145" title="Added in 1.7.145" src="https://img.shields.io/badge/+-1.7.145-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.string/last-index-of</samp>](http://clojure.github.io/clojure/branch-master/clojure.string-api.html#clojure.string/last-index-of)
</td>
</tr>
</table>

<samp>(last-index-of s value)</samp><br>
<samp>(last-index-of s value from-index)</samp><br>

---

 <samp>
(__last-index-of__ s value)<br>
</samp>
 <samp>
(__last-index-of__ s value from-index)<br>
</samp>

---





Source docstring:

```
Return last index of value (string or char) in s, optionally
searching backward from from-index or nil if not found.
```


Source code @ [github]():

```clj
(defn last-index-of
  ([s value]
   (let [result (.lastIndexOf s value)]
     (if (neg? result)
       nil
       result)))
  ([s value from-index]
   (let [result (.lastIndexOf s value from-index)]
     (if (neg? result)
       nil
       result))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.string/last-index-of` @ clojuredocs](http://clojuredocs.org/clojure.string/last-index-of)<br>
[`clojure.string/last-index-of` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.string/last-index-of/)<br>
[`clojure.string/last-index-of` @ crossclj](http://crossclj.info/fun/clojure.string/last-index-of.html)<br>
[`clojure.string/last-index-of` @ crossclj](http://crossclj.info/fun/clojure.string.cljs/last-index-of.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.string/last-index-of.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.string",
 :name "last-index-of",
 :signature ["[s value]" "[s value from-index]"],
 :name-encode "last-index-of",
 :history [["+" "1.7.145"]],
 :type "function",
 :clj-equiv {:full-name "clojure.string/last-index-of",
             :url "http://clojure.github.io/clojure/branch-master/clojure.string-api.html#clojure.string/last-index-of"},
 :full-name-encode "clojure.string/last-index-of",
 :source {:code "(defn last-index-of\n  ([s value]\n   (let [result (.lastIndexOf s value)]\n     (if (neg? result)\n       nil\n       result)))\n  ([s value from-index]\n   (let [result (.lastIndexOf s value from-index)]\n     (if (neg? result)\n       nil\n       result))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/clojure/string.cljs",
          :lines [231 243],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/clojure/string.cljs#L231-L243"},
 :usage ["(last-index-of s value)"
         "(last-index-of s value from-index)"],
 :full-name "clojure.string/last-index-of",
 :docstring "Return last index of value (string or char) in s, optionally\nsearching backward from from-index or nil if not found.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.string/last-index-of.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.string/last-index-of"]))
```

-->
