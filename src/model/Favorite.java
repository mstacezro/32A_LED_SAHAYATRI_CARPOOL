package model;

public class Favorite {
    private String driverEmail;
    private String email;
    private int fav_id;
    public String getDriverEmail() {
        return driverEmail;
    }
    public void setDriverEmail(String driverEmail) {
        this.driverEmail = driverEmail;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getFav_id() {
        return fav_id;
    }
    public void setFav_id(int fav_id) {
        this.fav_id = fav_id;
    }
    public Favorite(String driverEmail, String email, int fav_id) {
        this.driverEmail = driverEmail;
        this.email = email;
        this.fav_id = fav_id;
    }
}
