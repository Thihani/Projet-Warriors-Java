package main.java.warriors.cases.armes;

import main.java.warriors.Personnage;

public class Epee extends Armes {
    public Epee() {
        super("Epee",5);
    }

    public void interact (Personnage personnage) {
        personnage.setForce(personnage.getForce()+getForce());
    }
}
