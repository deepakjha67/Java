// Parent Class
class Vehicle {
    public String name;
    public String model;
    public int numberOfTires;
    
    // Parameterized Constructor
    public Vehicle(String name, String model, int numberOfTires) {
        this.name = name;
        this.model = model;
        this.numberOfTires = numberOfTires;
    }

    // Default Constructor
    public Vehicle() {
        this.name = "";
        this.model = "";
        this.numberOfTires = -1;
    }
    
    public void startEngine() {
        System.out.println("Engine is starting for " + name + " " + model);
    }
    
    public void stopEngine() {
        System.out.println("Engine is stopping for " + name + " " + model);
    }
}

// Child Class 1
class Car extends Vehicle {
    public int numberOfDoors;
    public String transmissionType;
    
    public Car(String name, String model, int tires, int doors, String transType) {
        super(name, model, tires); // Calls Vehicle's constructor
        this.numberOfDoors = doors;
        this.transmissionType = transType;
    }
    
    public void startAC() {
        System.out.println("AC Started of " + name);
    }
}

// Child Class 2
class Motorcycle extends Vehicle {
    public String handleBarStyle;
    public String suspensionType;
    
    public Motorcycle(String name, String model, int tires, String handleBar, String suspension) {
        super(name, model, tires);
        this.handleBarStyle = handleBar;
        this.suspensionType = suspension;
    }
    
    public void wheelie() {
        System.out.println(name + " is doing wheelie");
    }
}

// Main Class to Test
public class VehicleMain {
    public static void main(String[] args) {
        // Car object
        Car c = new Car("Maruti", "800", 4, 5, "Automatic");
        c.startEngine();   // Inherited from Vehicle
        c.startAC();       // Own method
        c.stopEngine();    // Inherited from Vehicle
        
        System.out.println("-----");
        
        // Motorcycle object
        Motorcycle m = new Motorcycle("Splendor", "XL", 2, "U-Type", "Soft");
        m.startEngine();   // Inherited from Vehicle
        m.wheelie();       // Own method
        m.stopEngine();    // Inherited from Vehicle
    }
}
