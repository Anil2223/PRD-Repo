package Project2;

public class WeeklyCodingTracker {
    public static void main(String[] args) {
        System.out.println("Weekly coding Practice Tracker");
        int day1Attempted = 7;
        int day1Solved = 5;
        double day1Hours = 2.0;

        int day2Attempted = 8;
        int day2Solved = 6;
        double day2Hours = 2.5;

        int day3Attempted = 6;
        int day3Solved = 4;
        double day3Hourse = 1.5;

        int day4Attempted = 7;
        int day4Solved = 5;
        double day4Hourse = 2.0;

        int day5Attempted = 8;
        int day5Solved = 6;
        double day5Hourse = 2.5;

        int day6Attempted = 7;
        int day6Solved = 5;
        double day6Hourse = 2.0;

        int day7Attempted = 7;
        int day7Solved = 6;
        double day7Hourse = 3.0;

        int totalAttempted = 0;
        int totalSolved = 0;
        double totalHourse = 0;

        int productiveDays = 0;
        int nonProductiveDays = 0;

        int day = 1;
        while (day <= 7) {
            int attempted = 0;
            int solved = 0;
            double hourse = 0;
            if (day == 1) {
                attempted = day1Attempted;
                solved = day1Solved;
                hourse = day1Hours;
            } else if (day == 2) {
                attempted = day2Attempted;
                solved = day2Solved;
                hourse = day2Hours;
            } else if (day == 3) {
                attempted = day3Attempted;
                solved = day3Solved;
                hourse = day3Hourse;
            } else if (day == 4) {
                attempted = day4Attempted;
                solved = day4Solved;
                hourse = day4Hourse;
            } else if (day == 5) {
                attempted = day5Attempted;
                solved = day5Solved;
                hourse = day5Hourse;
            } else if (day == 6) {
                attempted = day6Attempted;
                solved = day6Solved;
                hourse = day6Hourse;
            } else if (day == 7) {
                attempted = day7Attempted;
                solved = day7Solved;
                hourse = day7Hourse;
            }

            // calculation of total day

            totalAttempted += attempted;
            totalSolved += solved;
            totalHourse += hourse;

            if (solved >= 5 && hourse >= 2) {
                productiveDays++;
            } else {
                nonProductiveDays++;
            }

            day++;

        }
        double successPercentage = 0;
        if (totalAttempted != 0) {
            successPercentage = ((double) totalSolved / totalAttempted) * 100;

        }
        // average per day
        double averageSolved = 0;
        if (totalSolved != 0) {
            averageSolved = (double) totalSolved / 7;
        }
        // weekly target
        String weeklyTarget = totalSolved >= 35 ? "Achieved" : "Not Achieved";
        // consistency message
        String consistencyStatus = productiveDays >= 5 ? "Good" : "Needs Improvement";

        System.out.println("Total Promblems Attempted : " + totalAttempted);

        System.out.println("Total Problem Solved :" + totalSolved);
        System.out.println("Success Percentage :" + successPercentage + "%");
        System.out.println("Total Hours :" + totalHourse);
        System.out.println("Average Problem Solved Per Day: " + averageSolved);

        System.out.println();
        System.out.println("Productive Days :" + productiveDays);
        System.out.println("Non-Productive Days :" + nonProductiveDays);

        System.out.println("Weekly Target : " + weeklyTarget);
        System.out.println("Consistency Status: " + consistencyStatus);

    }
}
