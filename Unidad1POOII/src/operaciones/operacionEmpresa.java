
package operaciones;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.empresa;


public class operacionEmpresa extends empresa implements IOperacionEmpresa  {
//atributos
    
    ArrayList<empresa> listaEmpresa = new ArrayList<>();
    @Override
    public void ingresarempresas() {
        empresa objEmpresa1 = new empresa();
        String Nom=JOptionPane.showInputDialog(null,"escriba el nombre de la empresa:");
        objEmpresa1.setNombre(Nom);
        String dir =JOptionPane.showInputDialog(null,"escriba  la direccion:");
        objEmpresa1.setDireccion(dir);
        String ciu=JOptionPane.showInputDialog(null,"escriba la ciudad:");
        objEmpresa1.setCiudad(ciu);
        int nitt = Integer.parseInt(JOptionPane.showInputDialog(null,"escriba el  Nit:"));
        objEmpresa1.setNit(nitt);
        
        listaEmpresa.add(objEmpresa1);
    }

    @Override
    public void mostrarEmpresas() {
        for(empresa E:listaEmpresa){
            JOptionPane.showMessageDialog(null,"Las empresas registradas son: \nNombre:"+ E.getNombre()+"\nNit: "+E.getNit()+"\nDireccion: "+E.getDireccion()+"\nCiudad: "+E.getCiudad());
        }
    }

    @Override
    public int numeroDeEmpleados() {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
