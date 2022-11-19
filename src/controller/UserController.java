package controller;

import java.sql.ResultSet;

import database.DbConnection;
import model.User;

public class UserController {
    DbConnection dbConnection;

    public int insertDetails(User user) {
        String username = user.getUsername();
        String pass = user.getuserpass();
        String repass = user.getuserrepass();
        String fname = user.getuserfname();
        String mname = user.getusermname();
        String lname = user.getuserlname();
        String gender = user.getusergender();
        String dob = user.getuserdob();
        String nationality = user.getusernationality();
        String address = user.getuseraddress();
        String email = user.getuseremail();
        String phone = user.getuserphone();
        String sq = user.getusersq();
        String sqAnswer = user.getusersqanswer();
        String citizen = user.getusercitizen();

        String insertquery = "insert into user(username,password,first_name,middle_name,last_name,gender,dob,nationality,email,phone,sq,sq_ans,citizen)"
                + "values('" + username + "','" + pass + "','" + fname + "','" + mname + "','" + lname + "','" + gender
                + "','" + dob + "','" + nationality + "','" + email + "','" + phone + "','" + sq
                + "','"+sqAnswer+"','"+citizen+"')";

            dbConnection = new DbConnection();
            int result = dbConnection.manipulate(insertquery);
            return result;

    }

    // public ResultSet selectQuery(User user){
    // String
    // return null;

    // }
}
