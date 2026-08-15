package StudentPracticeTracker;

public class Student {
    String StudentName;
    String CourseName;
    int CompletedTopics;
    int QuestionSolved;

    Student(String StudentName, String CourseName, int CompletedTopics, int QuestionSolved) {
        this.StudentName = StudentName;
        this.CourseName = CourseName;
        this.CompletedTopics = CompletedTopics;
        this.QuestionSolved = QuestionSolved;
    }

    void displayDetails() {
        System.out.println("Student Name: " + StudentName);
        System.out.println("Course Name: " + CourseName);
        System.out.println("Enter Topics: " + CompletedTopics);
        System.out.println("Solve Question: " + QuestionSolved);
    }

    void displayProgress() {
        System.out.println("Complete Topics: " + CompletedTopics);
        System.out.println("Solve Question :" + QuestionSolved);
    }

    void addTopics(int Topics) {
        System.out.println("Topic Added Successfully !");
        this.CompletedTopics += Topics;
        System.out.println("Total Topic Completed: " + CompletedTopics);
    }

    void addQuestions(int Question) {
        System.out.println("Question Added Successfully !");
        this.QuestionSolved += Question;
        System.out.println("Total Question Solved: " + QuestionSolved);
    }

}
