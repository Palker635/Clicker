import java.sql.*;

public class clickerDB {

    public void dbSave(String username, int clickbonus, int clickscore) throws SQLException{
        Connection conn = null;
        Statement stmt;


        conn = DriverManager.getConnection(
                "jdbc:mysql://" + DatabaseLoginData.DBURL + ":" + DatabaseLoginData.port + "/" + DatabaseLoginData.DBname +
                        "? allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                DatabaseLoginData.user, DatabaseLoginData.password);

        stmt = conn.createStatement();

        String save = "INSERT INTO clickersave (scoredb, clickbonusdb, usernamedb) VALUES ("+clickscore+" , "+clickbonus+" ,'"+username+"')";
        System.out.println(save);
        stmt.executeUpdate(save);

    }
}