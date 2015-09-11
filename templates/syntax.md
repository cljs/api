# ClojureScript Syntax

{{description}}

To let you know which syntax forms are also available in Clojure or [edn], we
mark the syntax forms with clickable icons linking to the appropriate official
clojure/edn docs.

 <table>
<tr>
<td><img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"></td>
<td>
available in clojure
</td>
</tr>
<tr>
<td><img width="18px" valign="middle" src="http://i.imgur.com/I8uNXHv.png"></td>
<td>
available in [edn]
</td>
</tr>
</table>

[edn]:https://github.com/edn-format/edn#edn

 <table>
<thead><tr>
<th colspan=2>=</th>
<th>Name</th>
<th>History</th>
</tr></thead>
{{#symbols}}
<tr valign=top>
<td>{{#clj-doc}}[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">]({{&.}}){{/clj-doc}}</td>
<td>{{#edn-doc}}[<img width="18px" valign="middle" src="http://i.imgur.com/I8uNXHv.png">]({{&.}}){{/edn-doc}}</td>
<td><samp>[{{&display-name}}]({{&link}})</samp></td>
<td>{{#history}}{{&.}} {{/history}}</td>
</tr>
{{/symbols}}
</table>

