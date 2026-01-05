package lld;

//Singleton Pattern ensures that a class has only one instance and provides a global point of access to it.
//Singleton ek Creational Design Pattern hai jisme poore application me kisi class ka sirf ek hi object (instance) banaya jata hai.
public class singletonLogger {

    // static variable (single instance)

    private static singletonLogger loggerInstance;  //reference declare hua

    // private constructor

    private singletonLogger(){
        System.out.println("Logger Initialized");
    }

    // public static method to get instance


    public static singletonLogger getInstance(){
        if(loggerInstance == null){
            loggerInstance =new singletonLogger();
        }
        return loggerInstance ;
    }
    public void log(String message){
        System.out.println("Log:" + message);
    }

}

class Test {
    public static void main(String[] args) {
        singletonLogger log1 = singletonLogger.getInstance();
        log1.log("Application Started");

        singletonLogger log2 = singletonLogger.getInstance();
        log2.log("USer Logged In");

        System.out.println(log1 ==log2);
    }
}

