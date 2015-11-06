# Not Ported from Clojure

These are Clojure <img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">
symbols that are not yet ported to ClojureScript:

## Namespaces

- [clojure.core](#clojurecore)
- [clojure.core.protocols](#clojurecoreprotocols)
- [clojure.core.reducers](#clojurecorereducers)
- [clojure.data](#clojuredata)
- [clojure.edn](#clojureedn)
- [clojure.inspector](#clojureinspector)
- [clojure.instant](#clojureinstant)
- [clojure.java.browse](#clojurejavabrowse)
- [clojure.java.io](#clojurejavaio)
- [clojure.java.javadoc](#clojurejavajavadoc)
- [clojure.java.shell](#clojurejavashell)
- [clojure.lang](#clojurelang)
- [clojure.main](#clojuremain)
- [clojure.pprint](#clojurepprint)
- [clojure.reflect](#clojurereflect)
- [clojure.repl](#clojurerepl)
- [clojure.stacktrace](#clojurestacktrace)
- [clojure.string](#clojurestring)
- [clojure.template](#clojuretemplate)
- [clojure.test](#clojuretest)
- [clojure.test.junit](#clojuretestjunit)
- [clojure.test.tap](#clojuretesttap)
- [clojure.walk](#clojurewalk)
- [clojure.xml](#clojurexml)

## clojure.core

 <table>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/&](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/&)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/\*'](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/*')</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/\*agent\*](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/*agent*)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/\*clojure-version\*](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/*clojure-version*)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/\*command-line-args\*](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/*command-line-args*)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/\*compile-files\*](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/*compile-files*)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/\*compile-path\*](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/*compile-path*)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/\*compiler-options\*](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/*compiler-options*)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/\*data-readers\*](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/*data-readers*)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/\*default-data-reader-fn\*](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/*default-data-reader-fn*)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/\*e](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/*e)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/\*err\*](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/*err*)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/\*file\*](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/*file*)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/\*in\*](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/*in*)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/\*ns\*](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/*ns*)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/\*out\*](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/*out*)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/\*print-length\*](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/*print-length*)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/\*print-level\*](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/*print-level*)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/\*read-eval\*](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/*read-eval*)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/\*unchecked-math\*](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/*unchecked-math*)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/\*warn-on-reflection\*](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/*warn-on-reflection*)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/+'](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/+')</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/-'](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/-')</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/->ArrayChunk](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/-%3EArrayChunk)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/->Vec](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/-%3EVec)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/->VecNode](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/-%3EVecNode)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/->VecSeq](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/-%3EVecSeq)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/ArrayChunk](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ArrayChunk)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/Vec](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/Vec)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/VecNode](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/VecNode)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/VecSeq](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/VecSeq)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/accessor](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/accessor)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/add-classpath](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/add-classpath)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/agent](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/agent)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/agent-error](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/agent-error)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/agent-errors](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/agent-errors)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/alias](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/alias)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/all-ns](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/all-ns)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/alter](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/alter)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/alter-var-root](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/alter-var-root)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/aset-boolean](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/aset-boolean)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/aset-byte](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/aset-byte)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/aset-char](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/aset-char)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/aset-double](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/aset-double)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/aset-float](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/aset-float)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/aset-int](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/aset-int)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/aset-long](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/aset-long)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/aset-short](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/aset-short)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/await](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/await)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/await-for](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/await-for)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/bases](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/bases)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/bean](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/bean)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/bigdec](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/bigdec)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/bigint](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/bigint)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/biginteger](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/biginteger)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/boolean-array](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/boolean-array)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/bound-fn](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/bound-fn)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/bound-fn\*](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/bound-fn*)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/bound?](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/bound?)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/byte-array](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/byte-array)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/cast](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/cast)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/char-array](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/char-array)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/char-escape-string](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/char-escape-string)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/char-name-string](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/char-name-string)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/char?](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/char?)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/class](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/class)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/class?](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/class?)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/clear-agent-errors](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/clear-agent-errors)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/clojure-version](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/clojure-version)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/commute](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/commute)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/compile](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/compile)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/construct-proxy](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/construct-proxy)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/create-ns](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/create-ns)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/create-struct](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/create-struct)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/dec'](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/dec')</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/decimal?](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/decimal?)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/default-data-readers](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/default-data-readers)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/definline](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/definline)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/definterface](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/definterface)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/defonce](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/defonce)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/defstruct](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/defstruct)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/deliver](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/deliver)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/denominator](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/denominator)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/dosync](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/dosync)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/ensure](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ensure)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/enumeration-seq](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/enumeration-seq)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/error-handler](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/error-handler)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/error-mode](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/error-mode)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/eval](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/eval)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/extend](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/extend)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/extenders](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/extenders)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/extends?](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/extends?)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/file-seq](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/file-seq)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/find-keyword](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/find-keyword)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/find-ns](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/find-ns)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/find-var](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/find-var)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/float-array](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/float-array)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/float?](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/float?)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/future](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/future)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/future-call](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/future-call)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/future-cancel](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/future-cancel)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/future-cancelled?](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/future-cancelled?)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/future-done?](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/future-done?)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/future?](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/future?)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/gen-class](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/gen-class)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/gen-interface](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/gen-interface)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/get-proxy-class](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/get-proxy-class)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/get-thread-bindings](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/get-thread-bindings)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/import](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/import)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/inc'](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/inc')</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/init-proxy](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/init-proxy)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/intern](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/intern)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/io!](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/io!)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/iterator-seq](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/iterator-seq)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/line-seq](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/line-seq)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/load](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/load)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/load-reader](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/load-reader)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/load-string](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/load-string)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/loaded-libs](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/loaded-libs)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/locking](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/locking)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/macroexpand](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/macroexpand)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/macroexpand-1](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/macroexpand-1)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/monitor-enter](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/monitor-enter)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/monitor-exit](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/monitor-exit)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/namespace-munge](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/namespace-munge)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/ns-aliases](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ns-aliases)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/ns-imports](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ns-imports)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/ns-interns](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ns-interns)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/ns-map](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ns-map)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/ns-name](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ns-name)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/ns-publics](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ns-publics)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/ns-refers](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ns-refers)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/ns-resolve](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ns-resolve)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/ns-unalias](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ns-unalias)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/ns-unmap](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ns-unmap)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/nthrest](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/nthrest)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/num](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/num)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/numerator](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/numerator)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/pcalls](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/pcalls)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/pmap](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/pmap)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/pop-thread-bindings](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/pop-thread-bindings)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/promise](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/promise)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/proxy](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/proxy)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/proxy-mappings](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/proxy-mappings)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/proxy-super](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/proxy-super)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/push-thread-bindings](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/push-thread-bindings)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/pvalues](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/pvalues)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/ratio?](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ratio?)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/rational?](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/rational?)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/rationalize](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/rationalize)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/re-groups](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/re-groups)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/re-matcher](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/re-matcher)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/read-line](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/read-line)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/ref](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ref)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/ref-history-count](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ref-history-count)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/ref-max-history](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ref-max-history)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/ref-min-history](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ref-min-history)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/ref-set](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ref-set)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/refer](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/refer)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/refer-clojure](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/refer-clojure)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/release-pending-sends](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/release-pending-sends)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/remove-ns](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/remove-ns)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/require](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/require)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/resolve](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/resolve)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/restart-agent](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/restart-agent)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/resultset-seq](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/resultset-seq)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/send](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/send)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/send-off](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/send-off)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/send-via](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/send-via)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/seque](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/seque)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/sequence](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/sequence)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/set-agent-send-executor!](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/set-agent-send-executor!)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/set-agent-send-off-executor!](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/set-agent-send-off-executor!)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/set-error-handler!](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/set-error-handler!)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/set-error-mode!](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/set-error-mode!)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/short-array](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/short-array)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/shutdown-agents](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/shutdown-agents)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/slurp](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/slurp)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/sorted?](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/sorted?)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/spit](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/spit)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/struct](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/struct)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/struct-map](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/struct-map)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/supers](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/supers)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/sync](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/sync)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/test](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/test)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/the-ns](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/the-ns)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/thread-bound?](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/thread-bound?)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/update-proxy](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/update-proxy)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/use](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/use)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/var](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/var)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/var-get](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/var-get)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/var-set](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/var-set)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/var?](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/var?)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/vector-of](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/vector-of)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/with-bindings](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/with-bindings)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/with-bindings\*](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/with-bindings*)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/with-in-str](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/with-in-str)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/with-local-vars](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/with-local-vars)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/with-open](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/with-open)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/with-precision](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/with-precision)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/with-redefs](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/with-redefs)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/with-redefs-fn](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/with-redefs-fn)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core/xml-seq](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/xml-seq)</samp></td>
</tr>
</table>

## clojure.core.protocols

 <table>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core.protocols/CollReduce](http://clojure.github.io/clojure/branch-master/clojure.core.protocols-api.html#clojure.core.protocols/CollReduce)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core.protocols/IKVReduce](http://clojure.github.io/clojure/branch-master/clojure.core.protocols-api.html#clojure.core.protocols/IKVReduce)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core.protocols/InternalReduce](http://clojure.github.io/clojure/branch-master/clojure.core.protocols-api.html#clojure.core.protocols/InternalReduce)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core.protocols/coll-reduce](http://clojure.github.io/clojure/branch-master/clojure.core.protocols-api.html#clojure.core.protocols/coll-reduce)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core.protocols/internal-reduce](http://clojure.github.io/clojure/branch-master/clojure.core.protocols-api.html#clojure.core.protocols/internal-reduce)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core.protocols/kv-reduce](http://clojure.github.io/clojure/branch-master/clojure.core.protocols-api.html#clojure.core.protocols/kv-reduce)</samp></td>
</tr>
</table>

## clojure.core.reducers

 <table>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.core.reducers/->Cat](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core.reducers/-%3ECat)</samp></td>
</tr>
</table>

## clojure.data

 <table>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.data/diff-similar](http://clojure.github.io/clojure/branch-master/clojure.data-api.html#clojure.data/diff-similar)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.data/equality-partition](http://clojure.github.io/clojure/branch-master/clojure.data-api.html#clojure.data/equality-partition)</samp></td>
</tr>
</table>

## clojure.edn

 <table>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.edn/read](http://clojure.github.io/clojure/branch-master/clojure.edn-api.html#clojure.edn/read)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.edn/read-string](http://clojure.github.io/clojure/branch-master/clojure.edn-api.html#clojure.edn/read-string)</samp></td>
</tr>
</table>

## clojure.inspector

 <table>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.inspector/inspect](http://clojure.github.io/clojure/branch-master/clojure.inspector-api.html#clojure.inspector/inspect)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.inspector/inspect-table](http://clojure.github.io/clojure/branch-master/clojure.inspector-api.html#clojure.inspector/inspect-table)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.inspector/inspect-tree](http://clojure.github.io/clojure/branch-master/clojure.inspector-api.html#clojure.inspector/inspect-tree)</samp></td>
</tr>
</table>

## clojure.instant

 <table>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.instant/parse-timestamp](http://clojure.github.io/clojure/branch-master/clojure.instant-api.html#clojure.instant/parse-timestamp)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.instant/read-instant-calendar](http://clojure.github.io/clojure/branch-master/clojure.instant-api.html#clojure.instant/read-instant-calendar)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.instant/read-instant-date](http://clojure.github.io/clojure/branch-master/clojure.instant-api.html#clojure.instant/read-instant-date)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.instant/read-instant-timestamp](http://clojure.github.io/clojure/branch-master/clojure.instant-api.html#clojure.instant/read-instant-timestamp)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.instant/validated](http://clojure.github.io/clojure/branch-master/clojure.instant-api.html#clojure.instant/validated)</samp></td>
</tr>
</table>

## clojure.java.browse

 <table>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.java.browse/browse-url](http://clojure.github.io/clojure/branch-master/clojure.java.browse-api.html#clojure.java.browse/browse-url)</samp></td>
</tr>
</table>

## clojure.java.io

 <table>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.java.io/Coercions](http://clojure.github.io/clojure/branch-master/clojure.java.io-api.html#clojure.java.io/Coercions)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.java.io/IOFactory](http://clojure.github.io/clojure/branch-master/clojure.java.io-api.html#clojure.java.io/IOFactory)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.java.io/as-file](http://clojure.github.io/clojure/branch-master/clojure.java.io-api.html#clojure.java.io/as-file)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.java.io/as-relative-path](http://clojure.github.io/clojure/branch-master/clojure.java.io-api.html#clojure.java.io/as-relative-path)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.java.io/as-url](http://clojure.github.io/clojure/branch-master/clojure.java.io-api.html#clojure.java.io/as-url)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.java.io/copy](http://clojure.github.io/clojure/branch-master/clojure.java.io-api.html#clojure.java.io/copy)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.java.io/delete-file](http://clojure.github.io/clojure/branch-master/clojure.java.io-api.html#clojure.java.io/delete-file)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.java.io/file](http://clojure.github.io/clojure/branch-master/clojure.java.io-api.html#clojure.java.io/file)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.java.io/input-stream](http://clojure.github.io/clojure/branch-master/clojure.java.io-api.html#clojure.java.io/input-stream)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.java.io/make-input-stream](http://clojure.github.io/clojure/branch-master/clojure.java.io-api.html#clojure.java.io/make-input-stream)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.java.io/make-output-stream](http://clojure.github.io/clojure/branch-master/clojure.java.io-api.html#clojure.java.io/make-output-stream)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.java.io/make-parents](http://clojure.github.io/clojure/branch-master/clojure.java.io-api.html#clojure.java.io/make-parents)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.java.io/make-reader](http://clojure.github.io/clojure/branch-master/clojure.java.io-api.html#clojure.java.io/make-reader)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.java.io/make-writer](http://clojure.github.io/clojure/branch-master/clojure.java.io-api.html#clojure.java.io/make-writer)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.java.io/output-stream](http://clojure.github.io/clojure/branch-master/clojure.java.io-api.html#clojure.java.io/output-stream)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.java.io/reader](http://clojure.github.io/clojure/branch-master/clojure.java.io-api.html#clojure.java.io/reader)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.java.io/resource](http://clojure.github.io/clojure/branch-master/clojure.java.io-api.html#clojure.java.io/resource)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.java.io/writer](http://clojure.github.io/clojure/branch-master/clojure.java.io-api.html#clojure.java.io/writer)</samp></td>
</tr>
</table>

## clojure.java.javadoc

 <table>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.java.javadoc/add-local-javadoc](http://clojure.github.io/clojure/branch-master/clojure.java.javadoc-api.html#clojure.java.javadoc/add-local-javadoc)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.java.javadoc/add-remote-javadoc](http://clojure.github.io/clojure/branch-master/clojure.java.javadoc-api.html#clojure.java.javadoc/add-remote-javadoc)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.java.javadoc/javadoc](http://clojure.github.io/clojure/branch-master/clojure.java.javadoc-api.html#clojure.java.javadoc/javadoc)</samp></td>
</tr>
</table>

## clojure.java.shell

 <table>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.java.shell/sh](http://clojure.github.io/clojure/branch-master/clojure.java.shell-api.html#clojure.java.shell/sh)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.java.shell/with-sh-dir](http://clojure.github.io/clojure/branch-master/clojure.java.shell-api.html#clojure.java.shell/with-sh-dir)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.java.shell/with-sh-env](http://clojure.github.io/clojure/branch-master/clojure.java.shell-api.html#clojure.java.shell/with-sh-env)</samp></td>
</tr>
</table>

## clojure.lang

 <table>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/AFn](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/AFn.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/AFunction](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/AFunction.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/AMapEntry](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/AMapEntry.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/APersistentMap](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/APersistentMap.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/APersistentSet](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/APersistentSet.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/APersistentVector](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/APersistentVector.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/ARef](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/ARef.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/AReference](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/AReference.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/ATransientMap](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/ATransientMap.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/ATransientSet](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/ATransientSet.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/Agent](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Agent.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/ArityException](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/ArityException.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/ArraySeq](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/ArraySeq.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/BigInt](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/BigInt.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/Binding](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Binding.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/Compile](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Compile.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/Compiler](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Compiler.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/DynamicClassLoader](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/DynamicClassLoader.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/EdnReader](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/EdnReader.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/EnumerationSeq](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/EnumerationSeq.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/FnLoaderThunk](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/FnLoaderThunk.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/IBlockingDeref](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/IBlockingDeref.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/IExceptionInfo](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/IExceptionInfo.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/IHashEq](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/IHashEq.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/IKeywordLookup](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/IKeywordLookup.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/ILookupSite](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/ILookupSite.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/ILookupThunk](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/ILookupThunk.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/IObj](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/IObj.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/IPersistentCollection](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/IPersistentCollection.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/IPersistentMap](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/IPersistentMap.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/IProxy](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/IProxy.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/IRef](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/IRef.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/IReference](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/IReference.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/IType](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/IType.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/Intrinsics](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Intrinsics.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/IteratorSeq](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/IteratorSeq.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/KeySeq](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/APersistentMap.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/KeywordLookupSite](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/KeywordLookupSite.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/LazilyPersistentVector](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/LazilyPersistentVector.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/LineNumberingPushbackReader](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/LineNumberingPushbackReader.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/LispReader](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/LispReader.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/LockingTransaction](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/LockingTransaction.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/MapEntry](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/MapEntry.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/MapEquivalence](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/MapEquivalence.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/MethodImplCache](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/MethodImplCache.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/Namespace](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Namespace.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/Numbers](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Numbers.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/Obj](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Obj.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/PersistentStructMap](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/PersistentStructMap.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/ProxyHandler](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/ProxyHandler.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/RT](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/RT.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/Ratio](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Ratio.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/Ref](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Ref.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/Reflector](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Reflector.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/Repl](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Repl.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/RestFn](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/RestFn.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/Script](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Script.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/SeqEnumeration](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/SeqEnumeration.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/SeqIterator](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/SeqIterator.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/Settable](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Settable.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/StringSeq](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/StringSeq.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/TransactionalHashMap](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/TransactionalHashMap.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/Util](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Util.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/ValSeq](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/APersistentMap.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/Var](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Var.java)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.lang/XMLHandler](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/XMLHandler.java)</samp></td>
</tr>
</table>

## clojure.main

 <table>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.main/demunge](http://clojure.github.io/clojure/branch-master/clojure.main-api.html#clojure.main/demunge)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.main/load-script](http://clojure.github.io/clojure/branch-master/clojure.main-api.html#clojure.main/load-script)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.main/main](http://clojure.github.io/clojure/branch-master/clojure.main-api.html#clojure.main/main)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.main/repl](http://clojure.github.io/clojure/branch-master/clojure.main-api.html#clojure.main/repl)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.main/repl-caught](http://clojure.github.io/clojure/branch-master/clojure.main-api.html#clojure.main/repl-caught)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.main/repl-exception](http://clojure.github.io/clojure/branch-master/clojure.main-api.html#clojure.main/repl-exception)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.main/repl-prompt](http://clojure.github.io/clojure/branch-master/clojure.main-api.html#clojure.main/repl-prompt)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.main/repl-read](http://clojure.github.io/clojure/branch-master/clojure.main-api.html#clojure.main/repl-read)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.main/repl-requires](http://clojure.github.io/clojure/branch-master/clojure.main-api.html#clojure.main/repl-requires)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.main/root-cause](http://clojure.github.io/clojure/branch-master/clojure.main-api.html#clojure.main/root-cause)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.main/skip-if-eol](http://clojure.github.io/clojure/branch-master/clojure.main-api.html#clojure.main/skip-if-eol)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.main/skip-whitespace](http://clojure.github.io/clojure/branch-master/clojure.main-api.html#clojure.main/skip-whitespace)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.main/stack-element-str](http://clojure.github.io/clojure/branch-master/clojure.main-api.html#clojure.main/stack-element-str)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.main/with-bindings](http://clojure.github.io/clojure/branch-master/clojure.main-api.html#clojure.main/with-bindings)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.main/with-read-known](http://clojure.github.io/clojure/branch-master/clojure.main-api.html#clojure.main/with-read-known)</samp></td>
</tr>
</table>

## clojure.pprint

 <table>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.pprint/\*print-base\*](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/*print-base*)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.pprint/\*print-miser-width\*](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/*print-miser-width*)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.pprint/\*print-pprint-dispatch\*](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/*print-pprint-dispatch*)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.pprint/\*print-pretty\*](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/*print-pretty*)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.pprint/\*print-radix\*](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/*print-radix*)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.pprint/\*print-right-margin\*](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/*print-right-margin*)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.pprint/\*print-suppress-namespaces\*](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/*print-suppress-namespaces*)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.pprint/cl-format](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/cl-format)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.pprint/code-dispatch](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/code-dispatch)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.pprint/formatter](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/formatter)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.pprint/formatter-out](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/formatter-out)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.pprint/fresh-line](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/fresh-line)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.pprint/get-pretty-writer](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/get-pretty-writer)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.pprint/pp](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/pp)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.pprint/pprint](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/pprint)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.pprint/pprint-indent](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/pprint-indent)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.pprint/pprint-logical-block](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/pprint-logical-block)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.pprint/pprint-newline](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/pprint-newline)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.pprint/pprint-tab](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/pprint-tab)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.pprint/print-length-loop](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/print-length-loop)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.pprint/print-table](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/print-table)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.pprint/set-pprint-dispatch](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/set-pprint-dispatch)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.pprint/simple-dispatch](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/simple-dispatch)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.pprint/with-pprint-dispatch](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/with-pprint-dispatch)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.pprint/write](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/write)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.pprint/write-out](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/write-out)</samp></td>
</tr>
</table>

## clojure.reflect

 <table>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.reflect/->AsmReflector](http://clojure.github.io/clojure/branch-master/clojure.reflect-api.html#clojure.reflect/-%3EAsmReflector)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.reflect/->Constructor](http://clojure.github.io/clojure/branch-master/clojure.reflect-api.html#clojure.reflect/-%3EConstructor)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.reflect/->Field](http://clojure.github.io/clojure/branch-master/clojure.reflect-api.html#clojure.reflect/-%3EField)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.reflect/->JavaReflector](http://clojure.github.io/clojure/branch-master/clojure.reflect-api.html#clojure.reflect/-%3EJavaReflector)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.reflect/->Method](http://clojure.github.io/clojure/branch-master/clojure.reflect-api.html#clojure.reflect/-%3EMethod)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.reflect/AsmReflector](http://clojure.github.io/clojure/branch-master/clojure.reflect-api.html#clojure.reflect/AsmReflector)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.reflect/ClassResolver](http://clojure.github.io/clojure/branch-master/clojure.reflect-api.html#clojure.reflect/ClassResolver)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.reflect/Constructor](http://clojure.github.io/clojure/branch-master/clojure.reflect-api.html#clojure.reflect/Constructor)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.reflect/Field](http://clojure.github.io/clojure/branch-master/clojure.reflect-api.html#clojure.reflect/Field)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.reflect/JavaReflector](http://clojure.github.io/clojure/branch-master/clojure.reflect-api.html#clojure.reflect/JavaReflector)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.reflect/Method](http://clojure.github.io/clojure/branch-master/clojure.reflect-api.html#clojure.reflect/Method)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.reflect/Reflector](http://clojure.github.io/clojure/branch-master/clojure.reflect-api.html#clojure.reflect/Reflector)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.reflect/TypeReference](http://clojure.github.io/clojure/branch-master/clojure.reflect-api.html#clojure.reflect/TypeReference)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.reflect/do-reflect](http://clojure.github.io/clojure/branch-master/clojure.reflect-api.html#clojure.reflect/do-reflect)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.reflect/flag-descriptors](http://clojure.github.io/clojure/branch-master/clojure.reflect-api.html#clojure.reflect/flag-descriptors)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.reflect/map->Constructor](http://clojure.github.io/clojure/branch-master/clojure.reflect-api.html#clojure.reflect/map-%3EConstructor)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.reflect/map->Field](http://clojure.github.io/clojure/branch-master/clojure.reflect-api.html#clojure.reflect/map-%3EField)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.reflect/map->Method](http://clojure.github.io/clojure/branch-master/clojure.reflect-api.html#clojure.reflect/map-%3EMethod)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.reflect/reflect](http://clojure.github.io/clojure/branch-master/clojure.reflect-api.html#clojure.reflect/reflect)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.reflect/resolve-class](http://clojure.github.io/clojure/branch-master/clojure.reflect-api.html#clojure.reflect/resolve-class)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.reflect/type-reflect](http://clojure.github.io/clojure/branch-master/clojure.reflect-api.html#clojure.reflect/type-reflect)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.reflect/typename](http://clojure.github.io/clojure/branch-master/clojure.reflect-api.html#clojure.reflect/typename)</samp></td>
</tr>
</table>

## clojure.repl

 <table>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.repl/apropos](http://clojure.github.io/clojure/branch-master/clojure.repl-api.html#clojure.repl/apropos)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.repl/demunge](http://clojure.github.io/clojure/branch-master/clojure.repl-api.html#clojure.repl/demunge)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.repl/dir](http://clojure.github.io/clojure/branch-master/clojure.repl-api.html#clojure.repl/dir)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.repl/dir-fn](http://clojure.github.io/clojure/branch-master/clojure.repl-api.html#clojure.repl/dir-fn)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.repl/doc](http://clojure.github.io/clojure/branch-master/clojure.repl-api.html#clojure.repl/doc)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.repl/find-doc](http://clojure.github.io/clojure/branch-master/clojure.repl-api.html#clojure.repl/find-doc)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.repl/pst](http://clojure.github.io/clojure/branch-master/clojure.repl-api.html#clojure.repl/pst)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.repl/root-cause](http://clojure.github.io/clojure/branch-master/clojure.repl-api.html#clojure.repl/root-cause)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.repl/set-break-handler!](http://clojure.github.io/clojure/branch-master/clojure.repl-api.html#clojure.repl/set-break-handler!)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.repl/source](http://clojure.github.io/clojure/branch-master/clojure.repl-api.html#clojure.repl/source)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.repl/source-fn](http://clojure.github.io/clojure/branch-master/clojure.repl-api.html#clojure.repl/source-fn)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.repl/stack-element-str](http://clojure.github.io/clojure/branch-master/clojure.repl-api.html#clojure.repl/stack-element-str)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.repl/thread-stopper](http://clojure.github.io/clojure/branch-master/clojure.repl-api.html#clojure.repl/thread-stopper)</samp></td>
</tr>
</table>

## clojure.stacktrace

 <table>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.stacktrace/e](http://clojure.github.io/clojure/branch-master/clojure.stacktrace-api.html#clojure.stacktrace/e)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.stacktrace/print-cause-trace](http://clojure.github.io/clojure/branch-master/clojure.stacktrace-api.html#clojure.stacktrace/print-cause-trace)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.stacktrace/print-stack-trace](http://clojure.github.io/clojure/branch-master/clojure.stacktrace-api.html#clojure.stacktrace/print-stack-trace)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.stacktrace/print-throwable](http://clojure.github.io/clojure/branch-master/clojure.stacktrace-api.html#clojure.stacktrace/print-throwable)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.stacktrace/print-trace-element](http://clojure.github.io/clojure/branch-master/clojure.stacktrace-api.html#clojure.stacktrace/print-trace-element)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.stacktrace/root-cause](http://clojure.github.io/clojure/branch-master/clojure.stacktrace-api.html#clojure.stacktrace/root-cause)</samp></td>
</tr>
</table>

## clojure.string

 <table>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.string/re-quote-replacement](http://clojure.github.io/clojure/branch-master/clojure.string-api.html#clojure.string/re-quote-replacement)</samp></td>
</tr>
</table>

## clojure.template

 <table>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.template/apply-template](http://clojure.github.io/clojure/branch-master/clojure.template-api.html#clojure.template/apply-template)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.template/do-template](http://clojure.github.io/clojure/branch-master/clojure.template-api.html#clojure.template/do-template)</samp></td>
</tr>
</table>

## clojure.test

 <table>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.test/\*load-tests\*](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/*load-tests*)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.test/\*stack-trace-depth\*](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/*stack-trace-depth*)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.test/are](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/are)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.test/assert-any](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/assert-any)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.test/assert-predicate](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/assert-predicate)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.test/compose-fixtures](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/compose-fixtures)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.test/deftest](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/deftest)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.test/deftest-](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/deftest-)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.test/do-report](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/do-report)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.test/file-position](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/file-position)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.test/function?](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/function?)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.test/get-possibly-unbound-var](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/get-possibly-unbound-var)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.test/inc-report-counter](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/inc-report-counter)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.test/is](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/is)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.test/join-fixtures](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/join-fixtures)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.test/report](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/report)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.test/run-all-tests](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/run-all-tests)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.test/run-tests](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/run-tests)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.test/set-test](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/set-test)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.test/successful?](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/successful?)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.test/test-all-vars](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/test-all-vars)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.test/test-ns](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/test-ns)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.test/test-var](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/test-var)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.test/testing](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/testing)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.test/testing-contexts-str](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/testing-contexts-str)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.test/testing-vars-str](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/testing-vars-str)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.test/try-expr](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/try-expr)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.test/use-fixtures](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/use-fixtures)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.test/with-test](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/with-test)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.test/with-test-out](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/with-test-out)</samp></td>
</tr>
</table>

## clojure.test.junit

 <table>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.test.junit/with-junit-output](http://clojure.github.io/clojure/branch-master/clojure.test.junit-api.html#clojure.test.junit/with-junit-output)</samp></td>
</tr>
</table>

## clojure.test.tap

 <table>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.test.tap/print-tap-diagnostic](http://clojure.github.io/clojure/branch-master/clojure.test.tap-api.html#clojure.test.tap/print-tap-diagnostic)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.test.tap/print-tap-fail](http://clojure.github.io/clojure/branch-master/clojure.test.tap-api.html#clojure.test.tap/print-tap-fail)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.test.tap/print-tap-pass](http://clojure.github.io/clojure/branch-master/clojure.test.tap-api.html#clojure.test.tap/print-tap-pass)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.test.tap/print-tap-plan](http://clojure.github.io/clojure/branch-master/clojure.test.tap-api.html#clojure.test.tap/print-tap-plan)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.test.tap/with-tap-output](http://clojure.github.io/clojure/branch-master/clojure.test.tap-api.html#clojure.test.tap/with-tap-output)</samp></td>
</tr>
</table>

## clojure.walk

 <table>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.walk/macroexpand-all](http://clojure.github.io/clojure/branch-master/clojure.walk-api.html#clojure.walk/macroexpand-all)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.walk/postwalk-demo](http://clojure.github.io/clojure/branch-master/clojure.walk-api.html#clojure.walk/postwalk-demo)</samp></td>
</tr>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.walk/prewalk-demo](http://clojure.github.io/clojure/branch-master/clojure.walk-api.html#clojure.walk/prewalk-demo)</samp></td>
</tr>
</table>

## clojure.xml

 <table>
<tr>
<td><img width="20px" height="20px" valign="middle" src="http://i.imgur.com/sWBgjc6.png"></td>
<td><samp>[clojure.xml/parse](http://clojure.github.io/clojure/branch-master/clojure.xml-api.html#clojure.xml/parse)</samp></td>
</tr>
</table>

