package main.java.warriors;
import java.util.Scanner;

public class Personnage {
    private String nom;
    private int niveau;
    private int force;
    public static void main(String[] args) {

    }
    public Personnage(){
        Scanner clavier = new Scanner(System.in);

        System.out.print("Saisir le nom : ");
        nom = clavier.nextLine();

        System.out.print("Saisir le niveau : ");
        niveau = clavier.nextInt();

        System.out.print("Saisir le force : ");
        force = clavier.nextInt();

        System.out.println("[nom = " + nom + ", niveau = " + niveau + ", force" + force + "]");

        clavier.close();
    }
    public Personnage (String nom){
        Scanner clavier = new Scanner(System.in);

        System.out.print("Saisir le nom : ");
        nom = clavier.nextLine();

        System.out.print("Saisir le niveau : ");
        niveau = clavier.nextInt();

        System.out.print("Saisir le force : ");
        force = clavier.nextInt();

        System.out.println("[nom = " + nom + ", niveau = " + niveau + ", force" + force + "]");

        clavier.close();
    }
    public Personnage (String nom, int niveau, int force){
        Scanner clavier = new Scanner(System.in);

        System.out.print("Saisir le nom : ");
        nom = clavier.nextLine();

        System.out.print("Saisir le niveau : ");
        niveau = clavier.nextInt();

        System.out.print("Saisir le force : ");
        force = clavier.nextInt();

        System.out.println("[nom = " + nom + ", niveau = " + niveau + ", force" + force + "]");

        clavier.close();
    }


}
