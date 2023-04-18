public class EjmploPunto {
    public static void main(String[] args) {
        Punto punto1 = new Punto(3, 4);
        Punto punto2 = new Punto(7, 8);

        Punto punto3 = punto1.sumarPunto(punto2);

        System.out.println(punto3.toString());



    }
}
