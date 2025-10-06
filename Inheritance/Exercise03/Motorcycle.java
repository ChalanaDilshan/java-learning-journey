package Exercise03;

public class Motorcycle extends Vehicle {
    protected int engineSize;
    protected int numberOfCylinders;

    Motorcycle(String model,int year,int Mileage,double fuelEfficiency,double rentalRate,boolean isRented,int engineSize,int numberOfCylinders){
        super(model,year,Mileage,fuelEfficiency,rentalRate,isRented);
        this.engineSize = engineSize;
        this.numberOfCylinders = numberOfCylinders;
    }

    public void calculatePremium(){
        double premium = engineSize *0.5 +numberOfCylinders * 100;
        System.out.println("Insurance for premium is LKR "+premium);
    }

    public void simulateRace(){
        System.out.println(model+" is racing with high speed.. with engine size "+engineSize);
    }
}
