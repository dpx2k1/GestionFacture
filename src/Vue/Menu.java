/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Guillaume
 */
public class Menu extends JMenuBar implements ActionListener {

    private JFrame uneFrame;
    private JMenu menuCompte, menuContrats, menuStatistiques, menuFacture,
            menuCompagnie, menuAPropos, menuDeco;
    private JMenuItem mItemConnectionCompte, mItemNouveauCompte, mItemNouvelleFacture,
            mItemModifierFacture, mItemCredits, mItemAide;

    //Constructeur
    public Menu(JFrame uneFrame) {
        this.uneFrame = uneFrame;
        initMenuCompte();
        initMenuContrats();
        initMenuStatistique();
        initMenuFacture();
        initMenuCompagnie();
        initMenuAPropos();
        initMenuDeco();
        actionPerformed(null);
    }

    //Menu de connection / création d'utilisateur
    public void initMenuCompte() {
        menuCompte = new JMenu("Compte");
        this.add(menuCompte);

        //Sous menu JMenuItem
        mItemConnectionCompte = new JMenuItem("Connection");
        menuCompte.add(mItemConnectionCompte);
        menuCompte.addSeparator();

        mItemNouveauCompte = new JMenuItem("Nouveau");
        menuCompte.add(mItemNouveauCompte);
    }

    //Menu Contrats
    public void initMenuContrats() {
        menuContrats = new JMenu("Contrats");
        this.add(menuContrats);
    }

    //Menu Statistiques
    public void initMenuStatistique() {
        menuStatistiques = new JMenu("Statistiques");
        this.add(menuStatistiques);
    }

    //Menu Facturation
    public void initMenuFacture() {
        menuFacture = new JMenu("Facturation");
        this.add(menuFacture);

        //Sous menu JMenItem
        mItemNouvelleFacture = new JMenuItem("Ajouter");
        menuFacture.add(mItemNouvelleFacture);
        menuFacture.addSeparator();

        mItemModifierFacture = new JMenuItem("Modifier");
        menuFacture.add(mItemModifierFacture);
    }

    //Menu Compagnie
    public void initMenuCompagnie() {
        menuCompagnie = new JMenu("Bottin");
        this.add(menuCompagnie);
    }

    //Menu À propos
    public void initMenuAPropos() {
        menuAPropos = new JMenu("À propos");
        this.add(menuAPropos);

        //Sous menu JMenuItem
        mItemCredits = new JMenuItem("Crédits");
        menuAPropos.add(mItemCredits);
        menuAPropos.addSeparator();

        mItemAide = new JMenuItem("Aide");
        menuAPropos.add(mItemAide);
    }

    //Menu Déconnection
    public void initMenuDeco() {
        menuDeco = new JMenu("Déconnection");
        this.add(menuDeco);
    }

    //Ajout des ecouteurs
    @Override
    public void actionPerformed(ActionEvent e) {
        //écouteur pour l'inscription d'un nouvel utilisateur
        mItemNouveauCompte.addActionListener((ActionEvent e1) -> {
            if (e1.getSource() == mItemNouveauCompte) {
                uneFrame.getContentPane().removeAll();
                uneFrame.add(new PanelInscription());
                revalidate();
            }
        });
    }
}
