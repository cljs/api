# ClojureScript API History

 <table>
{{#versions}}
<tr>
<td>__[{{cljs-version}}](#{{changes-link}})__</td>
<td>{{cljs-date}}</td>
<td>
  <kbd>Clojure {{clj-version}}</kbd>
</td>
<td>
  <kbd>Closure Lib {{gclosure-lib}}</kbd>
</td>
<td>
<a href="#{{changes-link}}">
{{#add-count}}<img valign="middle" src="https://img.shields.io/badge/+-{{.}}-brightgreen.svg">{{/add-count}} {{#remove-count}}<img valign="middle" src="https://img.shields.io/badge/×-{{.}}-red.svg">{{/remove-count}}
</a>
</td>
</tr>
{{/versions}}
</table>

{{#versions}}
### {{cljs-version}}
 <table>
{{#no-changes}}<tr><td>_no symbols were added or removed in this version_</td></tr>{{/no-changes}}
{{#changes}}
<tr>
<td>
<img valign="middle" src="https://img.shields.io/badge/{{change}}-{{shield-text}}-{{shield-color}}.svg">
</td>
<td><samp>[{{&text}}]({{&link}})</samp></td>
</tr>
{{/changes}}
</table>
{{/versions}}
