package com.company;

public class Flat extends Buildings implements Payable{


    public Flat(String address, Person[] flats) {
        super(address, flats);
    }

    @Override
    public void toloyt() {
        System.out.println("They pay for public services.");
    }
}
