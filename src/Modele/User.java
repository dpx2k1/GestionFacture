package Modele;

import java.io.IOException;
import org.json.simple.JSONObject;

/**
 *
 * @author Guillaume
 */
//Information sur l'utilisateur
public class User {

    //Données membres de l'utilisateur
    private String nom, prenom, numeroRue, nomRue, codePostal, province, pays,
            password;
    //Objet JSON pour la database
    private JSONObject obj;

    //Constructeur
    public User(String nom, String prenom, String numeroRue, String nomRue, String codePostal,
            String province, String pays, String password) throws IOException {
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setNumeroRue(numeroRue);
        this.setNomRue(nomRue);
        this.setCodePostal(codePostal);
        this.setProvince(province);
        this.setPays(pays);
        this.setPassword(password);
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

    //Write les info du user avec JSON
    public JSONObject getUserInfo() throws IOException {
        obj = new JSONObject();

        obj.put("nom", getNom());
        obj.put("prenom", getPrenom());
        obj.put("numeroRue", getNumeroRue());
        obj.put("nomRue", getNomRue());
        obj.put("codePostal", getCodePostal());
        obj.put("province", getProvince());
        obj.put("pays", getPays());
        obj.put("password", getPassword());
        
        return obj;
    }
    public static void main(String[] args) throws IOException {
        User user = new User("Poulette","Marc-Andre","4512","Marquette","H2G 2Y9",
        "Quebec", "Canada", "12345");
        UserData ud = new UserData(user);
        System.out.println(ud.getListeUser());
    }
}
