//1. Write a Java program that checks if the user input number is a perfect sqaure.

import java.util.Scanner;
public class  qn1 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        boolean PerfectSquare = false;
        for (int i = 0; i * i <= num; i++) {
            if (i * i == num) {
                PerfectSquare = true;
                break;
            }
        }
        if (PerfectSquare) {
            System.out.println(num + " is a perfect square.");
        } else {
            System.out.println(num + " is not a perfect square.");
        }
        sc.close();

    }
}
