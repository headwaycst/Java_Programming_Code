import java.util.Scanner;
class Rhombus_7 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the diagonal-1:");
        int a = sc.nextInt();
        System.out.print("Enter the diagonal-2:");
        int b = sc.nextInt();
        double area = (0.5*(a*b));
        System.out.println("Rhombus area is "+area);

    }
}
