## Explanation :
The Movie class represents a movie with two properties: title and year.
It also contains two static methods, sortByMostRecentYear and sortAlphabeticallyIgnoringArticles,
which return comparators for sorting Movie objects.




## pseudo code :
function sortByMostRecentYear(a, b):
if (a.year > b.year):
return -1
else if (a.year < b.year):
return 1
else:
return 0

function sortAlphabeticallyIgnoringArticles(a,b):
 titleA = removeLeadingArticles(a.title)
 titleB = removeLeadingArticles(b.title)
return titleA.compareTo(titleB)

function removeLeadingArticles(title):
return title with leading articles (A, An, The) removed



## Time Complexity (Big O): O(1) >>  for this function  sortByMostRecentYear

 ## Time Complexity (Big O): O(n)  >>  for this function  sortAlphabeticallyIgnoringArticles


