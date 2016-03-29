## cljs.reader/read-meta



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(read-meta rdr _)</samp><br>

---

 <samp>
(__read-meta__ rdr _)<br>
</samp>

---







Source code @ [github]():

```clj
(defn read-meta
  [rdr _]
  (let [m (desugar-meta (read rdr true nil true))]
    (when-not (map? m)
      (reader-error rdr "Metadata must be Symbol,Keyword,String or Map"))
    (let [o (read rdr true nil true)]
      (if (satisfies? IWithMeta o)
        (with-meta o (merge (meta o) m))
        (reader-error rdr "Metadata can only be applied to IWithMetas")))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.reader/read-meta` @ crossclj](http://crossclj.info/fun/cljs.reader.cljs/read-meta.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader/read-meta.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.reader",
 :name "read-meta",
 :signature ["[rdr _]"],
 :name-encode "read-meta",
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.reader/read-meta",
 :source {:code "(defn read-meta\n  [rdr _]\n  (let [m (desugar-meta (read rdr true nil true))]\n    (when-not (map? m)\n      (reader-error rdr \"Metadata must be Symbol,Keyword,String or Map\"))\n    (let [o (read rdr true nil true)]\n      (if (satisfies? IWithMeta o)\n        (with-meta o (merge (meta o) m))\n        (reader-error rdr \"Metadata can only be applied to IWithMetas\")))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.40",
          :filename "src/main/cljs/cljs/reader.cljs",
          :lines [386 394],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.40/src/main/cljs/cljs/reader.cljs#L386-L394"},
 :usage ["(read-meta rdr _)"],
 :full-name "cljs.reader/read-meta",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader/read-meta.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/read-meta"]))
```

-->
