# ClojureScript API History

 <table>
<thead>
<th>Version</th>
<th>Date</th>
<th>Clojure</th>
<th>tools.reader</th>
<th>Closure Lib</th>
<th>Library API</th>
<th>Compiler API</th>
</thead>
{{#versions}}
<tr>
<td>__[{{cljs-version}}](https://github.com/cljsinfo/api-refs/tree/{{cljs-version}})__</td>
<td>{{cljs-date}}</td>
<td><kbd>{{clj-version}}</kbd></td>
<td><kbd>{{treader-version}}</kbd></td>
<td><kbd>{{gclosure-lib}}</kbd></td>
{{#library-api}}
<td>
<a href="#user-content-{{changes-link}}">
{{#add-count}}<img valign="middle" src="https://img.shields.io/badge/+-{{.}}-brightgreen.svg">{{/add-count}} {{#remove-count}}<img valign="middle" src="https://img.shields.io/badge/×-{{.}}-red.svg">{{/remove-count}}
</a>
</td>
{{/library-api}}
{{#compiler-api}}
<td>
<a href="#user-content-{{changes-link}}">
{{#add-count}}<img valign="middle" src="https://img.shields.io/badge/+-{{.}}-brightgreen.svg">{{/add-count}} {{#remove-count}}<img valign="middle" src="https://img.shields.io/badge/×-{{.}}-red.svg">{{/remove-count}}
</a>
</td>
{{/compiler-api}}
</tr>

{{/versions}}
</table>

{{#versions}}
### {{cljs-version}}

{{#library-api}}
<a name="{{changes-link}}"></a> __Library API Changes__
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
{{/library-api}}

{{#compiler-api}}
<a name="{{changes-link}}"></a> __Compiler API Changes__
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
{{/compiler-api}}

{{/versions}}
