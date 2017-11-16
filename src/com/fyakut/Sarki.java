package com.fyakut;

public class Sarki {
    private String sarkiAdi;
    private double sarkisuresi;

    public Sarki(String sarkiAdi, double sarkisuresi) {
        this.sarkiAdi = sarkiAdi;
        this.sarkisuresi = sarkisuresi;
    }

    public String getSarkiAdi() {
        return sarkiAdi;
    }

    @Override
    public String toString() {
        return this.sarkiAdi+":"+this.sarkisuresi;
    }
}
