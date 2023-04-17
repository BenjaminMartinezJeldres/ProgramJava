
/*
1. Desarrolle un algoritmo que convierta el peso chileno a su equivalente en dólar, euro, yen,
yuan y libra esterlina.
*/
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double monto;

        do {
            System.out.println("Ingrese un valor en pesos: ");
            monto = scan.nextDouble();
            if (monto < 0.0) {
                System.out.println("El valor ingresado es incorrecto.");
            }
        } while (monto < 0.0);

        // Los factores varían según el día
        System.out.println("\nSu conversión correspondiente es:");
        System.out.println("Dólar: " + (monto*0.0013));
        System.out.println("Euro: " + (monto*0.0012));
        System.out.println("Yen: " + (monto*0.17));
        System.out.println("Yuan: " + (monto*0.0087));
        System.out.println("Libra esterlina: " + (monto*0.001));
    }
}
