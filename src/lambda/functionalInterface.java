package lambda;

@FunctionalInterface
interface functional{
    int calc(int a , int b);
}
public class functionalInterface {
    public static void main(String[] args) {
//        without lambda funciton // Annonyous inner class example
//        functional f1 = new functional() {
//            public int calc(int a, int b) {
//                int sum = a + b;
//                return sum;
//            }
//        };

        //With lambda funciton

        functional f1 = (a,b) -> {int sum =a+b; return sum;};
        System.out.println(f1.calc(2,3));
    }
}


