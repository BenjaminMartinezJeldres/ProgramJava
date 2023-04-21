import java.util.Scanner;

/*
3. Desarrolle un programa que mediante un menú permita mostrar el resultado de las
operaciones de dos números complejos. El programa debe permitir escoger entre sumar,
restar, multiplicar y dividir
*/
public class Main {
    public static void main(String[] args) {

        System.out.printf("Bienvenido a la calculadora!");
        System.out.printf("Ingrese una operacion deseada: ");
        System.out.printf("1)Suma    2) Resta   3)Multiplicar   4)Dividir ");

        double Suma,Resta,Multiplicacion,Division;
        int NumeroComplejo1= 0;
        int NumeroComplejo2 = 0;
        int num=0;
        // Números Complejos son sumas entre Números Reales y Números Imaginarios
        // ()()=7+7i= números complejos


        Scanner leer= new Scanner(System.in);
        num= leer.nextInt();

        switch (num)
        {
            case 1: // Si el usuario escribe un 1
                System.out.println("Introduce el primer número:");
                NumeroComplejo1 = leer.nextInt();

                System.out.println("Introduce el segundo número:");
                NumeroComplejo2 = leer.nextInt();

                Suma= NumeroComplejo1+NumeroComplejo2;

                System.out.println("El resultado de la Suma es: "+Suma);
                break;
            case 2: // Si el usuario escribe un 2
                System.out.println("Introduce el primer número:");
                NumeroComplejo1 = leer.nextInt();

                System.out.println("Introduce el segundo número:");
                NumeroComplejo2 = leer.nextInt();

                Resta= NumeroComplejo1-NumeroComplejo2;
                System.out.println("El resultado de la resta es : "+Resta);
                break;
            case 3: // Si el usuario escribe un 3
                System.out.println("Introduce el primer número:");
                NumeroComplejo1 = leer.nextInt();

                System.out.println("Introduce el segundo número:");
                NumeroComplejo2 = leer.nextInt();

                Division= NumeroComplejo1/NumeroComplejo2;
                System.out.println("El resultado de la Division es: "+Division);
                break;
            case 4: // Si el usuario escribe un 4
                System.out.println("Introduce el primer número:");
                NumeroComplejo1 = leer.nextInt();

                System.out.println("Introduce el segundo número:");
                NumeroComplejo2 = leer.nextInt();

                Multiplicacion= NumeroComplejo1*NumeroComplejo2;
                System.out.println("El resultado de la multiplicacion es: "+Multiplicacion );
                break;
            default: // Si teclea un valor diferente...

                System.out.println("Debes teclear un número entre 1 y 4");
                break;
        }





        }
    }
