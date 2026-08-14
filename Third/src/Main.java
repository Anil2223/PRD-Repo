import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("COMPUSTRACK");
        System.out.println("==================================================");
        System.out.println("Student Academic Management System");
        System.out.println("--------------------------------------------------");
        int choice;
        do {
            int id;
            String name;
            int age;
            String email;
            String courseName = "";
            int fee = 0;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter student ID:");
            id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter full name :");

            name = scanner.nextLine();
            System.out.println("Enter age :");
            age = scanner.nextInt();

            while (age < 15 || age > 35) {
                System.out.println("Invalide age .Enter a value between 15 and 35");
                System.out.println("Enter age :");
                age = scanner.nextInt();
            }
            System.out.println("Age accepted .");
            System.out.println("Enter email :");
            email = scanner.next();

            // print
            // select course
            System.out.println("\n");
            System.out.println("Select course");
            System.out.println("1.BCA");
            System.out.println("2.B.SC Computer Science");
            System.out.println("3.B.E/B.Tech");
            System.out.println("4.MCA");
            System.out.println("5.Other");

            System.out.println("Enter course choice :");
            choice = scanner.nextInt();
            do {
                switch (choice) {
                    case 1:
                        courseName = "BCA";
                        fee = 35000;
                        break;
                    case 2:
                        courseName = "B.Sc Computer Science";
                        fee = 30000;
                        break;
                    case 3:
                        courseName = "B.E/B.Tech";
                        fee = 50000;
                        break;
                    case 4:
                        courseName = "MCA";
                        fee = 45000;
                        break;
                    case 5:
                        System.out.println("Other");
                        fee = 25000;
                        break;
                    default:
                        System.out.println("Invalide course choice.Select a value from 1 to 5 .");

                }
            } while (choice < 1 || choice > 5);

            System.out.println("Course selected :" + courseName);
            System.out.println("Course Feee : " + fee);
            scanner.nextLine();
            // semester
            int semester;
            do {
                System.out.println("Enter semester: ");
                semester = scanner.nextInt();
                if (semester < 0 || semester > 8) {
                    System.out.println("Invalid semester Enter valid semester");
                    semester = scanner.nextInt();
                }
            } while (semester < 1 || semester > 8);
            scanner.nextLine();
            System.out.println("Enter career goal :");
            String career = scanner.nextLine();
            System.out.println("Career goal " + career);
            System.out.println("\n");
            // collecting marks for exactly five subjects;

            System.out.println("Enter Java Marks: ");
            int java = scanner.nextInt();
            while (java < 0 || java > 100) {
                System.out.println("Invalid marks . Enter a value between 0 and 100 ");
                System.out.println("Enter Java Marks:");
                java = scanner.nextInt();
            }
            System.out.println("java marks accepted ");
            System.out.println("Enter SQL marks: ");
            int sql = scanner.nextInt();
            while (sql < 0 || sql > 100) {
                System.out.println("Invalide marks.Enter a value between 0 to 100");
                System.out.println("Enter SQL marks:");
                sql = scanner.nextInt();
            }
            System.out.println("Sql marks Accepted");
            System.out.println("Enter Web Technology marks: ");
            int webTech = scanner.nextInt();
            while (webTech < 0 || webTech > 100) {
                System.out.println("Invalide marks.Enter a value between 0 to 100");
                System.out.println("Enter web Technology marks:");
                webTech = scanner.nextInt();
            }
            System.out.println("Web Technology marks accepted .");

            System.out.println("Enter Aptitude marks: ");
            int AptitudeMarks = scanner.nextInt();
            while (AptitudeMarks < 0 || AptitudeMarks > 100) {
                System.out.println("Invalide marks.Enter a value between 0 to 100");
                System.out.println("Enter Aptitude Marks: ");
                AptitudeMarks = scanner.nextInt();
            }
            System.out.println("Aptitude Marks Accepted .");

            System.out.println("Enter Communication marks: ");
            int CommunicationMarks = scanner.nextInt();
            while (CommunicationMarks < 0 || CommunicationMarks > 100) {
                System.out.println("Invalide marks.Enter a value between 0 to 100");
                System.out.println("Enter Communication marks:");
                CommunicationMarks = scanner.nextInt();
            }
            System.out.println("Communication marks accepted . ");

            // Total and Percentage
            int totalmarks = java + sql + webTech + AptitudeMarks + CommunicationMarks;

            // calculate percentage
            double percentage = (double) totalmarks / 5;

            // Subject and Academice Result
            boolean AcademicStatus = java >= 35 && sql >= 35 && webTech >= 35 && AptitudeMarks >= 35
                    && CommunicationMarks >= 35;

            // print subject marks and percentage
            System.out.println("Java: " + java);
            System.out.println("Sql: " + sql);
            System.out.println("Web Technology: " + webTech);
            System.out.println("Aptitude: " + AptitudeMarks);
            System.out.println("Communication Marks: " + CommunicationMarks);
            System.out.println("Total marks: " + totalmarks);
            System.out.println("Percentage: " + percentage + "%");

            String AcademicStatusGrad = AcademicStatus ? "Pass" : "Fail";
            System.out.println("Academic Status : " + AcademicStatusGrad);
            String Grade;
            if (percentage >= 85) {
                Grade = "A+";
            } else if (percentage >= 75) {
                Grade = "A";

            } else if (percentage >= 65) {
                Grade = "B";
            } else if (percentage >= 50) {
                Grade = "C";
            } else if (percentage >= 40) {
                Grade = "D";
            } else {
                Grade = "F";
            }

            // Attendance
            int totalClassesConducted;
            System.out.println("Enter total classess conducted: ");
            totalClassesConducted = scanner.nextInt();
            System.out.println("Enter total Attendance:");
            int Attendance = scanner.nextInt();
            while (Attendance < 0 || Attendance >= totalClassesConducted) {
                System.out.println("Invalide attendance.Attendend classes cannot exceed " + totalClassesConducted);
                System.out.println("Enter classes Attended: ");
                Attendance = scanner.nextInt();
            }

            double attendancePercentage = ((double) Attendance / totalClassesConducted) * 100;

            String AttendanceCriteria = attendancePercentage >= 75 ? "REGULAR" : "NOT REGULAR";
            System.out.println(
                    "-----------------------------------STUDENT SEMESTER REPORT-----------------------------------------");

            System.out.println("Student ID: " + id);
            System.out.println("Student Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Course: " + courseName);
            System.out.println("Semester: " + semester);
            System.out.println("Career Goal:" + career);
            System.out.println("-----------------------Academic Summary-----------------------------");

            System.out.println("Java Marks: " + java);
            System.out.println("SQL Marks: " + sql);
            System.out.println("Web Technology Marks: " + webTech);
            System.out.println("Aptitude Marks: " + AptitudeMarks);
            System.out.println("Communication Marks: " + CommunicationMarks);
            System.out.println("Total Marks: " + totalmarks);
            System.out.println("Percentage: " + percentage);
            System.out.println("Academic Result: " + AcademicStatus);
            System.out.println("Grade: " + Grade);

            System.out.println("--------------------------Attendance--------------------------------------");
            System.out.println("Attendance" + Attendance);
            System.out.println("Total classes conducted:" + totalClassesConducted);
            System.out.println("Attendence percentage:" + attendancePercentage + "%");
            System.out.println("Attendance Status : " + AttendanceCriteria);

            System.out.println("----------------Assignment Score Processing-------------------");
            System.out.println("How many assignment scores do you want to enter ? ");

            int numberOfAssignments = scanner.nextInt();

            int totalAssignmentScore = 0;
            int validAssignmentCount = 0;

            for (int i = 1; i <= numberOfAssignments; i++) {

                System.out.print("Enter score for assignment " + i
                        + " (0-10, -1 to finish): ");

                int score = scanner.nextInt();

                if (score == -1) {
                    System.out.println("Assignment entry completed early.");
                    break;
                }

                if (score < -1 || score > 10) {
                    System.out.println("Invalid score. Assignment "
                            + i + " skipped.");
                    continue;
                }

                totalAssignmentScore += score;
                validAssignmentCount++;

                System.out.println("Assignment score accepted.");
            }

            double assignmentAverage;

            if (validAssignmentCount == 0) {
                assignmentAverage = 0.00;
            } else {
                assignmentAverage = (double) totalAssignmentScore / validAssignmentCount;
            }

            boolean assignmentPassed = validAssignmentCount > 0 && assignmentAverage >= 5;

            String assignmentStatus = assignmentPassed ? "SATISFACTORY" : "NEEDS IMPROVEMENT";

            System.out.println();
            System.out.println("Valid assignments: " + validAssignmentCount);
            System.out.println("Assignment total: " + totalAssignmentScore);
            System.out.printf("Assignment average: %.2f%n", assignmentAverage);
            System.out.println("Assignment status: " + assignmentStatus);

            System.out.println("-------------------Scholarship Calculation-----------------------");
            int scholarshipDiscount;
            if (percentage >= 85 && attendancePercentage >= 85) {
                scholarshipDiscount = 10;
            } else if (percentage >= 75 && attendancePercentage >= 75) {
                scholarshipDiscount = 5;
            } else {
                scholarshipDiscount = 0;
            }

            double ScholarshipAmount = fee * scholarshipDiscount / 100;
            double finalFees = fee - scholarshipDiscount;
            System.out.println("Base fee: " + fee);
            System.out.println("ScholarshipDiscount: " + scholarshipDiscount + "%");
            System.out.println("Scholarship amount: " + ScholarshipAmount);
            System.out.println("Final Payable Fee: " + finalFees);

            System.out.println(
                    "---------------------------Fee payment code outputs-----------------------------------------------");
            System.out.println("Enter amount paid : ");
            double amountPaid = scanner.nextDouble();
            while (amountPaid < 0 || amountPaid > finalFees) {
                System.out.println("Invalide amount . Enter a value between 0 and %.2f%n ");
                System.out.println("Enter amount paid: ");
                amountPaid = scanner.nextDouble();
            }

            double feeBalance = finalFees - amountPaid;
            String feeStatus = feeBalance == 0 ? "PAID" : "PENDING";
            System.out.println("Amount Paid: " + amountPaid);
            System.out.println("Feee Balance: " + feeBalance);
            System.out.println("Fee Status :" + feeStatus);

            System.out.println("---------------------Final Semester Clearance------------------------");
            boolean isPromoted = (attendancePercentage >= 75 && AcademicStatus == true && feeBalance == 0);
            String clearanceStatus = (isPromoted) ? "CLEARED FOR NEXT SEMESTER" : "Not Promoted .ACTION REQUIRED";
            System.out.println("Clearance Status :" + clearanceStatus);
            if (!isPromoted) {
                System.out.println("Failed Conditions");
                if (attendancePercentage < 75)
                    System.out.println("Lack of attendance");
                if (AcademicStatus == false)
                    System.out.println("Failiur in one of subjects.");
                if (java < 35)
                    System.out.println("java marks are below 35");
                if (sql < 35)
                    System.out.println("sql marks are below 35");
                if (webTech < 35)
                    System.out.println("webTech marks are below 35");
                if (AptitudeMarks < 35)
                    System.out.println("Aptitude Marks are below 35");
                if (CommunicationMarks < 35)
                    System.out.println("Communication Marks are below 35");
                if (percentage < 40)
                    System.out.println("percentage is below 40 %");
                if (Attendance < 75)
                    System.out.println("Attendance is below 75%");
                if (feeBalance != 0)
                    System.out.println("fee Balance is not zero");

            }

            System.out.println("----------Recommendations------------------------------------");
            if (java < 35) {
                System.out.println("Revisit the failed subject and Complete additional practice");

            } else if (sql < 35) {
                System.out.println("Revisit the failed subject and Complete additional practice");
            } else if (webTech < 35) {
                System.out.println("Revisit the failed subject and Complete additional practice");
            } else if (AptitudeMarks < 35) {
                System.out.println("Revisit the failed subject and Complete additional practice");
            } else if (CommunicationMarks < 35) {
                System.out.println("Revisit the failed subject and Complete additional practice");
            } else if (percentage < 40) {
                System.out.println("Improve overall academic performance");
            } else if (Attendance < 75) {
                System.out.println("Attend class regularly and clear the attandence shortage.");
            } else if (assignmentAverage < 5) {
                System.out.println("Complete assignments consistently and maintain an average of at least 5.00.");
            } else if (feeBalance != 0) {
                System.out.println("Pay the pending semester fee before clearance");
            } else {
                System.out.println("Maintain the current performance in the next semester.");
            }

            System.out.println("Do you want to process another student ?  ");
            System.out.println("1.Yes");
            System.out.println("0.No");

            System.out.println("Enter choice: ");
            choice = scanner.nextInt();
            while (choice != 1 && choice != 0) {
                System.out.println("Invalid choice. Enter 1 for Yes or 0 for No.");
                System.out.println("Enter choice :");
                choice = scanner.nextInt();
            }

        } while (choice == 1);
        System.out.println("Thank you for using CampusTrack.");
    }
}
