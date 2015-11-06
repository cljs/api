## Math/ namespace



 <table border="1">
<tr>
<td>special namespace</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/java_interop#toc6)
</td>
</tr>
</table>

<samp>Math/foo</samp><br>

---


A special namespace for direct access to the native JavaScript [Math library].

`Math/foo` => `js/Math.foo`

[Math library]:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math



---

###### Examples:

Math constants:

```clj
Math/E
;;=> 2.718281828459045

Math/PI
;;=> 3.141592653589793

Math/SQRT2
;;=> 1.4142135623730951
```

Math functions:

```clj
(Math/cos 0)
;;=> 1

(Math/atan2 1 0)
;;=> 1.5707963267948966

(Math/log Math/E)
;;=> 1

(Math/pow 2 5)
;;=> 32

(Math/pow Math/E (Math/log 1))
;;=> 1
```



---

###### See Also:

[`js/ namespace`](../syntax/js-namespace.md)<br>

---








 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/Math-namespace.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "A special namespace for direct access to the native JavaScript [Math library].\n\n`Math/foo` => `js/Math.foo`\n\n[Math library]:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math",
 :ns "syntax",
 :name "Math-namespace",
 :history [["+" "0.0-927"]],
 :type "special namespace",
 :related ["syntax/js-namespace"],
 :full-name-encode "syntax/Math-namespace",
 :usage ["Math/foo"],
 :examples [{:id "9cfeb0",
             :content "Math constants:\n\n```clj\nMath/E\n;;=> 2.718281828459045\n\nMath/PI\n;;=> 3.141592653589793\n\nMath/SQRT2\n;;=> 1.4142135623730951\n```\n\nMath functions:\n\n```clj\n(Math/cos 0)\n;;=> 1\n\n(Math/atan2 1 0)\n;;=> 1.5707963267948966\n\n(Math/log Math/E)\n;;=> 1\n\n(Math/pow 2 5)\n;;=> 32\n\n(Math/pow Math/E (Math/log 1))\n;;=> 1\n```"}],
 :full-name "syntax/Math-namespace",
 :display "Math/ namespace",
 :clj-doc "http://clojure.org/java_interop#toc6"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/Math-namespace"]))
```

-->
