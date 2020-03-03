/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas15;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Tugas15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner baca=new Scanner(System.in);
        lima a=new lima();
        empat b=new empat();
        tiga c=new tiga();
        dua d=new dua();
        a.ya();
        System.out.println(" ");
        a.masuk();
        a.masuk("");
        a.buka();
        a.setbuka("");
        a.getbuka();
        b.setya("");
        b.getya();
        b.buka();
        c.buka();
        System.out.println(" ");
        a.masuk();
        a.masuk("");
        d.buka();
    }
    
}
