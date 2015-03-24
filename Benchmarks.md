# Extraction Quality #

Using the [L3S-GN1 dataset](http://www.l3s.de/~kohlschuetter/boilerplate/) (news articles crawled from Google News), boilerpipe achieves a much higher accuracy than the competition:

![http://boilerpipe.googlecode.com/svn/wiki/googlenews-fmeasures-boilerpipe.png](http://boilerpipe.googlecode.com/svn/wiki/googlenews-fmeasures-boilerpipe.png)

The figure depicts the F1 score (harmonized mean between precision and recall) at token-level (i.e. every correctly/incorrectly classified word/token is taken into account). As you can see, there are pages in the dataset which result in 100% correct results and some with results close to 0%. The higher the curve is to the top-right corner, the better.

See my paper [Boilerplate Detection using Shallow Text Features](http://www.l3s.de/~kohlschuetter/boilerplate/) for details.