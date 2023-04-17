import AutomovilEjemplo.Automovil;

public class Main {
    public static void main(String[] args) {
        Automovil auto = new Automovil();
        auto.patente = "YT-2345";
        System.out.println(auto.patente);
        System.out.println(auto.avanzar());



        Automovil auto2 = new Automovil();
        auto2.patente = "RTZF-98";
        System.out.println(auto2.patente);
        System.out.println(auto2.avanzar());
    }
}
