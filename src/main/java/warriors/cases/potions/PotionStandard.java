package main.java.warriors.cases.potions;

import main.java.warriors.Personnage;

public class PotionStandard extends Potions{
    public PotionStandard () {
        super("Potion Standard", 2);
    }

    public void interact (Personnage personnage) {
        personnage.setForce(personnage.getNiveau()+getNiveau());
    }
}
