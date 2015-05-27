## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/\*main-cli-fn\*

 <table border="1">
<tr>
<td>var</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
</samp>

```
When compiled for a command-line target, whatever
function *main-fn* is set to will be called with the command-line
argv as arguments
```

---

 <pre>
clojurescript @ r971
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:52-56](https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L52-L56)</ins>
</pre>

```clj
(def
  ^{:doc "When compiled for a command-line target, whatever
  function *main-fn* is set to will be called with the command-line
  argv as arguments"}
  *main-cli-fn* nil)
```


---

```clj
{:full-name "cljs.core/*main-cli-fn*",
 :ns "cljs.core",
 :name "*main-cli-fn*",
 :docstring "When compiled for a command-line target, whatever\nfunction *main-fn* is set to will be called with the command-line\nargv as arguments",
 :type "var",
 :source {:code "(def\n  ^{:doc \"When compiled for a command-line target, whatever\n  function *main-fn* is set to will be called with the command-line\n  argv as arguments\"}\n  *main-cli-fn* nil)",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [52 56],
          :link "https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L52-L56"},
 :full-name-encode "cljs.core__STAR_main-cli-fn_STAR_",
 :history [["+" "0.0-927"]]}

```
