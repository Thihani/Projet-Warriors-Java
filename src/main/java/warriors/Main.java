package main.java.warriors;

import main.java.warriors.jdbcconnection.JDBCConnection;

public class Main {
    public static void main(String[] args) {
        /*Menu menu = new Menu();
        menu.launchMenu();*/

        JDBCConnection jdbcConnection = new JDBCConnection();
        jdbcConnection.getHeroes();
        jdbcConnection.createNewHeroes("Guerrier","ABC",10,10);
    }

}
