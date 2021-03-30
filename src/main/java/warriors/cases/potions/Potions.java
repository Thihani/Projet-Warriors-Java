package main.java.warriors.cases.potions;

import main.java.warriors.cases.Case;

public class Potions extends Case {

    private String nom;
    private int niveau;
    public Potions(String nom, int niveau) {
        this.nom = nom;
        this.niveau = niveau;
    }

    public String getNom() {
        return nom;
    }

    public int getNiveau() {
        return niveau;
    }

    public void interact () {}

    @Override
    public String toString() {
        return nom + ", Niveau: " + niveau;
    }
}
