## <img width="48p" valign="middle" src="http://i.imgur.com/Hi20huC.png"> {{&display-name}}

 <table border="1">
<tr>
<td>{{&type}}</td>
{{#history}}
<td>{{&change}} in **<kbd>{{&version}}</kbd>**</td>
{{/history}}
{{#clj-symbol}}
<td>from <img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>{{&.}}</samp></td>
{{/clj-symbol}}
</tr>
</table>

 <samp>
{{#signature}}
(__{{&name}}__ {{&args}})<br>
{{/signature}}
</samp>

```
{{&docstring}}
```

---

 <pre>
{{&source-path}}
</pre>

```clj
{{&source}}
```

---

```clj
{{&data}}
```
