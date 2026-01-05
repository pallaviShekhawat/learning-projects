package lld;

interface PaymentStrategy  {
    public void pay(int amount);
}

class CreditCardPayment implements PaymentStrategy {

    private String cardNumber;
    public CreditCardPayment (String cardNumber)
    {
        this.cardNumber = cardNumber;
    }
    @Override
    public void pay(int amount){
        System.out.println("Paid ₹" +amount+ "Using Credit Card [" + cardNumber + "]");
    }
}


 class UpiPayment implements PaymentStrategy {

    private String upiId ;
    public UpiPayment (String upiId)
    {
        this.upiId = upiId ;
    }
    @Override
    public void pay(int amount){
        System.out.println("Paid " +amount + "Using UPIPayment [" + upiId + "]");
    }
}

class PayPalPayment implements PaymentStrategy {
     private String email;
     public PayPalPayment (String email){
         this.email = email;
     }
     @Override
    public void pay(int amount ) {
         System.out.println("Paid " +amount+ " Using PayPalPayment ["+ email +"]");
     }
}

 class PaymentContext {
    private PaymentStrategy strategy ;
    public void setPaymentStrategy (PaymentStrategy strategy){
        this.strategy = strategy ;
    }

    public void payAmount(int amount) {
        if (strategy == null) {
            System.out.println("Please select payment method");
            return;
        }

        strategy.pay(amount);
    }
}

public class strategyDesignPattern{
    public static void main(String[] args){
        PaymentContext pc = new PaymentContext();
        pc.setPaymentStrategy(new CreditCardPayment("23456789"));
        pc.payAmount(500);
        pc.setPaymentStrategy(new PayPalPayment("user@gmail.com"));
        pc.payAmount(1000);
        pc.setPaymentStrategy(new UpiPayment("pallavi@upi"));
        pc.payAmount(2000);
    }
}