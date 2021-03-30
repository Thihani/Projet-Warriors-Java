package main.java.warriors.cases.potions;

import main.java.warriors.Personnage;
import main.java.warriors.cases.CaseVide;
import main.java.warriors.cases.Case;

public class Potions implements Case {

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

    public void interact (Personnage personnage) {}

    @Override
    public String toString() {
        return nom + ", Niveau: " + niveau;
    }
}
