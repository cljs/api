# ClojureScript Library API

The core ClojureScript library.

Some symbols are not namespaced:

{{#special-ns-symbols}}
- [{{&display}}]({{&link}})
{{/special-ns-symbols}}

The rest of the symbols are in the following namespaces:

 <table>
<thead><tr>
<th>=</th>
<th>Namespace</th>
<th>Description</th>
</tr></thead>
{{#ns-symbols}}
<tr>
<td>{{#clj-ns}}[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">]({{&link}}){{/clj-ns}}</td>
<td>[{{&display}}]({{&link}})</td>
<td>{{&caption}}</td>
</tr>
{{/ns-symbols}}
</table>

_See external API references for [Google Closure Library] and [JavaScript's
native library], both accessible from every ClojureScript application._

[Google Closure Library]:http://google.github.io/closure-library/api/
[JavaScript's native library]:https://developer.mozilla.org/docs/Web/JavaScript/Reference

