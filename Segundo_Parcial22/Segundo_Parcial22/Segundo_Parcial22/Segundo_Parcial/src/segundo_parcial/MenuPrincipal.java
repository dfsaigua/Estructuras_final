/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundo_parcial;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.io.*;
import java.applet.AudioClip;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
         this.setLocationRelativeTo(null);
   
         
        ImageIcon imagenicon1 = new ImageIcon("/Users/cindybohorquezsantana/NetBeansProjects/Segundo_Parcial22/Segundo_Parcial/src/imagenes/z7.gif");
        Icon icon1 = new ImageIcon(imagenicon1.getImage().getScaledInstance(label1.getWidth(), label1.getHeight(), Image.SCALE_DEFAULT));
        label1.setIcon(icon1);
        
        ImageIcon imagenicon2 = new ImageIcon("/Users/cindybohorquezsantana/NetBeansProjects/Segundo_Parcial22/Segundo_Parcial/src/imagenes/z8.png");
        Icon icon2 = new ImageIcon(imagenicon2.getImage().getScaledInstance(label2.getWidth(), label2.getHeight(), Image.SCALE_DEFAULT));
        label2.setIcon(icon2);
        
        ImageIcon imagenicon3 = new ImageIcon("/Users/cindybohorquezsantana/NetBeansProjects/Segundo_Parcial22/Segundo_Parcial/src/imagenes/z9.png");
        Icon icon3 = new ImageIcon(imagenicon3.getImage().getScaledInstance(label3.getWidth(), label3.getHeight(), Image.SCALE_DEFAULT));
        label3.setIcon(icon3);
        
        
        this.repaint();
        
        
    }
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        label3 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn1.setBackground(new java.awt.Color(255, 153, 0));
        btn1.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 48)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("SALIR");
        btn1.setToolTipText("");
        btn1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.setOpaque(false);
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn1MouseClicked(evt);
            }
        });
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 460, 70));

        btn2.setBackground(new java.awt.Color(255, 153, 0));
        btn2.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 48)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("ABOUT");
        btn2.setToolTipText("");
        btn2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn2.setOpaque(false);
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn2MouseClicked(evt);
            }
        });
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 460, 70));

        btn3.setBackground(new java.awt.Color(255, 153, 0));
        btn3.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 48)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("JUGAR");
        btn3.setToolTipText("");
        btn3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn3.setOpaque(false);
        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn3MouseClicked(evt);
            }
        });
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 460, 70));
        getContentPane().add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 810, 154));
        getContentPane().add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 150));
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed

        
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed

    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
      
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseClicked
               AudioClip sonido;
  sonido=java.applet.Applet.newAudioClip(getClass().getResource("/segundo_parcial/Click.wav"));
  sonido.play();
  About a = new About();
  a.setVisible(true);
          
    }//GEN-LAST:event_btn2MouseClicked

    private void btn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MouseClicked
  
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/segundo_parcial/Click.wav"));
        sonido.play();
        
        
     Pelea pelea = new Pelea();
    pelea.setVisible(true);
   

      

  
       
    }//GEN-LAST:event_btn3MouseClicked

    private void btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseClicked
     AudioClip sonido;
     sonido=java.applet.Applet.newAudioClip(getClass().getResource("/segundo_parcial/Click.wav"));
    sonido.play();
    System.exit(0);
    }//GEN-LAST:event_btn1MouseClicked

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    // End of variables declaration//GEN-END:variables
}