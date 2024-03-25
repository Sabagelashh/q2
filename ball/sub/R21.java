package quizzes.q2.saba_gelashvili_2.ball.sub;

import quizzes.q2.saba_gelashvili_2.ball.A21;
import quizzes.q2.saba_gelashvili_2.airplane.A22;

public class R21 {
    public static void main(String[] args) {
        // Calculate and print the area of the rectangle
        int area = A21.hei * A21.len;
        System.out.println("The area of the rectangle is: " + area);

        // Print the name of the month or an error if the value is invalid
        String monthName = getMonthName(A22.month);
        System.out.println(monthName);
    }

    private static String getMonthName(int monthNumber) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        if (monthNumber >= 1 && monthNumber <= 12) {
            return months[monthNumber - 1];
        } else {
            return "Invalid month value: " + monthNumber;
        }
    }
}

