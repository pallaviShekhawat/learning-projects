package lld;

//Enum Singleton is the best and safest approach in Java because JVM guarantees thread safety, serialization safety, and prevents reflection attacks. However, Enum does not support lazy initialization. When lazy initialization is mandatory, Double-Checked Locking with a volatile instance is the best option as it provides thread safety with minimal synchronization overhead.
//serialization safety : Object ko byte stream me convert karna (file / network / DB me store karna)
// prevents reflection attacks : Java Reflection ek feature hai jisse hum:
//1 .Runtime par class ka structure dekh sakte hain
//2 . private members (constructor, method, field) ko bhi access kar sakte hain ,Jo cheez normally allowed nahi hoti, reflection se forcefully call kar sakte hain.


public enum enumSingleton {
    INSTANCE ;

    enumSingleton(){
        System.out.println("Singleton Created");
    }

    public void showMessage (){
        System.out.println("Using Enum Singleton ");
    }
}
class testEnum {
    public static void main(String[] args) {
        enumSingleton s1 =enumSingleton.INSTANCE;
        s1.showMessage();

        enumSingleton s2 = enumSingleton.INSTANCE;
        s2.showMessage();

        System.out.println(s1==s2);
    }
}

