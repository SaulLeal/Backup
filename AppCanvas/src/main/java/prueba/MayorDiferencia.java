package prueba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MayorDiferencia {
    public static void main(String[] args) {
        System.out.println(obtenerMayorDiferencia(new int[]{1, 1, 4}));
        System.out.println(obtenerMayorDiferencia(new int[]{9, 8}));
        System.out.println(obtenerMayorDiferencia(new int[]{6, 22, 16, 29, 23}));
        System.out.println(obtenerMayorDiferencia(new int[]{28, 16, 28, 11, 14, 26, 23, 25, 17, 3, 22, 23, 23, 10}));
    }

    private static int obtenerMayorDiferencia(int[] arreglo) {
        // Opcion 1
        ArrayList<Integer> arrayList = new ArrayList<>();
        poblarArrayList(arrayList, arreglo);
        return Collections.max(arrayList) - Collections.min(arrayList);

        // Opcion 2
//        Integer[] arregloWrapper = trasnformarAWrapper(arreglo);
//        List<Integer> listaWrapper = Arrays.asList(arregloWrapper);
//        int valorMaximo = Collections.max(listaWrapper);
//        int valorMinimo = Collections.min(listaWrapper);
//        return valorMaximo - valorMinimo;
    }

    private static void poblarArrayList(ArrayList<Integer> arl, int[] arreglo) {
        for (Integer value:arreglo) {
            arl.add(value);
        }
    }

//    private static Integer[] trasnformarAWrapper(int[] arreglo) {
//        return Arrays.stream(arreglo)
//                .boxed()
//                .toArray(Integer[]::new);
//    }
}
