package lk.yoko.oop.week2;
import java.util.Scanner;

public class Circle extends Object {
    private double radius; //instance variable - one copy per object
    private static int objectCounter; //Static variable - one copy per class

    //constructor name must be same as class name
    //constructor doesn't have return type not void
    //if I do not add a constructor what will happen?
    //Default constructor will be added - No args constructor

    /*public Circle(){ // THE SUPER CLASS of the circle is the OBJECT
        super();
        this.radius=0.0;*/

    //The above part won't be needed bcs we have added that EXTENDS at the top
    //Everytime when we create an object a constructor will call always


    //Constructor for initializer
    public Circle(double radius){
        super();
        this.setRadius(radius);
        objectCounter++;

    }
    public int getObjectCounter(){
        return objectCounter;
    }

    public double getRadius(){  //Getter method for radius - Read only method bcs there's only getter method/ if there are both setter n getter=can read n write both
        return this.radius;  //this= Current object
    }

    public void setRadius(double radius){
        if(radius>0){
            this.radius=radius;
        }else{
            throw new IllegalArgumentException("Radius has to greater than 0.");
        }
    }

}
//instance specific =instance
//no instance variables are there=static

//GETTER n SETTER *****************************