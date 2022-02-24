package com.company;

public class Dormitory extends Buildings implements Rentable{


    public Dormitory(String address, Person[] flats) {
        super(address, flats);
    }

    @Override
    public void toloyt() {
        System.out.println("They pay for a rent.");
    }
}

