package model;

public class Kolo {
    public Kolo(Integer r) { //konstruktor jednoparametrowy wymusz dodanie parametru
        this.r = r;
    }

    private Integer r;

    public Integer getR() {
        return r;
    }

    public void setR(Integer r) {
        this.r = r;
    }

    public double obliczObwod(){
        return 2*Math.PI*r;
    }

}
