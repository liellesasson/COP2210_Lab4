package app;


import vehicle.Car;

import java.sql.SQLOutput;

public class Controller {

//------------------------------------------------
// beginning of main(String[] args)) method

    public static void main(String[] args) {

      yourInfoHeader();

      Car c1 = new Car();
      c1.displayInfo();
      Car.classDisplayInfo();

      Car c2 = new Car("White", 4);
      c2.displayInfo();

      Car c3 = new Car("Black", 2);
        c3.displayInfo();


        Car c4 = new Car("Blue", 4, 38500, 10432);
        c4.displayInfo();

        System.out.println();
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println("Working with instance method");
        System.out.println("-------------------------------");

        c4.setColor("Green");
        c4.setNumberOfDoors(2);
        c4.displayInfo();

        System.out.println();
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("working with public instance variable");
        System.out.println("-----------------------------------------");
        System.out.println();

        c2.displayInfo();
        c2.doYouLikeIt="No";
        c2.displayInfo();

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println("working with build-in string method");
        System.out.println("---------------------------------------");
        System.out.println();

        System.out.printf("Color of instance c1:\t\t\t\t\t\t\t\t\t%s\n", c1.getColor());
        System.out.printf("Length of Color of instance c1:\t\t\t\t\t%s\n", c1.getColor().length());
        System.out.println();

        System.out.printf("CarID of instance c2:\t\t\t\t\t\t\t\t\t%s", c2.getCarID());
        System.out.println("\nIndex of 'd' of c2's CarID:\t\t\t\t\t\t\t\t" + c2.getCarID().indexOf('d'));
        System.out.println();

        System.out.printf("CarID of instance c2:\t\t\t\t\t\t\t\t\t%s", c2.getCarID());
        System.out.println("\nIndex of the first 'o' of c2's CarID:\t\t\t" + c2.getCarID().indexOf('o',1));
        System.out.println();

        System.out.printf("CarID of instance c2:\t\t\t\t\t\t\t\t\t%s", c2.getCarID());
        System.out.println("\nIndex of the second 'o' of c2's CarID:\t\t\t" + c2.getCarID().indexOf('o', 6));

    }

//-------------------------------------------------------------
// beginning of yourInfoHeader() method

    public static void yourInfoHeader() {

        System.out.println("===============================================");
        System.out.println("PROGRAMMER: " + "Lielle Sasson");
        System.out.println("PANTHER ID: " + "6304972");
        System.out.println();
        System.out.println("CLASS: \t\t COP2210 ");
        System.out.println("SECTION: \t " + "UO1");
        System.out.println("SEMESTER: \t " + "Spring 2022");
        System.out.println("CLASSTIME: \t " + "T/TH 9:30-12:15");
        System.out.println();
        System.out.println("Assignment: " + "Lab4");
        System.out.println();
        System.out.println("CERTIFICATION: \nI understand FIU's academic policies, and I certify");
        System.out.println("that this work is my own and that none of it is the");
        System.out.println("work of any other person.");
        System.out.println("===============================================");
        System.out.println();

    }//end yourInfoHeader



}//end Controller
