package oops;

//An abstract class : can have both abstract methods and concrete methods. We cannot create its object directly because it may contain incomplete methods.
// It is mainly used to define common behavior and force subclasses to provide their own implementation.

//Abstraction is used to hide implementation details and shows only essential features to the user.
//abstraction is achieved using abstract classes and interfaces. It helps in loose coupling, security, and easy maintenance.

abstract class abstractionUsingAbstractVehicle {
    abstract void start(); // Abstract method
    void fuel(){  // concrete method (normal method)
        System.out.println("Vehicle needs fuel");
    }
}

class Car extends abstractionUsingAbstractVehicle {
    @Override
    void start() {
        System.out.println("Car need to start");
    }
}

class abstractMethod {
    public static void main(String[] args) {
        abstractionUsingAbstractVehicle abs = new Car();
        abs.start();
        abs.fuel();

    }
}
