/*
2. Desarrolle un algoritmo que permita, dado un valor entero 𝑥 calcular:
• El perímetro del cuadrado cuyo lado mide 𝑥
• El área de un circulo, cuyo diámetro es 𝑥
• El área de un rectángulo, cuyos lados miden 𝑥 y 2𝑥 respectivaente.
• El perímetro de un triángulo equilátero, cuyo lado mide 𝑥
La hipotenusa de un triángulo isósceles, cuyo cateto mide x
*/

import java.util.Scanner;

public class Ejercicio2{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double x;
            do {
                System.out.println("Ingrese la dimensión x:");
                x = scanner.nextDouble();
                if ( x <= 0.0 ) {
                    System.out.println("Debe ingresar medidas positivas mayores a 0.");
                }
            } while ( x < 0.0 );

            System.out.println("Perímetro cuadrado: " + (x*4));
            System.out.println("Área circulo: " + ((x/2)*(x/2)*3.1416));
            System.out.println("Área rectángulo: " + (x*x*2));
            System.out.println("Perímetro triángulo: " + (3*x));
            System.out.println("Hipotenusa: " + Math.sqrt(2*(x*x)));
        }
}
