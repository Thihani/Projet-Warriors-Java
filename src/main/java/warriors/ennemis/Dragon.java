package main.java.warriors.ennemis;

import main.java.warriors.Personnage;

public class Dragon extends Ennemi{
    public Dragon () {
        super("Dragon", 15, 4);
    }

    public void interact(Personnage personnage){
        personnage.setNiveau(personnage.getNiveau()+getNiveau());
        personnage.setForce(personnage.getForce()+getForce());
    }
}
