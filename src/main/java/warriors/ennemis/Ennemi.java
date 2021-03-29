package main.java.warriors.ennemis;

import main.java.warriors.cases.Case;

public class Ennemi extends Case {
    private String nom;
    private int niveau;
    private int force;

    public Ennemi (String nom, int niveau, int force) {
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

    public void interact() {}

    @Override
    public String toString() {
        return nom + " : Niveau: " + niveau + ", Force: " + force;
    }
}
