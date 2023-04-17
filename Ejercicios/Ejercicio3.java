/* 3. Desarrolle un algoritmo que permita calcular la siguiente función

            {(𝑥 + 2) elevado 2 − 𝑦𝑧, 𝑆𝑖 𝑥 <𝑦/𝑧
𝑓(𝑥, 𝑦, 𝑧)= {𝑥𝑦𝑧 + 71, 𝑆𝑖 𝑥 = y/z
            {𝑥 elevado 2 + 𝑦 elevado 2 + 𝑧 elevado 2 , 𝑆𝑖 𝑥 >y/z
*/
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        double x, y, z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese x, y, z:");
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        z = scanner.nextDouble();

        System.out.print("Resultado: ");
        if ( x < y/z ) {
            System.out.println( (x+2)*(x+2)-(y*z) );
        } else if ( x == y/z ) {
            System.out.println( (x*y+z) + 71 );
        } else {
            System.out.println( x*x+y*y+z*z );
        }
    }
}
