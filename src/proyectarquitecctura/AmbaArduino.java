/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectarquitecctura;
import com.panamahitek.ArduinoException;
 import com.panamahitek.PanamaHitek_Arduino;
import java.util.logging.Level;
import java.util.logging.Logger;
import jssc.SerialPortEvent;
import jssc.SerialPortEventListener;
import jssc.SerialPortException;
/**
 *
 * @author contaux
 */
public class AmbaArduino {
    
    PanamaHitek_Arduino ino = new PanamaHitek_Arduino();
    
    SerialPortEventListener listener = new SerialPortEventListener() {
        @Override
        public void serialEvent(SerialPortEvent spe) {
            try {
                if(ino.isMessageAvailable()){
                    String a = ino.printMessage();
                    System.err.println("mensaje: "+a);
                   
                    if(a.equals("Encendio"))
                     UsoProcessing.main(new String[]{proyectarquitecctura.UsoProcessing.class.getName()});
                } //To change body of generated methods, choose Tools | Templates.
            } catch (SerialPortException ex) {
                
            } catch (ArduinoException ex) {
                //Logger.getLogger(LeerArduinoPrueb.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    };

    public AmbaArduino(String puerto) {
        try {
            
            ino.arduinoRXTX(puerto, 9600, listener);
            
        } catch (ArduinoException ex) {
            //Logger.getLogger(LeerArduinoPrueb.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void Desconectar(){
        try {
            ino.killArduinoConnection();
            
        } catch (ArduinoException ex) {
            Logger.getLogger(AmbaArduino.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public void Apagar(){
        try {
            ino.sendData("0");
        } catch (ArduinoException ex) {
            //Logger.getLogger(ComunicacionInicialArd.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SerialPortException ex) {
            //Logger.getLogger(ComunicacionInicialArd.class.getName()).log(Level.SEVERE, null, ex);
             System.err.println("No Envia");
        }
    }
     public void Encender(){
        try {
            ino.sendData("1");
        } catch (ArduinoException ex) {
            //Logger.getLogger(ComunicacionInicialArd.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SerialPortException ex) {
            //Logger.getLogger(ComunicacionInicialArd.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("No Envia");
        }
    }
}
