/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundo_parcial;



public class Test {


    /**
     * @param args the command line arguments
     */
    public static void cargarMusica(){
        try{
            Thread.sleep(265000);
        }catch(InterruptedException e){
            
        }
    }

    public static void main(String[] args) {
        MenuPrincipal repro = new MenuPrincipal();
        repro.setVisible(true);

//    Pelea pelea = new Pelea();
//    pelea.setVisible(true);
        Sonido sound = new Sonido();
        cargarMusica();
        // TODO code application logic here

    }

}
