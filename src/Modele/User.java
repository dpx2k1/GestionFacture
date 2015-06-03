package Modele;

import java.io.IOException;

/**
 *
 * @author Guillaume
 */
//Information sur l'utilisateur
public class User {

    //Données membres de l'utilisateur
    private String nom, prenom, numeroRue, nomRue, codePostal, province, pays,
            password, telephone, nomCompagnie, licence;

    //Constructeur
    public User(String nom, String prenom, String telephone, String nomCompagnie,
            String licence, String numeroRue, String nomRue, String codePostal,
            String province, String pays, String password) throws IOException {
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setNumeroRue(numeroRue);
        this.setNomRue(nomRue);
        this.setCodePostal(codePostal);
        this.setProvince(province);
        this.setPays(pays);
        this.setPassword(password);
        this.setTelephone(telephone);
        this.setNomCompagnie(nomCompagnie);
        this.setLicence(licence);
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

    public void setTelephone(String unTelephone) {
        this.telephone = unTelephone;
    }

    public void setNomCompagnie(String unNomCompagnie) {
        this.nomCompagnie = unNomCompagnie;
    }

    public void setLicence(String uneLicence) {
        this.licence = uneLicence;
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

    public String getTelephone() {
        return this.telephone;
    }

    public String getNomCompagnie() {
        return this.nomCompagnie;
    }

    public String getLicence() {
        return this.licence;
    }
}
