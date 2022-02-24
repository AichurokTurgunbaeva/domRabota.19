package com.company;

public interface Payable extends Rentable{
    @Override
    default void toloyt() {
        System.out.println("Pay for public services.");
    }
}
