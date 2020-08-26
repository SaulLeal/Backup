package prueba;

public class ValorRepetidoRepeticionesMinimas {
    public static void main(String[] args) throws Exception{
        System.out.println(Class.forName("String").getName());
//        int[] arreglo = {4, 5, 2, 4, 5, 9, 9, 4, 4};
//        System.out.println(contiene(arreglo, 4, 5));
//        System.out.println(contiene(arreglo, 4, 4));
//        System.out.println(contiene(arreglo, 4, 3));
//        System.out.println(contiene(arreglo, 9, 2));
    }

    private static boolean contiene(int[] arreglo, int numeroDeseado, int repeticionesMinimas) {
        int contadorRepeticiones = 0;
        for (int value : arreglo) {
            if (value == numeroDeseado) {
                contadorRepeticiones++;
            }
        }
        return contadorRepeticiones >= repeticionesMinimas;
    }
}
