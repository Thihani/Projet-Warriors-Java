package main.java.warriors.ennemis;

import main.java.warriors.Personnage;

public class Sorcier extends Ennemis {
    public Sorcier () {
        super("Sorcier", 9, 2);
    }

    public void interact(Personnage personnage){
        personnage.setNiveau(personnage.getNiveau() - getForce());
        setNiveau(getNiveau() - personnage.getForce());
    }
}
