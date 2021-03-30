package main.java.warriors.cases.armes;
import main.java.warriors.cases.Case;

public class Armes extends Case {
    private String nom;
    private int force;

    public Armes(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    public String getNom() {
        return nom;
    }

    public int getForce() {
        return force;
    }

    public void interact(){};

    @Override
    public String toString() {
        return nom + ", Force: " +force;
    }

}
