# <img valign="middle" width="48px" src="http://i.imgur.com/Hi20huC.png"> ClojureScript API Reference

{{#release}}

 <table border="1">
<tr>
<td>__{{cljs-version}}__ on {{cljs-date}}</td>
<td>[<img valign="middle" width="24px" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.github.io/clojure/branch-master/index.html)
<kbd>Clojure {{clj-version}}</kbd></td>
<td>[<img valign="middle" width="18px" src="http://i.imgur.com/yGyeE7k.png">](http://google.github.io/closure-library/api/)
<kbd>Closure Lib {{gclosure-lib}}</kbd></td>
</tr>
</table>

## Changes in {{cljs-version}}
{{/release}}

 <table>

{{#no-changes}}
<tr><td>(no changes)</td></tr>
{{/no-changes}}

{{#changes}}
<tr>
<td><samp>{{&change}}</samp></td>
<td><samp>{{&type}}</samp></td>
<td><samp>[{{&text}}]({{&link}})</samp></td>
</tr>
{{/changes}}

</table>

## All Symbols

{{#ns-symbols}}
- [{{&ns}}](#{{&ns-link}})
{{/ns-symbols}}

{{#ns-symbols}}
### {{ns}}

 <table>
<thead><tr>
<th>=</th>
<th>Type</th>
<th>Name</th>
<th>History</th>
</tr></thead>
{{#symbols}}
<tr>
<td>{{#clj-symbol}}[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">]({{&link}}){{/clj-symbol}}
<td><samp>{{type}}</samp></td>
<td><samp>[{{&display-name}}]({{&link}})</samp></td>
<td>{{#history}}{{&.}} {{/history}}</td>
</tr>
{{/symbols}}
</table>

{{/ns-symbols}}
