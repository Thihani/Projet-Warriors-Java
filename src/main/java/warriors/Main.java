package main.java.warriors;

public class Main {

    public static void main(String[] args) {
	Guerrier guerrier = new Guerrier("fox",5,100);
	System.out.println(guerrier.getNom());
	System.out.println(guerrier.getNiveau());
	System.out.println(guerrier.getForce());

        Magicien magicien = new Magicien("ola", 7,12);
        System.out.println(magicien.getNom());
        System.out.println(magicien.getNiveau());
        System.out.println(magicien.getForce());
    }


}
