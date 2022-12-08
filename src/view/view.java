package view;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

// import com.mysql.cj.jdbc.Driver;

import controller.DriverController;
import controller.UserController;
import model.Driver;
import model.User;

public class view {
    public static void main(String[] args) {
        // User u1 = new User("1","1","1","1","1","1","1","1","1","1","3", "123", "1", "1", "123", null, null);
        try {
    //    User u1 = new User(null, "1", null, null, null, null, null, null, null, null, "2", null, null, null, null, null, null) ;
            Driver d1 = new Driver(3, null, null, null, null, 0, 0);
            DriverController dc = new DriverController();
            ResultSet result  = dc.selectDetails(d1);
            while(result.next()){
                String dLeave = result.getString(2);
                String dGoing = result.getString(3);
                String dDate = result.getString(4);
                String dTrunk = result.getString(5);
                String seat = result.getString(6);
                // JOptionPane.showMessageDialog(null,dLeave+" " +dGoing +""+ dDate+""+dTrunk+ ""+ seat);

            }
                
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
