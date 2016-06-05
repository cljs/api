## cljs.build.api/src-file->target-file



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2629"><img valign="middle" alt="[+] 0.0-2629" title="Added in 0.0-2629" src="https://img.shields.io/badge/+-0.0--2629-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(src-file->target-file src)</samp><br>
<samp>(src-file->target-file src opts)</samp><br>
<samp>(src-file->target-file state src opts)</samp><br>

---

 <samp>
(__src-file->target-file__ src)<br>
</samp>
 <samp>
(__src-file->target-file__ src opts)<br>
</samp>
 <samp>
(__src-file->target-file__ state src opts)<br>
</samp>

---





Source docstring:

```
Given a ClojureScript source file return the target file. May optionally
provide build options with :output-dir specified.
```


Source code @ [github]():

```clj
(defn ^File src-file->target-file
  ([src] (src-file->target-file src nil))
  ([src opts]
   (src-file->target-file
     (if-not (nil? env/*compiler*)
       env/*compiler*
       (env/default-compiler-env opts))
     src opts))
  ([state src opts]
   (env/with-compiler-env state
     (binding [ana/*cljs-warning-handlers* (:warning-handlers opts ana/*cljs-warning-handlers*)]
       (closure/src-file->target-file src opts)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.build.api/src-file->target-file` @ crossclj](http://crossclj.info/fun/cljs.build.api/src-file-%3Etarget-file.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.build.api/src-file-GTtarget-file.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:return-type File,
 :ns "cljs.build.api",
 :name "src-file->target-file",
 :signature ["[src]" "[src opts]" "[state src opts]"],
 :name-encode "src-file-GTtarget-file",
 :history [["+" "0.0-2629"]],
 :type "function",
 :full-name-encode "cljs.build.api/src-file-GTtarget-file",
 :source {:code "(defn ^File src-file->target-file\n  ([src] (src-file->target-file src nil))\n  ([src opts]\n   (src-file->target-file\n     (if-not (nil? env/*compiler*)\n       env/*compiler*\n       (env/default-compiler-env opts))\n     src opts))\n  ([state src opts]\n   (env/with-compiler-env state\n     (binding [ana/*cljs-warning-handlers* (:warning-handlers opts ana/*cljs-warning-handlers*)]\n       (closure/src-file->target-file src opts)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/clojure/cljs/build/api.clj",
          :lines [80 93],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/clojure/cljs/build/api.clj#L80-L93"},
 :usage ["(src-file->target-file src)"
         "(src-file->target-file src opts)"
         "(src-file->target-file state src opts)"],
 :full-name "cljs.build.api/src-file->target-file",
 :docstring "Given a ClojureScript source file return the target file. May optionally\nprovide build options with :output-dir specified.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.build.api/src-file-GTtarget-file.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.build.api/src-file->target-file"]))
```

-->
