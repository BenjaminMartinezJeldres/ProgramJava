package EjemploComputador;

public class Computador {
    private Teclado teclado;
    private Mouse mouse;
    private Monitor monitor;
    private Gabinete gabinete;
    public Computador(){
        this.mouse = new Mouse();
        this.teclado = new Teclado();
        this.monitor = new Monitor();
        this.gabinete = new Gabinete();
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Gabinete getGabinete() {
        return gabinete;
    }

    public void setGabinete(Gabinete gabinete) {
        this.gabinete = gabinete;
    }
}
