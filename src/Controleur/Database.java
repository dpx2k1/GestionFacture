/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import Modele.*;
import java.io.*;
import org.json.simple.JSONObject;

/**
 *
 * @author Guillaume
 */
//Class qui write les objects vers JSON
public class Database {

    private User user;
    private Compagnie compagnie;
    private FileWriter file;
    //Object JSON pour la database
    private JSONObject obj;
    private Boolean userCreated = false, compagnieCreated = false;

    //Constructeur pour User
    public Database(User unUser) throws IOException {
        this.user = unUser;
        createUserDB();
    }

    //Constructeur pour Compagnie
    public Database(Compagnie uneCompagnie) throws IOException {
        this.compagnie = uneCompagnie;
        createCompagnieDB();
    }

    public void createUserDB() {
        //Write les info du user avec JSON
        obj = new JSONObject();

        obj.put("nom", user.getNom());
        obj.put("prenom", user.getPrenom());
        obj.put("numeroRue", user.getNumeroRue());
        obj.put("nomRue", user.getNomRue());
        obj.put("codePostal", user.getCodePostal());
        obj.put("province", user.getProvince());
        obj.put("pays", user.getPays());
        obj.put("password", user.getPassword());
        obj.put("telephone", user.getTelephone());
        userCreated = true;
    }

    public void createCompagnieDB() {
        //Write les info du user avec JSON
        obj = new JSONObject();

        obj.put("nom", compagnie.getNomCompagnie());
        obj.put("numeroRue", compagnie.getNumeroRue());
        obj.put("nomRue", compagnie.getNomRue());
        obj.put("codePostal", compagnie.getCodePostal());
        obj.put("province", compagnie.getProvince());
        obj.put("pays", compagnie.getPays());
        obj.put("telephone", compagnie.getTelephone());
        obj.put("description", compagnie.getDescription());
        compagnieCreated = true;
    }

    public void writeDatabase() {
        try {
            if (userCreated) {
                file = new FileWriter("data\\file\\infoUser.json");
                userCreated = false;
            }
            if (compagnieCreated) {
                file = new FileWriter("data\\file\\infoCompagnie.json");
                compagnieCreated = false;
            }
            file.write(obj.toJSONString());
            file.flush();
            file.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    //TEST
    public static void main(String[] args) throws IOException {
        /*User user = new User("Poulette", "Marc-Andre", "4512", "Marquette", "H2G 2Y9",
         "Quebec", "Canada", "12345", null);
         Database data = new Database(user);
         data.writeDatabase();

        Compagnie compagnie = new Compagnie("Trepanier-Capistran Mondo Architecture Inc.",
                "1919", "Notre-Dame", "R5G H7Y", "Quebec", "Canada", "514 813-1687",
                "Firme architecture");
        Database data2 = new Database(compagnie);
        data2.writeDatabase();*/
    }
}
