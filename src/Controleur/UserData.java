/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import Modele.User;
import java.io.*;
import org.json.simple.JSONObject;

/**
 *
 * @author Guillaume
 */
public class UserData {

    private User user;
    private FileWriter file;
    //Object JSON pour la database
    private JSONObject obj;

    public UserData(User unUser) throws IOException {
        this.user = unUser;
        createUserDB();
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
    }

    public void initUser() {
        try {
            file = new FileWriter("file1.json");
            file.write(obj.toJSONString());
            file.flush();
            file.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    //TEST
    public static void main(String[] args) throws IOException {
        User user = new User("Poulette", "Marc-Andre", "4512", "Marquette", "H2G 2Y9",
                "Quebec", "Canada", "12345", null);
        UserData ud = new UserData(user);
        ud.initUser();
    }
}
