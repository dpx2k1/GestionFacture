/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Guillaume
 */
public class UserData{
    
    private User unUser;
    private ArrayList listeUser;
    
    public UserData(User unUser) throws IOException{
        this.unUser = unUser;
        initUser();
    }
    
    public void initUser() throws IOException{
        listeUser = new ArrayList<>();
        listeUser.add(unUser.getUserInfo());
    }
    
    public ArrayList getListeUser(){
        return listeUser;
    }
}
