package prueba;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class MismaMagnitud {
    public static void main(String[] args) {
        System.out.println(evaluarMismaMagnitud(new double[]{1, 3, 5}));
        System.out.println(evaluarMismaMagnitud(new double[]{194, 54, 23, 7, 3, 6, 8 }));
        System.out.println(evaluarMismaMagnitud(new double[]{44, 37, 30, 23}));
        System.out.println(evaluarMismaMagnitud(new double[]{-2.3, -1.1, 0.1, 1.3, 2.5, 3.7}));
        System.out.println(evaluarMismaMagnitud(new double[]{1, 8}));
        System.out.println(evaluarMismaMagnitud(new double[]{3, 2, 1, 2, 3, 4, 3}));
    }

    public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray)
            if (e.compareTo(elem) > 0)
                ++count;
        return count;
    }

    private static boolean evaluarMismaMagnitud(double[] arreglo) {
        if (!arregloValido(arreglo)) {return false;}

        double primerValor = arreglo[0];
        double segundoValor = arreglo[1];
        double magnitud = obtenerDoubleConFormato(Math.abs(primerValor - segundoValor));

        for(int i=1;i<arreglo.length-1;i++)
        {
            double valorActual = arreglo[i];
            double valorSiguiente = arreglo[i+1];
            double suma = obtenerDoubleConFormato(valorActual + magnitud);
            double resta = obtenerDoubleConFormato(valorActual - magnitud);

            if (valorSiguiente != suma && valorSiguiente != resta) {
                return false;
            }
        }

        return true;
    }

    private static double obtenerDoubleConFormato(double magnitud) {
        if (magnitud % 1 == 0) {
            return magnitud;
        }
        DecimalFormat df =new DecimalFormat("0.0");
        String format = df.format(magnitud);
        double result = 0.0;
        try {
            result = (Double)df.parse(format);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return result;
    }

    private static boolean arregloValido(double[] arreglo) {
        return arreglo != null && arreglo.length >= 2;
    }
}
