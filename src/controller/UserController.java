package controller;

import java.sql.ResultSet;

import database.DbConnection;
import model.User;

public class UserController {
    DbConnection dbConnection;

    public int insertDetails(User user) {
        String username = user.getUsername();
        String pass = user.getuserpass();
        // String repass = user.getuserrepass();
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
        String licencse = user.getuserlicense();
        String expiry = user.getuserexpiry();

        String insertquery = "insert into user_table(username,password,first_name,middle_name,last_name,gender,dob,nationality,email,phone,sq,sq_ans,citizen,user_Address,license,expiry)"
                + "values('" + username + "','" + pass + "','" + fname + "','" + mname + "','" + lname + "','" + gender
                + "','" + dob + "','" + nationality + "','" + email + "','" + phone + "','" + sq
                + "','" + sqAnswer + "','" + citizen + "','" + address + "','" + licencse + "','" + expiry + "')";

        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(insertquery);
        return result;

    }

    public ResultSet selectQuery(User user) {
        String email = user.getuseremail();
        String pass = user.getuserpass();

        String selectLogin = "select * from user_table where email='" + email + "' and password='" + pass + "'";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectLogin);
        return result;

    }

    public int updatestatus(User user) {
        String email = user.getuseremail();
        String updatestatus = "update user_table SET status= '" + "active" + "' where email='" + email + "'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(updatestatus);
        return result;
    }

    public int changeStatus(User user) {
        String changeStatus = "update user_table set status='" + "inactive" + "' where status='" + "active" + "'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(changeStatus);
        return result;
    }

    public ResultSet selectdetails(User user) {
        String selectdetails = "select * from user_table where status='" + "active" + "'";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectdetails);
        return result;
    }

    public int editdetails(User user) {
        String username = user.getUsername();
        String pass = user.getuserpass();
        // String repass = user.getuserrepass();
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
        String licencse = user.getuserlicense();
        String expiry = user.getuserexpiry();

        String editquery = "update user_table set username = '" + username
                + "',password ='" + pass + "',first_name='" + fname + "',middle_name='" + mname + "',last_name='"
                + lname + "',gender='" + gender + "',dob='" + dob + "',nationality='" + nationality + "',email='"
                + email + "',phone='" + phone + "',sq='" + sq + "',sq_ans='" + sqAnswer + "',citizen='" + citizen
                + "',user_Address='" + address + "',license='" + licencse + "',expiry='" + expiry + "' where status='"
                + "active" + "'";

        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(editquery);
        return result;
    }
}
