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
//Classe vue de la frame d'inscription d'un nouvel utilisateur
public class FrameInscription extends JPanel {

    //Donnée membres
    private Graphics g;
    private JLabel lbInscription;
    private JTextField txtNom, txtPrenom, txtNumeroRue, txtNomRue, txtCodePostal,
            txtProvince, txtPays, txtIndicatif, txt3Telephone, txt4Telephone;
    private JPasswordField password, passwordConfirmation;

    //Constructeur
    public FrameInscription() {
        this.setLayout(null);
        initComponent();
    }

    //Initialisation des composants 
    public void initComponent() {
        lbInscription = new JLabel("Nom : ");
        this.add(lbInscription).setBounds(100, 95, 50, 25);
        txtNom = new JTextField(75);
        this.add(txtNom).setBounds(155, 100, 75, 15);
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setFont(new Font("Courier", Font.BOLD, 40));
        g.setColor(new Color(152,152,255));
        g.drawString("Inscription", 100, 50);
        g.drawLine(0, 75, this.getWidth(), 75);
    }

    //Test
    public static void main(String[] args) {
        //Init FrameTest
        int largeurEcran = Toolkit.getDefaultToolkit().getScreenSize().width,
                hauteurEcran = Toolkit.getDefaultToolkit().getScreenSize().height;
        JFrame frame = new JFrame();
        frame.setTitle("Gestionnaire de facture");
        frame.setSize(largeurEcran, hauteurEcran);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        //Test specifique
        FrameInscription inscription = new FrameInscription();
        frame.add(inscription);
    }
}
