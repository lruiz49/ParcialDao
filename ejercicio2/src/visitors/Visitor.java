package visitors;

import objetivos.Departamento;
import objetivos.Empleado;
import objetivos.Proyecto;

public interface Visitor {
    void visitDepartamento(Departamento Departamento);

    void visitEmpleado(Empleado empleado);

    void visitProyecto(Proyecto Proyecto);

}
