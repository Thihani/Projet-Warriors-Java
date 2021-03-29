package main.java.warriors.ennemis;

import main.java.warriors.Personnage;

public class Sorcier extends Ennemi{
    public Sorcier () {
        super("Sorcier", 9, 2);
    }

    public void interact(Personnage personnage){
        personnage.setNiveau(personnage.getNiveau()+getNiveau());
        personnage.setForce(personnage.getForce()+getForce());
    }
}
