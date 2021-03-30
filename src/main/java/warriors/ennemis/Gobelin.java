package main.java.warriors.ennemis;

import main.java.warriors.Personnage;

public class Gobelin extends Ennemis {
    public Gobelin () {
        super("Gobelin", 6, 1);
    }

    public void interact(Personnage personnage){
        personnage.setNiveau(personnage.getNiveau() - getForce());
        if (personnage.isMort()){

        }
    }
}
