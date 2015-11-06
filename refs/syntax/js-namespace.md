## js/ namespace



 <table border="1">
<tr>
<td>special namespace</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>js/foo</samp><br>
<samp>js/foo.bar</samp><br>

---


A special namespace used for accessing any symbol defined
in JavaScript's global scope.



---

###### Examples:

The following examples are run from a browser REPL.

Get the JavaScript global `document` object:

```clj
js/document
;;=> #<[object HTMLDocument]>
```

Display an alert:

```clj
(js/alert "Hello World")
;; displays alert popup
```

Log to console:

```clj
(js/console.log "Hello World")
;; displays in developer console
```

Create a JavaScript date object:

```clj
(js/Date.)
;;=> #inst "2015-07-14T00:25:33.881-00:00"
```



---

###### See Also:

[`Math/ namespace`](../syntax/Math-namespace.md)<br>
[`.`](../special/DOT.md)<br>
[`cljs.core/aget`](../cljs.core/aget.md)<br>
[`cljs.core/aset`](../cljs.core/aset.md)<br>

---








 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/js-namespace.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "A special namespace used for accessing any symbol defined\nin JavaScript's global scope.",
 :ns "syntax",
 :name "js-namespace",
 :history [["+" "0.0-927"]],
 :type "special namespace",
 :related ["syntax/Math-namespace"
           "special/."
           "cljs.core/aget"
           "cljs.core/aset"],
 :full-name-encode "syntax/js-namespace",
 :usage ["js/foo" "js/foo.bar"],
 :examples [{:id "06f234",
             :content "The following examples are run from a browser REPL.\n\nGet the JavaScript global `document` object:\n\n```clj\njs/document\n;;=> #<[object HTMLDocument]>\n```\n\nDisplay an alert:\n\n```clj\n(js/alert \"Hello World\")\n;; displays alert popup\n```\n\nLog to console:\n\n```clj\n(js/console.log \"Hello World\")\n;; displays in developer console\n```\n\nCreate a JavaScript date object:\n\n```clj\n(js/Date.)\n;;=> #inst \"2015-07-14T00:25:33.881-00:00\"\n```"}],
 :full-name "syntax/js-namespace",
 :display "js/ namespace"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/js-namespace"]))
```

-->
