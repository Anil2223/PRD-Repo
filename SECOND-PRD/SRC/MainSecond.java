package SRC;

public class MainSecond {
    public static void main(String[] args) {
        System.out.println("Another Possibility Output ");

        String name = "Vikas";
        double AcademicPercentage = 85.5;
        double AttendancePercentage = 70;
        int ActiveBacklogs = 0;
        boolean ProjectCompleted = false;

        int CommunicationScore = 68;
        int AptitudeScore = 50;

        boolean AcademicPercentageEligibility = AcademicPercentage >= 60;
        boolean AttendanceEligibility = AttendancePercentage >= 75;
        boolean CommunicationEligibility = CommunicationScore >= 60;
        boolean AptitudeScoreEligibilty = AptitudeScore >= 60;
        boolean BacklogsEligibility = ActiveBacklogs <= 0;

        boolean AcademicStatus = AcademicPercentageEligibility &&
                AttendanceEligibility &&
                CommunicationEligibility &&
                AptitudeScoreEligibilty &&
                ProjectCompleted;

        System.out.println("Student Name:" + name);
        System.out.println("Academic Status :" + (AcademicPercentageEligibility ? "Eligible" : "not Eligible"));
        System.out.println("Attendance Status :" + (AttendanceEligibility ? "Eligible" : "not Eligible"));
        System.out.println("Backlog Status :" + (BacklogsEligibility ? "Eligible" : "not Eligible"));
        System.out.println("Project Status:" + (ProjectCompleted ? "Completed" : "Need to complete project"));
        System.out.println("Communication Status :" + (CommunicationEligibility ? "Eligible" : "you need to complete"));
        System.out.println("Aptitude Status :" + (AptitudeScoreEligibilty ? "Eligible" : "not eligible"));
        System.out.println("\n");
        System.out.println("Final Result:" + (AcademicStatus ? "PLACEMENT READY" : "NOT PLACEMENT READY"));
        System.out.println((AcademicStatus ? "All placement requirement are satisfied"
                : "Areas to Improve Attendance Project Completion Project Completion Aptitude Score "));

    }
}
