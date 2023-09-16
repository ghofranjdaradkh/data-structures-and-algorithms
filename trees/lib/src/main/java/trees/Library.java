/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

public class Library {
   public static void main(String [] args){
       BinarySearchTree search=new BinarySearchTree();
       search.add(6);
       search.add(2);
       search.add(8);
       search.add(1);
       search.add(4);
       search.add(3);
       search.add(5);
       System.out.println("inorder method"+search.inOrder(search.getRoot()));
       System.out.println( "preorder method"+ search.preOrder(search.getRoot()));
       System.out.println( "postorder method"+ search.postOrder(search.getRoot()));
   }
}