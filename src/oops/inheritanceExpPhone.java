package oops;

public class inheritanceExpPhone {
    void call()
    {
        System.out.println("calling from phone");
    }
    void message ()
    {
        System.out.println("Messaging From Phone");
    }
}

class smartPhone extends inheritanceExpPhone{
    void browseInternet()
    {
        System.out.println("Using Internet");
    }

    void takePhoto(){
        System.out.println("Taking Photo");
    }
}

class Main {
    public static void main(String[] args) {
        smartPhone sp = new smartPhone();
        sp.call();
        sp.message();
        sp.takePhoto();
        sp.browseInternet();
    }
}
