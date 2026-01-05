package lld;

interface Engine {
    void start();
}

class DieselEngine implements Engine {
    public void start(){
        System.out.println("diesel engine started");
    }
}

class ElectricEngine implements Engine {
    public void start () {
        System.out.println("Electric engine started") ;
    }
}

class Car1 {
    private Engine engine ;
    public Car1(Engine engine){
        this.engine = engine;
    }

    void startCar(){
        engine.start();
        System.out.println("Car Started");
    }
}

public class LooseCouple {
    public static void main(String[] args) {
        Engine eng = new ElectricEngine();
        Car1 car1 = new Car1(eng);
        car1.startCar();
    }
}




