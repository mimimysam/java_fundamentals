package class_demos.data_structures_and_algorithms;

public class HashMapNode<K, V> {

    protected K key;
    protected V value;
    protected HashMapNode<K, V> next;
    public HashMapNode() {
    }
    public HashMapNode(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public HashMapNode(K key, V value, HashMapNode<K, V> next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }
    public K getKey() {
        return key;
    }
    public void setKey(K key) {
        this.key = key;
    }
    public V getValue() {
        return value;
    }
    public void setValue(V value) {
        this.value = value;
    }
    public HashMapNode<K, V> getNext() {
        return next;
    }
    public void setNext(HashMapNode<K, V> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "HashMapNode{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
