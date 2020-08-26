package generics;

public class Tester {
    public static void main(String[] args) {
//        PairInterface<String, Integer> p1 = new OrderedPair<>("Even", 8);
//        PairInterface<String, String> p2 = new OrderedPair<>("Hello", "World");
//
//        OrderedPair<String, Box<Integer>> p = new OrderedPair<>("primes", new Box<>());
//        System.out.println(p.getKey());
//        System.out.println(p.getValue());

        Pair<Integer, String> p1 = new Pair<>(1, "apple");
        Pair<Integer, String> p2 = new Pair<>(2, "pear");
        boolean same = Util.<Integer, String>compare(p1, p2);
        System.out.println(same);
    }
}
