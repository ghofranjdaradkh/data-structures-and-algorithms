/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge5doublelinkedlist;

public class Library {
    public static void main(String[] args) {
        // create list
        DoubleLinkedList list = new DoubleLinkedList();
        list.doublyInsert(10);
        list.doublyInsert(20);
        list.doublyInsert(30);

        System.out.println(list);
        System.out.println(list.doublyIncludes(7));
        System.out.println(list.doublyIncludes(20));
        System.out.println(list.doublyToString());

    }}
