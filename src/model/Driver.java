/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.print.DocFlavor.STRING;

/**
 *
 * @author Legion
 */
public class Driver {
    private int dSN;
    private String dLeavePlace;
    private String dGoingTo;
    private String dDate;
    private String dTrunkSpace;
    private int dSeatAvailable;
    private int dPrice;
    private String email;

    public int getDSN() {
        return this.dSN;
    }

    public void setDSN(int dSN) {
        this.dSN = dSN;
    }

    public String getDLeavePlace() {
        return this.dLeavePlace;
    }

    public void setDLeavePlace(String dLeavePlace) {
        this.dLeavePlace = dLeavePlace;
    }

    public String getDGoingTo() {
        return this.dGoingTo;
    }

    public void setDGoingTo(String dGoingTo) {
        this.dGoingTo = dGoingTo;
    }

    public String getDDate() {
        return this.dDate;
    }

    public void setDDate(String dDate) {
        this.dDate = dDate;
    }

    public String getDTrunkSpace() {
        return this.dTrunkSpace;
    }

    public void setDTrunkSpace(String dTrunkSpace) {
        this.dTrunkSpace = dTrunkSpace;
    }

    public int getDSeatAvailable() {
        return this.dSeatAvailable;
    }

    public void setDSeatAvailable(int dSeatAvailable) {
        this.dSeatAvailable = dSeatAvailable;
    }

    public int getDPrice() {
        return this.dPrice;
    }

    public void setDPrice(int dPrice) {
        this.dPrice = dPrice;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Driver(int dSN, String dLeavePlace, String dGoingTo, String dDate, String dTrunkSpace, int dSeatAvailable, int dPrice, String email) {
        this.dSN = dSN;
        this.dLeavePlace = dLeavePlace;
        this.dGoingTo = dGoingTo;
        this.dDate = dDate;
        this.dTrunkSpace = dTrunkSpace;
        this.dSeatAvailable = dSeatAvailable;
        this.dPrice = dPrice;
        this.email = email;
    }

}