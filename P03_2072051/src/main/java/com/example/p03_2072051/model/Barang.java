package com.example.p03_2072051.model;

public class Barang {
    private int ID;
    private String Nama;
    private String Supplier;

    public Barang(int id, String nama, String supplier) {
        ID = id;
        Nama = nama;
        Supplier = supplier;
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

    public String getSupplier() {
        return Supplier;
    }

    public void setSupplier(String supplier) {
        Supplier = supplier;
    }
}
