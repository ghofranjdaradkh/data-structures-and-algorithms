# data-structures-and-algorithms

# Challenge 17
<!-- Description of the challenge -->
## Write code to implementation  Breadth First class
implement  a method called breadth first that take input set of Node (tree) 
and return list of all values in the tree, in the order they were encountered

Algorthim :
initialize an empty list result to store the values of the nodes in breadth-first order.

Initialize an empty queue queue to assist in traversal.

Add the root node to the queue and start a loop.

While the queue is not empty, do the following:
a. Dequeue a node temp from the queue.
b. Add the value of temp to the result list.
c. Print the value of temp (optional).

Check if temp has a left child:
a. If yes, enqueue the left child into the queue.

Check if temp has a right child:
a. If yes, enqueue the right child into the queue.

Repeat steps 4 to 6 until the queue is empty.

Return the result list containing the values of the binary tree in breadth-first order.




## Whiteboard Process
<!-- Embedded whiteboard image -->
![image (45).png](pic%2Fimage%20%2845%29.png)

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
1. The first thing specify the problem (implementation stack and queue classes and Node)
2. Draw simple diagram to understand the idea
3. Try to write the code for this part
4. Write the whole code using java language
5. Run the code to be sure is it correct
6. write test cases for code and then run it
7. Drawing the data structure in white board




## Time Complexity (O(n)
## Space Complexity (O(n))


## Solution
<!-- Show how to run your code,and examples of it in action -->
output :
![out17.PNG](pic%2Fout17.PNG)
test cases:
![testcase.PNG](pic%2Ftestcase.PNG)

gradlew test:
![gradlew17.PNG](pic%2Fgradlew17.PNG)

