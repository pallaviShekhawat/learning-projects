package StreamAPIs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1Emp {
    int id;
    String name;
    int salary;
    String dept;

    public Stream1Emp(int id, int salary, String name, String dept) {
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.dept = dept;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }
       @Override
    public String toString(){return  id+ " " + name + " " + salary + " " + dept;}
}
     class EmployeeExp {
        public static void main(String[] args) {

            List<Stream1Emp> empList = Arrays.asList(
                    new Stream1Emp(1,100000,"pallavi","CSE"),
                    new Stream1Emp(2,15000,"priyanka","ECE"),
                    new Stream1Emp(3,20000,"palak","EE"),
                    new Stream1Emp(4,40000,"pooja","CE")
            );

            List<Stream1Emp> result = empList.stream()
                    .filter(emp -> emp.getSalary()>20000)
                    .collect(Collectors.toList());

            System.out.println(result);

        }

        }


