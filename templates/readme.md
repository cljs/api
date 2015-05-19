# ClojureScript API Reference

 <table>
<tr>
<td>{{cljs-date}}</td>
<td>ClojureScript <kbd>{{cljs-version}}</kbd></td>
<td>Clojure <kbd>{{clj-version}}</kbd></td>
</tr>
</table>

## Changes in {{cljs-version}}

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
<th></th>
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
