package main.java.warriors;

import main.java.warriors.cases.armes.Armes;
import main.java.warriors.cases.sorts.Sorts;

public abstract class Personnage {
    private String nom;
    private int niveau;
    private int force;
    private Armes armes;
    private Sorts sorts;

    public Armes getArme() {
        return armes;
    }
    public void setArme(Armes armes) {
        this.armes = armes;
    }

    public Sorts getSorts() {
        return sorts;
    }

    public void setSorts(Sorts sorts) {
        this.sorts = sorts;
    }


    public Personnage() {
        nom = "Person";
        niveau = 0;
        force = 0;
    }

    public Personnage(String nom) {
        this.nom = nom;
        niveau = 0;
        force = 0;
    }

    public Personnage(String nom, int niveau, int force) {
        this.nom = nom;
        this.niveau = niveau;
        this.force = force;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getForce() {
        return force;
    }

    @Override
    public String toString() {
        return "Nom: " + nom + ", Niveau: " + niveau + ", Force: " +force;
    }

}
