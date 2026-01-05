package lld;

//Strategy Design  : The Strategy Pattern is a behavioral design pattern that lets you define a family of algorithms, put each of them in a separate class, and let the object choose the algorithm at runtime.
//It allows you to change the behavior of an object without changing its code.
//Choose algorithm dynamically without changing its main code  .

public interface hospitalTreatmentStrategy {
    void treatPatient();
}

class cardiologyTreatment implements hospitalTreatmentStrategy {
    @Override
    public void treatPatient() {
        System.out.println("Heart Treatment in Cardiology Department");
    }
}

class orthopedicsTreatment implements hospitalTreatmentStrategy{
    @Override
    public void treatPatient() {
        System.out.println("Bones Treatment in Ortho Department");
    }
}

class neurologyTreatment implements hospitalTreatmentStrategy {
    @Override
    public void treatPatient() {
        System.out.println("Brain Treatment in Neuro Department ");
    }
}

class Hospital{
    private hospitalTreatmentStrategy strategy1 ;
    public void setTreatmentStrategy(hospitalTreatmentStrategy strategy1){
        this.strategy1 = strategy1;
    }
     public void treat(){
        strategy1.treatPatient();
     }
}

class hospital {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.setTreatmentStrategy(new cardiologyTreatment());
        hospital.treat();
        hospital.setTreatmentStrategy(new neurologyTreatment());
        hospital.treat();
        hospital.setTreatmentStrategy(new orthopedicsTreatment());
        hospital.treat();
    }
}

