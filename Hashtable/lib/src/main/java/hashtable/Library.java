/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashtable;

public class Library {
    public static void main(String[] args) {
        hashTable<String, Integer> hashMap = new hashTable<>(100);

        hashMap.set("amal", 4);
        hashMap.set("ghofran", 7);
        hashMap.set("ali", 3);

        System.out.println(hashMap.get("amal"));
        System.out.println(hashMap.has("ghofran"));
        System.out.println(hashMap.has("marwah"));
        System.out.println(hashMap.keys());
    }
}