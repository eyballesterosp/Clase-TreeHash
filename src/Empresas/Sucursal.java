package Empresas;

import java.util.ArrayList;
import java.util.HashMap;

public class Sucursal {

    private String ciudad;
    private int numEmpleados;
    private HashMap<String, Empleado> empleado;

    public Sucursal(String ciudad) {
        this.ciudad = ciudad;
        this.numEmpleados = 0;
        this.empleado = new HashMap<>();
    }

    public boolean ingresarEmpleado(Empleado e) {
        if (this.empleado.containsKey(e)) {
            return false;
        } else {
            this.empleado.put(e.getCedula(), e);
            return true;
        }
    }

    public ArrayList<Empleado> listarEmpleados() {
        ArrayList<Empleado> empleados = new ArrayList<>();
        for (Empleado e : this.empleado.values()) {
            empleados.add(e);
        }
        return empleados;
    }

    public Empleado listarEmpleadoMayor() {
        Empleado empMayor = null;
        for (Empleado e : this.empleado.values()) {
            if (empMayor == null) {
                empMayor = e;
            } else if (e.getEdad() > empMayor.getEdad()) {
                empMayor = e;
                System.out.println(e);
            }
        }
        return empMayor;
    }

    public Empleado buscarEmpleado(String cedula) {
        Empleado e = null;
        e = this.empleado.get(cedula);
        return e;
    }

    @Override
    public String toString() {
        return "Sucursal{" + "ciudad=" + ciudad + ", numEmpleados=" + numEmpleados + ", empleado=" + empleado + '}';
    }

}
