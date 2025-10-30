import java.util.Scanner;
class Rectangle_6 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int a = sc.nextInt();
        System.out.print("Enter the width: ");
        int b = sc.nextInt();
        int area = a*b;
        System.out.println("Rectangle area is "+area);
    }
}
