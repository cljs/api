## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> {{&display-name}}

 <table border="1">
<tr>
{{#syntax-form}}<td><samp>{{&.}}</samp></td>{{/syntax-form}}
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

{{#signature}}
 <samp>
(__{{&name}}__{{#args}} {{&.}}{{/args}})<br>
</samp>

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
[`{{&full-name}}`]({{&link}})<br>
{{/symbols}}

---
{{/related}}

{{#docstring}}
Source docstring:

```
{{&.}}
```
{{/docstring}}

Source code:

{{#source}}
```clj
{{&code}}
```

 <pre>
{{&path-tree}}
</pre>
{{/source}}

{{#extra-sources}}

---

```clj
{{&code}}
```

 <pre>
{{&path-tree}}
</pre>
{{/extra-sources}}

---

Data used to generate this document:

```clj
{{&data}}
```

---

Contributions to this document are accepted as Pull Requests to the following file:

 <pre>
[{{&cljsdoc-path}}](https://github.com/cljsinfo/api-refs/blob/master/{{&cljsdoc-path}})
</pre>

