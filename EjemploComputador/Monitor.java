public class Monitor {
    private String marca;
    private String modelo;
    private double pulgadas;
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
    public double getPulgadas(){
        return this.pulgadas;
    }
    public void setPulgadas(double pulgadas){
        this.pulgadas = pulgadas;
    }
    public String encender(){
        return "Esta encendido!!";
    }
    public String apagar(){
        return "Ahora está apagado.";
    }
}
