/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundo_parcial;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.Timer;
import java.applet.AudioClip;

/**
 *
 * @author oscar
 */
public class Pelea extends javax.swing.JFrame  {
private Timer t;
    private final ActionListener ac;
    private int x=0;
    Peleador objeto1 = new Peleador();
    Peleador objeto2 = new Peleador();
    public static String ruta="C:\\Users\\Daniel\\Documents\\Estructuras\\Segundo_Parcial22\\Segundo_Parcial22\\Segundo_Parcial22\\Segundo_Parcial\\src\\imagenes\\";

    public Pelea() {
        initComponents();
       
        this.setLocationRelativeTo(null);
        
        ImageIcon imagenicon = new ImageIcon(ruta+"z6.gif");
        Icon icon = new ImageIcon(imagenicon.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
        label.setIcon(icon);
        
        ImageIcon imagenicon1 = new ImageIcon(ruta+"z11.png");
        Icon icon1 = new ImageIcon(imagenicon1.getImage().getScaledInstance(lblCaraIz.getWidth(), lblCaraIz.getHeight(), Image.SCALE_DEFAULT));
        lblCaraIz.setIcon(icon1);
        
        ImageIcon imagenicon2 = new ImageIcon(ruta+"z10.png");        
        Icon icon2 = new ImageIcon(imagenicon2.getImage().getScaledInstance(lblCaraDr.getWidth(), lblCaraDr.getHeight(), Image.SCALE_DEFAULT));
        lblCaraDr.setIcon(icon2);
        
        ImageIcon imagenicon3 = new ImageIcon(ruta+"z12.png");
        Icon icon3 = new ImageIcon(imagenicon3.getImage().getScaledInstance(lblLogoCentro.getWidth(), lblLogoCentro.getHeight(), Image.SCALE_DEFAULT));
        lblLogoCentro.setIcon(icon3);
        
        this.repaint();
        
        int x1 = personaje1.getX();
        int y1 = personaje1.getY();
        int x2 = personaje2.getX();
        int y2 = personaje2.getY();

        personaje1.setIcon(new javax.swing.ImageIcon(ruta+"ryu1.gif"));
        personaje2.setIcon(new javax.swing.ImageIcon(ruta+"ken1.gif"));
        
        ac = new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
           x = x+8;
                rSProgressBar1.setValue(x);
                rSProgressBar2.setValue(x);
                if(rSProgressBar1.getValue()>=50 ){
                    rSProgressBar1.setColorBorde(Color.YELLOW);
                }
                if(rSProgressBar2.getValue()>=50 ){
                    rSProgressBar2.setColorBorde(Color.YELLOW);
                }
                if(rSProgressBar1.getValue()==100){
                    rSProgressBar1.setColorSelForeground(Color.YELLOW);
                    rSProgressBar1.setForeground(Color.red);
                    
                    //dispose();
                    t.stop();
                }
                if(rSProgressBar2.getValue()==100){
                    rSProgressBar2.setColorSelForeground(Color.YELLOW);
                    rSProgressBar2.setForeground(Color.red);
                    
                    //dispose();
                    t.stop();
                }
            }
        };
        t=new Timer(100,ac);
        t.start();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        personaje1 = new javax.swing.JLabel();
        lblCaraDr = new javax.swing.JLabel();
        personaje2 = new javax.swing.JLabel();
        rSProgressBar1 = new rojerusan.componentes.RSProgressBar();
        rSProgressBar2 = new rojerusan.componentes.RSProgressBar();
        lblCaraIz = new javax.swing.JLabel();
        lblLogoCentro = new javax.swing.JLabel();
        label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName(""); // NOI18N
        setSize(new java.awt.Dimension(0, 0));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        personaje1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Daniel\\Documents\\Estructuras\\Segundo_Parcial22\\Segundo_Parcial22\\Segundo_Parcial22\\Segundo_Parcial\\src\\imagenes\\ryu1.gif")); // NOI18N
        personaje1.setText("jLabel1");
        getContentPane().add(personaje1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 113, -1));

        lblCaraDr.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 0), java.awt.Color.orange, java.awt.Color.orange, java.awt.Color.orange));
        getContentPane().add(lblCaraDr, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 80));

        personaje2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Daniel\\Documents\\Estructuras\\Segundo_Parcial22\\Segundo_Parcial22\\Segundo_Parcial22\\Segundo_Parcial\\src\\imagenes\\ken1.gif")); // NOI18N
        getContentPane().add(personaje2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 113, 124));

        rSProgressBar1.setColorBorde(new java.awt.Color(255, 204, 0));
        rSProgressBar1.setColorSelBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(rSProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 310, -1));

        rSProgressBar2.setColorBorde(new java.awt.Color(255, 204, 0));
        rSProgressBar2.setColorSelBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(rSProgressBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 310, -1));

        lblCaraIz.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 0), java.awt.Color.orange, java.awt.Color.orange, java.awt.Color.orange));
        getContentPane().add(lblCaraIz, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, 90, 80));
        getContentPane().add(lblLogoCentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 150, 90));
        getContentPane().add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        int x = 860;
        int y = 398;
        int x1 = personaje1.getX();
        int y1 = personaje1.getY();
        int x2 = personaje2.getX();
        int y2 = personaje2.getY();

        //System.out.println("el ancho de la imagen es:  "+personaje1.getWidth());
