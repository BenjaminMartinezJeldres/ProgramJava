package cl.ubiobio.face.paradigmas_2023_1.ejemplo_estudiante.casa;

public class AppCasa {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Pepito");
        System.out.println(estudiante.estudiar());
        System.out.println(estudiante.jugarPC());
    }
}
