package view;

import javax.swing.JOptionPane;

import controller.UserController;
import model.User;

public class view {
    public static void main(String[] args) {
        User u1 = new User("1","1","1","1","1","1","1","1","1","1","2", "12", "1", "1", "12", null, null);
        UserController sc  = new UserController();
        int result = sc.insertDetails(u1);
        if(result>0){
            JOptionPane.showMessageDialog(null, "Inserted");
        }else{
            JOptionPane.showMessageDialog(null, " NOt Inserted");
            
        }
        
    }
}
