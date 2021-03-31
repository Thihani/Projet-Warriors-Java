package main.java.warriors.cases.sorts;

import main.java.warriors.Personnage;

public class Eclair extends Sorts{
    public Eclair() {
        super("Eclair",2);
    }

    public void interact (Personnage personnage) {
        personnage.setSorts(this);
        if(personnage.getSorts()!=null){
            personnage.setForce(personnage.getForce()+getForce());
        }
    }
}
