package main.java.warriors;
import java.util.Scanner;


public class Menu {
    static String typeDePersonnage;
    private String nom;
    private int niveau;
    private int force;

    public static void main(String[] args) {
        Menu myMenu = new Menu();

        if (typeDePersonnage.equals("Guerrier")){
            Guerrier myGuerrier = new Guerrier(myMenu.nom, myMenu.niveau, myMenu.force);
            System.out.println("My Guerrier");
            System.out.println(myGuerrier.getNom());
            System.out.println(myGuerrier.getNiveau());
            System.out.println(myGuerrier.getForce());
        } else {
            Magicien myMagicien = new Magicien(myMenu.nom, myMenu.niveau, myMenu.force);
            System.out.println("My Magicien");
            System.out.println(myMagicien.getNom());
            System.out.println(myMagicien.getNiveau());
            System.out.println(myMagicien.getForce());
        }

    }
    public Menu() {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Créer nouveau personnage.");
        System.out.println("2. Afficher votre personnage.");
        System.out.println("3. Modifier votre personnage.");
        System.out.println("4. Quitter");
    }
    public void creer(){
        int i;
        int j;
        int n;
        int m;

        System.out.print("Quel type de personnage vous voulez créer (Guerrier/Magicien): ");
        typeDePersonnage = clavier.nextLine();
        this.typeDePersonnage = typeDePersonnage;

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
        clavier.close();
    }


     public void modifier (){
         Scanner clavier = new Scanner(System.in);
         System.out.print("Voulez-vous modifier: ");
     }
}
