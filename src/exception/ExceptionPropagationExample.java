package exception;

public class ExceptionPropagationExample {
    public static void main(String[] args) {
        try {
            methodA();
        }
        catch (ArithmeticException e ) {
            System.out.println("Exception Handled in main");
        }
    }
    static void methodA(){
        methodB();
    }
    static void methodB(){
        methodC();
    }
    static void methodC(){
        int a = 10/0;
    }
}
