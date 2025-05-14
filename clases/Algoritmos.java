public class Algoritmos {
    //método para saber si un número es par
    public static boolean esPar(int numero) {
        return numero % 2 == 0; 
    }

    //método para saber si un número es primo
    public static boolean esPrimo(int num) {
        if (num <= 1) { 
            return false; //si es menor o igual a 1 no es primo
        }
        for (int i = 2; i <= Math.sqrt(num); i++){ // recorre desde 2 hasta la raíz cuadrada del número
            if (num % i == 0) { //si el número es divisible entre i, no es primo
                return false;
            }
        }
        return true; // si no es divisible por ningún otro número, es primo
    }

    //método para revertir un String
    public static String stringEnReversa(String texto) {
        return new StringBuilder(texto).reverse().toString(); //crea una instancia, la invierte y la devuelve convertida en un String
    }

    //método para saber si una palabra es un palindromo
    public static boolean esPalindromo(String palabra) {
        String reversa = new StringBuilder(palabra).reverse().toString(); //crea una instancia, la invierte y la devuelve como String
        return palabra.equalsIgnoreCase(reversa); //compara el parámetro palabra con su reversa
        }

    //método de secuencia fizzbuzz
    public static String secuenciaFizzBuzz(int numero) {
        String resultado = "";
        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                resultado += "FizzBuzz ";
            } else if (i % 3 == 0) {
                resultado += "Fizz ";
            } else if (i % 5 == 0) {
                resultado += "Buzz ";
            } else {
                resultado += i + " ";
            }
        }
        return resultado;
    }
}    