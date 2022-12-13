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
        String insertQuery = String.format(
                "insert into driver_table(dLeavePlace, dGoingTo, dDate, dTrunkSpace, dSeatAvailable, dPrice) values('%s', '%s', '%s', '%s', %d, %d)",
                leavePlace, gointTo, date, trunkSpace, seatAvailable, price);
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

    public ResultSet selectDetails(Driver driver) {
        int driverId = driver.getDSN();
        String query = "select * from driver_table where dSN='" + driverId + "'";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(query);
        return result;

    }

    public int editDetails(Driver driver) {
        String leavePlace = driver.getDLeavePlace();
        String gointTo = driver.getDGoingTo();
        String date = driver.getDDate();
        String trunkSpace = driver.getDTrunkSpace();
        int seatAvailable = driver.getDSeatAvailable();
        int price = driver.getDPrice();
        int id = driver.getDSN();
        String query = "update driver_table set dLeavePlace='" + leavePlace + "', dGoingTo='" + gointTo + "', dDate='"
                + date + "', dTrunkSpace='" + trunkSpace + "', dSeatAvailable='" + seatAvailable + "', dPrice='" + price
                + "' where dSN='" + id + "'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(query);
        return result;
    }

    public int deleteDetails(Driver driver) {
        int driverId = driver.getDSN();
        String query = "delete from driver_table where dSN='" + driverId + "'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(query);
        return result;

    }

    public ResultSet searchDetails(Driver driver) {

        String goingTo = driver.getDGoingTo();
        String leavePlace = driver.getDLeavePlace();
        String date = driver.getDDate();
        String selectQuery = "select * from driver_table where  dLeavePlace='" + leavePlace + "' and dGoingTo='"
                + goingTo + "'and  dDate='" + date + "'";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);

        return result;
        // return result;

    }

    public int Request(Driver driver) {
        String email = driver.getEmail();
        int id = driver.getDSN();
        String query = "update driver_table set email='" + email + "' where dSN='" + id + "'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(query);
        return result;
    }

    public ResultSet showBook() {
        String query = "select driver_table.dSN,driver_table.dLeavePlace,driver_table.dGoingTo,user_table.username,user_table.phone,driver_table.booking from driver_table join user_table on driver_table.email=user_table.email ";
        dbConnection = new DbConnection();
        ResultSet result= dbConnection.retrieve(query);
        return result;
    }

    public int Accept(Driver driver){
        int id = driver.getDSN();
        String query = "update driver_table set booking='"+"Yes"+"' where dSN='"+id+"'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(query);
        return result;
    }
    public int Decline(Driver driver){
        int id = driver.getDSN();
        String query = "update driver_table set booking='"+"No"+"' where dSN='"+id+"'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(query);
        return result;
    }

}
