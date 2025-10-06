package Exercise03;

public class Truck extends Vehicle {
    double cargoCapacity;
    int payload;

    Truck(String model,int year,int Mileage,double fuelEfficiency,double rentalRate,boolean isRented,double cargoCapacity){
        super(model,year,Mileage,fuelEfficiency,rentalRate,isRented);
        this.cargoCapacity = cargoCapacity;
        this.payload = 0;
    }

    public void loadCargo(int weight){
        this.payload = payload + weight;
        System.out.println("Loaded "+weight+" tons.Current payload "+payload+" tons");
        checkOverload();
    }

    public void checkOverload(){
        if (payload > cargoCapacity){
            System.out.println("Truck is overloaded...!");
        }else{
            System.out.println("Truck is within Capacity");
        }
    }
}
