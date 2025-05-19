package visitors;

import objetivos.Departamento;
import objetivos.Empleado;
import objetivos.Proyecto;

public class EmployesPerDepartmentListVisitor implements Visitor{
    
    public void getEmpleadosList(Departamento...departamentos){
        
        for (Departamento departamento : departamentos) {
            departamento.accept(this);
        }
    }

    public void visitDepartamento(Departamento departamento){
        System.out.println("Empleados del departamento  " + departamento.getNombre() + ":\n\n");

        for(Empleado empleado : departamento.getEmpleados()){
            empleado.accept(this);
        }
    }

    public void visitEmpleado(Empleado empleado){
        System.out.println(empleado.getNombre()+ "\n");
    }

    public void visitProyecto(Proyecto proyecto){

    }
}


