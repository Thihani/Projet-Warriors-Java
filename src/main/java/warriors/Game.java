package main.java.warriors;

import main.java.warriors.cases.Case;
import main.java.warriors.cases.CaseVide;
import main.java.warriors.cases.armes.Epee;
import main.java.warriors.cases.armes.Massue;
import main.java.warriors.cases.potions.GrandePotion;
import main.java.warriors.cases.potions.PotionStandard;
import main.java.warriors.cases.sorts.BouleDeFeu;
import main.java.warriors.cases.sorts.Eclair;
import main.java.warriors.ennemis.Dragon;
import main.java.warriors.ennemis.Gobelin;
import main.java.warriors.ennemis.Sorcier;

import java.util.ArrayList;

public class Game {
    private ArrayList<Case> myPlateau;
    private int positionJoueur;
    private int lancerDe;
    private Case [] plateauStandard = new Case[64];

    public Game() {
        myPlateau = new ArrayList<>();
    }

    public void display() {
        fillPlateau();
        System.out.println("----------------------------------------------");
        System.out.println("PLATEAU DU JEU");
        for (int i = 0; i < plateauStandard.length; i++) {
            System.out.println("Case " + i + " - " + plateauStandard[i]);
        }
    }

    public void fillPlateau() {
        for (int j = 0; j<4; j++) {
            myPlateau.add(new Dragon());
        }
        for (int k = 0; k<10; k++) {
            myPlateau.add(new Sorcier());
        }
        for (int l = 0; l<10; l++) {
            myPlateau.add(new Gobelin());
        }
        for (int m = 0; m<5; m++) {
            myPlateau.add(new Massue());
        }
        for (int n = 0; n<4; n++) {
            myPlateau.add(new Epee());
        }
        for (int p = 0; p<5; p++) {
            myPlateau.add(new Eclair());
        }
        for (int q = 0; q<2; q++) {
            myPlateau.add(new BouleDeFeu());
        }
        for (int r = 0; r<6; r++) {
            myPlateau.add(new PotionStandard());
        }
        for (int s = 0; s<2; s++) {
            myPlateau.add(new GrandePotion());
        }
        for (int t = 0; t<16; t++) {
            myPlateau.add(new CaseVide());
        }


        for (int u = 0; u < myPlateau.size(); u++) {
            int randomIndex = (int) (Math.random() * myPlateau.size());
            plateauStandard[u] = myPlateau.get(randomIndex);
        }

    }

    public void play(Personnage personnage) {

            for (positionJoueur = 0; positionJoueur < myPlateau.size(); positionJoueur++) {
                if(!personnage.isMort()) {
                    myPlateau.get(positionJoueur).interact(personnage);
                    personnage.setMort();
                } /*else {
                    System.out.println("Perso est mort");
                }*/
            }
            System.out.println("Perso est mort: " + personnage.isMort());


        System.out.println("----------------------------------------------");
        System.out.println("Niveau de personnage: " + personnage.getNiveau());
        System.out.println("Force de personnage: " + personnage.getForce());


}
}