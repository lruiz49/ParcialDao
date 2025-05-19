package objetivos;

import visitors.Visitor;

public class Empleado {
    private final String nombre;
    private double salario;
    private double horasTrabajadas = 0;


    public Empleado(String nombre, double salario){
        this.nombre = nombre;
        this.salario = salario;
    }

    public void addHoras(double horas){
        horasTrabajadas += horas;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public String getNombre(){
        return nombre;
    }

    public double getSalario(){
        return salario;
    }

    public double getHorasTrabajadas(){
        return horasTrabajadas;
    }

    public void accept(Visitor v){
        v.visitEmpleado(this);
    }
}
