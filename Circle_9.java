import java.util.Scanner;
class Circle_9 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius:");
        float a = sc.nextFloat();
        double circle = Math.PI*a*a;
        System.out.println("Circle area is: "+circle);
    }

}
