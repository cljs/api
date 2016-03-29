## cljs.js/file->ns



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.10"><img valign="middle" alt="[+] 1.7.10" title="Added in 1.7.10" src="https://img.shields.io/badge/+-1.7.10-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(file->ns file)</samp><br>

---

 <samp>
(__file->ns__ file)<br>
</samp>

---







Source code @ [github]():

```clj
(defn file->ns
  [file]
  (let [lib-name (subs (string/replace file "/" ".")
                   0 (- (count file) 5))]
    (symbol (demunge lib-name))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.js/file->ns` @ crossclj](http://crossclj.info/fun/cljs.js.cljs/file-%3Ens.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.js/file-GTns.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.js",
 :name "file->ns",
 :signature ["[file]"],
 :name-encode "file-GTns",
 :history [["+" "1.7.10"]],
 :type "function",
 :full-name-encode "cljs.js/file-GTns",
 :source {:code "(defn file->ns\n  [file]\n  (let [lib-name (subs (string/replace file \"/\" \".\")\n                   0 (- (count file) 5))]\n    (symbol (demunge lib-name))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.40",
          :filename "src/main/cljs/cljs/js.cljs",
          :lines [35 39],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.40/src/main/cljs/cljs/js.cljs#L35-L39"},
 :usage ["(file->ns file)"],
 :full-name "cljs.js/file->ns",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.js/file-GTns.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.js/file->ns"]))
```

-->
