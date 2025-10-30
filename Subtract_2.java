  // Subtract of two number

import java.util.Scanner;
class Subtract_2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number-1: ");
        int a = sc.nextInt();
        System.out.print("Enter the number-2: ");
        int b = sc.nextInt();
        int subtract = a - b;
        System.out.println("The ans is " +subtract);
    }
}
