package StreamAPIs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEmployeeExample {
    private int id ;
    private double salary;
    private String name ;
    private String dept ;

    public StreamEmployeeExample(int id ,double salary ,String name , String dept){
        this.id= id;
        this.salary =salary;
        this.name =name;
        this.dept =dept;
    }

    public int getId(){
        return id;
    }
    public double getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public String getDept(){
        return dept;
    }
}

 class StreamExample {
    public static void main(String[] args) {
        List<StreamEmployeeExample> emp = Arrays.asList(
                new StreamEmployeeExample(1,60000,"pallavi","IT"),
                new StreamEmployeeExample(2,30000,"utsav","EC"),
                new StreamEmployeeExample(3,55000,"Akshay","IT"),
                new StreamEmployeeExample(4,45000,"priyanka","IT")
        );

        List<String> names = emp.stream()
                .filter(e -> e.getDept().equals("IT"))
                .filter(e-> e.getSalary()>50000)
                .map(StreamEmployeeExample::getName)
                .collect(Collectors.toList());

        System.out.println(names);
    }

}
