## .



 <table border="1">
<tr>
<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/.</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/.)
</td>
</tr>
</table>

<samp>(.-foo obj)</samp><br>
<samp>(.foo obj)</samp><br>

---

 <samp>
(__.__ o -p)<br>
</samp>
 <samp>
(__.__ o m)<br>
</samp>
 <samp>
(__.__ o m 1 2)<br>
</samp>
 <samp>
(__.__ o (m 1 2))<br>
</samp>

---

For interop, the `.` special form allows access to member properties of the
given JavaScript object `o`.

If the second operand is a symbol preceded with a hyphen as in `-p`, the
expression will result in the value of the property named `p`.

If the second operand is a symbol that is not preceded with a hyphen as in `m`,
the expression will evaluate to a call of the method named `m`.  Any additional
operands will be passed as arguments to the method.

The __preferred, idiomatic__ way to access members of a JavaScript object is to
use the following sugar:

<table class="code-tbl-9bef6">
  <thead>
    <tr>
      <th>Sugar</th>
      <th>Expands To</th></tr>
  </thead>
  <tbody>
    <tr>
      <td><pre>(.-p o)</pre></td>
      <td><pre>(. o -p)</pre></td>
    </tr>
    <tr>
      <td><pre>(.m o)</pre></td>
      <td><pre>(. o m)</pre></td>
    </tr>
    <tr>
      <td><pre>(.m o 1 2)</pre></td>
      <td><pre>(. o m 1 2)</pre></td>
    </tr>
  </tbody>
</table>



---

###### Examples:

We can access the JavaScript properties of a string:

```js
// JavaScript
var m = "Hello World";
m.length;
//=> 11
```

```clj
;; ClojureScript
(def m "Hello World")
(.-length m)
;;=> 11
```

We can also call member functions on the string:

```js
// JavaScript
m.toUpperCase();
//=> "HELLO WORLD"

m.replace("H", "");
//=> "ello World";
```

```clj
;; ClojureScript
(.toUpperCase m)
;;=> "HELLO WORLD"

(.replace m "H" "")
;;=> "ello World"
```



---
###### Examples:

Create a JavaScript object `o`:

```clj
(def o #js {:foo "bar"})
```

You can get the value at property `"foo"` with any of the following:

```clj
(. o -foo)
;;=> "bar"

(.-foo o)
;;=> "bar"

(aget o "foo")
;;=> "bar"
```



---

###### See Also:

[`cljs.core/..`](../cljs.core/DOTDOT.md)<br>
[`cljs.core/aget`](../cljs.core/aget.md)<br>

---




Parser code @ [github](https://github.com/clojure/clojurescript/blob/r993/src/clj/cljs/compiler.clj#L981-L996):

```clj
(defmethod parse '.
  [_ env [_ target & [field & member+]] _]
  (disallowing-recur
   (let [{:keys [dot-action target method field args]} (build-dot-form [target field member+])
         enve        (assoc env :context :expr)
         targetexpr  (analyze enve target)
         children    [enve]]
     (case dot-action
           ::access {:env env :op :dot :children children
                     :target targetexpr
                     :field field}
           ::call   (let [argexprs (map #(analyze enve %) args)]
                      {:env env :op :dot :children (into children argexprs)
                       :target targetexpr
                       :method method
                       :args argexprs})))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r993
└── src
    └── clj
        └── cljs
            └── <ins>[compiler.clj:981-996](https://github.com/clojure/clojurescript/blob/r993/src/clj/cljs/compiler.clj#L981-L996)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/.` @ clojuredocs](http://clojuredocs.org/clojure.core/_.)<br>
[`clojure.core/.` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/./)<br>
[`clojure.core/.` @ crossclj](http://crossclj.info/fun/clojure.core/..html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special/DOT.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "For interop, the `.` special form allows access to member properties of the\ngiven JavaScript object `o`.\n\nIf the second operand is a symbol preceded with a hyphen as in `-p`, the\nexpression will result in the value of the property named `p`.\n\nIf the second operand is a symbol that is not preceded with a hyphen as in `m`,\nthe expression will evaluate to a call of the method named `m`.  Any additional\noperands will be passed as arguments to the method.\n\nThe __preferred, idiomatic__ way to access members of a JavaScript object is to\nuse the following sugar:\n\n<table class=\"code-tbl-9bef6\">\n  <thead>\n    <tr>\n      <th>Sugar</th>\n      <th>Expands To</th></tr>\n  </thead>\n  <tbody>\n    <tr>\n      <td><pre>(.-p o)</pre></td>\n      <td><pre>(. o -p)</pre></td>\n    </tr>\n    <tr>\n      <td><pre>(.m o)</pre></td>\n      <td><pre>(. o m)</pre></td>\n    </tr>\n    <tr>\n      <td><pre>(.m o 1 2)</pre></td>\n      <td><pre>(. o m 1 2)</pre></td>\n    </tr>\n  </tbody>\n</table>",
 :ns "special",
 :name ".",
 :signature ["[o -p]" "[o m]" "[o m 1 2]" "[o (m 1 2)]"],
 :history [["+" "0.0-927"]],
 :type "special form",
 :related ["cljs.core/.." "cljs.core/aget"],
 :full-name-encode "special/DOT",
 :source {:code "(defmethod parse '.\n  [_ env [_ target & [field & member+]] _]\n  (disallowing-recur\n   (let [{:keys [dot-action target method field args]} (build-dot-form [target field member+])\n         enve        (assoc env :context :expr)\n         targetexpr  (analyze enve target)\n         children    [enve]]\n     (case dot-action\n           ::access {:env env :op :dot :children children\n                     :target targetexpr\n                     :field field}\n           ::call   (let [argexprs (map #(analyze enve %) args)]\n                      {:env env :op :dot :children (into children argexprs)\n                       :target targetexpr\n                       :method method\n                       :args argexprs})))))",
          :title "Parser code",
          :repo "clojurescript",
          :tag "r993",
          :filename "src/clj/cljs/compiler.clj",
          :lines [981 996]},
 :usage ["(.-foo obj)" "(.foo obj)"],
 :examples [{:id "22ccbb",
             :content "We can access the JavaScript properties of a string:\n\n```js\n// JavaScript\nvar m = \"Hello World\";\nm.length;\n//=> 11\n```\n\n```clj\n;; ClojureScript\n(def m \"Hello World\")\n(.-length m)\n;;=> 11\n```\n\nWe can also call member functions on the string:\n\n```js\n// JavaScript\nm.toUpperCase();\n//=> \"HELLO WORLD\"\n\nm.replace(\"H\", \"\");\n//=> \"ello World\";\n```\n\n```clj\n;; ClojureScript\n(.toUpperCase m)\n;;=> \"HELLO WORLD\"\n\n(.replace m \"H\" \"\")\n;;=> \"ello World\"\n```"}
            {:id "7c5e58",
             :content "Create a JavaScript object `o`:\n\n```clj\n(def o #js {:foo \"bar\"})\n```\n\nYou can get the value at property `\"foo\"` with any of the following:\n\n```clj\n(. o -foo)\n;;=> \"bar\"\n\n(.-foo o)\n;;=> \"bar\"\n\n(aget o \"foo\")\n;;=> \"bar\"\n```"}],
 :full-name "special/.",
 :clj-symbol "clojure.core/."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/."]))
```

-->
