package Company;

public class Car {
    String color;
    String brand;
    int doors;

    public Car(){
        //Default constructor
    }

    public Car(String color,String brand,int doors){
        this.color=color;
        this.doors=doors;
        this.brand=brand;
    }


        public void drive(){  //non-return method
        System.out.println("Driving!");
    }

    public void start(){  //non-return method
        System.out.println("Car is starting!");
    }

    public String stop(){   //return method
        return "The engine is stopped.";


    }
}
