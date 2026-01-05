package lld;

//DCL ensures thread safety with minimal synchronization overhead in high-concurrency systems.
//Singleton creation actually 3 steps me hota hai:
//1. Memory allocate
//2. Object initialize (constructor)
//3. Reference assign

public class doubleCheckSingleton {
    //volatile is must : prevent reordering volatile is required to prevent instruction reordering and to ensure visibility of the fully constructed Singleton instance across threads.
    //4️⃣ volatile → prevents half-created object

    private static volatile doubleCheckSingleton dclInstance ;

    private doubleCheckSingleton (){}
    public static doubleCheckSingleton getInstance(){
        if(dclInstance == null){ // First check (no lock)
            synchronized (doubleCheckSingleton.class){ //Lock
                if(dclInstance ==null) //Second check (with lock) ensures single object
                {
                    dclInstance = new doubleCheckSingleton();
                }
            }
        }
            return dclInstance ;
    }
    public void showMessage (){
        System.out.println("Using Singleton Instance");
    }
}

class testDCL{
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            doubleCheckSingleton dcl1 = doubleCheckSingleton.getInstance();
            System.out.println("Thread-1 : " +dcl1.hashCode());
        });

        Thread t2 = new Thread(() -> {
            doubleCheckSingleton dcl2 = doubleCheckSingleton.getInstance();
            System.out.println("Thread - 2: " +dcl2.hashCode());
        });

        t1.start();
        t2.start();
    }
}

