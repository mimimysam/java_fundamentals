package class_demos.data_structures_and_algorithms;

public class CustomHashMap<K, V> {

    private HashMapNode<K, V>[] table = new HashMapNode[10];

    public int hash(K key){
        int hash = key.hashCode();
        int index = Math.abs(hash % table.length);
        return index;
    }

    //void put(K, V)
    public void put(K key, V value) {
        int index = hash(key);
        HashMapNode<K,V> entry = new HashMapNode(key, value);
        if (table[index] == null) {
            table[index] = entry;
        }
        else {
            HashMapNode<K, V> p = table[index];
            while (p.next != null) {
                p = p.next;
            }
            p.next = entry;
        }
    }

    //V get(K)
    public V get(K key) {
        int index = hash(key);
        if (table[index] == null) {
            return null;
        }
        HashMapNode<K, V> entry = table[index];
        while (entry.getKey() != key) {
            if (entry.next == null) {
                return null;
            }
            entry = entry.next;
        }
        return entry.getValue();
    }


    //void remove(K)
    public void remove(K key) {
        if (get(key) == null) {
            System.out.println("This entry does not exist");
            return;
        }
        int index = hash(key);
        HashMapNode<K, V> entry = table[index];
        if (entry.getKey().equals(key)) {
            if (entry.getNext() == null) {
                table[index] = null;
                return;
            } else {
                table[index] = entry.next;
                return;
            }
        }
        while (entry.next != null) {
            if (!entry.next.getKey().equals(key)) {
                entry = entry.next;
            } else {
                break;
            }
        }
        if (entry.next == null) {
            return;
        } else if (entry.next.getKey().equals(key)) {
            if (entry.getNext().getKey().equals(key)) {
                if (entry.next.next != null) {
                    entry.next = entry.next.next;
                } else {
                    entry.next = null;
                }
            }
        }
    }

    //boolean contains(K)
    public boolean contains(K key) {
        int index = hash(key);

        if (table[index] == null){
            System.out.println("Empty");
            return false;
        }
        HashMapNode<K, V> iterator = table[index];
        while(null != iterator) {
            if (iterator.getKey().equals(key)){
                System.out.println("true");
                return true;
            }
            iterator = iterator.getNext();
            }
        System.out.println("false");
        return false;
        }

}
