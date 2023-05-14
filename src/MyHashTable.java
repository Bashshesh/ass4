import java.util.ArrayList;

public class MyHashTable<K, V> {
    private ArrayList<ArrayList<Node<K, V>>> buckets;
    private int size;

    //initializes a hash table with 10 empty buckets, each represented by an empty ArrayList. The size of the hash table is set to zero
    public MyHashTable() {
        buckets = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            buckets.add(new ArrayList<>());
        }
        size = 0;
    }
    private static class Node<K, V> {
        K key;
        V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
