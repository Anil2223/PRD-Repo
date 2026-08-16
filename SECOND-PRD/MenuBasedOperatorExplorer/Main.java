package MenuBasedOperatorExplorer;

public class Main {
    public static void main(String[] args) {

        int firstNumber = 12;
        int secondNumber = 5;

        int[] menuChoices = { 1, 6, 8, 9, 10 };

        System.out.println("Initial First Number: " + firstNumber);
        System.out.println("Initial Second Number: " + secondNumber);
        System.out.println();

        int index = 0;
        int choice;

        do {
            if (index >= menuChoices.length) {
                break;
            }

            choice = menuChoices[index++];

            switch (choice) {
                case 1:
                    System.out.println("Selected Operation: Addition");
                    System.out.println("Result: " + (firstNumber + secondNumber));
                    break;

                case 2:
                    System.out.println("Selected Operation: Subtraction");
                    System.out.println("Result: " + (firstNumber - secondNumber));
                    break;

                case 3:
                    System.out.println("Selected Operation: Multiplication");
                    System.out.println("Result: " + (firstNumber * secondNumber));
                    break;

                case 4:
                    System.out.println("Selected Operation: Division");
                    if (secondNumber != 0) {
                        System.out.println("Result: " + (firstNumber / secondNumber));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;

                case 5:
                    System.out.println("Selected Operation: Remainder");
                    if (secondNumber != 0) {
                        System.out.println("Result: " + (firstNumber % secondNumber));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;

                case 6:
                    System.out.println("Selected Operation: Increment First Number");
                    firstNumber++;
                    System.out.println("Updated First Number: " + (+firstNumber)); // Unary plus demo
                    break;

                case 7:
                    System.out.println("Selected Operation: Decrement Second Number");
                    secondNumber--;
                    System.out.println("Updated Second Number: " + (+secondNumber));
                    break;

                case 8:
                    System.out.println("Selected Operation: Compare Numbers");

                    String comparisonResult = (firstNumber == secondNumber) ? "Numbers are equal."
                            : (firstNumber > secondNumber) ? "First number is greater."
                                    : "Second number is greater.";
                    System.out.println("Result: " + comparisonResult);
                    break;

                case 9:
                    System.out.println("Selected Operation: Change Sign");
                    firstNumber = -firstNumber; // Unary minus & Assignment operator
                    System.out.println("Updated First Number: " + firstNumber);
                    break;

                case 10:
                    System.out.println("Selected Operation: Exit");
                    System.out.println("Operator Explorer Closed.");
                    break;

                default:
                    System.out.println("Selected Choice: " + choice);
                    System.out.println("Invalid hard-coded menu choice.");
                    break;
            }

            System.out.println();
        } while (choice != 10);
    }
}
