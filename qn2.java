// 2. Write a Java program that calculates the product of the digits in a number given by a user
// using a loop.
import java.util.Scanner;
public class qn2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a numbeer:");
        int num = sc.nextInt();
        int product = 1;
        while(num > 0){
            int digit = num % 10;
            product *= digit;
            num /= 10;
        }
        System.out.println("The product of the digits is: " + product);
        sc.close();


    }    
    }
    

    

