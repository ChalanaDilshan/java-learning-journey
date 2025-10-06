package Exercise03;

public class Main {
    public static void main(String[] args) {
        System.out.println("---Car---");
        Car car1 = new Car("Toyota",2021,74500,15,5000,false,4);
        car1.rentVehicle();
        car1.calculateFuelEfficiency();
        System.out.println("The rental for 5 days is: "+car1.calculateRentalcost(5));
        car1.returnVehicle();
        System.out.println();

        System.out.println("---Truck---");
        Truck truck1 = new Truck("Deemo",2005,85000,14,2000,false,5000);
        truck1.loadCargo(8);
        truck1.loadCargo(5);
        System.out.println();

        System.out.println("---Motor Cycle---");
        Motorcycle moto1 = new Motorcycle("Hornet",2006, 85000, 8, 15000, false, 600, 8);
        moto1.calculatePremium();
        moto1.simulateRace();


    }
}
