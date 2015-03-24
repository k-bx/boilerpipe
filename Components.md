# Introduction #

Boilerpipe consists of the following components:

  1. an HTML parser that transforms HTML into an internal text-only document model supporting "blocks" of text.
  1. several Filter components analyze and tag these text blocks
  1. extractors consisting of one or more Filters. Such "pipelines" take the parsed document object and distill the main textual content from it
  1. an HTML highlighter to visually inspect the extracted main content within a copy of the input page.

# Components #

See the [API Javadocs](http://boilerpipe.googlecode.com/svn/trunk/boilerpipe-core/javadoc/1.0/index.html) for details.

## HTML Parser ##

The HTML Parser is based upon [CyberNeko](http://nekohtml.sourceforge.net/) 1.9.13. It is called internally from within the Extractors.

The parser takes an HTML document and transforms it into a `TextDocument`, consisting of one or more `TextBlock`s. It knows about specific HTML elements (SCRIPT, OPTION etc.) that are ignored automatically.

Each `TextBlock` stores a portion of text from the HTML document. Initially (after parsing) almost every TextBlock represents a text section from the HTML document, except for a few inline elements that do not separate per defintion (for example `<A>` anchor tags).

The `TextBlock` objects also store shallow text statistics for the block's content such as the number of words and the number of words in anchor text.

## Filters ##

Filters are applied to a `TextDocument` and usually iterate once over all contained `TextBlock`s. They may mark individual `TextBlock`s as _content_/_boilerplate_ or assign additional tags (textual labels) to it.

Boilerpipe's Filters are grouped into the following packages:

  1. `simple` Very basic Filters
  1. `english` Filters that are probably specific to English text (they might work for other Western languages, but some parameters probably need to be changed)
  1. `heuristics` Filters that simply seem to work well but have not yet been further explored from a theoretic perspective

## Extractors ##

Extractors consist of one or more pipelined Filters. They are used to get the content of a webpage. Several different Extractors exist, ranging from a generic `DefaultExtractor` to extractors specific for news article extraction (`ArticleExtractor`).

## HTML Highlighter ##

For showcase and debugging purposes you can use the `HTMLHighlighter` class. It returns a modified HTML that shows the extracted main content marked yellow.

# Theoretical Background #

To understand why boilerpipe works read the paper "[Boilerplate Detection using Shallow Text Features](http://www.l3s.de/~kohlschuetter/publications/wsdm187-kohlschuetter.pdf)" by Christian Kohlschütter et al., presented at WSDM 2010 -- The Third ACM International Conference on Web Search and Data Mining New York City, NY USA.

Please note that boilerpipe is a re-implementation of the code used in this paper. We have found some minor differences between the two implementations, which we have planned to fix in a later release of boilerpipe.