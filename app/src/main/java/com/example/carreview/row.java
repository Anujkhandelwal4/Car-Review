package com.example.carreview;

public class row {

    String pic;
    String carname;
    String prname;
    String owTel;

    public row(String pic ,String carname, String prname, String owTel) {

        this.pic = pic;
        this.carname = carname;
        this.prname = prname;
        this.owTel = owTel;
    }


    public String getOwTel() {
        return owTel;
    }

    public void setOwTel(String owTel) {
        this.owTel = owTel;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public String getPrname() {
        return prname;
    }

    public void setPrname(String prname) {
        this.prname = prname;
    }
}
