/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectarquitecctura;

import javax.swing.JOptionPane;

/**
 *
 * @author contaux
 */
public class ProyectArquitecctura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /*  AmbaArduino pru= new AmbaArduino("COM5");
      for(int i= 0 ; i<3; i++){
            int sele = Integer.parseInt(JOptionPane.showInputDialog("ingrese apagar o encender"));
            if(sele==1){
                pru.Encender();
            }
            else{
                pru.Apagar();
            }
        }
      AmbaArduino pru2= new AmbaArduino("COM6");
      for(int i= 0 ; i<3; i++){
            int sele = Integer.parseInt(JOptionPane.showInputDialog("ingrese apagar o encender"));
            if(sele==1){
                pru2.Encender();
            }
            else{
                pru2.Apagar();
            }
        }
	*/
     UsoProcessing.main(new String[]{proyectarquitecctura.UsoProcessing.class.getName()});
        System.err.println("Ya paso");
     
    }
    
}
