/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge8;
//
import java.util.LinkedList;



public class Library {


    public static void main(String[] args) {
        linkedListZip list1 = new linkedListZip();
        list1.append(1);
        list1.append(2);
        list1.append(3);

        linkedListZip list2 = new linkedListZip();
        list2.append(10);
        list2.append(20);
        list2.append(30);

        linkedListZip zippedList = new linkedListZip();
        zippedList.head = zippedList.zipLists(list1.head, list2.head);

        System.out.println(zippedList);
    }
}