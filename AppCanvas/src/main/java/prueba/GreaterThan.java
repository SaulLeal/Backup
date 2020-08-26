package prueba;

import java.util.Arrays;

public class GreaterThan {
    public static void main(String[] args) {
        int[] arrayInt = {5,6,7};
        int element = 5;

        Integer[] arrayWrapped = trasnformarAWrapper(arrayInt);

        int result = countArrayGreaterThan(arrayWrapped, element);

        System.out.println(result);
    }


    private static Integer[] trasnformarAWrapper(int[] arreglo) {
        return Arrays.stream(arreglo)
                .boxed()
                .toArray(Integer[]::new);
    }

    // Generic Method with Bounded Type Parameters
    public static <T extends Comparable<T>> int countArrayGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray)
            if (e.compareTo(elem) > 0)
                ++count;
        return count;
    }
}
