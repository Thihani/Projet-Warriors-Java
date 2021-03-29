package main.java.warriors;

public class Main {
    public static void main(String[] args) {
        Guerrier myGuerrier = new Guerrier("Fox", 9,9);
        Game game = new Game();
        game.display();
        game.play(myGuerrier);


    }

}
