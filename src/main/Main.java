/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author PereZ
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
     
        Djur[] djur = new Djur[4];
       
        djur[0] = new Hund();
        djur[1] = new Delfin();
        djur[2] = new Kråka();
        djur[3] = new Duva();
        for (int i = 0; i < djur.length && djur[i] != null; i++) {
            
         
              djur[i].läte();
              System.out.println("Antal ben: "+djur[i].getAntalBen()+" Äter: " + djur[i].getÄter()+" Är: "+djur[i].getBlood());
        } 
    }   
}
