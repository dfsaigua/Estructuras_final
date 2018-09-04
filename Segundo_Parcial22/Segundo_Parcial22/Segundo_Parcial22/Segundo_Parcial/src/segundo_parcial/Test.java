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
        System.out.println("\nTEMA  4:  ABB.decision");//Ver metodo en clase ABB
        
        ABB<String> arbolDecision = new ABB();
        arbolDecision.insertar("Decision43","MODO");
        arbolDecision.insertar("Decision28","MODO ATAQUE");
        arbolDecision.insertar("Decision70","MODO DEFENSA");
        arbolDecision.insertar("Decision25","ATAQUE");
        arbolDecision.insertar("Decision33","QUIETO");
        arbolDecision.insertar("Decision60","TIPO");
        arbolDecision.insertar("Decision75","RETROCEDER");
        arbolDecision.insertar("Decision15","GOLPES");
        arbolDecision.insertar("Decision26","LANZAR PODER");
        arbolDecision.insertar("Decision32","RETROCEDER");
        arbolDecision.insertar("Decision35","ESPERAR");
        arbolDecision.insertar("Decision55","AGACHARSE");
        arbolDecision.insertar("Decision65","SALTAR");
        arbolDecision.insertar("Decision14","PATADA");
        arbolDecision.insertar("Decision16","PUÑETE");
        
        
        
        
        
        System.out.println(arbolDecision.anchura());
        
        /*String str1="Pregunta3";
        String str2="Pregunta7";
        System.out.println(str1.compareTo(str2));*/

    }
    
}
