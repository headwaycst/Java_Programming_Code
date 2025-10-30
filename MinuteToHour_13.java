import java.util.Scanner;
class MinuteToHour_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter minute :");
        int minute = sc.nextInt();
        int hour = minute/60;
        System.out.println(hour+ " hour is equal to " +minute+" minute");
       
    }
}