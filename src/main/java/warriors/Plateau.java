package main.java.warriors;

import javax.print.attribute.standard.MediaSize;

public class Plateau {
    private int position;
    public int getPosition() {
        return position;
    }

    public void setPosition(int position) throws PersonnageHorsPlateauException{
        if(position <= 64){
            this.position = position;
        }else{
            throw new PersonnageHorsPlateauException();
        }
    }
}
