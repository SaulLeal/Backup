package prueba;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BookSale {
    public static int nthLowestSelling(int[] sales, int n) {
        Arrays.sort(sales);
        Integer[] salesInt = Arrays.stream( sales ).boxed().toArray( Integer[]::new );
        List<Integer> listWithoutDuplicates = Arrays.asList(salesInt)
                .stream()
                .distinct()
                .collect(Collectors.toList());
        return binarySearchIterative(sales, 0, sales.length - 1, n);
    }

    private static int binarySearchIterative(int array[], int left, int right, int objective) {
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == objective) return objective;
            if (array[mid] < objective) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int x = nthLowestSelling(new int[] { 5, 4, 3, 2, 1, 5, 4, 3, 2, 5, 4, 3, 5, 4, 5 }, 2);
        System.out.println(x);
    }
}