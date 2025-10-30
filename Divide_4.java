import java.util.Scanner;
class Divide_4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number-1:");
        float a = sc.nextInt();
        System.out.print("Enter the number-2:");
        float b = sc.nextInt();
        float divide = a / b;
        System.out.println("The ans is "+divide);
    }
}
