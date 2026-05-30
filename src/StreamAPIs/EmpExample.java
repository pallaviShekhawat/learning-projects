package StreamAPIs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmpExample {
    int id;
    String name;
    String dept;

    public EmpExample(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }
@Override
public String toString(){return  id+ " " + name + " " + dept;}

}

class EmpTest{
    public static void main(String[] args) {
        List<EmpExample> empList = new ArrayList<>();
        empList.add(new EmpExample(1,"Pallavi","CSE"));
        empList.add(new EmpExample(2,"Lata","EEE"));
        empList.add(new EmpExample(3,"Shekhawat","ECE"));

        empList.stream()
                .forEach(System.out::println);
    }
}




