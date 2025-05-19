package objetivos;
import java.util.ArrayList;

import visitors.Visitor;

public class Proyecto {
    private final ArrayList<Empleado> empleados = new ArrayList<>();
    private final String plazo;
    private final String estado;
    private final String nombre;

    public Proyecto(String nombre, String plazo, String estado){
        this.nombre = nombre;
        this.estado = estado;
        this.plazo = plazo;
    }

    public void addEmpleado(Empleado empleado){
        empleados.add(empleado);
    } 

    public String getEstado(){
        return estado;
    }

    public String getPlazo(){
        return plazo;
    }

    public String getNombre(){
        return nombre;
    }

    public ArrayList<Empleado> getEmpleados(){
        return empleados;
    }

    public void accept(Visitor v){
        v.visitProyecto(this);
    }
}
