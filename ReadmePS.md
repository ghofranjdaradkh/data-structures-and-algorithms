# data-structures-and-algorithms

# Challenge 11
<!-- Description of the challenge -->
## Write code to implementation  pseudo Queue class
# pseudo Queue
Implement a pseudo Queue class that models a stack data structure with using two stacks
The class should provide the following methods:
## **enqueue** 
that takes a single argument (value) and pushes it onto stack1. This simulates adding an element to the end of the queue.

 ## **dequeue**
check if stack2 is empty. If it is, and stack1 is also empty, throw an NoSuchElementException to indicate that the queue is empty.
While stack1 is not empty:
a. Pop the top element from stack1 using stack1.pop().
b. Push the popped element onto stack2 using stack2.push().
c. Repeat steps 3a and 3b until stack1 becomes empty.
Finally, return the popped value from stack2, which corresponds to dequeue the first element in the queue.





## Whiteboard Process
<!-- Embedded whiteboard image -->

![image (37).png](..%2FDownloads%2Fimage%20%2837%29.png)
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
1. The first thing specify the problem (implementation stack and queue classes and Node)
2. Draw simple diagram to understand the idea
3. Try to write the code for this part
4. Write the whole code using java language
5. Run the code to be sure is it correct
6. write test cases for code and then run it
7. Drawing the data structure in white board

it takes 4 hours to deal with Queue using Stack and draw the white board.


## Time Complexity (O(1)
## Space Complexity (O(1))


## Solution
<!-- Show how to run your code,and examples of it in action -->
output :
![outputcc11.PNG](pic%2Foutputcc11.PNG)
test cases:
![testcases11.PNG](pic%2Ftestcases11.PNG)

gradlew test:
![GRADLEW11.PNG](pic%2FGRADLEW11.PNG)

