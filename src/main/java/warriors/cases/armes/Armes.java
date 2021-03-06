package main.java.warriors.cases.armes;
import main.java.warriors.Personnage;
import main.java.warriors.cases.Case;

public abstract class Armes implements Case {
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

    public abstract void interact(Personnage personnage);

    @Override
    public String toString() {
        return nom + ", Force: " +force;
    }

}
