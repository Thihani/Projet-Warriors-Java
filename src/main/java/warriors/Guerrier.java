package main.java.warriors;

import java.util.Scanner;

public class Guerrier extends Personnage {

    public static void main(String[] args) {

    }
   public Guerrier() {
        super("Fox",5,5);
    }
    public Guerrier(String nom) {
        super(nom,5,5);
    }
    public Guerrier(String nom, int niveau, int force) {
        super(nom,niveau,force);
    }


}
