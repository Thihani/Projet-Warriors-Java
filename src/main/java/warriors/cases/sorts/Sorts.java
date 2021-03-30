package main.java.warriors.cases.sorts;

import main.java.warriors.Personnage;
import main.java.warriors.cases.Case;

public abstract class Sorts implements Case {
    private String nom;
    private int force;

    public Sorts (String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    public String getNom() {
        return nom;
    }

    public int getForce() {
        return force;
    }

    public abstract void interact(Personnage personnage);

    @Override
    public String toString() {
        return nom + ", Force: " +force;
    }
}
