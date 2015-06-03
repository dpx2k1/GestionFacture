/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import Controleur.Database;
import Controleur.Informateur;
import Modele.User;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Guillaume
 */
//Classe vue de la frame d'inscription d'un nouvel utilisateur
public class PanelInscription extends JPanel implements ActionListener {

    //Donnée membres
    private Image image;
    private JPanel panelTop, panelMid, panelBottom;
    private TitledBorder border;
    private JTextField txtNom, txtPrenom, txtNomCompagnie, txtLicence, txtNumeroRue,
            txtNomRue, txtCodePostal, txtProvince, txtPays, txtIndicatif,
            txt3Telephone, txt4Telephone;
    private JPasswordField password, passwordConfirmation;
    private JButton btnConfirm, btnAnuuler;
    private User user;
    private Database data;

    //Constructeur
    public PanelInscription() {
        this.setLayout(null);
        initComponentInformation();
        initComponentAdresse();
        InitComponentPassword();
        this.add(btnConfirm = new JButton("Confirmation")).setBounds(550, 625, 100, 35);
        this.add(btnAnuuler = new JButton("Anuuler")).setBounds(700, 625, 100, 35);
        actionPerformed(null);
    }

    //Initialisation des composants 
    public void initComponentInformation() {
        //Information
        panelTop = new JPanel();
        panelTop.setLayout(new GridLayout(5, 2, 5, 5));
        this.add(panelTop).setBounds(150, 100, Informateur.largeurEcran - 300, 200);
        //Ajout d'un border
        border = BorderFactory.createTitledBorder("Information");
        panelTop.setBorder(border);
        //Ajout des composants Swing au JPanel
        panelTop.add(new JLabel("Nom : "));
        panelTop.add(txtNom = new JTextField(25));
        panelTop.add(new JLabel("Prenom : "));
        panelTop.add(txtPrenom = new JTextField(25));
        panelTop.add(new JLabel("Téléphone :"));
        panelTop.add(txtIndicatif = new JTextField(25));
        panelTop.add(new JLabel("Nom de compagnie : "));
        panelTop.add(txtNomCompagnie = new JTextField(25));
        panelTop.add(new JLabel("# licence : "));
        panelTop.add(txtLicence = new JTextField());
    }

    //Initialisation des composants 
    public void initComponentAdresse() {
        //Adresse
        panelMid = new JPanel();
        panelMid.setLayout(new GridLayout(5, 2, 5, 5));
        this.add(panelMid).setBounds(150, 300, Informateur.largeurEcran - 300, 200);
        //Ajout d'un border
        border = BorderFactory.createTitledBorder("Adresse");
        panelMid.setBorder(border);
        //Ajout des composants Swing au JPanel
        panelMid.add(new JLabel("Numéro : "));
        panelMid.add(txtNumeroRue = new JTextField());
        panelMid.add(new JLabel("Rue : "));
        panelMid.add(txtNomRue = new JTextField());
        panelMid.add(new JLabel("Code postal : "));
        panelMid.add(txtCodePostal = new JTextField());
        panelMid.add(new JLabel("Province : "));
        panelMid.add(txtProvince = new JTextField());
        panelMid.add(new JLabel("Pays : "));
        panelMid.add(txtPays = new JTextField());
    }

    //Initialisation des composants
    public void InitComponentPassword() {
        //Password
        panelBottom = new JPanel();
        panelBottom.setLayout(new GridLayout(2, 2, 5, 5));
        this.add(panelBottom).setBounds(150, 500, Informateur.largeurEcran - 300, 100);
        //Ajout d'un border
        border = BorderFactory.createTitledBorder("Mot de passe");
        panelBottom.setBorder(border);
        //Ajout des composants Swing au JPanel
        panelBottom.add(new JLabel("Mot de passe : "));
        panelBottom.add(password = new JPasswordField());
        panelBottom.add(new JLabel("Confirmation : "));
        panelBottom.add(passwordConfirmation = new JPasswordField());
    }

    //Ajout des éléments graphics
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("Courier", Font.BOLD, 40));
        g.setColor(new Color(152, 152, 255));
        //TITRE
        g.drawString("Inscription", 100, 50);
        g.drawLine(0, 75, this.getWidth(), 75);
        //SECTION INFO
    }

    //Initialisation des écouteurs
    @Override
    public void actionPerformed(ActionEvent e) {
        btnConfirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e1) {
                if (e1.getSource() == btnConfirm && password.getText().equals(passwordConfirmation.getText())) {
                    System.out.println("OK");
                    try {
                        user = new User(txtNom.getText(), txtPrenom.getText(), txtIndicatif.getText(),
                                txtNomCompagnie.getText(), txtLicence.getText(), txtNumeroRue.getText(),
                                txtNomRue.getText(), txtCodePostal.getText(), txtProvince.getText(),
                                txtPays.getText(), password.getText());
                        data = new Database(user);
                        data.writeDatabase();
                    } catch (IOException ex) {
                        Logger.getLogger(PanelInscription.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
    }

    //Test
    public static void main(String[] args) {
        //Init FrameTest
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus is not available, fall back to cross-platform
            try {
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            } catch (Exception ex) {
                // not worth my time
            }
        }
        int largeurEcran = Toolkit.getDefaultToolkit().getScreenSize().width,
                hauteurEcran = Toolkit.getDefaultToolkit().getScreenSize().height;
        JFrame frame = new JFrame();
        frame.setTitle("Gestionnaire de facture");
        frame.setSize(largeurEcran, hauteurEcran);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        //Test specifique
        PanelInscription inscription = new PanelInscription();
        frame.add(inscription);
    }
}
