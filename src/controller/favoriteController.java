package controller;

import java.sql.ResultSet;

import database.DbConnection;
import model.Favorite;

public class favoriteController {
    DbConnection dbConnection;

    public int favorite(Favorite favorite){
        String email  = favorite.getEmail();
        String dEmail = favorite.getDriverEmail();

        String insertQuery="insert into favorite(email,driverEmail) values('"+email+"','"+dEmail+"')";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(insertQuery);
        return result;
    }

    public ResultSet fetchFavorite(Favorite favorite){
        String email = favorite.getEmail();
        
        String selectQuery = "select driverEmail from favorite where email='"+email+"'";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;
    }
}
