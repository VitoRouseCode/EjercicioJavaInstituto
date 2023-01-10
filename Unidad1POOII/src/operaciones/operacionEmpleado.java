
package operaciones;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.Empleado;


public class operacionEmpleado extends Empleado implements IOperacionEmpleados {
ArrayList<Empleado> listaEmpleado = new ArrayList<>();
    
    @Override
    public void crearEmpleados() {
        Empleado objempleado1 = new Empleado();
        
        String empleadox=JOptionPane.showInputDialog(null,"escriba el nombre del empleado:");
        objempleado1.setNombre(empleadox);
        int doc = Integer.parseInt(JOptionPane.showInputDialog(null,"escriba el documento del empleado:"));
        objempleado1.setDocumento(doc);
        int edad = Integer.parseInt(JOptionPane.showInputDialog(null,"escriba la edad del empleado:"));
        objempleado1.setEdad(edad);
        double sueldo= Double.parseDouble(JOptionPane.showInputDialog(null,"escriba el sueldo del empleado por hora:"));
        objempleado1.setSueloxhora(sueldo);
        
        listaEmpleado.add(objempleado1);    
    }

    @Override
    public void mostrarEmpleados() {
        
        for(Empleado p:listaEmpleado){
        
        JOptionPane.showMessageDialog(null,"Empleados Registrados: \nNombre: "+p.getNombre()+"\nCedula: "+p.getDocumento()+"\nEdad: "+p.getEdad()+"\nSueldo por hora: "+p.getSueloxhora());
        }
        
         /*String datos="";
	for (int i=0;i<listaEmpleado.size();i++) {
		datos+=listaEmpleado.get(i).toString();	
}
	System.out.println(datos);
	
    */
         }

    @Override
    public void empleadoPorDocumento() {
        int cedula=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el numero del documento del empleado:"));
        for (int i=0;i<listaEmpleado.size();i++) {
            if (listaEmpleado.get(i).getDocumento() == cedula){
               JOptionPane.showMessageDialog(null,"el empleado con esa identificacion es : \nNombre: "+ listaEmpleado.get(i).getNombre()+"\nCedula: "+listaEmpleado.get(i).getDocumento()+"\nEdad: "+listaEmpleado.get(i).getEdad()+"\nSueldo por hora: "+listaEmpleado.get(i).getSueloxhora());  
            }
            
          } 
        
              
            }

    @Override
    public void promedioSueldo() {
    
        String name=JOptionPane.showInputDialog(null,"ingrese el nombre del empleado para calcular su sueldo:");
        double horas=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el numero horas trabajadas:"));
        for (int i=0;i<listaEmpleado.size();i++) {
            if (listaEmpleado.get(i).getNombre() == null ? name == null : listaEmpleado.get(i).getNombre().equals(name)){
                JOptionPane.showMessageDialog(null,"elempleado esta registrado: \nNombre: "+listaEmpleado.get(i).getNombre());
                JOptionPane.showMessageDialog(null,"el sueldo por las "+horas+" horas de trabajo de "+listaEmpleado.get(i).getNombre()+" es: $"+(listaEmpleado.get(i).getSueloxhora())*horas);
                
                }
            
            }
        
                
            }
               
        
    public void numeroDeEmpleados() {
        int cont=0;
        for(int i =0;i<listaEmpleado.size();i++){
            cont++;
            
        }
          JOptionPane.showMessageDialog(null,"Empleados Registrados:" +cont);  
        }
        
    }

        
        /*double suma = 0;
        for (int i=0;i<listaEmpleado.size();i++) {
        suma=suma+listaEmpleado.get(i).getSueloxhora()/listaEmpleado.size();
        
        
        }
       JOptionPane.showMessageDialog(null,"el promedio de los sueldos de los empleados es: "+suma);*/ 
    
    	
    
        
    






        
    