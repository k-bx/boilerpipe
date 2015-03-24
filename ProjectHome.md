# Summary #

The boilerpipe library provides algorithms to detect and remove the surplus "clutter" (boilerplate, templates) around the main textual content of a web page.

The library already provides specific strategies for common tasks (for example: news article extraction) and may also be easily extended for individual problem settings.

Extracting content is very fast (milliseconds), just needs the input document (no global or site-level information required) and is usually quite accurate.

Boilerpipe is a Java library written by Christian Kohlschütter. It is released under the Apache License 2.0.

The algorithms used by the library are based on (and extending) some concepts of the paper "[Boilerplate Detection using Shallow Text Features](http://www.l3s.de/~kohlschuetter/boilerplate/)" by Christian Kohlschütter et al., presented at WSDM 2010 -- The Third ACM International Conference on Web Search and Data Mining New York City, NY USA. [Click here to read the paper and the presentation slides](http://www.l3s.de/~kohlschuetter/boilerplate/). A video of the presentation is freely available on [Videolectures.net](http://videolectures.net/wsdm2010_kohlschutter_bdu/) (turn speaker balance to the left to improve audio quality).

Commercial support is available through [Kohlschütter Search Intelligence](http://www.kohlschutter.com/).

# News #

  * _(2011-06-06)_ **boilerpipe 1.2.0**
> > Bug fixes, some new label extensions, heuristics.
> > Brings boilerpipe-core up-to-date with boilerpipe-web

  * _(2010-11-02)_ **boilerpipe Web API**
> > You can now test drive boilerpipe on the Web: http://boilerpipe-web.appspot.com/

  * _(2010-11-02)_ **boilerpipe 1.1.0**
> > Added [an estimator for Extraction Quality](http://code.google.com/p/boilerpipe/source/browse/trunk/boilerpipe-core/src/main/de/l3s/boilerpipe/estimators/SimpleEstimator.java), [HTML-level Extraction capabilities](http://code.google.com/p/boilerpipe/issues/detail?id=4&can=1), [a new CanolaExtractor](http://code.google.com/p/boilerpipe/source/browse/trunk/boilerpipe-core/src/main/de/l3s/boilerpipe/extractors/CanolaExtractor.java), [a home for common extractors](http://code.google.com/p/boilerpipe/source/browse/trunk/boilerpipe-core/src/main/de/l3s/boilerpipe/extractors/CommonExtractors.java), [TextBlock#clone](http://code.google.com/p/boilerpipe/issues/detail?id=2) and a new [block-level labeling framework](http://code.google.com/p/boilerpipe/source/browse/#svn/trunk/boilerpipe-core/src/main/de/l3s/boilerpipe/labels).
> > Plus some bug fixes, especially affecting the extraction of HTML from wikipedia.org.

  * _(2010-05-06)_ **boilerpipe 1.0.4**
> > Now supports TagSoup and other HTML balancers through a SAX `ContentHandler`.
> > Boilerpipe now available in [its own Maven repository](http://boilerpipe.googlecode.com/svn/repo/).

  * _(2010-01-30)_ **boilerpipe 1.0.3**
> > Two bug fixes (XML parsing issues). Issues [#1](http://code.google.com/p/boilerpipe/issues/detail?id=1) and [#2](http://code.google.com/p/boilerpipe/issues/detail?id=2).
> > _(Thanks to Tom Taylor, Kaspar Fischer and nedunk for reporting the problems)_
  * _(2009-12-10)_ **boilerpipe 1.0.2**
> > This release hot-fixes a [NekoHTML bug](http://sourceforge.net/tracker/?func=detail&atid=952178&aid=2909310&group_id=195122) which caused low-quality results in a rare situation. _(Thanks to Kris Jirapinyo for reporting the problem)_
  * _(2009-12-04)_ **boilerpipe 1.0.1**
> > Added the dependency libs (xerces and nekohtml) and the javadocs to the binary tarball. _(Thanks to Mike Matthews for reporting the problem)_
  * _(2009-12-03)_ **boilerpipe 1.0.0**
> > The code is now online. Have fun!

# Getting Started #

To get started, see the [documentation in the Wiki](http://code.google.com/p/boilerpipe/w/list) and the [binary and source tarballs](http://code.google.com/p/boilerpipe/downloads/list). Please also read the [FAQ](http://code.google.com/p/boilerpipe/wiki/FAQ), it contains important information.

# About the Author #

[Christian Kohlschütter](http://www.kohlschutter.com/) has done his PhD research on boilerplate removal at [L3S Research Center](http://www.L3S.de/). His main research interests are in the area of Web Information Retrieval and Quantitative Linguistics.