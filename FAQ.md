# Will it work with any web page? #

Probably not. But you should give it a try. The algorithms used in Boilerpipe should be quite content-independent.

Please make sure that you first try with English text, preferably from News or Blog sites (the algorithms have been trained on such data). Then attempt to extract text from other sources and see how it goes. If you extract non-English text you might need to change some parameters (this is not yet automatized). See the [WSDM 2010 paper](WSDM2010Paper.md) for details.

If your page is really short, i.e. it contains few words (or just one sentence per paragraph etc.), you might get worse results than for longer ones.

If your page does not contain sufficient HTML text (i.e., PDF, Flash or JavaScript), there is nothing Boilerpipe can do about it at the moment. Try converting the output to HTML or `TextDocument`s and feed it to a Boilerpipe extractor.

# It does not work for page _X_ #

Maybe it is an HTML parsing problem? Boilerpipe uses the [NekoHTML parser library](http://nekohtml.sourceforge.net/) to get a valid SAX tree (to skip elements like `SCRIPT`, `OPTION` etc. and to detect text linked by `A`)

Boilerpipe user _Kris Jirapinyo_ reported a case where the NekoHTML parser library failed to parse the input HTML correctly and caused low-quality extraction results (e.g., for [this page](http://abclocal.go.com/kgo/story?section=news/national_world&id=7153024)). This was fixed in boilerpipe 1.0.2. Boilerpipe now also actively monitors what is coming from the HTML parser and will throw a `BoilerpipeProcessingException` if a knowingly incorrect input is received.

So, in case you are not happy with the extraction of a particular web page, please try to clean the URL's HTML code before sending it to boilerpipe. If you have Firefox with the [Web Developer Extension](https://addons.mozilla.org/de/firefox/addon/60), you just need to click on "View Generated Source" and save that HTML to disk.

If it then works, it is probably a bug in NekoHTML.

In any case, please file an [issue](http://code.google.com/p/boilerpipe/issues/list) with all necessary information (e.g., URL information and type of error). If possible please also attach the HTML in question.