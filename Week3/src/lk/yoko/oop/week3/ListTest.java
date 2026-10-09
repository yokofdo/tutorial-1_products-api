package lk.yoko.oop.week3;
private static final int SIZE=10;
import java.util.ArrayList;

public class ListTest {
    public static void main(String[]args){
        //create an array list
        //programming to super type
        List<Object>objects=new ArrayList<>();
        objects.add(10);
        objects.add("Hello");
        objects.add(new Scanner(System.in));

        List<Object>numbers=new LinkedList<>();


        //List<Integer>numbers-new ArrayList<Integer>();
        //List<Integer>nums=new ArrayList<>();
        //Generic doesnt support premitive data type
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<SIZE;i++){
            System.out.print("Enter the number for index"+i);
            numbers.add(sc.nextInt());
        }

        System.out.println("Before sorting"+numbers);
        Collections.sort(numbers);
        System.out.println("After sorting"+numbers);











    }
}
