package main.java.warriors;

import java.util.Scanner;

public class Guerrier extends Personnage {
    private String bouclier;
    private String arme;


    public Guerrier() {
        super("Fox",5,5);
    }

    public Guerrier(String nom) {
        super(nom,5,5);
    }

    public Guerrier(String nom, int niveau, int force) {
        super(nom,niveau,force);
    }

    public String getBouclier() {
        return bouclier;
    }

    public void setBouclier(String bouclier) {
        this.bouclier = bouclier;
    }

    public String getArme() {
        return arme;
    }

    public void setArme(String arme) {
        this.arme = arme;
    }


}
