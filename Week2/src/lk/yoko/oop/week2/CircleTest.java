package lk.yoko.oop.week2;
import java.util.Scanner;

public class CircleTest {
    public static void main(String[]args){
        //new - creates an object
        //Circle() - call too the constructor
        //Circle() constructor initializes the object

        //Circle.objectCounter = 1000000; = ERROR

        System.out.println("The number of circle object" + Circle.getObjectCounter());
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();
        Circle obj = new Circle(radius);
        System.out.println("The number of circle object" + Circle.getObjectCounter());
        System.out.println("The radius is " + obj.getRadius());
        System.out.println("Enter the new radius: ");


    }
}
