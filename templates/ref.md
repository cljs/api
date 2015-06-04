## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> {{&display-name}}

 <table border="1">
<tr>
<td>{{&type}}</td>
<td>{{#history}}{{&.}} {{/history}}</td>
{{#clj-symbol}}
<td>
{{#import}}imported {{/import}}[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>{{&display-name}}</samp>]({{&link}})
</td>
{{/clj-symbol}}
</tr>
</table>

 <samp>
{{#signature}}
(__{{&name}}__{{#args}} {{&.}}{{/args}})<br>
{{/signature}}
</samp>

```
{{&docstring}}
```

---

{{#source}}
 <pre>
{{&path-tree}}
</pre>

```clj
{{&code}}
```
{{/source}}

{{#extra-sources}}

---

 <pre>
{{&path-tree}}
</pre>

```clj
{{&code}}
```
{{/extra-sources}}

---

```clj
{{&data}}
```
