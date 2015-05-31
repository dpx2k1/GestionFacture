/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import Modele.Compagnie;
import java.io.*;
import org.json.simple.JSONObject;

/**
 *
 * @author Guillaume
 */
public class CompagnieData {

    private Compagnie compagnie;
    private FileWriter file;
    //Object JSON pour la database
    private JSONObject obj;

    public CompagnieData(Compagnie uneCompagnie) throws IOException {
        this.compagnie = uneCompagnie;
        createCompagnieDB();
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
    }

    public void initUser() {
        try {
            file = new FileWriter("Compagnie.json");
            file.write(obj.toJSONString());
            file.flush();
            file.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    //TEST
    public static void main(String[] args) throws IOException {
        Compagnie compagnie = new Compagnie("Trepanier-Capistran Mondo Architecture Inc.",
                "1919", "Notre-Dame", "R5G H7Y", "Quebec", "Canada", "514 813-1687",
                "Firme architecture");
        CompagnieData ud = new CompagnieData(compagnie);
        ud.initUser();
    }
}
