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
public abstract class Djur {

    private int antalBen;
    private String äter;
    private String blood;

    public String getBlood() {
        return blood;
    }

    public String getÄter() {
        return äter;
    }

    public int getAntalBen() {
        return antalBen;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public void setÄter(String äter) {
        this.äter = äter;
    }

    public void setAntalBen(int antalBen) {
        this.antalBen = antalBen;
    }

    public abstract void läte();
}

abstract class Däggdjur extends Djur {

    public Däggdjur() {
        setBlood("Varmblodig");
    }
}

class Hund extends Däggdjur {

    public Hund() {
        setAntalBen(4);
        setÄter("Ben");
    }

    @Override
    public void läte() {
        System.out.println("Hund låter: voff voff");
    }
}

class Delfin extends Däggdjur {

    public Delfin() {

        setAntalBen(0);
        setÄter("Fisk");
    }

    @Override
    public void läte() {
        System.out.println("Delfin låter: Mip MiiiIiiip!");
    }
}

abstract class Fåglar extends Djur {

    public Fåglar() {
        setBlood("Varmblodigt");
        setAntalBen(2);
    }
}

class Kråka extends Fåglar {

    public Kråka() {
        setÄter("Maskar och bär");
    }

    @Override
    public void läte() {
        System.out.println("Kråka låter: krax, Krax!");
    }
}

class Duva extends Fåglar {

    public Duva() {
        setÄter("Maskar och skräp");
    }

    @Override
    public void läte() {
        System.out.println("Duva låter: kruu, Kruuu!");
    }
}
