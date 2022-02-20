package com.company;

public class Hotel extends Buildings implements Rentable{

    public Hotel(String address) {
        super(address);
    }

    @Override
    public void toloyt() {
        System.out.println("They pay for a rent.");
    }
}
