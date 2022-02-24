package com.company;

public class Main {

    public static void main(String[] args) {
     Person mom = new Person("Aichurok");
     Person dad = new Person("Ulukbek");
     Person daughter = new Person("Mariam");
     Person daughter2 = new Person("Fatima");
     Person[] family1 = {mom, dad, daughter, daughter2};

        Flat flat = new Flat("North American,56", family1);
        System.out.println(flat);
        flat.toloyt();

     Person mommy = new Person("Gulzina");
     Person son = new Person("Ibragim");
     Person[] family2 = {mommy, son};

        Hotel hotel = new Hotel("Ottawa,12", family2);
        System.out.println(hotel);
        hotel.toloyt();


     Person mother = new Person("Nuriza");
     Person daddy = new Person("Sanzhar");
     Person daughter3 = new Person("Aliya");
     Person son1 = new Person("Emir");
     Person[] family3 = {mother, daddy, daughter3, son1};

        Dormitory dormitory = new Dormitory("Hawaii", family3);
        System.out.println(dormitory);
        dormitory.toloyt();

    }
}


