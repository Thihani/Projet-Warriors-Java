package main.java.warriors;

import java.util.Scanner;

public class Magicien extends Personnage{
    public String philtre;
    public String sort;

    public Magicien() {
        super("MyGirl",3,8);
    }

    public Magicien(String nom) {
        super(nom,3,8);
    }

    public Magicien(String nom, int niveau, int force) {
        super(nom,niveau,force);
    }

    public String getPhiltre() {
        return philtre;
    }

    public void setPhiltre(String philtre) {
        this.philtre = philtre;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
