## cljs.repl/repl



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__repl__ repl-env & opts)<br>
</samp>

---





Source docstring:

```
Generic, reusable, read-eval-print loop. By default, reads from *in* using
a c.t.r.reader-types/source-logging-push-back-reader,
writes to *out*, and prints exception summaries to *err*. If you use the
default :read hook, *in* must either be an instance of
c.t.r.reader-types/PushbackReader or duplicate its behavior of both supporting
unread and collapsing CR, LF, and CRLF into a single \newline. Options
are sequential keyword-value pairs. The first argument is the JavaScript
evaluation environment, the second argument is an extended version of the
standard ClojureScript compiler options. In addition to ClojureScript compiler
build options it also take a set of options similar to clojure.main/repl with
adjustments for ClojureScript evalution and compilation model:

Available clojure.main/repl style options and their defaults:

   - :init, function of no arguments, initialization hook called with
     bindings for set!-able vars in place.
     default: #()

   - :need-prompt, function of no arguments, called before each
     read-eval-print except the first, the user will be prompted if it
     returns true.
     default: #(if (c.t.r.readers-types/indexing-reader? *in*)
                 (== (c.t.r.reader-types/get-column-number *in*) 1)
                 (identity true))

   - :prompt, function of no arguments, prompts for more input.
     default: repl-prompt

   - :flush, function of no arguments, flushes output
     default: flush

   - :read, function of two arguments, reads from *in*:
       - returns its first argument to request a fresh prompt
         - depending on need-prompt, this may cause the repl to prompt
           before reading again
       - returns its second argument to request an exit from the repl
       - else returns the next object read from the input stream
     default: repl-read

   - :eval, function of one argument, returns the evaluation of its
     argument. The eval function must take repl-env, the JavaScript evaluation
     environment, env, the ClojureScript analysis environment, the form
     and opts, the standard ClojureScript REPL/compiler options.
     default: eval

   - :print, function of one argument, prints its argument to the output
     default: println

   - :caught, function of three arguments, a throwable, called when
     read, eval, or print throws an exception or error default. The second
     argument is the JavaScript evaluation environment this permits context
     sensitive handling if necessary. The third argument is opts, the standard
     ClojureScript REPL/compiler options. In the case of errors or exception
     in the JavaScript target, these will be thrown as
     clojure.lang.IExceptionInfo instances.
     default: repl-caught

   - :reader, the c.t.r reader to use.
     default: c.t.r.reader-types/source-logging-push-back-reader

   - :print-no-newline, print without a newline.
     default: print

   - :source-map-inline, whether inline source maps should be enabled. Most
     useful in browser context. Implies using a fresh reader for each form.
     default: true
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3297/src/main/clojure/cljs/repl.cljc#L862-L932):

```clj
(defn repl
  [repl-env & opts]
  (assert (even? (count opts))
    "Arguments after repl-env must be interleaved key value pairs")
  (repl* repl-env (apply hash-map opts)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[repl.cljc:862-932](https://github.com/clojure/clojurescript/blob/r3297/src/main/clojure/cljs/repl.cljc#L862-L932)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl/repl` @ crossclj](http://crossclj.info/fun/cljs.repl/repl.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/repl.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl",
 :name "repl",
 :signature ["[repl-env & opts]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.repl/repl",
 :source {:code "(defn repl\n  [repl-env & opts]\n  (assert (even? (count opts))\n    \"Arguments after repl-env must be interleaved key value pairs\")\n  (repl* repl-env (apply hash-map opts)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3297",
          :filename "src/main/clojure/cljs/repl.cljc",
          :lines [862 932]},
 :full-name "cljs.repl/repl",
 :docstring "Generic, reusable, read-eval-print loop. By default, reads from *in* using\na c.t.r.reader-types/source-logging-push-back-reader,\nwrites to *out*, and prints exception summaries to *err*. If you use the\ndefault :read hook, *in* must either be an instance of\nc.t.r.reader-types/PushbackReader or duplicate its behavior of both supporting\nunread and collapsing CR, LF, and CRLF into a single \\newline. Options\nare sequential keyword-value pairs. The first argument is the JavaScript\nevaluation environment, the second argument is an extended version of the\nstandard ClojureScript compiler options. In addition to ClojureScript compiler\nbuild options it also take a set of options similar to clojure.main/repl with\nadjustments for ClojureScript evalution and compilation model:\n\nAvailable clojure.main/repl style options and their defaults:\n\n   - :init, function of no arguments, initialization hook called with\n     bindings for set!-able vars in place.\n     default: #()\n\n   - :need-prompt, function of no arguments, called before each\n     read-eval-print except the first, the user will be prompted if it\n     returns true.\n     default: #(if (c.t.r.readers-types/indexing-reader? *in*)\n                 (== (c.t.r.reader-types/get-column-number *in*) 1)\n                 (identity true))\n\n   - :prompt, function of no arguments, prompts for more input.\n     default: repl-prompt\n\n   - :flush, function of no arguments, flushes output\n     default: flush\n\n   - :read, function of two arguments, reads from *in*:\n       - returns its first argument to request a fresh prompt\n         - depending on need-prompt, this may cause the repl to prompt\n           before reading again\n       - returns its second argument to request an exit from the repl\n       - else returns the next object read from the input stream\n     default: repl-read\n\n   - :eval, function of one argument, returns the evaluation of its\n     argument. The eval function must take repl-env, the JavaScript evaluation\n     environment, env, the ClojureScript analysis environment, the form\n     and opts, the standard ClojureScript REPL/compiler options.\n     default: eval\n\n   - :print, function of one argument, prints its argument to the output\n     default: println\n\n   - :caught, function of three arguments, a throwable, called when\n     read, eval, or print throws an exception or error default. The second\n     argument is the JavaScript evaluation environment this permits context\n     sensitive handling if necessary. The third argument is opts, the standard\n     ClojureScript REPL/compiler options. In the case of errors or exception\n     in the JavaScript target, these will be thrown as\n     clojure.lang.IExceptionInfo instances.\n     default: repl-caught\n\n   - :reader, the c.t.r reader to use.\n     default: c.t.r.reader-types/source-logging-push-back-reader\n\n   - :print-no-newline, print without a newline.\n     default: print\n\n   - :source-map-inline, whether inline source maps should be enabled. Most\n     useful in browser context. Implies using a fresh reader for each form.\n     default: true"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/repl"]))
```

-->
