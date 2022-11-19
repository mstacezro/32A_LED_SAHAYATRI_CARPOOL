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
    //    User u1 = new User(null, "1", null, null, null, null, null, null, null, null, "2", null, null, null, null, null, null) ;
    User u1 = new User(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null) ;  
    UserController sc = new UserController();
        ResultSet result = sc.selectdetails(u1);
            if(result.next()){
                String username,pass,repass,fname,mname,lname,gender,dob,nationality,address,email,phone,sq,sqanswer,citizen,license,expiry;
                username = result.getString(1);
                pass = result.getString(2);
                fname=result.getString(3);
                mname=result.getString(4);
                lname=result.getString(5);
                gender=result.getString(6);
                dob=result.getString(7);
                nationality=result.getString(8);
                email=result.getString(9);
                phone=result.getString(10);
                sq=result.getString(11);
                sqanswer=result.getString(12);
                citizen=result.getString(13);
                license= result.getString(14);
                expiry=result.getString(15);
                address=result.getString(16);

                System.out.println(username+pass+fname+mname+lname+gender+dob+nationality+email+phone+sq+sqanswer+citizen+license+expiry+address);
                

            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
