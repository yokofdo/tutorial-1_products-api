package lk.yoko.oop.week3;
import java.util.Scanner;

public class ArrayTest {
    public static final int SIZE=10;
    public static void main(String[]args){
        //store 10 number and find the sum


        int[]numbers=new int[SIZE];
        Scanner sc=new Scanner(System.in);

        for(int i =0; i<numbers.length;i++){
            System.out.println("Enter the number for index"+i+":");
            numbers[i]=sc.nextInt();
        }

        //calculate the sum
        int total=0;
        for(int num:numbers){
            System.out.println(num);
            total+=num;
        }
        System.out.println("Sum of the numbers"+total);

        Arrays.sort(numbers);
        System.out.println("Printing after sorting");
        for(int num:numbers);
            System.out.println()
    }
}
