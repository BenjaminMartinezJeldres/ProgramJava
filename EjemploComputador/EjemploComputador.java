package EjemploComputador;

public class EjemploComputador {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        System.out.println(mouse.getCoordenada().getX());

        Monitor monitor = new Monitor();
        System.out.println(monitor.encender());

        Computador pc = new Computador();
        System.out.println(pc.getMouse().getCoordenada().getY());
    }
}
