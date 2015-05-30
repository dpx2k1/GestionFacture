/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Guillaume
 */
public class FramePrincipale extends JFrame {
    
    int largeurEcran = Toolkit.getDefaultToolkit().getScreenSize().width, 
            hauteurEcran = Toolkit.getDefaultToolkit().getScreenSize().height;
    
    public FramePrincipale(){
        setTitle("Gestionnaire de fa7cture");
        setSize(largeurEcran, hauteurEcran);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Icon made by Freepik from www.flaticon.com 
        Image icon = getToolkit().getImage("data\\image\\icon.png");
        this.setIconImage(icon);
    }
}
