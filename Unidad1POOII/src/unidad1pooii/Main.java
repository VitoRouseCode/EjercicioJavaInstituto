
package unidad1pooii;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.Empleado;
import operaciones.operacionEmpleado;
import operaciones.operacionEmpresa;


public class Main {

   
    public static void main(String[] args) {
        
        
        menu();
        
    
}
    
    
public static void menu(){
        int opc = 0;
        operacionEmpresa creaEmpresa = new operacionEmpresa();
        operacionEmpleado empleado=new operacionEmpleado();
        do{
            JOptionPane.showMessageDialog(null,"presiona: \n(1)crear NUEVA EMPRESA \n(2)AGREGAR EMPLEADO \n(3)Otras opciones\n(4)SALIR");
            opc = Integer.parseInt( JOptionPane.showInputDialog(null,"escriba el numero de la opcion seleccionada"));
            
            
            
            switch(opc){
                
                case 1:creaEmpresa.ingresarempresas();
                    break;
                case 2:empleado.crearEmpleados();
                    break;
          
                case 3:
                    int opcion=0;
                        do{
                            JOptionPane.showMessageDialog(null,"escoge entre las siguientes opciones:\n(1) ver los empleados ingresados"
                            + "\n(2) ver empresas ingresadas \n(3)empleados por documento \n(4)calcular sueldo de empleado"
                            + "\n(5)cantidad de empleados en una empresa \n(6)regresar al menu anterior");
                            opcion = Integer.parseInt( JOptionPane.showInputDialog(null,"escriba el numero de la opcion seleccionada"));
                                switch(opcion){
                                case 1:empleado.mostrarEmpleados();
                                    break;
                                case 2:creaEmpresa.mostrarEmpresas();
                                    break;
                                case 3:empleado.empleadoPorDocumento();
                                    break;
                                case 4:empleado.promedioSueldo();
                                    break;
                                case 5:empleado.numeroDeEmpleados();//no encontre la manera de relacionar las empresas y los empleados
                                case 6:menu();
                                    break;
                                }
                        }while(opcion!=0);
                    break;
                case 4:System.exit(4);
                    break;
            }
                        
            
        }while(opc!=0);
        
}
}