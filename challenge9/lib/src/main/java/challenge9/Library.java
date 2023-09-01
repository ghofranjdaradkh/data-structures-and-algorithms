package challenge9;



public class Library {
        public static void main(String[] args) {
//                reverseArray array = new reverseArray();
//                array.append(3);
//                array.append(2);
//                array.append(1);
//
//                System.out.println("Original List: " + array.toString());
//
//                array.reverseLinkedList();
//
//                System.out.println("Reversed List: " + array.toString());
//        }

                Palindrome palindromeChecker = new Palindrome();

                // Create linked list nodes
                Palindrome.Node node1 = palindromeChecker.new Node("m");
                Palindrome.Node node2 = palindromeChecker.new Node("o");
                Palindrome.Node node3 = palindromeChecker.new Node("o");
                Palindrome.Node node4 = palindromeChecker.new Node("m");


                // Connect linked list nodes
                palindromeChecker.head = node1;
                node1.next = node2;
                node2.next = node3;
                node3.next = node4;


                System.out.println(palindromeChecker.isPalindrome(palindromeChecker.head));
        }
}
