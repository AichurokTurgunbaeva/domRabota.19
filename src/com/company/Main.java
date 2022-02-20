package com.company;

public class Main {

    public static void main(String[] args) {
     Flat person1 = new Flat("Texas avenue, 5");
     Flat person2 = new Flat("Texas avenue, 5");
     Flat person3 = new Flat("Texas avenue, 5");
     Flat person4 = new Flat("Texas avenue, 5");
     Flat[] flats = {person1, person2, person3, person4};
     int counter = 0;
     for(Flat a: flats) {
         if(a instanceof Flat) {
             flats[counter] = a;
             counter++;
         }
     }
        System.out.println("Address of flat: " +person1.getAddress()+" , "+counter+" people are living here");
        person1.toloyt();

    Dormitory dormitory1 = new Dormitory("Tunguch 25");
    Dormitory dormitory2 = new Dormitory("Tunguch 25");
    Dormitory dormitory3 = new Dormitory("Tunguch 25");
    Dormitory dormitory4 = new Dormitory("Tunguch 25");
    Dormitory dormitory5 = new Dormitory("Tunguch 25");
    Dormitory[] dormitories = {dormitory1, dormitory2, dormitory3, dormitory4, dormitory5};
    int counter2 = 0;
    for(Dormitory d: dormitories) {
        if(d instanceof Dormitory) {
            dormitories[counter2] = d;
            counter2++;
        }
      }
            System.out.println("-----------------------------------------");
            System.out.println("Address of dormitory: " +dormitory1.getAddress()+" , "+counter2+
                    " people are living here");
            dormitory1.toloyt();

    Hotel hotel1 = new Hotel("Kyrgyz ayili");
    Hotel hotel2 = new Hotel("Kyrgyz ayili");
    Hotel[] hotels = {hotel1, hotel2};
    int counter3 = 0;
    for(Hotel h: hotels) {
        if(h instanceof Hotel) {
            hotels[counter3] = h;
            counter3++;

            }
        }
            System.out.println("-----------------------------------------");
            System.out.println("Address of hotel: " +hotel1.getAddress()+" , "+counter3+
                    " people are living here");
            hotel1.toloyt();
    }
}


