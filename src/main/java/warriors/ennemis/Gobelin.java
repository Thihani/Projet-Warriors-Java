package main.java.warriors.ennemis;

import main.java.warriors.Personnage;

public class Gobelin extends Ennemis {
    public Gobelin () {
        super("Gobelin", 6, 1);
    }

    public void interact(Personnage personnage){
        if (this.getNiveau() > 0) {
            personnage.setNiveau(personnage.getNiveau() - getForce());
            setNiveau(getNiveau() - personnage.getForce());
        } else {
            System.out.println("        " + this.getNom() + " est mort!");
        }
    }
}
