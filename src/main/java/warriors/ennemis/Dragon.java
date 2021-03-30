package main.java.warriors.ennemis;

import main.java.warriors.Personnage;

public class Dragon extends Ennemis {
    public Dragon () {
        super("Dragon", 15, 4);
    }

    public void interact(Personnage personnage){
        personnage.setNiveau(personnage.getNiveau() - getForce());
    }
}
