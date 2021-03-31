package main.java.warriors;

import main.java.warriors.cases.armes.Armes;

import java.util.Scanner;

public class Magicien extends Personnage{

    public Magicien() {
        super("MyGirl",3,8);
    }

    public Magicien(String nom) {
        super(nom,3,8);
    }

    public Magicien(String nom, int niveau, int force) {
        super(nom,niveau,force);
    }

    public void setArme(Armes armes) {}
}
