/*
6. Desarrolle un algoritmo que imprima por pantalla los números del 1 al 100, pero cambie los
múltiplos de 3 por la palabra fizz y los múltiplos de 5 por la palabra buzz, para los números
que sean tanto múltiplos de 3 y 5 se debe mostrar la palabra fizzbuzz.
*/

public class Ejercicio6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if ( i % 3 == 0 ) {
                System.out.print("fizz");
            }
            if ( i % 5 == 0 ) {
                System.out.print("buzz");
            }
            if( i % 3 != 0 && i % 5 != 0 ) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}
