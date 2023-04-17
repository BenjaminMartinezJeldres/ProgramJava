/*
 4. Dados tres lados de entrada 𝑆1, 𝑆2 y 𝑆3 determinar qué tipo de triángulo forman ellos,
considerando que si:
• 𝑆1 = 𝑆2 = 𝑆3, entonces el triángulo es equilátero.
• 𝑆1 ≠ 𝑆2 ≠ 𝑆3, entonces el triángulo es escaleno.
• Existen dos lados iguales, entonces el triángulo es isósceles.
Se debe comprobar primero, si estos tres lados forman o no un triángulo, esto es, se debe
comprobar que la suma de dos lados cualquiera debe ser mayor al tercer lado.
* */

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        double x, y, z;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Ingrese un lado:");
            x = scanner.nextDouble();
            if ( x <= 0 ) {
                System.out.println("Ingrese un numero mayor o igual a 0.");
            }
        } while ( x <= 0 );

        do {
            System.out.println("Ingrese un lado:");
            y = scanner.nextDouble();
            if ( y <= 0 ) {
                System.out.println("Ingrese un numero mayor o igual a 0.");
            }
        } while ( y <= 0 );

        do {
            System.out.println("Ingrese un lado:");
            z = scanner.nextDouble();
            if ( z <= 0 ) {
                System.out.println("Ingrese un numero mayor o igual a 0.");
            }
        } while ( z <= 0 );

        if ( (x + y) > z && (x+z) > y && (y+z) > x ) {
            if ( x == y && y == z ) {
                System.out.println("El triángulo es equilátero.");
            } else if ( x != y && x != z && y != z ) {
                System.out.println("El triángulo es escaleno.");
            } else {
                System.out.println("El triángulo es isósceles.");
            }
        } else {
            System.out.println("Con los valores ingresados no se puede formar un triángulo.");
        }
    }
}
