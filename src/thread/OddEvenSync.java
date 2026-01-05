package thread;

class PrintNumbers{
    int number = 1;
    int MAX = 100;

public synchronized void printOdd()
{
    while(number<=MAX){
        while(number % 2 == 0){
            try {
                wait();
            } catch (InterruptedException e ) {
                e.printStackTrace();
            }
        } if(number <=MAX) {
            System.out.println("Odd =" +number);
            number ++;
            notify();
        }
    }
}

public synchronized void printEven(){
    while(number <= MAX) {
        while(number % 2 == 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } if (number<= MAX) {
            System.out.println("Even " + number);
            number++;
            notify();
        }

    }
}
}

public class OddEvenSync {
    public static void main (String[] args){

        PrintNumbers pn = new PrintNumbers();
        Thread t1 = new Thread(()->pn.printOdd());
        Thread t2= new Thread(()->pn.printEven());

        t1.start();
        t2.start();
    }
}

