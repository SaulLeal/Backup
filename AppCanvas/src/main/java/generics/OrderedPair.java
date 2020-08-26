package generics;

interface PairInterface<K, V> {
    public K getKey();
    public V getValue();
}

public class OrderedPair<K, V> implements PairInterface<K, V> {
    private K key;
    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
}
