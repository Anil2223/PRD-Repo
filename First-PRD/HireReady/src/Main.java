class Main {
    public static void main(String[] args) {
        // Condidate Basic information

        String candidateName = "Anil";
        int registrationNumber = 24032;
        String degree = "B.Tech Computer Science";
        int graduationYear = 2025;
        double degreePercentage = 72.5;
        int activeBacklogs = 0;

        // Assessment Details
        int aptitudeCorrectAnswer = 40;
        int aptitudeTotalQuestions = 50;

        int codingTestCasesPassed = 8;
        int codingTotalTestCases = 10;

        int communicationScore = 75;
        // Project and Profile Details
        boolean projectCompleted = true;
        boolean projectVerified = true;

        // Calculate Aptitude Percentage

        double aptitudePercentage = (double) aptitudeCorrectAnswer / aptitudeTotalQuestions * 100;

        // Calculate Coding Percentage

        double codingPercentage = (double) codingTestCasesPassed / codingTotalTestCases * 100;

        // Eligibility Conditions
        boolean degreeEligible = degreePercentage >= 60;
        boolean backlogsEligible = activeBacklogs == 0;

        boolean graduationYearEligible = graduationYear == 2025 ||
                graduationYear == 2026 ||
                graduationYear == 2027;

        boolean aptitudeEligible = aptitudePercentage >= 60;
        boolean codingEligible = codingPercentage >= 70;
        boolean communicationEligible = communicationScore >= 60;
        boolean projectEligible = projectCompleted;
        boolean profileEligible = projectVerified;
        // Final Eligibility Condition

        boolean allEligible = degreeEligible &&
                backlogsEligible &&
                graduationYearEligible &&
                aptitudeEligible &&
                codingEligible &&
                communicationEligible &&
                projectEligible &&
                projectEligible;

        // Display Condidate Report
        System.out.println("==================");
        System.out.println("COMPUS PLACEMENT APPLICATION REPORT");
        System.out.println("=========================");

        System.out.println();

        System.out.println("Candidate Name      :" + candidateName);
        System.out.println("Registration Namber :" + registrationNumber);
        System.out.println("Degree              :" + degree);
        System.out.println("Graduation Year     :" + graduationYear);
        System.out.println("Degree Percentage    :" + degreePercentage);
        System.out.println("Active Backlogs :" + activeBacklogs);

        System.out.println("-----------------------------------------------");

        System.out.println("Aptitude Score :"
                + aptitudeCorrectAnswer + "/" +
                aptitudeTotalQuestions);

        System.out.println("Aptitude Percentage :" + aptitudePercentage);

        System.out.println("Coding Test Cases :"
                + codingPercentage + "/"
                + codingTotalTestCases);

        System.out.println("Coding Percentage :" + codingPercentage);
        System.out.println("Communication Score  :" + communicationScore);
        System.out.println("Project Completed  :" + (projectCompleted ? "Yes" : "No"));

        System.out.println("Profile Verified :" + (projectVerified ? "Yes" : "No"));

        System.out.println("---------------------------------------------------");

        System.out.println("Degree Eligibility      : "
                + (degreeEligible ? "Eligible" : "Not Eligible"));

        System.out.println("Backlog Eligibility     : "
                + (backlogsEligible ? "Eligible" : "Not Eligible"));

        System.out.println("Graduation Year         : "
                + (graduationYearEligible ? "Eligible" : "Not Eligible"));

        System.out.println("Aptitude Eligibility    : "
                + (aptitudeEligible ? "Eligible" : "Not Eligible"));

        System.out.println("Coding Eligibility      : "
                + (codingEligible ? "Eligible" : "Not Eligible"));

        System.out.println("Communication Status    : "
                + (communicationEligible ? "Eligible" : "Not Eligible"));

        System.out.println("Project Status          : "
                + (projectEligible ? "Eligible" : "Not Eligible"));

        System.out.println("Profile Verification    : "
                + (profileEligible ? "Verified" : "Not Verified"));

        System.out.println("------------------------------------");
        // final application status

        if (!degreeEligible) {
            System.out.println("Application Status : Not Eligible");
            System.out.println("Next Action : Improve degree percentage");

        } else if (!backlogsEligible) {
            System.out.println("Application Status : Not Eligible");
            System.out.println("Next Action : Clear active backlogs");
        } else if (!graduationYearEligible) {
            System.out.println("Application Status : Not Eligible ");
            System.out.println("Next Action : Clear active backlogs");
        } else if (!graduationYearEligible) {
            System.out.println("Application Status : Not Eligible ");
            System.out.println("Next Action : Check graduation-year criteria");
        } else if (!aptitudeEligible) {
            System.out.println("Application status : Not eligible");
            System.out.println("Next Action :Improve Aptitude performance");
        } else if (!codingEligible) {
            System.out.println("Application Status :Not Eligible ");
            System.out.println("Next Action :Improve coding performance");
        } else if (!communicationEligible) {
            System.out.println("Application Status :Not Eligible ");
            System.out.println("Next Action :Improve Communication ");
        } else if (!projectEligible) {
            System.out.println("Application Status : Application on HOld");
            System.out.println("Next Action :Complete The project ");
        } else if (!profileEligible) {
            System.out.println("Application Status :Applicatin On HOld ");
            System.out.println("Next Action :Complete profile verificatioin");

        } else if (allEligible) {
            System.out.println("Application Status : Eligible to Apply ");
            System.out.println("Next Action :Submit the company application ");

        }

        System.out.println("=====================================================");

    }
}