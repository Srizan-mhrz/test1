//1. Write a Java program that checks if the user input number is a perfect sqaure.

import java.util.Scanner;
public class test{
    public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter a number:");
    int num = sc.nextInt();
    int sqrt = (int)Math.sqrt(num);
    if(sqrt*sqrt == num){
        System.out.println(num + " is a perfect square.");
        
        }
    else{
        System.out.println(num + " is not a perfect square.");
        }
    sc.close();
}
}

