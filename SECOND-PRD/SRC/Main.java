package SRC;

public class Main {
    public static void main(String[] args) {
        System.out.println("Placement ready evaluation");

        String name = "Anil";
        double AcademicPercentage = 85.5;
        double AttendancePercentage = 88;
        int ActiveBacklogs = 0;
        boolean ProjectCompleted = true;

        int CommunicationScore = 68;
        int AptitudeScore = 74;

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
        System.out.println("Academic Status :" + (AcademicStatus ? "Eligible" : "not Eligible"));
        System.out.println("Backlog Status :" + (BacklogsEligibility ? "Eligible" : "not Eligible"));
        System.out.println("Attendance Status :" + (AttendanceEligibility ? "Eligible" : "not Eligible"));
        System.out.println("Project Status:" + (ProjectCompleted ? "Completed" : "Need to complete project"));
        System.out.println("Communication Status :" + (CommunicationEligibility ? "Eligible" : "you need to complete"));
        System.out.println("Aptitude Status :" + (AptitudeScoreEligibilty ? "Eligible" : "not eligible"));
        System.out.println("\n");
        System.out.println("Final Result:" + (AcademicStatus ? "PLACEMENT READY" : "NOT READY FOR PLACEMENT"));
        System.out.println("Message :"
                + (AcademicStatus ? "All placement requirement are satisfied" : "Not eligible for placement "));

    }
}