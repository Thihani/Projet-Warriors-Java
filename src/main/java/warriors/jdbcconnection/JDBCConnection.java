package main.java.warriors.jdbcconnection;


import java.sql.*;

public class JDBCConnection {
    final String url = "jdbc:mysql://localhost:3306/warriors_java";
    final String user = "root";
    final String password = "root";
    private Connection connection = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    private PreparedStatement preparedStatement = null;

    public void getHeroes(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url,user,password);
            stmt = connection.createStatement();
            rs = stmt.executeQuery("SELECT * FROM hero");
            while (rs.next()) {
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("nom"));
                System.out.println(rs.getInt("niveau"));
                System.out.println(rs.getInt("force"));
                System.out.println("------------------------------");
            }

        } catch (SQLException | ClassNotFoundException ex){
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException sqlEx) { } // ignore

                rs = null;
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlEx) { } // ignore

                stmt = null;
            }
        }
    }

    public void createNewHeroes (String type, String nom, int niveau, int force) {
        try {
            preparedStatement = connection.prepareStatement("insert into  hero values (default, ?, ?, ?, ?)");
            preparedStatement.setString(1, type);
            preparedStatement.setString(2, nom);
            preparedStatement.setInt(3, niveau);
            preparedStatement.setInt(4, force);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}

