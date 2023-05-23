package Test2.models;

import java.util.ArrayList;


public class Calzado {
    private String marca;
    private String tipo_calzado;
    private String genero;
    private String talla;
    private String precio;
    private static ArrayList<Calzado> calzados = new ArrayList<>();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo_calzado() {
        return tipo_calzado;
    }

    public void setTipo_calzado(String tipo_calzado) {
        this.tipo_calzado = tipo_calzado;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public static ArrayList<Calzado> getCalzados() {
        return calzados;
    }

    public static void setCalzados(ArrayList<Calzado> calzados) {
        Calzado.calzados = calzados;
    }

    public ArrayList<Calzado> buscar(String busqueda){
        ArrayList<Calzado> calzados = new ArrayList<>();
        for (Calzado calzado: Calzado.getCalzados()) {
            if ( calzado.getTipo_calzado().toLowerCase().contains(busqueda.toLowerCase()) ||
                    calzado.getMarca().toLowerCase().contains(busqueda.toLowerCase()) ) {
                calzados.add(calzado);
            }
        }
        return calzados;
    }

    @Override
    public String toString() {
        return "Calzado{" +
                "titulo='" + marca + '\'' +
                ", autor='" + tipo_calzado + '\'' +
                ", isbn='" +  + '\'' +
                ", editorial='" + genero + '\'' +
                ", talla='" + talla + '\'' +
                ", precio='" + precio + '\'' +
                '}';
    }
}
