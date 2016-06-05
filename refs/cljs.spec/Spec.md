## cljs.spec/Spec



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github]():

```clj
(defprotocol Spec
  (conform* [spec x])
  (explain* [spec path via in x])
  (gen* [spec overrides path rmap])
  (with-gen* [spec gfn])
  (describe* [spec]))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.spec/Spec` @ crossclj](http://crossclj.info/fun/cljs.spec.cljs/Spec.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/Spec.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec",
 :name "Spec",
 :name-encode "Spec",
 :history [["+" "1.9.14"]],
 :type "protocol",
 :full-name-encode "cljs.spec/Spec",
 :source {:code "(defprotocol Spec\n  (conform* [spec x])\n  (explain* [spec path via in x])\n  (gen* [spec overrides path rmap])\n  (with-gen* [spec gfn])\n  (describe* [spec]))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/cljs/spec.cljs",
          :lines [37 42],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/cljs/spec.cljs#L37-L42"},
 :methods [{:name "conform*", :signature ["[spec x]"], :docstring nil}
           {:name "explain*",
            :signature ["[spec path via in x]"],
            :docstring nil}
           {:name "gen*",
            :signature ["[spec overrides path rmap]"],
            :docstring nil}
           {:name "with-gen*",
            :signature ["[spec gfn]"],
            :docstring nil}
           {:name "describe*", :signature ["[spec]"], :docstring nil}],
 :full-name "cljs.spec/Spec",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/Spec.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec/Spec"]))
```

-->
