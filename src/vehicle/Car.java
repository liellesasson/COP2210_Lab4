package vehicle;

import java.util.Random;
public class Car {
    private static int vehicleCounter = 2000;
    private final static String CAR_FACTORY_ID = "Norwood";
    private String carID;
    private String color;
    private String factory;
    private int numberOfDoors;
    private double price;
    private int mileage;
    public String doYouLikeIt;

    public Car(){
        carID = "VIN-" + CAR_FACTORY_ID +"-" +vehicleCounter;
        numberOfDoors = 2;
        vehicleCounter++;
        color = "Red";
        mileage = 0;
        factory = CAR_FACTORY_ID;
        doYouLikeIt ="yes";
        Random randgen = new Random();
        price = randgen.nextInt(45000 - 35000 + 1) + 35000;

    }
    public Car(String color, int numberOfDoors){
        this();
        this.color = color;
        this.numberOfDoors = numberOfDoors;

    }

    public Car(String color, int numberOfDoors, double price, int mileage){
        this(color, numberOfDoors);
        this.price = price;
        this.mileage = mileage;

    }
   public static int getVehicleCounter(){
        return vehicleCounter;
    }

    public String getCarID (){
        return carID;
    }

    public String getColor (){
        return color;
    }

    public void setColor (String color){
        this.color = color;
    }

    public String getFactory (){
        return factory;
    }

    public int getNumberOfDoors (){
        return numberOfDoors;
    }

    public void setNumberOfDoors (int numberOfDoors){
        this.numberOfDoors = numberOfDoors;
    }

    public double getPrice(){
        return price;
    }





    public void displayInfo(){

        System.out.println();
        System.out.println("=========================");
        System.out.println("Car Info");
        System.out.println("==========================");
        System.out.println("CarID:\t\t\t\t\t" + carID);
        System.out.println("Factory:\t\t\t\t" + factory);
        System.out.println("Number of Doors: \t\t" + numberOfDoors);
        System.out.println("Color:\t\t\t\t\t"  + color);
        System.out.println("Mileage:\t\t\t\t" + mileage);
        System.out.printf("Price:\t\t\t\t\t$%.2f", price);
        System.out.println("\nDo you like it:\t\t\t" +doYouLikeIt);

    }

    public static void classDisplayInfo(){
        System.out.println();
        System.out.println("=========================");
        System.out.println("Car Class Info");
        System.out.println("=========================");
        System.out.println("vehicleCounter:\t\t\t" + vehicleCounter);
        System.out.println("CAR_FACTORY_ID:\t\t\t" + CAR_FACTORY_ID);

    }






}// end of class
