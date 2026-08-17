package DailyStudyHourEvaluator;

import java.util.Scanner;

public class Study {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int dayHours;
      int target = 3;
      int sevenDaysHourse = 0;
      int sevenDay = 1;
      double highestHours = 1;
      int targetMeetDays = 0;
      int belowTarget = 0;

      do {

         System.out.println("Enter Day " + sevenDay + " Study Hours: ");
         dayHours = scanner.nextInt();

         if (dayHours <= 2 && dayHours < target) {
            belowTarget++;
         }

         if (dayHours >= 2 && dayHours <= 3) {
            System.out.println("Developing");
            if (highestHours <= dayHours) {
               highestHours = dayHours;
            }
            if (dayHours >= 3) {
               targetMeetDays++;
            }

         } else if (dayHours >= 4 && dayHours <= 5) {
            System.out.println("Good");
            targetMeetDays++;
            if (highestHours <= dayHours) {
               highestHours = dayHours;
            }
         } else if (dayHours >= 6 && dayHours <= 24) {
            System.out.println("Excellent");
            targetMeetDays++;
            if (highestHours <= dayHours) {
               highestHours = dayHours;
            }
         } else {
            System.out.println("Need Improvement ");
         }

         sevenDaysHourse += dayHours;
         sevenDay++;

      } while (sevenDay <= 7);

      System.out.println("\n");
      System.out.println("Total Study Hourse :" + sevenDaysHourse);

      double avgstudyhours = ((double) sevenDaysHourse / 7);
      System.out.println("Average Study Hours: " + avgstudyhours);
      System.out.println("Highest Study Hours: " + highestHours);
      System.out.println("Days Meets Target: " + targetMeetDays);
      System.out.println("Days Below Target: " + belowTarget);

      if (avgstudyhours >= 3) {
         System.out.println("Consistency Status: Good");
         System.out.println("Message: Improve the low-study days and maintain consistency.");
      } else {
         System.out.println("maintain consistency hours !");
         System.out.println("Message: Improve the low-study days and maintain consistency.");
      }

   }
}
