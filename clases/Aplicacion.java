public class Aplicacion {
    public static void main(String[] args) {
        //probando método esPar
        System.out.println ("10 es par: " + Algoritmos.esPar(10));
        System.out.println ("17 es par: " + Algoritmos.esPar(17));

        //probando método esPrimo
        System.out.println("8 es primo: " + Algoritmos.esPrimo(8));
        System.out.println("7 es primo: " + Algoritmos.esPrimo(7));

        //probando método stringEnReversa
        System.out.println("'Hola Mundo' en reversa es: " + Algoritmos.stringEnReversa("Hola Mundo"));
        System.err.println("'Bienvenido' en reversa es: " + Algoritmos.stringEnReversa("Bienvenido"));

        //probando métodp esPalindromo
        System.out.println("'Radar' es palíndromo: " + Algoritmos.esPalindromo("radar"));
        System.out.println("'Local' es palíndromo: " + Algoritmos.esPalindromo("local"));

        //probando método secuenciaFizzBuzz
        System.out.println("Secuencia FizzBuzz hasta 30:\n" + Algoritmos.secuenciaFizzBuzz(30));
    }
}