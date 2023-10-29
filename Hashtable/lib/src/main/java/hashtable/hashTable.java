package hashtable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class hashTable<K, V> {

    private ArrayList<LinkedList<KeyValue<K, V>>> bucketArrayList;
    private int size;

    public hashTable(int size) { // Constructor name should match the class name
        if (size < 1) {
            throw new IllegalArgumentException("Hashtables size must be 1 or greater!");
        }

        this.size = size;
        this.bucketArrayList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            bucketArrayList.add(new LinkedList<>());
        }
    }

    public void set(K key, V value) {
        int index = hash(key);
        LinkedList<KeyValue<K, V>> bucket = bucketArrayList.get(index);
        for (KeyValue<K, V> kv : bucket) {
            if (kv.key.equals(key)) {
                kv.value = value;
                return;
            }
        }
        bucket.add(new KeyValue<>(key, value));
    }

    public V get(K key) {
        int index = hash(key);
        LinkedList<KeyValue<K, V>> bucket = bucketArrayList.get(index);
        for (KeyValue<K, V> kv : bucket) {
            if (kv.key.equals(key)) {
                return kv.value;
            }
        }
        return null;
    }

    public boolean has(K key) {
        int index = hash(key);
        LinkedList<KeyValue<K, V>> bucket = bucketArrayList.get(index);
        for (KeyValue<K, V> kv : bucket) {
            if (kv.key.equals(key)) {
                return true;
            }
        }
        return false;
    }

    public List<K> keys() {
        List<K> keys = new ArrayList<>();
        for (LinkedList<KeyValue<K, V>> bucket : bucketArrayList) {
            for (KeyValue<K, V> kv : bucket) {
                keys.add(kv.key);
            }
        }
        return keys;
    }

    public int hash(K key) {
        return Math.abs(key.hashCode()) % size;
    }

    private static class KeyValue<K, V> {
        K key;
        V value;

        KeyValue(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
