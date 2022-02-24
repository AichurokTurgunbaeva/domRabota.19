package com.company;

import java.util.Arrays;

public abstract class Buildings {
    private String address;
    private Person[] flats;


    public Buildings(String address, Person[] flats) {
        this.address = address;
        this.flats = flats;
    }


    @Override
    public String toString() {
        return "Buildings{" +
                "address='" + address + '\'' +
                ", people=" + flats.length +
                '}';
    }
}

