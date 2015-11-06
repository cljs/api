## cljs.pprint

 <table border="1">
<tr>
<td>namespace</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.pprint</samp>](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html)
</td>
</tr>
</table>

This is a pretty-printer for ClojureScript data structures and code.  Its most salient
use case is to properly indent data for readable logging.



---


Source Docstring:

```
A Pretty Printer for ClojureScript

cljs.pprint implements a flexible system for printing structured data
in a pleasing, easy-to-understand format. Basic use of the pretty printer is 
simple, just call pprint instead of println. More advanced users can use 
the building blocks provided to create custom output formats. 

Out of the box, pprint supports a simple structured format for basic data 
and a specialized format for Clojure source code. More advanced formats,
including formats that don't look like Clojure data at all like XML and 
JSON, can be rendered by creating custom dispatch functions. 

In addition to the pprint function, this module contains cl-format, a text 
formatting function which is fully compatible with the format function in 
Common Lisp. Because pretty printing directives are directly integrated with
cl-format, it supports very concise custom dispatch. It also provides
a more powerful alternative to Clojure's standard format function.

See documentation for pprint and cl-format for more information or 
complete documentation on the the clojure web site on github.
```

---

###### Public Symbols:

 <table>
<thead><tr>
<th>=</th>
<th>Name</th>
<th>Type</th>
<th>History</th>
</tr></thead>
<tr>
<td></td>
<td><samp>[PrettyFlush](../cljs.pprint/PrettyFlush.md)</samp></td>
<td><samp>protocol</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
</table>


---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files
