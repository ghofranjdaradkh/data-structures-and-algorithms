# data-structures-and-algorithms

# Challenge 30
<!-- Description of the challenge -->
## Write code to implementation  hashtable with the basic methods 
### set method :
Arguments: key, value
Returns: nothing
### get method :
Arguments: key
Returns: Value associated with that key in the table
### has method :
Arguments: key
Returns: Boolean, indicating if the key exists in the table already.
### keys method :
Returns: Collection of keys
### hash method :
Arguments: key
Returns: Index in the collection for that key.



## Whiteboard Process
<!-- Embedded whiteboard image -->
![Untitled (8).jpg](pic%2FUntitled%20%288%29.jpg)


## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
1. The first thing specify the problem
2. Draw simple diagram to understand the idea
3. try to write code in simple terms (pseudo code )
4. Write the whole code using java language
5. Run the code to be sure is it correct
6. write test cases for code and then run it
7. Drawing the data structure in white board



------------------------------------
set(K key, V value):

Time Complexity: O(1) to O(n) if it have collisions
Space Complexity: O(1)
------------------------------------
get(K key):

Time Complexity: O(1) to O(n) if it have collisions
Space Complexity: O(1)
------------------------------------
contains(K key):

Time Complexity: O(1) to O(n) if it have collisions
Space Complexity: O(1)
-------------------------------------
keys():

Time Complexity: O(k)
Space Complexity: O(k)
-------------------------------------
hash(K key):

Time Complexity: O(1)
Space Complexity: O(1)
--------------------------------------

## Solution
<!-- Show how to run your code,and examples of it in action -->
output :
![hashtableoutput.PNG](pic%2Fhashtableoutput.PNG)
test cases:
![testcaseshashtable.PNG](pic%2Ftestcaseshashtable.PNG)
gradlew test:

![gradlewhash.PNG](pic%2Fgradlewhash.PNG)
