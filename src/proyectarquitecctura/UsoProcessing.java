/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectarquitecctura;
import processing.video.*;
import processing.core.*;

	


/**
 *
 * @author contaux
 */
public class UsoProcessing extends PApplet {

    public UsoProcessing() {
    }
 Capture cam;
        int y = 100;
    
    @Override
    public void settings()
{
   size(640, 360);
}
    @Override
   public void setup() {
        cam = new Capture(this, "name=Dispositivo de vídeo USB,size=640x480,fps=5");
      cam.start(); 
 
}
boolean a = true;
    @Override
 public void draw() {
        if (cam.available() == true) {
          cam.read();
          cam.save("E:\\Users\\contaux\\Desktop\\imagenes digital\\deUna.jpg");
          cam.stop();
        }
 }
 

}
