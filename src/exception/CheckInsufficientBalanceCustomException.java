package exception;

public class CheckInsufficientBalanceCustomException extends Exception{
    public CheckInsufficientBalanceCustomException(String message){
        super(message);
    }
}
 class BankService {
    public static void main(String[] args) {
        try {
            withDraw(5000,7000);
        }
        catch (CheckInsufficientBalanceCustomException e){
            System.out.println(e.getMessage());
        }
    }
    static void withDraw(int balance , int amount ) throws CheckInsufficientBalanceCustomException {
        if(amount>balance)
        {
            throw new CheckInsufficientBalanceCustomException("Insufficent balance: " +balance);
        }
        System.out.println("Withdraw successful ");
    }
}
