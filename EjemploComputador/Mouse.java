public class Mouse {
    private String marca;
    private String modelo;
    private Coordenada coordenada;
    public Mouse(){
        this.coordenada = new Coordenada();
    }
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
    public Coordenada getCoordenada(){
        return this.coordenada;
    }
    public void setCoordenada(Coordenada coordenada){
        this.coordenada = coordenada;
    }
    public Coordenada obtenerCoordenadas(){
        return this.getCoordenada();
    }
}
