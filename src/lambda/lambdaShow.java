package lambda;
@FunctionalInterface
interface show {
    void Show();
}
public class lambdaShow {
    public static void main(String[] args) {
        show s1 = ()-> System.out.println("First Show");
        s1.Show();
    }
}
