public class Gabinete {
    private String marca;
    private String modelo;
    private String procesador;
    private double velocidadProcesador;
    private int ram;
    private int disco;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public double getVelocidadProcesador() {
        return velocidadProcesador;
    }

    public void setVelocidadProcesador(double velocidadProcesador) {
        this.velocidadProcesador = velocidadProcesador;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getDisco() {
        return disco;
    }

    public void setDisco(int disco) {
        this.disco = disco;
    }
}
