package com.company;

public class Flat extends Buildings implements Payable{

    public Flat(String address) {
        super(address);
    }

    @Override
    public void toloyt() {
        System.out.println("They pay for public services.");
    }
}
