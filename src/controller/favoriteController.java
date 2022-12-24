package controller;

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
}
