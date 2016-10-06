package Empresas;

import java.util.ArrayList;
import java.util.TreeMap;

public class Empresa {

    private String nombre;
    private TreeMap<String, Sucursal> ciudad;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.ciudad = new TreeMap<>();
    }
    
    /*public ArrayList<Empleado> listarTodosLosEmpleados(){
        ArrayList<Empleado> sucursal = new ArrayList<>();
        for (Sucursal s : this.ciudad.values()) {
            for (Empleado e : this.) {
                
            }
        }
        return empleados;
    }*/
    
}
