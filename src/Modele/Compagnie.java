package Modele;

import java.io.IOException;

/**
 *
 * @author Guillaume
 */
//Information sur l'utilisateur
public class Compagnie {

    //Données membres de l'utilisateur
    private String nomCompagnie, numeroRue, nomRue, codePostal, province, pays,
            description, telephone;

    //Constructeur
    public Compagnie(String nomCompagnie, String numeroRue, String nomRue, String codePostal,
            String province, String pays, String telephone, String description) throws IOException {
        this.setNomCompagnie(nomCompagnie);
        this.setNumeroRue(numeroRue);
        this.setNomRue(nomRue);
        this.setCodePostal(codePostal);
        this.setProvince(province);
        this.setPays(pays);
        this.setTelephone(telephone);
        this.setDescription(description);
    }

    //Setter
    public void setNomCompagnie(String unNomCompagnie) {
        this.nomCompagnie = unNomCompagnie;
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

    public void setTelephone(String unTelephone) {
        this.telephone = unTelephone;
    }

    public void setDescription(String uneDescription) {
        this.description = uneDescription;
    }

    //Getter
    public String getNomCompagnie() {
        return this.nomCompagnie;
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

    public String getTelephone() {
        return this.telephone;
    }

    public String getDescription() {
        return this.description;
    }
}
