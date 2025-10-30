import java.util.Scanner;
class MonthToDay_11 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month :");
        int month = sc.nextInt();
        int day = month* 30;
        System.out.println(month+" month is equal to "+day+"day");
    }
}
