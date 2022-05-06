# ClojureScript API Docs

Generates data for the __[API Documentation Site]__

- Create with: `./run`
- Download data: [`cljs-api.edn`]
- Learn about data format: [`cljs-api-format.edn`]
- Explore the data in a Planck REPL: `./explore`
- Contribute extra documentation in [`docfiles/`]

[API Documentation Site]:http://cljs.github.io/api/
[`cljs-api.edn`]:cljs-api.edn
[`cljs-api-format.edn`]:cljs-api-format.edn
[`docfiles/`]:docfiles

We parse every version of ClojureScript to build a versioned catalog for the
syntax, library, and compiler.  We also supplement this data with curated
descriptions, examples, cross-refs, and associate each ClojureScript form with
an equivalent Clojure form where appropriate.

CLJS master branch changes are represented with a pseudo-version ending in `+`.
For example, if `1.9.23` is latest published version, `1.9.23+` will represent
what is currently in master.

## Google Closure Library API?

https://google.github.io/closure-library/api/index.html

The entire Google Closure Library API is also included with ClojureScript. I
find it hard to search through, but here are the following are the main
namespaces I gleaned with [googs.clj]:

```
:i  :ns               :overview
0   goog.array        Utilities for manipulating arrays.
1   goog.asserts      Utilities to check the preconditions, postconditions and invariants runtime.
2   goog.color        Utilities related to color and color conversion.
3   goog.crypt        Namespace with crypto related helper functions.
4   goog.cssom        CSS Object Model helper functions.
5   goog.date         Functions and objects for date representation and manipulation.
6   goog.db           Wrappers for the HTML5 IndexedDB.
7   goog.debug        Logging and debugging utilities.
8   goog.dispose      The dispose method is used to clean up references and resources.
9   goog.dom          Utilities for manipulating the browser's Document Object Model Inspiration taken *heavily* from mochikit (http://mochikit.com/).
10  goog.events       An event manager for both native browser event targets and custom JavaScript event targets (`goog.events.Listenable`).
11  goog.format       Provides utility functions for formatting strings, numbers etc.
12  goog.fs           Wrappers for the HTML5 File API.
13  goog.functions    Utilities for creating functions.
14  goog.fx           Legacy stub for the goog.fx namespace.
15  goog.graphics     Graphics utility functions and factory methods.
16  goog.iter         Python style iteration utilities.
17  goog.json         JSON utility functions.
18  goog.locale       Functions for dealing with Date formatting & Parsing, County and language name, TimeZone list.
19  goog.log          Basic strippable logging definitions.
20  goog.math         Additional mathematical functions.
21  goog.memoize      Tool for caching the result of expensive deterministic functions.
22  goog.messaging    Functions for manipulating message channels.
23  goog.object       Utilities for manipulating objects/maps/hashes.
24  goog.positioning  Common positioning code.
25  goog.proto        Protocol buffer serializer.
26  goog.reflect      Useful compiler idioms.
27  goog.singleton    Provides an implementation for getInstance() methods.
28  goog.soy          Provides utility methods to render soy template.
29  goog.string       Utilities for string manipulation.
30  goog.structs      Generics method for collection-like classes and objects.
31  goog.style        Utilities for element styles.
32  goog.testing      Enable mocking of functions not attached to objects whether they be global / top-level or anonymous methods / closures.
33  goog.tweak        Provides facilities for creating and querying tweaks.
34  goog.url          Class for parsing strings into URLs using browser native resolution.
35  goog.vec          Supplies global data types and constants for the vector math library.
36  goog.webgl        Constants used by the WebGL rendering, including all of the constants used from the WebGL context.
37  goog.window       Utilities for window manipulation.
```

## License

MIT, Copyright © 2014-2017 Shaun LeBron
