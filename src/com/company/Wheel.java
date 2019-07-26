package com.company;

public class Wheel {
    private int size;
    private String companyName;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    public Wheel(int size, String companyName){
        this.size = size;
        this.companyName = companyName;

    }


}
