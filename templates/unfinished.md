# Unfinished Docs

This is a table of symbols that have unfinished docs.  The goal is to have
every column filled.  
__Rows are removed when their columns are filled (done).__

 <table>
<thead><tr>
<th>name</th>
<th>cljsdoc</th>
<th>description?</th>
<th>examples?</th>
<th>related?</th>
</tr></thead>

{{#symbols}}
<tr>
<td>[{{&display-name}}]({{&ref}})</td>
<td>{{#cljsdoc}}[cljsdoc]({{&.}}){{/cljsdoc}}</td>
<td>{{#description}}:heavy_check_mark:{{/description}}</td>
<td>{{#examples}}:heavy_check_mark:{{/examples}}</td>
<td>{{#related}}:heavy_check_mark:{{/related}}</td>
</tr>
{{/symbols}}

</table>

