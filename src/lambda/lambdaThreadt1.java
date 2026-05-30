package lambda;
class MyThread extends Thread {}
public class lambdaThreadt1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> System.out.println(Thread.currentThread().getName()+"running......"));
        t1.start();
    }
}

// without lambda expression we need to override run method

/*class MyThread extends Thread {}
*//*
class lambdaThreadt1{
    public static void main(String[] args){
    Thread t1 = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+"Running Thread");
        }
    });
      t1.start();

    }
}*/
