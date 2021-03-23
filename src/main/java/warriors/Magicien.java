package main.java.warriors;

import java.util.Scanner;

public class Magicien extends Personnage{

    public static void main(String[] args) {

    }
    public Magicien() {
        super("MyGirl",3,8);
    }
    public Magicien(String nom) {
        super(nom,3,8);
    }
    public Magicien(String nom, int niveau, int force) {
        super(nom,niveau,force);
    }
}
