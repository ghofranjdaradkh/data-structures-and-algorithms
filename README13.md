# data-structures-and-algorithms

# Challenge 13
<!-- Description of the challenge -->
## Write code to implementation  validate Brackets class using Stack 
In this lab we use stack data structue to validate barackets in the input expression 
1. Create a class called Stack with push, pop, and peek methods.
2. Create a class called validateBrackets.
3. Implement a method in validateBrackets that returns a boolean value.
4. Iterate through the input expression character by character.
5. If the character is any type of open bracket, push it onto the stack.
   --If the character in the expression is a closing bracket:Check if the stack is empty or if the output from the pairBracket method is false. If either condition is true, return false.
   --If the stack is not empty and the closing bracket matches the corresponding open bracket, pop the open bracket from the stack.
6. Continue processing each character in the expression.
7. After processing all characters, check if the stack is empty. If it is, return true; otherwise, return false.
8. implement pairBracket method to check for matching pairs of brackets for each type.





## Whiteboard Process
<!-- Embedded whiteboard image -->
![WHITEBOARD13.png](pic%2FWHITEBOARD13.png)

![image (37).png](pic%2Fimage%20%2837%29.png)
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
1. The first thing specify the problem (implementation stack and queue classes and Node)
2. Draw simple diagram to understand the idea
3. Try to write the code for this part
4. Write the whole code using java language
5. Run the code to be sure is it correct
6. write test cases for code and then run it
7. Drawing the data structure in white board

it takes 3 hours to deal with validate Bracket using Stack and draw the white board.


## Time Complexity (O(n)
## Space Complexity (O(n))


## Solution
<!-- Show how to run your code,and examples of it in action -->
output :
![RUNLAB13.PNG](pic%2FRUNLAB13.PNG)
test cases:
![TESTCASES13.PNG](pic%2FTESTCASES13.PNG)

gradlew test:

![GRADLEW13.PNG](pic%2FGRADLEW13.PNG)
