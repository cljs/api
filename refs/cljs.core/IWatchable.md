## cljs.core/IWatchable



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>







Source docstring:

```
Protocol for types that can be watched. Currently only implemented by Atom.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3149/src/cljs/cljs/core.cljs#L539-L547):

```clj
(defprotocol IWatchable
  "Protocol for types that can be watched. Currently only implemented by Atom."
  (-notify-watches [this oldval newval]
    "Calls all watchers with this, oldval and newval.")
  (-add-watch [this key f]
    "Adds a watcher function f to this. Keys must be unique per reference,
     and can be used to remove the watch with -remove-watch.")
  (-remove-watch [this key]
    "Removes watcher that corresponds to key from this."))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3149
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:539-547](https://github.com/clojure/clojurescript/blob/r3149/src/cljs/cljs/core.cljs#L539-L547)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/IWatchable` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/IWatchable.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/IWatchable.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "IWatchable",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :full-name-encode "cljs.core/IWatchable",
 :source {:code "(defprotocol IWatchable\n  \"Protocol for types that can be watched. Currently only implemented by Atom.\"\n  (-notify-watches [this oldval newval]\n    \"Calls all watchers with this, oldval and newval.\")\n  (-add-watch [this key f]\n    \"Adds a watcher function f to this. Keys must be unique per reference,\n     and can be used to remove the watch with -remove-watch.\")\n  (-remove-watch [this key]\n    \"Removes watcher that corresponds to key from this.\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3149",
          :filename "src/cljs/cljs/core.cljs",
          :lines [539 547]},
 :methods [{:name "-notify-watches",
            :signature ["[this oldval newval]"],
            :docstring "Calls all watchers with this, oldval and newval."}
           {:name "-add-watch",
            :signature ["[this key f]"],
            :docstring "Adds a watcher function f to this. Keys must be unique per reference,\n     and can be used to remove the watch with -remove-watch."}
           {:name "-remove-watch",
            :signature ["[this key]"],
            :docstring "Removes watcher that corresponds to key from this."}],
 :full-name "cljs.core/IWatchable",
 :docstring "Protocol for types that can be watched. Currently only implemented by Atom."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IWatchable"]))
```

-->
