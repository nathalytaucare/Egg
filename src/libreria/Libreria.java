/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import java.util.logging.Level;
import java.util.logging.Logger;
import libreria.servicios.ClienteServicio;
import libreria.servicios.LibroServicio;

/**
 *
 * @author Nathaly
 */
public class Libreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       // ClienteServicio cs = new ClienteServicio();
        //cs.guardarCliente(18314, "Daniel", "Perez", "Tucapel","2734458");
        // System.out.println(cs.buscarClientePorNombre("Daniel"));
        
        //MODIFICAR
//        try { 
//            cs.modificarCliente(new Long(18314), "Andres", "Alanoca", "Juan Guillen Canales", "273446");
//            
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
        // BORRAR 
//        try {
//            cs.eliminar(new Long(18314));
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
        
          LibroServicio libro1 = new LibroServicio();
          libro1.guardarLibro(978, "Diario de Ana Frank", 2010, 12, 2);
        

    }

}
