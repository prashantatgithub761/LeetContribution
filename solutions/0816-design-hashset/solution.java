// import java.util.LinkedList;

// class Bucket {
//     private LinkedList<Integer> list;

//     public Bucket() {
//         list = new LinkedList<>();
//     }

//     public void insert(int key) {
//         if (!list.contains(key)) {
//             list.add(key);
//         }
//     }

//     public void remove(int key) {
//         list.remove(Integer.valueOf(key));
//     }

//     public boolean contains(int key) {
//         return list.contains(key);
//     }
// }

import java.util.LinkedList;

class Bucket {

    private LinkedList<Integer> list;

    public Bucket() {
        list = new LinkedList<>();
    }

    public void insert(int key) {
        if (!list.contains(key)) {
            list.add(key);
        }
    }

    public void remove(int key) {
        list.remove(Integer.valueOf(key));
    }

    public boolean contains(int key) {
        return list.contains(key);
    }
}


class MyHashSet {
 
    private final int KEY_RANGE = 2003;

    private Bucket[] buckets;

    

    public MyHashSet() {
        
        buckets = new Bucket[KEY_RANGE];
        for(int i = 0;i<KEY_RANGE;i++){
            buckets[i] = new Bucket();
        }
    }
    // hashFunction 
    private int hash(int key){
        return key%KEY_RANGE;
    }

    public void add(int key) {
        int bucketIndex = hash(key);
        buckets[bucketIndex].insert(key);
        
    }

    public void remove(int key) {
        int bucketIndex = hash(key);
        buckets[bucketIndex].remove(key);
        
    }

    public boolean contains(int key) {
        int bucketIndex = hash(key);
        return buckets[bucketIndex].contains(key);
        
    }
}
