package generics;

import java.util.ArrayList;
import java.util.List;

class Utilites {
    public static <T> void fill(List<T> list, T val) {
        for (int i=0; i<list.size();i++) {
            list.set(i, val);
        }
    }
}

public class UtilitiesTest {
    public static void main(String[] args) {
        List<String> intList = new ArrayList<>();
        intList.add("10");
        intList.add("20");
        System.out.println("The original list is: " + intList);
        Utilites.fill(intList, "100");
        System.out.println("The list after calling Utilities.fill() is: " + intList);
    }
}
