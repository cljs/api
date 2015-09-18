## {{display}}

 <table border="1">
<tr>
<td>namespace</td>
<td>{{#history}}{{&shield}} {{/history}}</td>
{{#clj-ns}}
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>{{&display-name}}</samp>]({{&link}})
</td>
{{/clj-ns}}
</tr>
</table>

{{description}}

---

{{#docstring}}

Source Docstring:

```
{{&.}}
```

---
{{/docstring}}

###### Public Symbols:

 <table>
<thead><tr>
<th>=</th>
<th>Name</th>
<th>Type</th>
<th>History</th>
</tr></thead>
{{#symbols}}
<tr>
<td>{{#clj-symbol}}[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">]({{&link}}){{#import}} <samp>→</samp>{{/import}}{{/clj-symbol}}</td>
<td><samp>{{&display-prefix}}[{{&display-name}}]({{&link}})</samp></td>
<td><samp>{{type}}</samp></td>
<td>{{#history}}{{&shield}} {{/history}}</td>
</tr>
{{/symbols}}
</table>

{{#removed}}
---

###### Symbols removed or no longer public:

 <table>
<thead><tr>
<th>=</th>
<th>Name</th>
<th>Type</th>
<th>History</th>
</tr></thead>
{{#symbols}}
<tr>
<td>{{#clj-symbol}}[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">]({{&link}}){{#import}} <samp>→</samp>{{/import}}{{/clj-symbol}}</td>
<td><samp>{{&display-prefix}}[{{&display-name}}]({{&link}})</samp></td>
<td><samp>{{type}}</samp></td>
<td>{{#history}}{{&shield}} {{/history}}</td>
</tr>
{{/symbols}}
</table>
{{/removed}}

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/{{&cljsdoc-path}}
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files
