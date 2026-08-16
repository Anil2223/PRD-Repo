package InterviewPreparationProgressChecker;

import java.util.Scanner;

public class Progress {
    public static void main(String[] args) {
        String name;
        int ProgrammingScore;
        int AptitudeScore;
        int CommunicationScore;
        String ResumeCompletionStatus;
        String MockInterviewCompletionStatus;
        String ProjectCompletionStatus;
        String AptitudeStatus;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name:");
        name = scanner.nextLine();
        System.out.println("Enter Programming Score:");
        ProgrammingScore = scanner.nextInt();
        System.out.println("Enter Aptitutde Score :");
        AptitudeScore = scanner.nextInt();
        System.out.println("Enter Communication Score:");
        CommunicationScore = scanner.nextInt();

        ResumeCompletionStatus = ProgrammingScore >= 65 ? "Ready" : "Not Ready";
        String ProgrammingStatus = ProgrammingScore >= 65 ? "Completed" : "Not Completed";
        AptitudeStatus = AptitudeScore >= 60 ? "Ready" : "Not Ready";
        MockInterviewCompletionStatus = CommunicationScore >= 60 ? "Completed" : "Not Completed";
        ProjectCompletionStatus = ProgrammingScore >= 65 ? "Completed" : "Not Completed";
        String CommunicationStatus = CommunicationScore >= 60 ? "Ready" : "not Ready";

        System.out.println("Student Name: " + name);
        System.out.println("Aptitude Status: " + AptitudeStatus);
        System.out.println("Programming Status: " + ProgrammingStatus);
        System.out.println("Communication Status :" + CommunicationStatus);
        System.out.println("Mock Interview Status: " + MockInterviewCompletionStatus);
        System.out.println("Project Status: " + ProjectCompletionStatus);
        System.out.println("Resume Status: " + ResumeCompletionStatus);

        int totalScore = ProgrammingScore + AptitudeScore + CommunicationScore;
        double percentage = ((double) totalScore / 3);
        System.out.println("Over all percentage " + percentage + " %");

        boolean finalResult = ProgrammingScore >= 65 &&
                AptitudeScore >= 60 &&
                CommunicationScore >= 60;
        if (finalResult) {
            System.out.println("Final Result: INTERVIEW READY");
            System.out.println("Recommended Action: Start applying and continue mock practice.");
        } else {
            System.out.println("Final Result:NOT ITNERVIEW READY");
            System.out.println("Need more Practice for Score and communication & Aptitude !");
        }
    }
}
