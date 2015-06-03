/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.util.ArrayList;

/**
 *
 * @author Guillaume
 */
//Class modèle des facture
public class Facture {

    //Donnée membres
    private ArrayList description, tauxHoraire, nbrHeure;
    private String infoMembre, infoCompagnie;
    private double preTotal = 0, salaire = 0, tps = 0, tvq = 0, totalFinal = 0;
    private final double TAXE_TPS = 0.05, TAXE_TVQ = 0.09975;

    //Constructeur
    public Facture(User unUser, Compagnie uneCompgnie, ArrayList<String> uneDescription,
            ArrayList<String> unTauxHoraire, ArrayList<String> unNbrHeure) {
        infoMembre = unUser.toString();
        infoCompagnie = uneCompgnie.toString();
        setDescription(uneDescription);
        setTauxHoraire(unTauxHoraire);
        setNbrHeure(unNbrHeure);
    }

    //Getter
    private ArrayList getDescription() {
        return description;
    }

    private ArrayList getTauxHoraire() {
        return tauxHoraire;
    }

    private ArrayList getNbrHeure() {
        return nbrHeure;
    }

    //Setter
    private void setDescription(ArrayList uneListe) {
        this.description = uneListe;
    }

    private void setTauxHoraire(ArrayList uneListe) {
        this.tauxHoraire = uneListe;
    }

    private void setNbrHeure(ArrayList uneListe) {
        this.nbrHeure = uneListe;
    }

    //Méthode spécifique
    //Donne le salaire pour le travail effectué, un salaire par description
    private double calculSalaire(int i) {
        salaire = Double.parseDouble((String) getTauxHoraire().get(i))
                * Double.parseDouble((String) getNbrHeure().get(i));
        return salaire;
    }

    //Calcul le salaire de tout les travaux effectués avant taxes
    private double CalculPreTotal() {
        for (int i = 0; i < getTauxHoraire().size(); i++) {
            preTotal += Double.parseDouble((String) getTauxHoraire().get(i))
                    * Double.parseDouble((String) getNbrHeure().get(i));
        }
        return preTotal;
    }

    //Calcul le salaire avec les taxes
    //Créer un modèle taxe pour modifier la variable dans le futur
    private double CalculTotalFinal() {
        totalFinal = CalculPreTotal() * (1+TAXE_TPS+TAXE_TVQ);
        return totalFinal;
    }
    
    //Calcul motant de seulement les taxes
    private double CalculTPS(){
        tps = CalculPreTotal()*TAXE_TPS;
        return tps;
    }
    
    private double CalculTVQ(){
        tvq = CalculPreTotal()*TAXE_TVQ;
        return tvq;
    }
}