//-----------------------------------------------------------------------------------PELEADOR1-----------------------------------------------------------------------------------        
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            objeto1.setEstado("correr");

            personaje1.setIcon(new javax.swing.ImageIcon(ruta+"ryu2.gif"));
            x1 = x1 + 2;

            personaje1.setLocation(x1, y1);
            
            if (x1 >= 340) {
                personaje1.setLocation(340, 398);
            }

//////            if (x1 + personaje1.getWidth() >= 600) {
//////                personaje1.setLocation(x, y);
//////            }

            System.out.print("PERSONAJE 1: ESTADO: " + objeto1.getEstado() + " ---- ");
            objeto1.setMovimiento_x(x1);
            objeto1.setMovimiento_y(y1);
            System.out.println("LA POSICION ES: " + objeto1.getMovimiento_x() + "," + objeto1.getMovimiento_y());
            

        }
        objeto1.setMovimiento_x(x1);
        objeto1.setMovimiento_y(y1);

        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            objeto1.setEstado("retroceder");

            personaje1.setIcon(new javax.swing.ImageIcon(ruta+"ryu2.gif"));
            x1 = x1 - 2;
            personaje1.setLocation(x1, y1);

            if (x1 <= 0) {
                personaje1.setLocation(2, 398);
            }

            System.out.print("PERSONAJE 1: ESTADO: " + objeto1.getEstado() + " ---- ");
            objeto1.setMovimiento_x(x1);
            objeto1.setMovimiento_y(y1);
            System.out.println("LA POSICION ES: " + objeto1.getMovimiento_x() + "," + objeto1.getMovimiento_y());
        }
        objeto1.setMovimiento_x(x1);
        objeto1.setMovimiento_y(y1);

        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {

            //if(objeto1.getEstado()=="derecha" || objeto1.getEstado()=="saltando"){ 
            objeto1.setEstado("agachado");
            personaje1.setIcon(new javax.swing.ImageIcon(ruta+"ryu103.png"));
            personaje1.setLocation(objeto1.getMovimiento_x(), objeto1.getMovimiento_y());
            System.out.print("PERSONAJE 1: ESTADO: " + objeto1.getEstado() + " ---- ");
            objeto1.setMovimiento_x(x1);
            objeto1.setMovimiento_y(y1);
            System.out.println("LA POSICION ES: " + objeto1.getMovimiento_x() + "," + objeto1.getMovimiento_y());

        }

        objeto1.setMovimiento_x(x1);
        objeto1.setMovimiento_y(y1);

        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            objeto1.setEstado("saltando");
            personaje1.setIcon(new javax.swing.ImageIcon(ruta+"ryu7.gif"));
            personaje1.setLocation(objeto1.getMovimiento_x(), objeto1.getMovimiento_y());
            System.out.print("PERSONAJE 1: ESTADO: " + objeto1.getEstado() + " ---- ");
            objeto1.setMovimiento_x(x1);
            objeto1.setMovimiento_y(y1);
            System.out.println("LA POSICION ES: " + objeto1.getMovimiento_x() + "," + objeto1.getMovimiento_y());

        }
        objeto1.setMovimiento_x(x1);
        objeto1.setMovimiento_y(y1);

        if (evt.getKeyChar() == 'J' || evt.getKeyChar() == 'j') {
            //if(objeto1.getEstado()=="derecha"){ 
            objeto1.setEstado("puñete");
            personaje1.setIcon(new javax.swing.ImageIcon(ruta+"ryu10.gif"));
            personaje1.setLocation(objeto1.getMovimiento_x(), objeto1.getMovimiento_y());
            System.out.print("PERSONAJE 1: ESTADO: " + objeto1.getEstado() + " ---- ");
            objeto1.setMovimiento_x(x1);
            objeto1.setMovimiento_y(y1);
            System.out.println("LA POSICION ES: " + objeto1.getMovimiento_x() + "," + objeto1.getMovimiento_y());

        }

        if (evt.getKeyChar() == 'L' || evt.getKeyChar() == 'l') {

            //if(objeto1.getEstado()=="derecha"){ 
            objeto1.setEstado("patada");
            personaje1.setIcon(new javax.swing.ImageIcon(ruta+"ryu20.gif"));
            personaje1.setLocation(objeto1.getMovimiento_x(), objeto1.getMovimiento_y());
            System.out.print("PERSONAJE 1: ESTADO: " + objeto1.getEstado() + " ---- ");
            objeto1.setMovimiento_x(x1);
            objeto1.setMovimiento_y(y1);
            System.out.println("LA POSICION ES: " + objeto1.getMovimiento_x() + "," + objeto1.getMovimiento_y());

        }

        if (evt.getKeyChar() == 'K' || evt.getKeyChar() == 'k') {
            //if(objeto1.getEstado()=="derecha"){ 
            objeto1.setEstado("poder");
            personaje1.setIcon(new javax.swing.ImageIcon(ruta+"ryu30.gif"));
            personaje1.setLocation(objeto1.getMovimiento_x(), objeto1.getMovimiento_y());
            System.out.print("PERSONAJE 1: ESTADO: " + objeto1.getEstado() + " ---- ");
            objeto1.setMovimiento_x(x1);
            objeto1.setMovimiento_y(y1);
            System.out.println("LA POSICION ES: " + objeto1.getMovimiento_x() + "," + objeto1.getMovimiento_y());

        }

        //---------------------------------------------------------------------------PELEADOR2-----------------------------------------------------------------------       
        if (evt.getKeyChar() == 'a' || evt.getKeyChar() == 'A') {
            personaje2.setIcon(new javax.swing.ImageIcon(ruta+"ken2.gif"));
            x2 = x2 - 2;
            personaje2.setLocation(x2, y2);
            if (x2 <= 410) {
                personaje2.setLocation(410, 398);
            }
            objeto2.setEstado("correr");
            System.out.print("PERSONAJE 2: ESTADO: " + objeto2.getEstado() + " ---- ");
            objeto2.setMovimiento_x(x2);
            objeto2.setMovimiento_y(y2);
            System.out.println("LA POSICION ES: " + objeto2.getMovimiento_x() + "," + objeto2.getMovimiento_y());

        }

        if (evt.getKeyChar() == 'd' || evt.getKeyChar() == 'D') {
            personaje2.setIcon(new javax.swing.ImageIcon(ruta+"ken2.gif"));
            x2 = x2 + 2;

            personaje2.setLocation(x2, y2);

            if (x2 + personaje2.getWidth() >= 973) {
                personaje2.setLocation(x, y);
            }
            objeto2.setEstado("retroceder");

            System.out.print("PERSONAJE 2: ESTADO: " + objeto2.getEstado() + " ---- ");
            objeto2.setMovimiento_x(x2);
            objeto2.setMovimiento_y(y2);
            System.out.println("LA POSICION ES: " + objeto2.getMovimiento_x() + "," + objeto2.getMovimiento_y());

        }

        if (evt.getKeyChar() == 'w' || evt.getKeyChar() == 'W') {
            objeto2.setEstado("saltando");
            personaje2.setIcon(new javax.swing.ImageIcon(ruta+"kg.gif"));
            personaje2.setLocation(objeto2.getMovimiento_x(), objeto2.getMovimiento_y());
            System.out.print("PERSONAJE 2: ESTADO: " + objeto2.getEstado() + " ---- ");
            objeto2.setMovimiento_x(x2);
            objeto2.setMovimiento_y(y2);
            System.out.println("LA POSICION ES: " + objeto2.getMovimiento_x() + "," + objeto2.getMovimiento_y());
            
            
        }

        if (evt.getKeyChar() == 's' || evt.getKeyChar() == 'S') {

//            //if (objeto2.getEstado() == "derecha") {
//                objeto2.setEstado("agachado");
//                personaje2.setIcon(new javax.swing.ImageIcon("C:/Users/oscar/Documents/NetBeansProjects/Segundo_Parcial/Segundo_Parcial/src/segundo_parcial/ken100.png"));
//                personaje2.setLocation(objeto2.getMovimiento_x(), objeto2.getMovimiento_y());
//                System.out.print("PERSONAJE 2: ESTADO: " + objeto2.getEstado() + " ---- ");
//                objeto2.setMovimiento_x(x2);
//                objeto2.setMovimiento_y(y2);
//                System.out.println("LA POSICION ES: " + objeto2.getMovimiento_x() + "," + objeto2.getMovimiento_y());
//            }
           // if (objeto2.getEstado() == "izquierda" || objeto2.getEstado() == "saltando") {
                objeto2.setEstado("agachado");
                personaje2.setIcon(new javax.swing.ImageIcon(ruta+"ken101.png"));
                personaje2.setLocation(objeto2.getMovimiento_x(), objeto2.getMovimiento_y());
                System.out.print("PERSONAJE 2: ESTADO: " + objeto2.getEstado() + " ---- ");
                objeto2.setMovimiento_x(x2);
                objeto2.setMovimiento_y(y2);
                System.out.println("LA POSICION ES: " + objeto2.getMovimiento_x() + "," + objeto2.getMovimiento_y());
           // }

        }

        if (evt.getKeyChar() == 'F' || evt.getKeyChar() == 'f') {
           // if (objeto2.getEstado() == "izquierda") {
                objeto2.setEstado("puñete");
                personaje2.setIcon(new javax.swing.ImageIcon(ruta+"ken81.gif"));
                personaje2.setLocation(objeto2.getMovimiento_x(), objeto2.getMovimiento_y());
                System.out.print("PERSONAJE 2: ESTADO: " + objeto2.getEstado() + " ---- ");
                objeto2.setMovimiento_x(x2);
                objeto2.setMovimiento_y(y2);
                System.out.println("LA POSICION ES: " + objeto2.getMovimiento_x() + "," + objeto2.getMovimiento_y());

           // }

////            if (objeto2.getEstado() == "derecha") {
////                objeto2.setEstado("puñete");
////                personaje2.setIcon(new javax.swing.ImageIcon("C:/Users/oscar/Documents/NetBeansProjects/Segundo_Parcial/Segundo_Parcial/src/segundo_parcial/ken8.gif"));
////                personaje2.setLocation(objeto2.getMovimiento_x(), objeto2.getMovimiento_y());
////                System.out.print("PERSONAJE 2: ESTADO: " + objeto2.getEstado() + " ---- ");
////                objeto2.setMovimiento_x(x2);
////                objeto2.setMovimiento_y(y2);
////                System.out.println("LA POSICION ES: " + objeto2.getMovimiento_x() + "," + objeto2.getMovimiento_y());
////
////            }

        }

        if (evt.getKeyChar() == 'g' || evt.getKeyChar() == 'G') {
            //if (objeto2.getEstado() == "izquierda") {
                objeto2.setEstado("poder");
                personaje2.setIcon(new javax.swing.ImageIcon(ruta+"ken91.gif"));
                personaje2.setLocation(objeto2.getMovimiento_x(), objeto2.getMovimiento_y());
                System.out.print("PERSONAJE 2: ESTADO: " + objeto2.getEstado() + " ---- ");
                objeto2.setMovimiento_x(x2);
                objeto2.setMovimiento_y(y2);
                System.out.println("LA POSICION ES: " + objeto2.getMovimiento_x() + "," + objeto2.getMovimiento_y());

////            }
////
////            if (objeto2.getEstado() == "derecha") {
////                objeto2.setEstado("poder");
////                personaje2.setIcon(new javax.swing.ImageIcon("C:/Users/oscar/Documents/NetBeansProjects/Segundo_Parcial/Segundo_Parcial/src/segundo_parcial/ken9.gif"));
////                personaje2.setLocation(objeto2.getMovimiento_x(), objeto2.getMovimiento_y());
////                System.out.print("PERSONAJE 2: ESTADO: " + objeto2.getEstado() + " ---- ");
////                objeto2.setMovimiento_x(x2);
////                objeto2.setMovimiento_y(y2);
////                System.out.println("LA POSICION ES: " + objeto2.getMovimiento_x() + "," + objeto2.getMovimiento_y());
////
////            }

        }

        if (evt.getKeyChar() == 'H' || evt.getKeyChar() == 'h') {
          //  if (objeto2.getEstado() == "izquierda") {
                objeto2.setEstado("patada");
                personaje2.setIcon(new javax.swing.ImageIcon(ruta+"ken6112.gif"));
                personaje2.setLocation(objeto2.getMovimiento_x(), objeto2.getMovimiento_y());
                System.out.print("PERSONAJE 2: ESTADO: " + objeto2.getEstado() + " ---- ");
                objeto2.setMovimiento_x(x2);
                objeto2.setMovimiento_y(y2);
                System.out.println("LA POSICION ES: " + objeto2.getMovimiento_x() + "," + objeto2.getMovimiento_y());

//            }
//
//            if (objeto2.getEstado() == "derecha") {
//                objeto2.setEstado("patada");
//                personaje2.setIcon(new javax.swing.ImageIcon("C:/Users/oscar/Documents/NetBeansProjects/Segundo_Parcial/Segundo_Parcial/src/segundo_parcial/ken6111.gif"));
//                personaje2.setLocation(objeto2.getMovimiento_x(), objeto2.getMovimiento_y());
//                System.out.print("PERSONAJE 2: ESTADO: " + objeto2.getEstado() + " ---- ");
//                objeto2.setMovimiento_x(x2);
//                objeto2.setMovimiento_y(y2);
//                System.out.println("LA POSICION ES: " + objeto2.getMovimiento_x() + "," + objeto2.getMovimiento_y());
//
//            }

        }
    }//GEN-LAST:event_formKeyPressed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        System.out.println("---------------------------------------------------------------------------------");
        int x1 = personaje1.getX();
        int y1 = personaje1.getY();
        objeto1.setEstado("quieto");
        personaje1.setLocation(x1, y1);
        personaje1.setIcon(new javax.swing.ImageIcon(ruta+"ryu1.gif"));
        System.out.print("PERSONAJE 1: ESTADO: " + objeto1.getEstado() + " ---- ");
        //System.out.println("LA POSICION ES: " + objeto1.getMovimiento_x() + "," + objeto1.getMovimiento_y());
        System.out.println("LA POSICION ES: " + personaje1.getX()+ "," +personaje1.getY());
        
        int x2 = personaje2.getX();
        int y2 = personaje2.getY();
        objeto2.setEstado("quieto");
        personaje2.setLocation(x2, y2);
        personaje2.setIcon(new javax.swing.ImageIcon(ruta+"ken1.gif"));
        System.out.print("PERSONAJE 2: ESTADO: " + objeto2.getEstado() + " ---- ");
        //System.out.println("LA POSICION ES: " + objeto2.getMovimiento_x() + "," + objeto2.getMovimiento_y());
        System.out.println("LA POSICION ES: " + personaje2.getX()+ "," +personaje2.getY());
        System.out.println("ESTAN CERCA->"+Pelea.Personajescerca(objeto1.getMovimiento_x(), objeto2.getMovimiento_x()));
        System.out.println("---------------------------------------------------------------------------------");

    }//GEN-LAST:event_formKeyReleased

    public static boolean Personajescerca(int x, int y){
        //int temp=
        if (y-x<=90) {
            return true;
        }
        return false;
    
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pelea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pelea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pelea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pelea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*00:21 Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pelea().setVisible(true);
            }
        });*/
        new Pelea().setVisible(true);//00:21
        ABB<String> arbol = new ABB();
        ABB.cargarArbol(arbol);
        System.out.println(arbol.anchura());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel label;
    private javax.swing.JLabel lblCaraDr;
    private javax.swing.JLabel lblCaraIz;
    private javax.swing.JLabel lblLogoCentro;
    public javax.swing.JLabel personaje1;
    private javax.swing.JLabel personaje2;
    private rojerusan.componentes.RSProgressBar rSProgressBar1;
    private rojerusan.componentes.RSProgressBar rSProgressBar2;
    // End of variables declaration//GEN-END:variables
}
