## {{&display-name}}

{{#moved}}
> __MOVED__, please see {{&.}}
{{/moved}}

 <table border="1">
<tr>
<td>{{&type}}</td>
<td>{{#history}}{{&.}} {{/history}}</td>
{{#clj-symbol}}
<td>
{{#import}}imported {{/import}}[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>{{&display-name}}</samp>]({{&link}})
</td>
{{/clj-symbol}}
{{#clj-doc}}
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc]({{&.}})
</td>
{{/clj-doc}}
{{#edn-doc}}
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/I8uNXHv.png"> edn doc]({{&.}})
</td>
{{/edn-doc}}
</tr>
</table>

{{#usage}}
{{#usages}}
<samp>{{&.}}</samp><br>
{{/usages}}

---
{{/usage}}

{{#signature}}
{{#sigs}}
 <samp>
(__{{&name}}__{{#args}} {{&.}}{{/args}})<br>
</samp>
{{/sigs}}

---
{{/signature}}

{{#description}}
{{&.}}

---
{{/description}}

{{#examples}}
Example:

{{&content}}

---
{{/examples}}

{{#related}}
See Also:

{{#symbols}}
{{&.}}<br>
{{/symbols}}

---
{{/related}}


{{#docstring}}
Source docstring:

```
{{&.}}
```
{{/docstring}}


{{#source}}
Source code:

```clj
{{&code}}
```

 <pre>
{{&path-tree}}
</pre>

---
{{/source}}

{{#extra-sources}}

```clj
{{&code}}
```

 <pre>
{{&path-tree}}
</pre>

---
{{/extra-sources}}


{{#external-doc-links}}
External Doc Links:

{{#links}}
[`{{&symbol}}` @ {{&source}}]({{&link}})<br>
{{/links}}

---
{{/external-doc-links}}

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/{{&cljsdoc-path}}
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{{&data}}
```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "{{&full-name}}"]))
```

-->
