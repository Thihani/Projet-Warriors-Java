package main.java.warriors;

import java.util.Scanner;

public class Guerrier extends Personnage {
    //private Arme arme = new Arme();

    public Guerrier() {
        super("Fox",5,5);
    }

    public Guerrier(String nom) {
        super(nom,5,5);
    }

    public Guerrier(String nom, int niveau, int force) {
        super(nom,niveau,force);
    }

    /*public Arme getArme() {
        return arme;
    }

    public void setArme(Arme arme) {
        this.arme = arme;
    }*/

}
