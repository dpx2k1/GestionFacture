/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import java.awt.Toolkit;

/**
 *
 * @author Guillaume
 */
public class Informateur {
    
    public static int largeurEcran = Toolkit.getDefaultToolkit().getScreenSize().width,
            hauteurEcran = Toolkit.getDefaultToolkit().getScreenSize().height;
    
    public Informateur(){ 
    }
    
}
