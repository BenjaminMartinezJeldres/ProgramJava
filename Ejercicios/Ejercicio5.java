/*
5. Desarrolle un algoritmo que, dado un texto ingresado por teclado, muestre el mismo texto
por pantalla en mayúsculas cambiando las letras ‘a’ por ‘o’ y las letras ‘e’ por ‘i’.

 */
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto;
        System.out.println("Ingrese un texto");
        texto = scanner.nextLine();

        for(char letra : texto.toUpperCase().toCharArray()) {
            if ( letra == 'A' ) {
                System.out.print("O");
            } else if ( letra == 'E' ) {
                System.out.print("I");
            } else {
                System.out.print(letra);
            }
        }
    }
}
