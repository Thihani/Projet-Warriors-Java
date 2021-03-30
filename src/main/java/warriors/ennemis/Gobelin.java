package main.java.warriors.ennemis;

import main.java.warriors.Personnage;

public class Gobelin extends Ennemi{
    public Gobelin () {
        super("Gobelin", 6, 1);
    }

    public void interact(Personnage personnage){
        personnage.setNiveau(personnage.getNiveau() - getNiveau());
        personnage.setForce(personnage.getForce() - getForce());
    }
}
