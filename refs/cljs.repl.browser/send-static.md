## cljs.repl.browser/send-static



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(send-static {path :path, :as request} conn opts)</samp><br>

---

 <samp>
(__send-static__ {path :path, :as request} conn opts)<br>
</samp>

---







Source code @ [github]():

```clj
(defn send-static [{path :path :as request} conn opts]
  (if (and (:static-dir opts)
           (not= "/favicon.ico" path))
    (let [path   (if (= "/" path) "/index.html" path)
          st-dir (:static-dir opts)
          local-path
          (cond->
            (seq (for [x (if (string? st-dir) [st-dir] st-dir)
                       :when (.exists (io/file (str x path)))]
                   (str x path)))
            (complement nil?) first)
          local-path
          (if (nil? local-path)
            (cond
              (re-find #".jar" path)
              (io/resource (second (string/split path #".jar!/")))
              (re-find (Pattern/compile (System/getProperty "user.dir")) path)
              (io/file (string/replace path (str (System/getProperty "user.dir") "/") ""))
              :else nil)
            local-path)]
      (if local-path
        (if-let [ext (some #(if (.endsWith path %) %) (keys ext->mime-type))]
          (let [mime-type (ext->mime-type ext "text/plain")
                encoding (mime-type->encoding mime-type "UTF-8")]
            (server/send-and-close
              conn
              200
              (slurp local-path :encoding encoding)
              mime-type
              encoding))
          (server/send-and-close conn 200 (slurp local-path) "text/plain"))
        (server/send-404 conn path)))
    (server/send-404 conn path)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.repl.browser/send-static` @ crossclj](http://crossclj.info/fun/cljs.repl.browser/send-static.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser/send-static.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.browser",
 :name "send-static",
 :signature ["[{path :path, :as request} conn opts]"],
 :name-encode "send-static",
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.repl.browser/send-static",
 :source {:code "(defn send-static [{path :path :as request} conn opts]\n  (if (and (:static-dir opts)\n           (not= \"/favicon.ico\" path))\n    (let [path   (if (= \"/\" path) \"/index.html\" path)\n          st-dir (:static-dir opts)\n          local-path\n          (cond->\n            (seq (for [x (if (string? st-dir) [st-dir] st-dir)\n                       :when (.exists (io/file (str x path)))]\n                   (str x path)))\n            (complement nil?) first)\n          local-path\n          (if (nil? local-path)\n            (cond\n              (re-find #\".jar\" path)\n              (io/resource (second (string/split path #\".jar!/\")))\n              (re-find (Pattern/compile (System/getProperty \"user.dir\")) path)\n              (io/file (string/replace path (str (System/getProperty \"user.dir\") \"/\") \"\"))\n              :else nil)\n            local-path)]\n      (if local-path\n        (if-let [ext (some #(if (.endsWith path %) %) (keys ext->mime-type))]\n          (let [mime-type (ext->mime-type ext \"text/plain\")\n                encoding (mime-type->encoding mime-type \"UTF-8\")]\n            (server/send-and-close\n              conn\n              200\n              (slurp local-path :encoding encoding)\n              mime-type\n              encoding))\n          (server/send-and-close conn 200 (slurp local-path) \"text/plain\"))\n        (server/send-404 conn path)))\n    (server/send-404 conn path)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.40",
          :filename "src/main/clojure/cljs/repl/browser.clj",
          :lines [92 124],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.40/src/main/clojure/cljs/repl/browser.clj#L92-L124"},
 :usage ["(send-static {path :path, :as request} conn opts)"],
 :full-name "cljs.repl.browser/send-static",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser/send-static.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/send-static"]))
```

-->
