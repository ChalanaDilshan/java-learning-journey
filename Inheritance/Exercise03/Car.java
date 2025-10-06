package Exercise03;

public class Car extends Vehicle {
    int numberOFDoors;

    Car(String model,int year,int Mileage,double fuelEfficiency,double rentalRate,boolean isRented,int numberOFDoors){
        super(model,year,Mileage,fuelEfficiency,rentalRate,isRented);
        this.numberOFDoors = numberOFDoors;
    }

    public void calculateFuelEfficiency(){
        System.out.println("Fuel efficiency is: "+fuelEfficiency+" Per Litre!");
    }
}
