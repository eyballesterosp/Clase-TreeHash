package Empresas;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Empleado e1 = new Empleado("123456", "uno", 21);
        Empleado e2 = new Empleado("987654", "Dos", 51);
        Sucursal s1 = new Sucursal("Bogota");
        //Ingresando Empleado
        if (!s1.ingresarEmpleado(e1)) System.out.println("Error");
        if (!s1.ingresarEmpleado(e2)) System.out.println("Error");
        if (!s1.ingresarEmpleado(e2)) System.out.println("Error");
        
        //Buscar Empleado                  
        /*Empleado e = s1.buscarEmpleado("123987");
        if (e != null) {
            System.out.println(e);
        } else {
            System.out.println("No Existe");
        }*/

        //Listar Empleados
        ArrayList<Empleado> empleados = s1.listarEmpleados();
        for (Empleado empleado : empleados){
            System.out.println(empleado);
        }
         //Imprimir Empleado Mayor
        System.out.println("\nEmpleado Mayor");
        Empleado emp = s1.listarEmpleadoMayor();
        
    }
}
