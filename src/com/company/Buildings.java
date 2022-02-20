package com.company;

import java.util.Arrays;

public class Buildings implements Payable {
    private String address;

    public Buildings(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void toloyt() {

    }
}


