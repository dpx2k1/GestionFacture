package Modele;

import java.util.*;

/**
 *
 * @author Guillaume
 */
//Information sur l'utilisateur
public class User {
    
    //Données membres de l'utilisateur
    private String nom, prenom, numeroRue, nomRue, codePostal, province, pays,
            password;
    
    private ArrayList informationUser;
    
    //Constructeur
    public User() {
        init();
    }
    
    //Initialisation des données membres
    public void init() {
        setNom(nom);
        setPrenom(prenom);
        setNumeroRue(numeroRue);
        setNomRue(nomRue);
        setCodePostal(codePostal);
        setProvince(province);
        setPays(pays);
        setPassword(password);
    }

    //Setter
    public void setNom(String unNom) {
        this.nom = unNom;
    }
    
    public void setPrenom(String unPrenom) {
        this.prenom = unPrenom;
    }
    
    public void setNumeroRue(String unNumeroRue) {
        this.numeroRue = unNumeroRue;
    }
    
    public void setNomRue(String unNomRue) {
        this.nomRue = unNomRue;
    }
    
    public void setCodePostal(String unCodePostal) {
        this.codePostal = unCodePostal;
    }
    
    public void setProvince(String uneProvince) {
        this.province = uneProvince;
    }
    
    public void setPays(String unPays) {
        this.pays = unPays;
    }
    
    public void setPassword(String newPassword) {
        this.password = newPassword;
    }

    //Getter
    public String getNom() {
        return this.nom;
    }
    
    public String getPrenom() {
        return this.prenom;
    }
    
    public String getNumeroRue() {
        return this.numeroRue;
    }
    
    public String getNomRue() {
        return this.nomRue;
    }
    
    public String getCodePostal() {
        return this.codePostal;
    }
    
    public String getProvince() {
        return this.province;
    }
    
    public String getPays() {
        return this.pays;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    //Ajoute les informations dans une ArrayList
    public ArrayList getListeInfo(){
        informationUser = new ArrayList<>();
        informationUser.add(getNom());
        informationUser.add(getPrenom());
        informationUser.add(getNumeroRue());
        informationUser.add(getNomRue());
        informationUser.add(getCodePostal());
        informationUser.add(getProvince());
        informationUser.add(getPays());
        return informationUser;
    }
}
