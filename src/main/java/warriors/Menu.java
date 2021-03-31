package main.java.warriors;

import java.util.Scanner;


public class Menu {
    private String typeDePersonnage;
    private String nom;
    private int niveau;
    private int force;
    private int action;
    private int position;
    private int lancerDe;
    private int option;
    Guerrier myGuerrier;
    Magicien myMagicien;

    public void launchMenu() {

        if (typeDePersonnage.equals("Guerrier")) {
            myGuerrier = new Guerrier(this.nom, this.niveau, this.force);
            while (action == 1 || action == 2 || action == 3) {
                switch (action) {
                    case 1:
                        this.modifier(myGuerrier);
                        break;
                    case 2:
                        this.afficher(myGuerrier);
                        break;
                    case 3:
                        demarrer(myGuerrier);
                        while (option == 6) {
                            this.demarrer(myGuerrier);
                        }
                        if (option == 5) {
                            quitter();
                            action = 0;
                        }
                }
            }
            if (action == 4) {
                quitter();
            }
        } else {
            myMagicien = new Magicien(this.nom, this.niveau, this.force);
            while (action == 1 || action == 2 || action == 3) {
                switch (action) {
                    case 1:
                        this.modifier(myMagicien);
                        break;
                    case 2:
                        this.afficher(myMagicien);
                        break;
                    case 3:
                        demarrer(myMagicien);
                        while (option == 6) {
                            this.demarrer(myMagicien);

                        }
                        if (option == 5) {
                            quitter();
                            action = 0;
                        }
                }
            }
            if (action == 4) {
                quitter();
            }
        }
    }

    public Menu() {
        int i;
        int j;
        int n;
        int m;
        Scanner clavier = new Scanner(System.in);
        System.out.print("Quel type de personnage vous voulez créer (Guerrier/Magicien): ");
        typeDePersonnage = clavier.nextLine();

        System.out.print("Saisir le nom: ");
        nom = clavier.nextLine();
        this.nom = nom;

        if (typeDePersonnage.equals("Guerrier")) {
            i = 5;
            j = 10;
            m = 5;
            n = 10;
        } else {
            i = 3;
            j = 6;
            m = 8;
            n = 15;
        }

        System.out.print("Saisir le niveau: ");
        niveau = clavier.nextInt();
        while (this.niveau < i || this.niveau > j) {
            System.out.println("Votre niveau doit être entre " + i + "et " + j);
            System.out.println("Saisir le niveau (entre " + i + " et " + j + " ):");
            niveau = clavier.nextInt();
        }
        if (this.niveau >= i && this.niveau <= j) {
            this.niveau = niveau;
        }

        System.out.print("Saisir le force: ");
        force = clavier.nextInt();
        while (this.force < m || this.force > n) {
            System.out.println("Votre force doit être entre " + m + "et " + n);
            System.out.println("Saisir la force (entre " + m + " et " + n + " ):");
            force = clavier.nextInt();
        }
        if (this.force >= m && this.force <= n) {
            this.force = force;
        }
        this.home();
    }

    public void home() {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Modifier votre personnage.");
        System.out.println("2. Afficher votre personnage");
        System.out.println("3. Demarrer");
        System.out.println("4. Quitter");
        System.out.println("Entrer le numero: ");
        action = clavier.nextInt();
    }

    public void afficher(Personnage myPersonnage) {
        if (typeDePersonnage.equals("Guerrier")) {
            System.out.println("Votre Guerrier");
        } else {
            System.out.println("Votre Magicien");
        }
        System.out.println(myPersonnage.toString());
        this.home();
    }

    public void modifier(Personnage myPersonnage) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Saisir le nouveau nom: ");
        myPersonnage.setNom(clavier.nextLine());
        System.out.print("Saisir le nouveau niveau: ");
        myPersonnage.setNiveau(clavier.nextInt());
        System.out.print("Saisir la nouvelle force: ");
        myPersonnage.setForce(clavier.nextInt());
        this.home();
    }

    public void quitter() {
        System.out.println("Vous avez quitté de Warriors!");
    }

    public void demarrer(Personnage personnage) {
        /*Plateau plateau = new Plateau();
        position = 1;
        try {
            while (position <= 64) {
                    lancerDe = (int) (Math.random() * (6 - 1)) + 1;
                System.out.println("Lancer dé: " + lancerDe);
                position = position + lancerDe;
                System.out.println("Votre position: " + position);
                plateau.setPosition(position);
            }
        } catch (PersonnageHorsPlateauException e) {
            System.out.println(e);
        }*/
        Game game = new Game();
        game.display();
        game.play(personnage);

        Scanner clavier = new Scanner(System.in);
        System.out.println("----------------------------------------------");
        System.out.println("Votre choix:");
        System.out.println("5: Quitter le jeu.");
        System.out.println("6: Recommencer.");
        option = clavier.nextInt();
    }
}
