package main.java.warriors.cases.sorts;

import main.java.warriors.Personnage;

public class BouleDeFeu extends Sorts{
    public BouleDeFeu() {
        super("Boule de feu",7);
    }

    public void interact (Personnage personnage) {
        personnage.setForce(personnage.getForce()+getForce());
    }
}
