package Exercise03;

public class Vehicle {
    protected String model;
    protected int year;
    protected int Mileage;
    protected double fuelEfficiency;
    protected double rentalRate;
    protected boolean isRented;

    Vehicle(String model,int year,int Mileage,double fuelEfficiency,double rentalRate,boolean isRented){
        this.model = model;
        this.year = year;
        this.Mileage = Mileage;
        this.fuelEfficiency = fuelEfficiency;
        this.rentalRate = rentalRate;
        this.isRented = false;
    }

    public void rentVehicle(){
        if(!isRented){
            isRented = true;
            System.out.println(model+ " is rented successfully...!");
        }else{
        System.out.println(model+ "is already rented");
        }

    }

    public void returnVehicle() {
        if (isRented) {
            isRented = false;
            System.out.println(model + " has been returned.");
        } else {
            System.out.println(model + " was not rented.");
        }
    }

    public double calculateRentalcost(int days){
        return rentalRate * days;
    }

    public int getMileage(){
        return Mileage;
    }

    public void setMileage(int  Mileage){
        this.Mileage = Mileage;
    }
}


