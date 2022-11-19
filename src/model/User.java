/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lenovo
 */
public class User {
    private String user_username;
    private String user_pass;
    private String user_repass;
    private String user_fname;
    private String user_mname;
    private String user_lname;
    private String user_gender;
    private String user_dob;
    private String user_nationality;
    private String user_address;
    private String user_email;
    private String user_phone;
    private String user_sq;
    private String user_sqanswer;
    private String user_citizen;
    private String user_license;
    private String user_expiry;

    public User(String user_username,
    String user_pass,
    String user_repass,
    String user_fname,
    String user_mname,
    String user_lname,
    String user_gender,
    String user_dob,
    String user_nationality,
    String user_address,
    String user_email,
    String user_phone,
    String user_sq,
    String user_sqanswer,
    String user_citizen,
    String user_license,
    String user_expiry){
        this.user_username = user_username;
        this.user_pass = user_pass;
        this.user_repass = user_repass;
        this.user_fname = user_fname;
        this.user_mname = user_mname;
        this.user_lname = user_lname;
        this.user_gender = user_gender;
        this.user_dob = user_dob;
        this.user_nationality = user_nationality;
        this.user_address = user_address;
        this.user_email = user_email;
        this.user_phone = user_phone;
        this.user_sq = user_sq;
        this.user_sqanswer = user_sqanswer;
        this.user_citizen = user_citizen;
        this.user_license = user_license;
        this.user_expiry = user_expiry;

    }

    

    public void setUsername(String newUsername){
        this.user_username = newUsername;
    }

    public String getUsername(){
        return this.user_username;
    }

    public void setUserpass(String newUserpass){
        this.user_pass = newUserpass;
    }

    public String getuserpass(){
        return this.user_pass;
    }
    public void setUserrepass(String newUserrepass){
         this.user_repass = newUserrepass;
    }
    public String getuserrepass(){
        return this.user_repass;
    } 
    public void setUserfname(String newUserfname){
        this.user_fname = newUserfname;
    }
    public String getuserfname(){
        return this.user_fname;
    }
    public void setUsermname(String newUsermname){
        this.user_mname = newUsermname;
    }
    public String getusermname(){
        return this.user_mname;

        
    }
    public void setUserlname(String newUserlname){
        this.user_lname = newUserlname;
    }
    public String getuserlname(){
        return this.user_lname;
    }
    public void setUsergender(String newUsergender){
        this.user_gender = newUsergender;
    }
    public String getusergender(){
        return this.user_gender;
    
    }
    public void setUserdob(String newUserdob){
        this.user_dob = newUserdob;
    }
    public String getuserdob(){
        return this.user_dob;
    
    }
    public void setUsernationality(String newUsernationality){
        this.user_nationality = newUsernationality;
    }
    public String getusernationality(){
        return this.user_nationality;
    
    }
    public void setUseraddress(String newUseraddress){
        this.user_address = newUseraddress;
    }
    public String getuseraddress(){
        return this.user_address;
    
    }
    public void setUseremail(String newUseremail){
        this.user_email = newUseremail;
    }
    public String getuseremail(){
        return this.user_email;
    
    }
    public void setUserphone(String newUserphone){
        this.user_phone = newUserphone;
    }
    public String getuserphone(){
        return this.user_phone;
    
    }
    public void setUsersq(String newUsersq){
        this.user_sq = newUsersq;
    }
    public String getusersq(){
        return this.user_sq;
    
    }
    public void setUsersqanswer(String newUsersqanswer){
        this.user_sqanswer = newUsersqanswer;
    }
    public String getusersqanswer(){
        return this.user_sqanswer;
    
    }
    public void setUsercitizen(String newUsercitizen){
        this.user_citizen = newUsercitizen;
    }
    public String getusercitizen(){
        return this.user_citizen;
    
    }
    public void setUserlicense(String newUserlicense){
        this.user_license = newUserlicense;
    }
    public String getuserlicense(){
        return this.user_license;
    
    }
    public void setUserexpiry(String newUserexpiry){
        this.user_expiry = newUserexpiry;
    }
    public String getuserexpiry(){
        return this.user_expiry;
    
    }
}
       
    
        
    



