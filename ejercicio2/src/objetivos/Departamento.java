package objetivos;
import java.util.ArrayList;

import visitors.Visitor;

public class Departamento {
    private final ArrayList<Empleado> empleados = new ArrayList<>();
    private final double presupuesto;
    private final String nombre;

    public Departamento(String nombre, Double presupuesto){
        this.nombre = nombre;
        this.presupuesto = presupuesto;
    }

    public void addEmpleado(Empleado empleado){
        empleados.add(empleado);
    } 

    public ArrayList<Empleado> getEmpleados(){
        return empleados;
    }

    public double getPresupuesto(){
        return presupuesto;
    }

    public String getNombre(){
        return nombre;
    }

    public void accept(Visitor v){
        v.visitDepartamento(this);
    }
}
