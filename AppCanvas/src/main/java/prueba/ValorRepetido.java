package prueba;

public class ValorRepetido {
    public static void main(String[] args) {
        int[] arreglo = {2,3,4,3,2,1};
        System.out.println(contiene(arreglo, 3));
    }

    private static int contiene(int[] arreglo, int numeroDeseado) {
        int contadorRepeticiones = 0;
        for (int value : arreglo) {
            if (value == numeroDeseado) {
                contadorRepeticiones++;
            }
        }
        return contadorRepeticiones;
    }
}

