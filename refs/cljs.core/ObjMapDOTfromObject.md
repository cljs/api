## cljs.core/ObjMap.fromObject



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(ObjMap.fromObject ks obj)</samp><br>

---

 <samp>
(__ObjMap.fromObject__ ks obj)<br>
</samp>

---







Source code @ [github]():

```clj
(set! (.-fromObject ObjMap) (fn [ks obj] (ObjMap. nil ks obj 0 nil)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.core/ObjMap.fromObject` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/ObjMap.fromObject.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/ObjMapDOTfromObject.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "ObjMap.fromObject",
 :signature ["[ks obj]"],
 :name-encode "ObjMapDOTfromObject",
 :history [["+" "0.0-927"]],
 :parent-type "ObjMap",
 :type "function",
 :full-name-encode "cljs.core/ObjMapDOTfromObject",
 :source {:code "(set! (.-fromObject ObjMap) (fn [ks obj] (ObjMap. nil ks obj 0 nil)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [5828],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/cljs/core.cljs#L5828"},
 :usage ["(ObjMap.fromObject ks obj)"],
 :full-name "cljs.core/ObjMap.fromObject",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/ObjMapDOTfromObject.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ObjMap.fromObject"]))
```

-->
