package lld;

//Decorator Structural Design Pattern hai.
//Run-time par object ke behavior ko dynamically extend karne ke liye use hota hai
//Inheritance ke bina new functionality add karta hai
//Matlab:Class ko modify kiye bina, object ke upar “extra features” chipka dete hain.







// Component Interface
public interface decoratorCoffee {
     String getDiscription();
     int getCost();
}

//2️⃣ Concrete Component (Base Coffee) 👉 Ye basic object hai jiske upar decorators lagenge.

class simpleCoffee implements decoratorCoffee{
    @Override
    public String getDiscription(){
        return "Simple Coffee";
    }

    @Override
    public int getCost(){
        return 50;
    }
}

//Decorator Abstract Class Ye wrapper class hai ,Coffee ko wrap kar raha hai

abstract class CoffeeDecorator implements decoratorCoffee{
    protected decoratorCoffee coffee ;

    public CoffeeDecorator (decoratorCoffee coffee){
        this.coffee = coffee;
    }
}

//4️⃣ Concrete Decorator – Milk

class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(decoratorCoffee coffee){
        super(coffee);
    }
    @Override
    public String getDiscription(){
        return coffee.getDiscription() + ", Milk";
    }
    @Override
    public int getCost(){
        return coffee.getCost() + 20;
     }
}

//4️⃣ Concrete Decorator – Sugar

 class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(decoratorCoffee coffee){
        super(coffee);
    }
    @Override
    public String getDiscription(){
        return coffee.getDiscription() + ", Sugar";
    }
    @Override
    public int getCost(){
        return coffee.getCost() + 50;
    }
}

class DecoratorTest {
    public static void main(String[] args) {
        decoratorCoffee coffee =new simpleCoffee();
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);

        System.out.println(coffee.getDiscription());
        System.out.println("Total Cost: " + coffee.getCost());
    }
}