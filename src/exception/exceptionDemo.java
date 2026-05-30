package exception;

public class exceptionDemo {
    public static void main(String[] args) {
        try {
            int a = 10/0;
        } catch(ArithmeticException e){
            System.out.println("Zero se divide nahi kar sakte");
        }
        System.out.println("Program nornal chal rha h");
    }
}
