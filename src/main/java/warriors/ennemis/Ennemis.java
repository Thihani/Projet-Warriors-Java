package main.java.warriors.ennemis;

import main.java.warriors.Personnage;
import main.java.warriors.cases.Case;

public class Ennemis implements Case {
    private String nom;
    private int niveau;
    private int force;

    public Ennemis(String nom, int niveau, int force) {
        this.nom = nom;
        this.niveau = niveau;
        this.force = force;
    }

    public String getNom() {
        return nom;
    }
    public int getForce() {
        return force;
    }
    public int getNiveau() {
        return niveau;
    }

    public void interact(Personnage personnage) {}

    @Override
    public String toString() {
        return nom + " : Niveau: " + niveau + ", Force: " + force;
    }
}
