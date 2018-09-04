/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundo_parcial;

/**
 *
 * @author Daniel
 */
public class Hilo extends Thread {
    //Pelea peleaHilo;
    
    
  @Override
	public void run() {
           new Pelea().setVisible(true); 
        }
    
}
