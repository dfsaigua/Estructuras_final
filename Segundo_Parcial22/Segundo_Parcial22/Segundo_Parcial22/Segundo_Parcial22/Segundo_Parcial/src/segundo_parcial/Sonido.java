/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundo_parcial;

import java.applet.AudioClip;

/**
 *
 * @author cindybohorquezsantana
 */
public class Sonido {
    AudioClip player;
    
    public Sonido(){
        player = java.applet.Applet.newAudioClip(getClass().getResource("/segundo_parcial/MK.wav"));
        player.play();
    }
    public void apagar(){
        player.stop();
    }
}
