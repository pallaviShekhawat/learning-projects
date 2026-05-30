package StreamAPIs;

import java.util.ArrayList;
import java.util.List;

public class SteamUseCaseWithOrWithout {
    int id ;
    int salary;
    String name;

    public SteamUseCaseWithOrWithout(int id , int salary,String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    @Override
    public String toString()
    {
        return id + " " +salary+ " " +name;
    }
}
 class TestCase{
    public static void main(String[] args) {
        List<SteamUseCaseWithOrWithout> empLst = new ArrayList<>();
        empLst.add(new SteamUseCaseWithOrWithout(1,10000,"sonu"));
        empLst.add(new SteamUseCaseWithOrWithout(2,20000,"monu"));
        empLst.add(new SteamUseCaseWithOrWithout(4,30000,"ronu"));


//        Without Stream
  /*for(SteamUseCaseWithOrWithout e : empLst)
      {
        if(e.salary < 20000){
             System.out.println(e);
        }
    }*/
        //with Stream

        empLst.stream()
                .filter(e -> e.salary>20000)
                .map(e-> e.name)
                .forEach(System.out::println);


    }
}
