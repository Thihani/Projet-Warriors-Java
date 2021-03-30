package main.java.warriors;

import main.java.warriors.cases.armes.Armes;

public abstract class Personnage {
    private String nom;
    private int niveau;
    private int force;
    private Armes armes;
    private boolean mort;

    public void setMort() {
        /*if (niveau <= 0) {mort = true;}
        else { mort = false;}*/
        mort = niveau <= 0;
    }

    public boolean isMort() {
        return mort;
    }

    public Armes getArme() {
        return armes;
    }

    public void setArme(Armes armes) {
        this.armes = armes;
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
