## clojure.browser.event/listen



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(listen src type fn)</samp><br>
<samp>(listen src type fn capture?)</samp><br>

---

 <samp>
(__listen__ src type fn)<br>
</samp>
 <samp>
(__listen__ src type fn capture?)<br>
</samp>

---







Source code @ [github]():

```clj
(defn listen
  ([src type fn]
     (listen src type fn false))
  ([src type fn capture?]
     (events/listen src
                    (get (event-types src) type type)
                    fn
                    capture?)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.browser.event/listen` @ crossclj](http://crossclj.info/fun/clojure.browser.event.cljs/listen.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.event/listen.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.browser.event",
 :name "listen",
 :signature ["[src type fn]" "[src type fn capture?]"],
 :name-encode "listen",
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.browser.event/listen",
 :source {:code "(defn listen\n  ([src type fn]\n     (listen src type fn false))\n  ([src type fn capture?]\n     (events/listen src\n                    (get (event-types src) type type)\n                    fn\n                    capture?)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/clojure/browser/event.cljs",
          :lines [46 53],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/clojure/browser/event.cljs#L46-L53"},
 :usage ["(listen src type fn)" "(listen src type fn capture?)"],
 :full-name "clojure.browser.event/listen",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.event/listen.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.event/listen"]))
```

-->
