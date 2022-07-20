package com.example.p03_2072051.model;

public class Supplier {
    private int ID;
    private String Nama;
    private String Alamat;

    public Supplier(int id, String nama, String alamat) {
        ID = id;
        Nama = nama;
        Alamat = alamat;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String alamat) {
        Alamat = alamat;
    }
}
