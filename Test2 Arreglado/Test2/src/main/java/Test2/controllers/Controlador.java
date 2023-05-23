package Test2.controllers;
import Test2.models.Calzado;
import Test2.views.Vista;


import java.util.ArrayList;

public class Controlador {
    public void operarMenu(int opcion){
        Vista ui = new Vista();
        switch (opcion){
            case 1:
                ui.agregarCalzado();
                break;
            case 2:
                ui.buscarCalzado();
                break;
        }
    }

    public void agregarCalzado(Calzado calzado){
        Calzado.getCalzados().add(calzado);
    }

    public void buscarCalzado(String busqueda){
        Calzado calzado = new Calzado();
        ArrayList<Calzado> calzados = calzado.buscar(busqueda);
        Vista ui = new Vista();
        ui.mostrarcalzados(calzados);
    }
}
