package main.java.warriors;

import main.java.warriors.cases.armes.Armes;
import main.java.warriors.cases.sorts.Sorts;

import java.util.Scanner;

public class Guerrier extends Personnage {

    public Guerrier() {
        super("Fox",5,5);
    }

    public Guerrier(String nom) {
        super(nom,5,5);
    }

    public Guerrier(String nom, int niveau, int force) {
        super(nom,niveau,force);
    }

    public void setSorts(Sorts sorts) {}
}
