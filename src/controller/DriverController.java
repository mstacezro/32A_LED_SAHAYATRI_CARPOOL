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
    
    

    

    

    
    public ResultSet  selectDetails(Driver driver){
        int driverId = driver.getDSN();
        String query = "select * from driver_table where dSN='"+driverId+"'";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(query);
        return result;

    }

    public int editDetails(Driver driver){
        String leavePlace = driver.getDLeavePlace();
        String gointTo = driver.getDGoingTo();
        String date = driver.getDDate();
        String trunkSpace = driver.getDTrunkSpace();
        int seatAvailable = driver.getDSeatAvailable();
        int price = driver.getDPrice();
        int id = driver.getDSN();
        String query = "update driver_table set dLeavePlace='"+leavePlace+"', dGoingTo='"+gointTo+"', dDate='"+date+"', dTrunkSpace='"+trunkSpace+"', dSeatAvailable='"+seatAvailable+"', dPrice='"+price+"' where dSN='"+id+"'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(query);
        return result;
    }
    public int deleteDetails(Driver driver){
        int driverId = driver.getDSN();
        String query  = "delete from driver_table where dSN='"+driverId+"'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(query);
        return result;

    }
}
