package main.java.warriors;
import main.java.warriors.cases.armes.Armes;
import main.java.warriors.cases.Case;
import main.java.warriors.cases.CaseVide;
import main.java.warriors.cases.armes.Epee;
import main.java.warriors.cases.potions.PotionStandard;
import main.java.warriors.ennemis.Ennemi;
import main.java.warriors.ennemis.Gobelin;

import java.util.ArrayList;

public class Game {
    private ArrayList <Case> myPlateau;
    private int positionJoueur;
    private int lancerDe;

    public Game() {
        myPlateau = new ArrayList<>();
    }

    public void display() {
        fillPlateau();
        for (Case casePlateau:myPlateau) {
            System.out.println(casePlateau);
        }
    }

    public void fillPlateau () {
        myPlateau.add(new CaseVide());
        myPlateau.add(new Gobelin());
        myPlateau.add(new Epee());
        myPlateau.add(new PotionStandard());

    }

    public void play (Personnage personnage) {
        for (positionJoueur = 0; positionJoueur < 4; positionJoueur++) {
            myPlateau.get(positionJoueur).interact();
        }

    }


}
