package com.example.goc.Entity;

public class Request{

    private String adi;
    private String soyadi;
    private String email;
    private String bankName;
    private String bankIban;


    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankIban() {
        return bankIban;
    }

    public void setBankIban(String bankIban) {
        this.bankIban = bankIban;
    }

    // toString metodu
    @Override
    public String toString() {
        return "RequestData{" +
                "adi='" + adi + '\'' +
                ", soyadi='" + soyadi + '\'' +
                ", email='" + email + '\'' +
                ", bankName='" + bankName + '\'' +
                ", bankIban='" + bankIban + '\'' +
                '}';
    }
}
