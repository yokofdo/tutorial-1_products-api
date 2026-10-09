package Company;

public class Main {
    public static void main(String[]args){

        Car car1=new Car();
        car1.brand="Toyota";
        car1.color="Black";
        car1.doors=4;

        System.out.println(car1.brand);

        car1.drive();

        Car car2=new Car("Red","BYD",4);
        System.out.println(car2.brand);
        car2.drive();


    }
}