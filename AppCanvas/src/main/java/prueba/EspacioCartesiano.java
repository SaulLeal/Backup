package prueba;

public class EspacioCartesiano {

    public static class Punto {
        public double x = 0;
        public double y = 0;

        public Punto(double a, double b) {
            x = a;
            y = b;
        }
    }

    public static void main(String[] args) {
        Punto a = new Punto(1,3);
        Punto b = new Punto(-3,-5);
        Punto c = new Punto(0.5,2);

        System.out.println(distanciaPromedio(a,b,c));
    }

    private static double distanciaPromedio(Punto a, Punto b, Punto c) {
        double resultadoAB = calcularDistancia(a, b);
        double resultadoCA = calcularDistancia(c, a);
        double resultadoCB = calcularDistancia(c, b);
        return (resultadoAB+resultadoCA+resultadoCB)/3;
    }

    private static double calcularDistancia(Punto a, Punto b) {
        return Math.sqrt(Math.pow((b.x-a.x),2)+Math.pow((b.y-a.y),2));
    }
}
