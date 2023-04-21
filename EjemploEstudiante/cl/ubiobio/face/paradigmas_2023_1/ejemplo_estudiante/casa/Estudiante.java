package cl.ubiobio.face.paradigmas_2023_1.ejemplo_estudiante.casa;

public class Estudiante {
    private String nombre;
    private String apellido;

    public Estudiante(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String estudiar(){
        return this.nombre + " abrió el libro...";
    }

    String jugarPC(){
        return this.nombre + " con una sonrisa abrió el Valorant";
    }

}
