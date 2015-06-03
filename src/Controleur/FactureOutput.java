/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import java.io.File;
import java.io.IOException;
import jxl.write.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import jxl.*;
import jxl.write.Number;

/**
 *
 * @author Guillaume
 */
//Class qui recoit des éléments de la base de donnée pour créer un ficher Excel
//Librairy utilisé est JExcel : http://jexcelapi.sourceforge.net/
public class FactureOutput {

    //Déclaration des variables
    private WritableWorkbook workbook;
    private WritableSheet sheet;

    //Constructeur
    public FactureOutput() {
        try {
            //Initialisation des variables
            //Initialisation du WritableWorkbook (notre fichier excel)
            workbook = Workbook.createWorkbook(new File("output.xls"));
            //Une fois le Workbook créé on peut créer une WritableSheet, commencant par 0
            sheet = workbook.createSheet("First Sheet", 0);
            //Une fois la Sheets créée, il reste qu'à remplir les cellules            
            try {
                //La position des cellules dans la sheet sont indexées comme de la façon suivante (colonnes, rangée) 
                //Ecrit le contenue du label dans la cell A3
                Label label = new Label(0, 2, "A label record");
                sheet.addCell(label);
                //Ecrit le nombre 3.14159 dans la cell D5
                Number number = new Number(3, 4, 3.1459);
                sheet.addCell(number);
                //Une fois les cellules ecrites on peut ecrire le Workbook
                workbook.write();
                workbook.close();
            } catch (WriteException ex) {
                Logger.getLogger(FactureOutput.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(FactureOutput.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String[] args) throws IOException {
        FactureOutput.main(args);
    }
}
