import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year = input.nextInt();

        boolean isValidYear = year >= 1582;

        boolean isLeapYear = isValidYear &&
                ( (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) );

        if (isLeapYear) {
            System.out.println("The Year " + year + " is a Leap Year");
        } else {
            System.out.println("The Year " + year + " is not a Leap Year");
        }
    }
}