package oops;

//This type of polymorphism is resolved dynamically at runtime, based on the actual object instance rather than the reference variable's type. It relies on inheritance and is achieved through Method Overriding
//Occurs when a subclass provides a specific implementation of a method that is already defined in its superclass, with the exact same method signature (name, parameters, and return type)
//Child class, parent class ke method ka same signature ke saath new implementation deti hai.
//➡ Decision runtime pe hota hai (Dynamic Method Dispatch).
//“Dynamic Method Dispatch is a runtime mechanism in Java where the JVM determines which overridden method to invoke based on the actual object type not the reference type, enabling runtime polymorphism.”
//Kaunsa method call hoga ye decide based on actual object ye karta h

public class runtimeAnimal {
     void sound()
    {
        System.out.println("Animal sound");
    }
}

class Dog extends runtimeAnimal {
    @Override
    void sound()
    {
        System.out.println("Dog sound");
    }
}

class Cat extends runtimeAnimal{
    @Override
    void sound()
    {
        System.out.println("Cat Sound");
    }
}

class methodOverriding {
    public static void main(String[] args) {
        runtimeAnimal ra = new Dog();
        ra.sound();

        ra = new Cat();
        ra.sound();
    }
}
