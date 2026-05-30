package exception;

import java.io.IOException;

public class CheckedExceptionPropagation {
    public static void main(String[] args) {
        try{
            methodA();
        }
        catch (IOException e)
        {
            System.out.println("Exception Handled in Main");
        }
    }
    static void methodA() throws IOException {
        methodB();
    }
    static void methodB() throws IOException {
        methodC();
    }
    static void methodC() throws IOException {
        throw new IOException("File not found");
    }
}
