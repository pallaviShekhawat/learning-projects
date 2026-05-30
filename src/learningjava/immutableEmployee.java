package learningjava;

import java.util.Date;

public class immutableEmployee {
    private final int id;
    private final String name;
    private final Date joiningDate; //mutable field

    public immutableEmployee(int id ,String name ,Date joiningDate) {
        this.id =id ;
        this.name =name;

        // Defensive copy
        this.joiningDate = new Date(joiningDate.getTime());
    }

    //Getter methods only (NO setters)
    public int getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public Date getJoiningDate(){
        // Defensive copy again
        return new Date(joiningDate.getTime());
    }
}

class employeeImmutableString {
    public static void main(String[] args) {
        Date date = new Date();
        immutableEmployee emp = new immutableEmployee(101,"Pallavi",date);

        // Trying to modify original Date object
        date.setTime(0);

        System.out.println(emp.getId());
        System.out.println(emp.getName());
        System.out.println(emp.getJoiningDate());

        //Try to modify using getter
        emp.getJoiningDate().setTime(0);

        System.out.println(emp.getJoiningDate()); ////still unchanged
    }
}
