package com.company;

public class Hotel extends Buildings implements Rentable{


    public Hotel(String address, Person[] flats) {
        super(address, flats);
    }

    @Override
    public void toloyt() {
        System.out.println("They pay for a rent.");
    }
}
