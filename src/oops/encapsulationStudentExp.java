package oops;

//Encapsulaiton :  Encapsulation is the process of wrapping data and methods together into a sigle unit and restricting direct access to data using access modifiers.

public class encapsulationStudentExp {

    private int marks ;  // private for direct access band and do not enter any wrong value

    public void setMarks(int m){
        if(m>= 0 && m <= 100){
            marks=m;
        }
    }
    public int getMarks(){
        return marks;
    }
}

class testStudent {
    public static void main(String[] args) {
        encapsulationStudentExp s1 = new encapsulationStudentExp();
        s1.setMarks(100); //controlled entry
      //  s1.marks    not allowed // koi bhi chamge kr skta h
        System.out.println(s1.getMarks());
    }
}
