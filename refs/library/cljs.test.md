## cljs.test

 <table border="1">
<tr>
<td>namespace</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.test</samp>](http://clojure.github.io/clojure/branch-master/clojure.test-api.html)
</td>
</tr>
</table>

a unit-testing framework

---


Source Docstring:

```
A unit testing framework.

   ASSERTIONS

   The core of the library is the "is" macro, which lets you make
   assertions of any arbitrary expression:

   (is (= 4 (+ 2 2)))
   (is (instance? Integer 256))
   (is (.startsWith "abcde" "ab"))

   You can type an "is" expression directly at the REPL, which will
   print a message if it fails.

       user> (is (= 5 (+ 2 2)))

       FAIL in  (:1)
       expected: (= 5 (+ 2 2))
         actual: (not (= 5 4))
       false

   The "expected:" line shows you the original expression, and the
   "actual:" shows you what actually happened.  In this case, it
   shows that (+ 2 2) returned 4, which is not = to 5.  Finally, the
   "false" on the last line is the value returned from the
   expression.  The "is" macro always returns the result of the
   inner expression.

   There are two special assertions for testing exceptions.  The
   "(is (thrown? c ...))" form tests if an exception of class c is
   thrown:

   (is (thrown? ArithmeticException (/ 1 0))) 

   "(is (thrown-with-msg? c re ...))" does the same thing and also
   tests that the message on the exception matches the regular
   expression re:

   (is (thrown-with-msg? ArithmeticException #"Divide by zero"
                         (/ 1 0)))

   DOCUMENTING TESTS

   "is" takes an optional second argument, a string describing the
   assertion.  This message will be included in the error report.

   (is (= 5 (+ 2 2)) "Crazy arithmetic")

   In addition, you can document groups of assertions with the
   "testing" macro, which takes a string followed by any number of
   assertions.  The string will be included in failure reports.
   Calls to "testing" may be nested, and all of the strings will be
   joined together with spaces in the final report, in a style
   similar to RSpec <http://rspec.info/>

   (testing "Arithmetic"
     (testing "with positive integers"
       (is (= 4 (+ 2 2)))
       (is (= 7 (+ 3 4))))
     (testing "with negative integers"
       (is (= -4 (+ -2 -2)))
       (is (= -1 (+ 3 -4)))))

   Note that, unlike RSpec, the "testing" macro may only be used
   INSIDE a "deftest" form (see below).


   DEFINING TESTS

   (deftest addition
     (is (= 4 (+ 2 2)))
     (is (= 7 (+ 3 4))))

   (deftest subtraction
     (is (= 1 (- 4 3)))
     (is (= 3 (- 7 4))))

   This creates functions named "addition" and "subtraction", which
   can be called like any other function.  Therefore, tests can be
   grouped and composed, in a style similar to the test framework in
   Peter Seibel's "Practical Common Lisp"
   <http://www.gigamonkeys.com/book/practical-building-a-unit-test-framework.html>

   (deftest arithmetic
     (addition)
     (subtraction))

   The names of the nested tests will be joined in a list, like
   "(arithmetic addition)", in failure reports.  You can use nested
   tests to set up a context shared by several tests.


   RUNNING TESTS

   Run tests with the function "(run-tests namespaces...)":

   (run-tests 'your.namespace 'some.other.namespace)

   If you don't specify any namespaces, the current namespace is
   used.  To run all tests in all namespaces, use "(run-all-tests)".

   By default, these functions will search for all tests defined in
   a namespace and run them in an undefined order.  However, if you
   are composing tests, as in the "arithmetic" example above, you
   probably do not want the "addition" and "subtraction" tests run
   separately.  In that case, you must define a special function
   named "test-ns-hook" that runs your tests in the correct order:

   (defn test-ns-hook []
     (arithmetic))

   "run-tests" also optionally takes a testing enviroment. A default
   one is supplied for you by invoking "empty-env".  The test
   environment contains everything needed to run tests including the
   report results map. Fixtures must be present here if you want them
   to run. Note that code that relies on "test-ns" will
   automatically be supplied the appropriate defined fixtures.  For
   example, this is done for you if you use "run-tests".

   Note: test-ns-hook prevents execution of fixtures (see below).


   OMITTING TESTS FROM PRODUCTION CODE

   You can set the ClojureScript compiler build option
   ":load-tests" to false when loading or compiling code in
   production.  This will prevent any tests from being created by
   or "deftest".


   FIXTURES

   Fixtures allow you to run code before and after tests, to set up
   the context in which tests should be run.

   A fixture is just a function that calls another function passed as
   an argument.  It looks like this:

   (defn my-fixture [f]
      Perform setup, establish bindings, whatever.
     (f)  Then call the function we were passed.
      Tear-down / clean-up code here.
    )

   Fixtures are attached to namespaces in one of two ways.  "each"
   fixtures are run repeatedly, once for each test function created
   with "deftest".  "each" fixtures are useful for
   establishing a consistent before/after state for each test, like
   clearing out database tables.

   "each" fixtures can be attached to the current namespace like this:
   (use-fixtures :each fixture1 fixture2 ...)
   The fixture1, fixture2 are just functions like the example above.
   They can also be anonymous functions, like this:
   (use-fixtures :each (fn [f] setup... (f) cleanup...))

   The other kind of fixture, a "once" fixture, is only run once,
   around ALL the tests in the namespace.  "once" fixtures are useful
   for tasks that only need to be performed once, like establishing
   database connections, or for time-consuming tasks.

   Attach "once" fixtures to the current namespace like this:
   (use-fixtures :once fixture1 fixture2 ...)

   Note: Fixtures and test-ns-hook are mutually incompatible.  If you
   are using test-ns-hook, fixture functions will *never* be run.


   EXTENDING TEST-IS (ADVANCED)

   You can extend the behavior of the "is" macro by defining new
   methods for the "assert-expr" multimethod.  These methods are
   called during expansion of the "is" macro, so they should return
   quoted forms to be evaluated.

   You can plug in your own test-reporting framework by specifying a
   :reporter key in the test environment. It is normally set to
   :cljs.test/default. Set this to the desired key and supply custom
   implementations of the "report" multimethod.

   The 'event' argument is a map.  It will always have a :type key,
   whose value will be a keyword signaling the type of event being
   reported.  Standard events with :type value of :pass, :fail, and
   :error are called when an assertion passes, fails, and throws an
   exception, respectively.  In that case, the event will also have
   the following keys:

     :expected   The form that was expected to be true
     :actual     A form representing what actually occurred
     :message    The string message given as an argument to 'is'

   The "testing" strings will be a list in the :testing-contexts
   property of the test environment, and the vars being tested will be
   a list in the :testing-vars property of the test environment.

   For additional event types, see the examples in the code.

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
<td><samp>[\*current-env\*](../cljs.test/STARcurrent-envSTAR.md)</samp></td>
<td><samp>dynamic var</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
<tr>
<td></td>
<td><samp>[clear-env!](../cljs.test/clear-envBANG.md)</samp></td>
<td><samp>function</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
<tr>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/compose-fixtures)</td>
<td><samp>[compose-fixtures](../cljs.test/compose-fixtures.md)</samp></td>
<td><samp>function</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
<tr>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/deftest)</td>
<td><samp>[deftest](../cljs.test/deftest.md)</samp></td>
<td><samp>macro</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
<tr>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/do-report)</td>
<td><samp>[do-report](../cljs.test/do-report.md)</samp></td>
<td><samp>function</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
<tr>
<td></td>
<td><samp>[empty-env](../cljs.test/empty-env.md)</samp></td>
<td><samp>function</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
<tr>
<td></td>
<td><samp>[file-and-line](../cljs.test/file-and-line.md)</samp></td>
<td><samp>function</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
<tr>
<td></td>
<td><samp>[get-current-env](../cljs.test/get-current-env.md)</samp></td>
<td><samp>function</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
<tr>
<td></td>
<td><samp>[inc-report-counter!](../cljs.test/inc-report-counterBANG.md)</samp></td>
<td><samp>function</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
<tr>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/is)</td>
<td><samp>[is](../cljs.test/is.md)</samp></td>
<td><samp>macro</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
<tr>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/join-fixtures)</td>
<td><samp>[join-fixtures](../cljs.test/join-fixtures.md)</samp></td>
<td><samp>function</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
<tr>
<td></td>
<td><samp>[js-filename](../cljs.test/js-filename.md)</samp></td>
<td><samp>function</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
<tr>
<td></td>
<td><samp>[js-line-and-column](../cljs.test/js-line-and-column.md)</samp></td>
<td><samp>function</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
<tr>
<td></td>
<td><samp>[mapped-line-and-column](../cljs.test/mapped-line-and-column.md)</samp></td>
<td><samp>function</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
<tr>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/report)</td>
<td><samp>[report](../cljs.test/report.md)</samp></td>
<td><samp>multimethod</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
<tr>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/run-all-tests)</td>
<td><samp>[run-all-tests](../cljs.test/run-all-tests.md)</samp></td>
<td><samp>macro</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
<tr>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/run-tests)</td>
<td><samp>[run-tests](../cljs.test/run-tests.md)</samp></td>
<td><samp>macro</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
<tr>
<td></td>
<td><samp>[set-env!](../cljs.test/set-envBANG.md)</samp></td>
<td><samp>function</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
<tr>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/successful?)</td>
<td><samp>[successful?](../cljs.test/successfulQMARK.md)</samp></td>
<td><samp>function</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
<tr>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/test-all-vars)</td>
<td><samp>[test-all-vars](../cljs.test/test-all-vars.md)</samp></td>
<td><samp>macro</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
<tr>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/test-ns)</td>
<td><samp>[test-ns](../cljs.test/test-ns.md)</samp></td>
<td><samp>macro</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
<tr>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/test-var)</td>
<td><samp>[test-var](../cljs.test/test-var.md)</samp></td>
<td><samp>function</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
<tr>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/test-vars)</td>
<td><samp>[test-vars](../cljs.test/test-vars.md)</samp></td>
<td><samp>function</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
<tr>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/testing)</td>
<td><samp>[testing](../cljs.test/testing.md)</samp></td>
<td><samp>macro</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
<tr>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/testing-contexts-str)</td>
<td><samp>[testing-contexts-str](../cljs.test/testing-contexts-str.md)</samp></td>
<td><samp>function</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
<tr>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/testing-vars-str)</td>
<td><samp>[testing-vars-str](../cljs.test/testing-vars-str.md)</samp></td>
<td><samp>function</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
<tr>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/try-expr)</td>
<td><samp>[try-expr](../cljs.test/try-expr.md)</samp></td>
<td><samp>macro</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
<tr>
<td></td>
<td><samp>[update-current-env!](../cljs.test/update-current-envBANG.md)</samp></td>
<td><samp>function</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
<tr>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/use-fixtures)</td>
<td><samp>[use-fixtures](../cljs.test/use-fixtures.md)</samp></td>
<td><samp>macro</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2498"><img valign="middle" alt="[+] 0.0-2498" title="Added in 0.0-2498" src="https://img.shields.io/badge/+-0.0--2498-lightgrey.svg"></a> </td>
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

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files
