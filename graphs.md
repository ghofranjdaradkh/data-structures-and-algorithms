# data-structures-and-algorithms

# Challenge 35
## Graphs
<!-- Description of the challenge -->
write a set of methods using graph
as an adjacency list

add vertex
input :value
output : vertex(like Node )

add edge.
input: 2 vertices
output: nothing

get vertices.
input: none
output : collection(list)

get neighbors.
input: vertex
output: a collection of edges

size
input: none
output: the total number of vertices in the graph

--------------------------------------------------------------


## Whiteboard Process
<!-- Embedded whiteboard image -->

![Untitled (14).jpg](pic%2FUntitled%20%2814%29.jpg)

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
complexity :
addVertex:
Time Complexity: O(1)
Space Complexity: O(1)
addEdge:
Time Complexity: O(1) to O(V) (worst case)
Space Complexity: O(1)
getVertices:
Time Complexity: O(V)
Space Complexity: O(V)
getNeighbors:
Time Complexity: O(1)
Space Complexity: O(E) (worst case)
size:
Time Complexity: O(1)
Space Complexity: O(1)
------------------------------------



## Solution
<!-- Show how to run your code,and examples of it in action -->
output :
![output35.PNG](pic%2Foutput35.PNG)
test cases:
![testcases35.PNG](pic%2Ftestcases35.PNG)
gradlew test:
![gradlewtest35.PNG](pic%2Fgradlewtest35.PNG)

