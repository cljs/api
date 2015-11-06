## #inst literal



 <table border="1">
<tr>
<td>tagged literal</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](https://github.com/clojure/clojure/blob/clojure-1.6.0/src/clj/clojure/core.clj#L6947)
</td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/I8uNXHv.png"> edn doc](https://github.com/edn-format/edn#inst-rfc-3339-format)
</td>
</tr>
</table>

<samp>#inst "yyyy-mm-dd"</samp><br>
<samp>#inst "yyyy-mm-ddThh:mm:ss"</samp><br>
<samp>#inst "yyyy-mm-ddThh:mm:ssZ"</samp><br>
<samp>#inst "yyyy-mm-ddThh:mm:ss-hh:mm"</samp><br>

---


An instant in time, using a [RFC-3339] formatted string. Creates a JavaScript [Date] object.

The format is `#inst "yyyy-mm-ddThh:mm:ss"`, where:

- `yyyy-mm-dd` = date
- `hh:mm:ss` = time (optional)

Append `Z` to denote UTC, or `-hh:mm` to denote exact UTC offset.

[Date]:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date
[RFC-3339]:http://www.ietf.org/rfc/rfc3339.txt



---

###### Examples:

```clj
#inst "1985-04-12"
;;=> #inst "1985-04-12T00:00:00.000-00:00"

#inst "1985-04-12T23:20:50.52Z"
;;=> #inst "1985-04-12T23:20:50.520-00:00"
```

Dates can be tested for order, as native JavaScript Dates can:

```clj
(def a #inst "2005-01-20")
(def b #inst "2005-01-21")

(< a b)
;;=> true
```

Dates can be tested for equality, unlike JavaScript Dates.  (ClojureScript
extends `js/Date` type with `IEquiv` protocol to allow this.)

```clj
(def a #inst "2012-06-13")
(def b #inst "2012-06-13")

(= a b)
;;=> true
```



---

###### See Also:

[`cljs.core/time`](../cljs.core/time.md)<br>
[`# tagged literal`](../syntax/tagged-literal.md)<br>

---





Reader code @ [github](https://github.com/clojure/clojurescript/blob/r2261/src/clj/cljs/tagged_literals.clj#L19-L26):

```clj
(defn read-inst
  [form]
  (when-not (string? form)
    (throw (RuntimeException. "Instance literal expects a string for its timestamp.")))
  (try
    (inst/read-instant-date form)
    (catch Throwable e
      (throw (RuntimeException. (.getMessage e))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2261
└── src
    └── clj
        └── cljs
            └── <ins>[tagged_literals.clj:19-26](https://github.com/clojure/clojurescript/blob/r2261/src/clj/cljs/tagged_literals.clj#L19-L26)</ins>
</pre>
-->

---
Reader table @ [github](https://github.com/clojure/clojurescript/blob/r2261/src/clj/cljs/tagged_literals.clj#L44-L48):

```clj
(def ^:dynamic *cljs-data-readers*
  {'queue read-queue
   'uuid  read-uuid
   'inst  read-inst
   'js    read-js})
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2261
└── src
    └── clj
        └── cljs
            └── <ins>[tagged_literals.clj:44-48](https://github.com/clojure/clojurescript/blob/r2261/src/clj/cljs/tagged_literals.clj#L44-L48)</ins>
</pre>
-->

---



 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/inst-literal.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "An instant in time, using a [RFC-3339] formatted string. Creates a JavaScript [Date] object.\n\nThe format is `#inst \"yyyy-mm-ddThh:mm:ss\"`, where:\n\n- `yyyy-mm-dd` = date\n- `hh:mm:ss` = time (optional)\n\nAppend `Z` to denote UTC, or `-hh:mm` to denote exact UTC offset.\n\n[Date]:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date\n[RFC-3339]:http://www.ietf.org/rfc/rfc3339.txt",
 :ns "syntax",
 :name "inst-literal",
 :history [["+" "0.0-1211"]],
 :type "tagged literal",
 :related ["cljs.core/time" "syntax/tagged-literal"],
 :full-name-encode "syntax/inst-literal",
 :extra-sources ({:code "(defn read-inst\n  [form]\n  (when-not (string? form)\n    (throw (RuntimeException. \"Instance literal expects a string for its timestamp.\")))\n  (try\n    (inst/read-instant-date form)\n    (catch Throwable e\n      (throw (RuntimeException. (.getMessage e))))))",
                  :title "Reader code",
                  :repo "clojurescript",
                  :tag "r2261",
                  :filename "src/clj/cljs/tagged_literals.clj",
                  :lines [19 26]}
                 {:code "(def ^:dynamic *cljs-data-readers*\n  {'queue read-queue\n   'uuid  read-uuid\n   'inst  read-inst\n   'js    read-js})",
                  :title "Reader table",
                  :repo "clojurescript",
                  :tag "r2261",
                  :filename "src/clj/cljs/tagged_literals.clj",
                  :lines [44 48]}),
 :usage ["#inst \"yyyy-mm-dd\""
         "#inst \"yyyy-mm-ddThh:mm:ss\""
         "#inst \"yyyy-mm-ddThh:mm:ssZ\""
         "#inst \"yyyy-mm-ddThh:mm:ss-hh:mm\""],
 :examples [{:id "47d8ee",
             :content "```clj\n#inst \"1985-04-12\"\n;;=> #inst \"1985-04-12T00:00:00.000-00:00\"\n\n#inst \"1985-04-12T23:20:50.52Z\"\n;;=> #inst \"1985-04-12T23:20:50.520-00:00\"\n```\n\nDates can be tested for order, as native JavaScript Dates can:\n\n```clj\n(def a #inst \"2005-01-20\")\n(def b #inst \"2005-01-21\")\n\n(< a b)\n;;=> true\n```\n\nDates can be tested for equality, unlike JavaScript Dates.  (ClojureScript\nextends `js/Date` type with `IEquiv` protocol to allow this.)\n\n```clj\n(def a #inst \"2012-06-13\")\n(def b #inst \"2012-06-13\")\n\n(= a b)\n;;=> true\n```"}],
 :edn-doc "https://github.com/edn-format/edn#inst-rfc-3339-format",
 :full-name "syntax/inst-literal",
 :display "#inst literal",
 :clj-doc "https://github.com/clojure/clojure/blob/clojure-1.6.0/src/clj/clojure/core.clj#L6947"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/inst-literal"]))
```

-->
