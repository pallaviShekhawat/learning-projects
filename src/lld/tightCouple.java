package lld;

class Engine1 {
    void start(){
        System.out.println("car started");
    }
}
class Car {
    Engine1 eng = new Engine1();
    void startCar(){
        eng.start();
        System.out.println("Engine Started");
    }

}

public class tightCouple {
    public static void main (String[] args){
        Car c1 = new Car ();
        c1.startCar();
    }
}