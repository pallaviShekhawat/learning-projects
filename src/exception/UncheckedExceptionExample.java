package exception;

import java.sql.SQLOutput;

public class UncheckedExceptionExample {
    public static void main(String[] args) {
        try {
            //Arthimatc Exception
            int b = 20/0 ;

            //Null pointer exception
            String s = null ;
            System.out.println(s.length());

            // Arrayindetout of bound excepption
            int[] arr = {10,5,15};
            System.out.println(arr[5]);

            //Illegal argument exception
            setAge(-5);

        } catch (NullPointerException |ArithmeticException |ArrayIndexOutOfBoundsException |IllegalArgumentException e){
            System.out.println("Exception Caught " + e);
        }
        finally {
            System.out.println("Finally block is always executed");
        }
    }

    public static void setAge(int age){
        if (age <0){
            throw new IllegalArgumentException("Age can not be negative");
        }
        System.out.println("Age set to: " +age);
    }
}

