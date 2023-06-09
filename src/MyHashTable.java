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

    //function takes a key and a value, calculates the hash of the key, then adds the key-value pair to a bucket in an array of buckets. If the key already exists in the bucket, its value is updated.
    public void put(K key, V value) {
        int hash = key.hashCode() % buckets.size();
        ArrayList<Node<K, V>> bucket = buckets.get(hash);
        for (Node<K, V> node : bucket) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
        }
        bucket.add(new Node<>(key, value));
        size++;
    }

    //returns the value associated with a given key from an ArrayList of nodes. If the key is not found, it returns null
    public V get(K key) {
        int hash = key.hashCode() % buckets.size();
        ArrayList<Node<K, V>> bucket = buckets.get(hash);
        for (Node<K, V> node : bucket) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }
        return null;
    }
    private int getBucketIndex(K key) {
        return key.hashCode() % size;
    }
    /*private void resize(){
        int newSize = size * 2;
        ArrayList<ArrayList<Node<K, V>>> newBuckets = new ArrayList<>(newSize);
        for(int i = 0; i < newSize; i++){
            newBuckets.add(new ArrayList<>());
        }

    }*/



    //takes a key, computes a hashcode based on the key and removes the node with the given key from the ArrayList of nodes in the corresponding bucket, reducing the size by 1 if successful
    public void remove(K key) {
        int hash = key.hashCode() % buckets.size();
        ArrayList<Node<K, V>> bucket = buckets.get(hash);
        for (Node<K, V> node : bucket) {
            if (node.key.equals(key)) {
                bucket.remove(node);
                size--;
                return;
            }
        }
    }

    //returns size
    public int size() {
        return size;
    }

    public void copyAll(K key, V value){
        MyHashTable(K, V);
        buckets = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            buckets.add(new ArrayList<>());
        }
        size = 0;
        int hash = key.hashCode() % buckets.size();
        ArrayList<Node<K, V>> bucket = buckets.get(hash);
        for (Node<K, V> node : bucket) {
            if (node.key.equals(key)) {
                node.value = value;
            }
        }
        bucket.add(new Node<>(key, value));
        size++;

        for (int i = 0; i < buckets.size(); i++) {
            ArrayList<Node<K, V>> bucket = buckets.get(i);
            bucket.add(new Node<>(key, value));
        }
//asddasdas
    }

    //prints the number of elements in each bucket of a hash table. It iterates through all the buckets and prints their index and size
    public void printBuckets() {
        for (int i = 0; i < buckets.size(); i++) {
            ArrayList<Node<K, V>> bucket = buckets.get(i);
            System.out.println("Bucket " + i + ": " + bucket.size() + " elements");
        }
    }

    //defines a private static Node class with two template types K and V for key and value respectively. It has a constructor to initialize the key and value
    private static class Node<K, V> {
        K key;
        V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
