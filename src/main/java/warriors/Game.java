package main.java.warriors;

import main.java.warriors.cases.Case;
import main.java.warriors.cases.CaseVide;
import main.java.warriors.cases.armes.Epee;
import main.java.warriors.cases.armes.Massue;
import main.java.warriors.cases.potions.GrandePotion;
import main.java.warriors.cases.potions.PotionStandard;
import main.java.warriors.cases.sorts.BouleDeFeu;
import main.java.warriors.cases.sorts.Eclair;
import main.java.warriors.cases.sorts.Sorts;
import main.java.warriors.ennemis.Dragon;
import main.java.warriors.ennemis.Ennemis;
import main.java.warriors.ennemis.Gobelin;
import main.java.warriors.ennemis.Sorcier;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private ArrayList<Case> myPlateau;
    private int positionJoueur;
    private int lancerDe;
    private Case[] plateauStandard = new Case[64];
    private Dragon dragon;
    private Sorcier sorcier;
    private Gobelin gobelin;
    private int choix;
    private int reculer;

    public Game() {
        myPlateau = new ArrayList<>();
    }

    public void display() {
        fillPlateau();
        System.out.println("-----------------------PLATEAU DU JEU-----------------------");
        for (int i = 0; i < plateauStandard.length; i++) {
            System.out.println("Case " + i + " - " + plateauStandard[i]);
        }
    }

    public void fillPlateau() {
        dragon = new Dragon();
        sorcier = new Sorcier();
        gobelin = new Gobelin();

        for (int j = 0; j < 4; j++) {
            if(dragon.getNiveau() > 0){
                myPlateau.add(dragon);
            } else {break;}
        }
        for (int k = 0; k < 10; k++) {
            if(sorcier.getNiveau() > 0) {
                myPlateau.add(sorcier);
            } else {break;}
        }
        for (int l = 0; l < 10; l++) {
            if (gobelin.getNiveau() > 0) {
                myPlateau.add(gobelin);
            } else {break;}
        }
        for (int m = 0; m < 5; m++) {
            myPlateau.add(new Massue());
        }
        for (int n = 0; n < 4; n++) {
            myPlateau.add(new Epee());
        }
        for (int p = 0; p < 5; p++) {
            myPlateau.add(new Eclair());
        }
        for (int q = 0; q < 2; q++) {
            myPlateau.add(new BouleDeFeu());
        }
        for (int r = 0; r < 6; r++) {
            myPlateau.add(new PotionStandard());
        }
        for (int s = 0; s < 2; s++) {
            myPlateau.add(new GrandePotion());
        }
        for (int t = 0; t < 16; t++) {
            myPlateau.add(new CaseVide());
        }

        for (int u = 0; u < myPlateau.size(); u++) {
            int randomIndex = (int) (Math.random() * myPlateau.size());
            plateauStandard[u] = myPlateau.get(randomIndex);
        }

    }

    public void play(Personnage personnage) {
        System.out.println("----------------------PLAY------------------------");
        Plateau plateau = new Plateau();
        try {
            while (positionJoueur <= plateauStandard.length) {
                lancerDe = (int) (Math.random() * (6 - 1)) + 1;
                System.out.println("         Lancer dé: " + lancerDe);
                positionJoueur = positionJoueur + lancerDe;
                plateau.setPosition(positionJoueur);
                if (personnage.getNiveau() > 0) {
                    System.out.println("Case " + positionJoueur + " - " + plateauStandard[positionJoueur]);
                    if ((plateauStandard[positionJoueur] == gobelin && gobelin.getNiveau() > 0 )|| (plateauStandard[positionJoueur] == dragon && dragon.getNiveau() > 0)|| (plateauStandard[positionJoueur] == sorcier && sorcier.getNiveau() >0)) {
                        Scanner clavier = new Scanner(System.in);
                        System.out.println("Votre choix:");
                        System.out.println("1: Attaquer.");
                        System.out.println("2: Fuir.");
                        choix = clavier.nextInt();
                        if (choix == 1) {
                            plateauStandard[positionJoueur].interact(personnage);
                            System.out.println("         " + personnage.getNom() + " - Nouveau niveau: " + personnage.getNiveau() + ", Nouvelle force: " + personnage.getForce());

                        } if (choix == 2) {
                            reculer = (int) (Math.random() * (6 - 1)) + 1;
                            System.out.println("         Reculer: " + reculer);
                            positionJoueur = positionJoueur - reculer;
                            System.out.println("Case " + positionJoueur + " - " + plateauStandard[positionJoueur]);
                            System.out.println("         " + personnage.getNom() + " - Nouveau niveau: " + personnage.getNiveau() + ", Nouvelle force: " + personnage.getForce());

                        }
                    } else {
                        plateauStandard[positionJoueur].interact(personnage);
                        System.out.println("         " + personnage.getNom() + " - Nouveau niveau: " + personnage.getNiveau() + ", Nouvelle force: " + personnage.getForce());
                    }
                } else {
                    break;
                }
            }
            if ((positionJoueur-1) < 63) {
                System.out.println(personnage.getNom() + " est mort à la case " + (positionJoueur-1));
            }
            if ((positionJoueur-1) == 63) {
                System.out.println(personnage.getNom() + " est gagné!");
            }
        } catch (PersonnageHorsPlateauException e) {
        System.out.println(e);
        }
    }
}