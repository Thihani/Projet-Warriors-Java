package main.java.warriors;

import java.util.Scanner;

public class Guerrier {

    private String nom;
    private int niveau;
    private int force;
    public static void main(String[] args) {

    }
    public Guerrier(){
        nom = "Fox";
        niveau = 5;
        force = 5;
    }
    public Guerrier (String nom){
        this.nom = nom;
        niveau = 5;
        force = 5;
    }
    public Guerrier (String nom, int niveau, int force){
        this.nom = nom;
        this.niveau = niveau;
        this.force = force;
    }

    public void setNom(String nom){
        this.nom = nom;
    }
    public String getNom(){
        return nom;
    }

    public void setNiveau(int niveau){
        this.niveau = niveau;
    }
    public int getNiveau(){
        return niveau;
    }

    public void setForce(int force){
        this.force = force;
    }
    public int getForce (){
        return force;
    }


}