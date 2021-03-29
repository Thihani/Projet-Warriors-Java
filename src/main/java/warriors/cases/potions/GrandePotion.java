package main.java.warriors.cases.potions;

import main.java.warriors.Personnage;

public class GrandePotion extends Potions{
    public GrandePotion () {
        super("Grand Potion", 5);
    }

    public void interact (Personnage personnage) {
        personnage.setForce(personnage.getNiveau()+getNiveau());
    }
}
