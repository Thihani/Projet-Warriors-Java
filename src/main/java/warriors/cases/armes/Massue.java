package main.java.warriors.cases.armes;

import main.java.warriors.Personnage;

public class Massue extends Armes{
    public Massue() {
        super("Massue",3);
    }

    public void interact (Personnage personnage) {
        personnage.setArme(this);
        if(personnage.getArme()!=null){
            personnage.setForce(personnage.getForce()+getForce());
        }
    }
}
