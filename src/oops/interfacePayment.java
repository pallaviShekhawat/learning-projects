package oops;


//Interface ek contract hota hai jo batata hai class kya karegi, lekin kaise karegi ye nahi batata. Class ko interface ke sab methods implement karne padte hain.
//It contains method declarations without implementation

interface interfacePayment {
    void pay(double amount);

    default void receipt(){
        System.out.println("Receipt Generated successfully");
    }
    static void termsAndConditions(){
        System.out.println("Payment is subject to bank approval");
    }
}

class upiPayments implements interfacePayment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " +amount + "using UPI");
    }
}
class cardPayment implements interfacePayment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " +amount+ "Using Credit Card");
    }
}

class paymentAbsraction{
    public static void main(String[] args) {
        interfacePayment pmt = new upiPayments();
        pmt.pay(5000);
        pmt.receipt(); //Default Method :  To add new functionality to an interface without breaking existing implementation classes.
        interfacePayment.termsAndConditions(); //Interface ke static methods object/reference se call nahi hote Sirf interface name se call hote hain
    }
}

//Static methods are used for utility or common logic related to the interface and are not overridden by implementing classes.
//Static methods in an interface belong to the interface itself, not to the implementing class or its object, so they must be called using the interface name.