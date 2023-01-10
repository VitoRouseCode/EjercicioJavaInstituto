/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author 57301
 */
public class Empleado {
    
//atributos
    
    int documento;
    String nombre;
    double sueloxhora;
    int edad;
    
//encapsular
 
    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueloxhora() {
        return sueloxhora;
    }

    public void setSueloxhora(double sueloxhora) {
        this.sueloxhora = sueloxhora;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //constructor
    
    public Empleado(){
    }
    
    public Empleado(int documento, String nombre, double sueldoxhora, int edad){
        this.documento=documento;
        this.nombre=nombre;
        this.sueloxhora=sueldoxhora;
        this.edad=edad;
    }
    
    //metodos

   
    
    
    
}
