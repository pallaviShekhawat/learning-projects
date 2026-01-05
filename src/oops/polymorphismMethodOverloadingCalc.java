package oops;

//Compile time polymorphism
//This type of polymorphism is resolved at compile time, meaning the compiler determines which method to call based on the method's signature (name, number, and type of parameters)
//It is primarily achieved through Method Overloading

public class polymorphismMethodOverloadingCalc {
    int add(int a , int b)
    {
        return a+b;
    }

    int add(int a,int b,int c)
    {
        return a+b+c;
    }
    double add(double a , double b )
    {
        return a+b;
    }
}
class methodOverloading {
    public static void main(String[] args) {
        polymorphismMethodOverloadingCalc pc = new polymorphismMethodOverloadingCalc();
        System.out.println(pc.add(2,3));
        System.out.println(pc.add(2,4,6));
        System.out.println(pc.add(2.5,4.5));
    }
}
