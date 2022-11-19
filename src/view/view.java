package view;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import controller.UserController;
import model.User;

public class view {
    public static void main(String[] args) {
        // User u1 = new User("1","1","1","1","1","1","1","1","1","1","3", "123", "1", "1", "123", null, null);
        try {
       User u1 = new User(null, "1", null, null, null, null, null, null, null, null, "2", null, null, null, null, null, null) ;
        UserController sc = new UserController();
        ResultSet result = sc.selectQuery(u1);
            if(result.next()){
                JOptionPane.showMessageDialog(null, "Login Success");
                sc.changeStatus(u1);
                sc.updatestatus(u1);

            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
