/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import Controleur.Informateur;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Guillaume
 */
public class FramePrincipale extends JFrame {
    
    private Menu menu = null;
    
    //Constructeur des éléments visuels
    public FramePrincipale(){
        initFrame();
        initMenu();
    }
    
    //Info de la JFrame
    public void initFrame(){
        setTitle("Gestionnaire de facture");
        setSize(Informateur.largeurEcran, Informateur.hauteurEcran);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Icon made by Freepik from www.flaticon.com 
        Image icon = getToolkit().getImage("data\\image\\icon.png");
        this.setIconImage(icon);
    }
    
    //Info du menu
    public void initMenu(){
        this.menu = new Menu(this);
        setJMenuBar(menu);
    }
}
