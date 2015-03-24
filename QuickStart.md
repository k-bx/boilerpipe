# Installation #

  1. Get a binary and optionally also the source tarball from the [Downloads page](http://code.google.com/p/boilerpipe/downloads/list)
  1. Extract the files somewhere
```
    tar xvzf boilerpipe-VERSION-bin.tar.gz
    tar xvzf boilerpipe-VERSION-src.tar.gz
```
  1. Add `boilerpipe-VERSION.jar`, `nekohtml-1.9.13.jar` and `xerces-2.9.1.jar` to your Java classpath (these jar files are included in the binary tarball).

> (Whereas VERSION needs to be replaced by boilerpipe's version number, e.g. `1.0.3`).

# Usage #

Once you have boilerpipe on your classpath, extracting the "main" content from a Web page is really simple:

```
   URL url = new URL("http://www.example.com/some-location/index.html");
   // NOTE: Use ArticleExtractor unless DefaultExtractor gives better results for you
   String text = ArticleExtractor.INSTANCE.getText(url);
```


Please also have a look at the [demo classes](http://code.google.com/p/boilerpipe/source/browse/#svn/tags/BOILERPIPE_1_0_0/boilerpipe-core/src/demo/de/l3s/boilerpipe/demo).

Even though there is a [DefaultExtractor](http://code.google.com/p/boilerpipe/source/browse/trunk/boilerpipe-core/src/main/de/l3s/boilerpipe/extractors/DefaultExtractor.java) which should work somehow well on any type of content, there are [other extractors](http://boilerpipe.googlecode.com/svn/trunk/boilerpipe-core/javadoc/1.0/de/l3s/boilerpipe/BoilerpipeExtractor.html) that may be more suitable for particular content scenarios. For example, [ArticleExtractor](http://boilerpipe.googlecode.com/svn/trunk/boilerpipe-core/javadoc/1.0/de/l3s/boilerpipe/extractors/ArticleExtractor.html) adds some heuristics to extract the main content from a news page (this the usual scenario for boilerplate removal, so use this unless you are absolutely sure what you are doing). There is also [NumWordsRulesExtractor](http://code.google.com/p/boilerpipe/source/browse/trunk/boilerpipe-core/src/main/de/l3s/boilerpipe/extractors/NumWordsRulesExtractor.java) which resembles the number-of-words-based decision tree presented in the [WSDM 2010 Paper](WSDM2010Paper.md) (Algorithm 2).

There are also [other ways](http://boilerpipe.googlecode.com/svn/trunk/boilerpipe-core/javadoc/1.0/de/l3s/boilerpipe/extractors/ExtractorBase.html) to call the Extractor (using `Reader`, `InputSource`, `String` etc.).

See the [API Javadocs](http://boilerpipe.googlecode.com/svn/trunk/boilerpipe-core/javadoc/1.0/index.html) for details.

# Building from Source #

To work with the source, please either check out a version from the [SVN repository](http://code.google.com/p/boilerpipe/source/checkout) or download the tarballs of the latest release. In the latter case, you will need both the binary and the source tarball, since the binary contains the dependency libraries. Just extract them into the same directory.

To build the distribution jars and archives from the sources just run the `build.xml` ant script:
```
   ant
```

To just build the jar files run
```
   ant jars
```

# Maven Repository #

You may download the jar from my local [Maven Repository](http://boilerpipe.googlecode.com/svn/repo/):
```
http://boilerpipe.googlecode.com/svn/repo/
```

# Customizing #

You are invited to improve, customize and extend Boilerpipe. See here for details on [how the boilerpipe components work together](Components.md).