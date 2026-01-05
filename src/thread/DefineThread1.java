package thread;

class MyRunnable implements Runnable {
    public void run (){
        System.out.println("By implementing runnable interface");
    }
}

public class DefineThread1 {
    public static void main(String[] args){
        MyRunnable obj = new MyRunnable();
        Thread t1 = new Thread(obj);
        t1.start();
    }
}
