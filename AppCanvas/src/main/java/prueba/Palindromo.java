package prueba;

public class Palindromo {
    public static void main(String[] args) {
        System.out.println(casiPalindromo("abccba")); //true
        System.out.println(casiPalindromo("abccbx")); //true
    }

    private static boolean casiPalindromo(String palabra) {
        String palabraAlReves = "";
        for (int i = palabra.length() - 1; i >= 0; i--) {
            palabraAlReves = palabraAlReves + palabra.charAt(i);
        }
        if (palabra.length() == palabraAlReves.length()) {
            for (int i = 0; i < palabra.length(); i++) {
                
            }
        }
        return palabra.equals(palabraAlReves);
    }
}
