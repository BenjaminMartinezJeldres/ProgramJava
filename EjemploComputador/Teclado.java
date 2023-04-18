public class Teclado {
    private String marca;
    private String modelo;
    private int cantidadTeclas;
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public int getCantidadTeclas(){
        return this.cantidadTeclas;
    }
    public void setCantidadTeclas(int cantidadTeclas){
        this.cantidadTeclas = cantidadTeclas;
    }
    public char codificarTecla(char tecla) {
        return tecla;
    }
}
