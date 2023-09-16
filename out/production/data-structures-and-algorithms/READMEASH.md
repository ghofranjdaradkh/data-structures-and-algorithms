# data-structures-and-algorithms

# Challenge 11
<!-- Description of the challenge -->
## Write code to implementation  Animal Shelter class

Implement a Animal Shelter class that have two queue "dogQueue" and "catQueue" useing linkedlist data structure
The class should provide the following methods:
## **enqueue**
The enqueue method adds an animal to one of the queues based on its species:
If it's a dog, it's enqueued into the dogQueue.
If it's a cat, it's enqueued into the catQueue.
## **dequeue**
dequeues an animal based on the preference (pref) provided as an argument:

If the pref is "cat" and the catQueue is not empty, it dequeues and returns the front animal from the catQueue.
If the pref is "dog" and the dogQueue is not empty, it dequeues and returns the front animal from the dogQueue.
If the pref is neither "cat" nor "dog" or the respective queue is empty, it returns null.




## Whiteboard Process
<!-- Embedded whiteboard image -->
![image (38).png](pic%2Fimage%20%2838%29.png)

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
1. The first thing specify the problem (implementation stack and queue classes and Node)
2. Draw simple diagram to understand the idea
3. Try to write the code for this part
4. Write the whole code using java language
5. Run the code to be sure is it correct
6. write test cases for code and then run it
7. Drawing the data structure in white board

it takes 5 hours to deal with Queue interface using linkedList and draw the white board.


## Time Complexity (O(1)
## Space Complexity (O(1))


## Solution
<!-- Show how to run your code,and examples of it in action -->
output :
![output12.PNG](pic%2Foutput12.PNG)
test cases:
![testCases12.PNG](pic%2FtestCases12.PNG)

gradlew test:
![gradlew12.PNG](pic%2Fgradlew12.PNG)