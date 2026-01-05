package lld;

//Factory Design : Factory Design Pattern is a creational design pattern which provides an interface for creating objects, but lets the factory decide which class to instantiate.
//It helps in loose coupling, better maintainability, and follows Open-Closed Principle.

//Factory Pattern object creation pe focus karta hai,
//Strategy Pattern behavior (logic/algorithm) change karne pe.
//Factory = kaunsa object banega
//Strategy = kaunsa logic chalega

interface factoryPayment {
    void pay(int amount);
}

class upiPayment implements factoryPayment {
    @Override
    public void pay(int amount) {
        System.out.println("Paid via UPI: " + amount);
    }
}
class cardPayment implements factoryPayment {
    @Override
    public void pay(int amount) {
        System.out.println("Paid via Card :" + amount);
    }
}

class paymentFactory {
    public static factoryPayment getPayment(String type) {
        if(type.equalsIgnoreCase("UPI")){
            return new upiPayment();
        }else if (type.equalsIgnoreCase("Card")){
            return new cardPayment();
        }

        throw new IllegalArgumentException("Invalid Payment Type");
    }
}

class factoryDemo {
    public static void main(String[] args) {
        factoryPayment fp = paymentFactory.getPayment("UPI");
        fp.pay(500);
        factoryPayment fp1 = paymentFactory.getPayment("Card");
        fp1.pay(1000);
        }
    }

