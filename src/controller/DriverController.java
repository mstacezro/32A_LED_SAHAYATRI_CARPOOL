package controller;

import java.sql.*;

import database.DbConnection;
import java.awt.List;
import java.util.ArrayList;
import model.Driver;
import model.User;

public class DriverController {
    DbConnection dbConnection;

    public int insertDriverDetails(Driver driver) {
        String leavePlace = driver.getDLeavePlace();
        String gointTo = driver.getDGoingTo();
        String date = driver.getDDate();
        String trunkSpace = driver.getDTrunkSpace();
        int seatAvailable = driver.getDSeatAvailable();
        int price = driver.getDPrice();
        String insertQuery = String.format("insert into driver_table(dLeavePlace, dGoingTo, dDate, dTrunkSpace, dSeatAvailable, dPrice) values('%s', '%s', '%s', '%s', %d, %d)",leavePlace, gointTo, date, trunkSpace, seatAvailable, price);
        System.out.println(insertQuery);    
        dbConnection = new DbConnection();
            int result = dbConnection.manipulate(insertQuery);
            return result;
            

    }
    
    public ResultSet fetchDriverDetails() {
        // ArrayList<Driver> driverList = new ArrayList<Driver>();
        String selectQuery = "select * from driver_table";    
        dbConnection = new DbConnection();
            ResultSet result = dbConnection.retrieve(selectQuery);
            
                
            
            
            return result;

    }
    
    public ResultSet selectQuery(User user){
        String email = user.getuseremail();
        String pass = user.getuserpass();

        String selectLogin = "select * from user where email='"+email+"' and password='"+pass+"'";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectLogin);
        return result;
    

    }

    public int updatestatus(User user){
        String email = user.getuseremail();
        String updatestatus = "update user SET status= '"+"active"+"' where email='"+email+"'";
        dbConnection = new DbConnection();
        int result  = dbConnection.manipulate(updatestatus);
        return result;
    }

    public int changeStatus(User user){
        String changeStatus = "update user set status='"+"inactive"+"' where status='"+"active"+"'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(changeStatus);
        return result;
    }
    
    public ResultSet selectdetails(User user){
        String selectdetails = "select * from user where status='"+"active"+"'";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectdetails);
        return result;
    }

    public int editdetails(User user){
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
        String licencse= user.getuserlicense();
        String expiry = user.getuserexpiry();

        String editquery = "update user set(username,password,first_name,middle_name,last_name,gender,dob,nationality,email,phone,sq,sq_ans,citizen,user_Address,license,expiry)"
        + "values('" + username + "','" + pass + "','" + fname + "','" + mname + "','" + lname + "','" + gender
        + "','" + dob + "','" + nationality + "','" + email + "','" + phone + "','" + sq
        + "','"+sqAnswer+"','"+citizen+"','"+address+"','"+licencse+"','"+expiry+"') where status='"+"active"+"'";

        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(editquery);
        return result;
    }
}
