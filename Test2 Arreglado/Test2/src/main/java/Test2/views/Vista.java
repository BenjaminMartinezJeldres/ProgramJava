package Test2.views;

import Test2.models.Calzado;
import Test2.controllers.Controlador;

import java.util.ArrayList;
import java.util.Scanner;

public class Vista {
    private Scanner sc;

    public Vista(){
        this.sc = new Scanner(System.in);
    }
    public void mostrarMenu(){
        int opcion;
        Controlador lb = new Controlador();
        do {
            System.out.println("1. Agregar calzado:");
            System.out.println("2. Buscar calzado:");
            System.out.println("0. Salir");
            opcion = Integer.parseInt(sc.nextLine());
            lb.operarMenu(opcion);
        } while ( opcion != 0 );
        sc.close();
    }

    public void agregarCalzado(){
        Calzado calzado = new Calzado();
        System.out.println("Ingrese marca:");
        calzado.setMarca(this.sc.nextLine());
        System.out.println("Ingrese tipo de calzado (zapato, zapatilla, bota):");
        String tipoCalzado = this.sc.nextLine();
        while (!validarTipoCalzado(tipoCalzado)) {
            System.out.println("Tipo de calzado inválido. Ingrese nuevamente (zapato, zapatilla, bota):");
            tipoCalzado = this.sc.nextLine();
        }
        calzado.setTipo_calzado(tipoCalzado);
        System.out.println("Ingrese género (masculino, femenino):");
        String genero = this.sc.nextLine();
        while (!validarGenero(genero)) {
            System.out.println("Género inválido. Ingrese nuevamente (masculino, femenino):");
            genero = this.sc.nextLine();
        }
        calzado.setGenero(genero);
        System.out.println("Ingrese talla:");
        calzado.setTalla(this.sc.nextLine());
        System.out.println("Ingrese precio:");
        calzado.setPrecio(this.sc.nextLine());
        Controlador lb = new Controlador();
        lb.agregarCalzado(calzado);
    }

    public void buscarCalzado(){
        String busqueda;
        System.out.println("Ingrese marca o tipo de calzado:");
        busqueda = this.sc.nextLine();
        Controlador lb = new Controlador();
        lb.buscarCalzado(busqueda);
    }

    public void mostrarcalzados(ArrayList<Calzado> calzados){
        for (Calzado calzado: calzados){
            System.out.println(calzado.toString());
        }
    }

    private boolean validarTipoCalzado(String tipoCalzado) {
        return tipoCalzado.equalsIgnoreCase("zapato") ||
                tipoCalzado.equalsIgnoreCase("zapatilla") ||
                tipoCalzado.equalsIgnoreCase("bota");
    }

    private boolean validarGenero(String genero) {
        return genero.equalsIgnoreCase("masculino") ||
                genero.equalsIgnoreCase("femenino");
    }

}
