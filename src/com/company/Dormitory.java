package com.company;

public class Dormitory extends Buildings implements Rentable{

    public Dormitory(String address) {
        super( address);
    }

    @Override
    public void toloyt() {
        System.out.println("They pay for a rent.");
    }
}

