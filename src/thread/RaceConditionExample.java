package thread;

public class RaceConditionExample {
    int count = 0;
    synchronized void increment(){
        count++;
    }
}

class RaceDemo {
    public static void main(String[] args) throws Exception {
         RaceConditionExample rac = new RaceConditionExample();
         Thread t1 = new Thread(()->{for (int i = 0;i<1000;i++ )
         {
             rac.increment();
         }
         });

         Thread t2 = new Thread(()->{for(int i= 0 ;i<1000;i++)
         {
             rac.increment();
         }
         });

         t1.start();
         t2.start();

         t1.join();
         t2.join();

        System.out.println("Final Count :" +rac.count);
    }
}
