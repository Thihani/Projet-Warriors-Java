package main.java.warriors;
import java.util.Scanner;


public class Menu {
    private String typeDePersonnage;
    private String nom;
    private int niveau;
    private int force;
    private int action;

    public void launchMenu() {

        if (typeDePersonnage.equals("Guerrier")){
            Guerrier myGuerrier = new Guerrier(this.nom, this.niveau, this.force);
            System.out.println("Votre Guerrier");
            this.afficher(myGuerrier);
            this.home();
            if (action == 1) {
                this.modifier(myGuerrier);
                this.afficher(myGuerrier);
            }

        } else {
            Magicien myMagicien = new Magicien(this.nom, this.niveau, this.force);
            System.out.println("Votre Magicien");
            this.afficher(myMagicien);
            this.home();
            if (action == 1) {
                this.modifier(myMagicien);
                this.afficher(myMagicien);
            }
        }
    }

    public Menu(){
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

        if(typeDePersonnage.equals("Guerrier")) {
            i = 5;
            j=10;
            m = 5;
            n = 10;
        } else {
            i = 3;
            j=6;
            m = 8;
            n = 15;
        }

        System.out.print("Saisir le niveau: ");
        niveau = clavier.nextInt();
        while(this.niveau<i || this.niveau>j){
            System.out.println("Votre niveau doit être entre " + i + "et " + j);
            System.out.println("Saisir le niveau (entre " + i + " et " +j + " ):");
            niveau = clavier.nextInt();
        }
        if(this.niveau>=i && this.niveau<=j){
            this.niveau = niveau;
        }

        System.out.print("Saisir le force: ");
        force = clavier.nextInt();
        while(this.force<m || this.force>n){
            System.out.println("Votre force doit être entre " + m + "et " + n);
            System.out.println("Saisir la force (entre " + m + " et " +n + " ):");
            force= clavier.nextInt();
        }
        if(this.force>=m && this.force<=n){
            this.force = force;
        }

    }

    public void home() {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Modifier votre personnage.");
        System.out.println("2. Demarrer");
        System.out.println("Entrer le numero: ");
        action = clavier.nextInt();
    }

    public void afficher (Personnage myPersonnage) {
        System.out.println("Nom: " + myPersonnage.getNom());
        System.out.println("Niveau: " + myPersonnage.getNiveau());
        System.out.println("Force: " + myPersonnage.getForce());
    }

    public void modifier(Personnage myPersonnage ) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Saisir le nouveau nom: ");
        myPersonnage.setNom(clavier.nextLine());
        System.out.print("Saisir le nouveau niveau: ");
        myPersonnage.setNiveau(clavier.nextInt());
        System.out.print("Saisir la nouvelle force: ");
        myPersonnage.setForce(clavier.nextInt());
        clavier.close();
    }

    public void demarrer () {

    }





}
