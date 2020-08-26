package generics;

class PairOfT<T> {
    T object1;
    T object2;
    PairOfT(T one, T two) {
        object1 = one;
        object2 = two;
    }

    public T getFirst() {
        return object1;
    }

    public T getSecond() {
        return object2;
    }
}

class PairTest {
    public static void main(String []args) {
        Pair<Integer, String> worldCup = new Pair<>(2018, "Russia");
        System.out.println("World cup " + worldCup.getKey() + " in " + worldCup.getValue());

        PairOfT<String> worldCup2 = new PairOfT<>("2018", "Russia");
        System.out.println("World cup " + worldCup2.getFirst() + " in " + worldCup2.getSecond());
    }
}
