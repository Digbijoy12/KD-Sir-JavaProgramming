package monthassignment;
import java.util.Scanner;
public class monthassignment {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a month name: ");
        String monthName = scanner.nextLine();

        int days = getDaysInMonth(monthName);
        if (days != -1) {
            System.out.println(monthName + " has " + days + " days.");
        } else {
            System.out.println("Invalid month name.");
        }

        scanner.close();
    }

    public static int getDaysInMonth(String monthName) {
        String[] months = {
            "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"
        };

        int[] daysInMonth = {
            31, 28, 31, 30,
            31, 30, 31, 31,
            30, 31, 30, 31
        };

        for (int i = 0; i < months.length; i++) {
            if (monthName.equalsIgnoreCase(months[i])) {
                return daysInMonth[i];
            }
        }
        return -1; 
    }
}

