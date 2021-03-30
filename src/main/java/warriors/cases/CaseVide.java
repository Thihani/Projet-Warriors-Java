package main.java.warriors.cases;
import main.java.warriors.Personnage;
import main.java.warriors.cases.Case;

public class CaseVide implements Case{
    public CaseVide () {
    }
    @Override
    public String toString() {
        return "Case vide";
    }

    @Override
    public void interact(Personnage personnage) {

    }
}
