# Second PRD — Java Project Requirements
# Requirement 1 — Placement Readiness Evaluator

## Problem Statement

Create a Java program that evaluates whether a student is ready to attend a placement drive.

## Hard-Coded Details

Declare values for:

* Student name
* Academic percentage
* Attendance percentage
* Active backlogs
* Project completion status
* Communication score
* Aptitude score

## Eligibility Rules

A student is placement-ready only when:

* Academic percentage is at least `60`
* Attendance percentage is at least `75`
* Active backlogs are `0`
* Project is completed
* Communication score is at least `60`
* Aptitude score is at least `60`

## Program Requirements

Display:

* Student name
* Academic status
* Attendance status
* Backlog status
* Project status
* Communication status
* Aptitude status
* Final placement-readiness result
* Areas that require improvement

Use a loop to evaluate at least two different student profiles by changing or resetting hard-coded values inside the program.

## Mandatory Concepts

* Primitive data types
* `String`
* Boolean values
* Relational operators
* Logical operators
* Compound conditions
* Nested conditions
* Ternary operator
* `while` or `do-while`

## Sample Values

```text
Student Name: Ananya
Academic Percentage: 72.5
Attendance Percentage: 81
Active Backlogs: 0
Project Completed: true
Communication Score: 68
Aptitude Score: 74
```

## Sample Output

```text
PLACEMENT READINESS REPORT

Student Name: Ananya
Academic Status: Eligible
Attendance Status: Eligible
Backlog Status: Eligible
Project Status: Completed
Communication Status: Eligible
Aptitude Status: Eligible

Final Result: PLACEMENT READY
Message: All placement requirements are satisfied.
```

## Another Possible Output

```text
Student Name: Kiran
Academic Status: Eligible
Attendance Status: Not Eligible
Backlog Status: Eligible
Project Status: Not Completed
Communication Status: Eligible
Aptitude Status: Needs Improvement

Final Result: NOT PLACEMENT READY

Areas to Improve:
Attendance
Project Completion
Aptitude Score
```

---

# Requirement 2 — Weekly Coding Practice Tracker

## Problem Statement

Create a Java program that tracks coding practice for seven days.

## Hard-Coded Details for Each Day

Create values for:

* Problems attempted
* Problems solved
* Practice hours

Since arrays have not been covered, process each day using variables and a `while` loop.

Students may update the values based on the current loop day using conditions.

## Rules

A day is productive when:

* At least `5` problems are solved
* Practice time is at least `2` hours

The weekly target is `35` solved problems.

## Program Requirements

Display:

* Total problems attempted
* Total problems solved
* Total practice hours
* Success percentage
* Average problems solved
* Productive days
* Non-productive days
* Weekly target status
* Final consistency message

Avoid division by zero.

## Mandatory Concepts

* Arithmetic operators
* Assignment operators
* Increment operator
* Type casting
* Decimal division
* Relational operators
* Logical operators
* `while`
* Ternary operator

## Sample Output

```text
WEEKLY CODING PRACTICE REPORT

Total Problems Attempted: 50
Total Problems Solved: 37
Success Percentage: 74.0%
Total Practice Hours: 15.5
Average Problems Solved Per Day: 5.28

Productive Days: 6
Non-Productive Days: 1

Weekly Target: Achieved
Consistency Status: Good
```

---

# Requirement 3 — Mock Test Attempt Manager

## Problem Statement

Create a Java program that manages a student’s mock-test attempts.

## Hard-Coded Details

Create values for three attempts:

* Score
* Correct answers
* Incorrect answers

## Rules

* Passing score is `60`
* Maximum attempts are `3`
* Stop evaluating when the student passes
* Track the best score
* Display remaining attempts

## Program Requirements

Display:

* Attempt number
* Score
* Correct answers
* Incorrect answers
* Pass or fail status
* Best score
* Remaining attempts
* Final result
* Recommendation

## Mandatory Concepts

* `while` or `do-while`
* Increment operator
* Decrement operator
* Assignment operators
* Relational operators
* Logical operators
* Nested conditions
* Ternary operator

## Sample Output

```text
MOCK TEST ATTEMPT REPORT

Attempt 1
Score: 48
Result: Failed
Remaining Attempts: 2

Attempt 2
Score: 57
Result: Failed
Remaining Attempts: 1

Attempt 3
Score: 68
Result: Passed

Best Score: 68
Final Result: MOCK TEST CLEARED
Message: Student passed on attempt 3.
```

---

# Requirement 4 — Personal Expense and Savings Analyser

## Problem Statement

Create a Java program that analyses monthly income, expenses, and savings.

## Hard-Coded Details

Declare values for:

* Monthly income
* Home contribution
* Rent
* Food expenses
* Travel expenses
* Education expenses
* Other expenses

## Program Requirements

Calculate and display:

* Total expenses
* Remaining amount
* Savings percentage
* Expense percentage
* Whether expenses exceed income
* Financial category
* Improvement message

## Suggested Categories

* Savings below 10%: Critical
* 10% to below 20%: Needs Improvement
* 20% to below 30%: Good
* 30% and above: Excellent

Use a loop to analyse at least two monthly scenarios.

## Mandatory Concepts

* Arithmetic operators
* Assignment operators
* Relational operators
* Logical operators
* Type casting
* Decimal division
* `if-else-if`
* Ternary operator
* `do-while`

## Sample Output

```text
MONTHLY FINANCIAL REPORT

Monthly Income: 70000.0
Total Expenses: 50000.0
Savings: 20000.0

Expense Percentage: 71.43%
Savings Percentage: 28.57%

Financial Category: Good
Message: Savings are healthy but can be improved.
```

---

# Requirement 5 — Student Marks and Grade Report

## Problem Statement

Create a Java program that evaluates marks for five subjects.

## Hard-Coded Details

Declare:

* Student name
* Five subject marks

## Rules

* Marks must be between `0` and `100`
* Passing mark is `35`
* The student fails if any subject mark is below `35`

## Grade Rules

* 90 and above: A+
* 80 to below 90: A
* 70 to below 80: B
* 60 to below 70: C
* 50 to below 60: D
* Below 50: Needs Improvement

## Program Requirements

Display:

* Total marks
* Average
* Percentage
* Passed-subject count
* Failed-subject count
* Pass or fail
* Grade
* Next-level eligibility
* Final message

Use a loop to process the five subjects using hard-coded values selected based on the loop count.

## Mandatory Concepts

* `while`
* Arithmetic operators
* Assignment operators
* Relational operators
* Logical operators
* Type casting
* Nested conditions
* Ternary operator

## Sample Output

```text
STUDENT MARKS REPORT

Student Name: Rahul
Total Marks: 370
Average Marks: 74.0
Percentage: 74.0%

Passed Subjects: 5
Failed Subjects: 0

Overall Result: PASS
Grade: B
Next-Level Eligibility: Eligible
```

---

# Requirement 6 — Attendance and Consistency Tracker

## Problem Statement

Create a Java program that tracks attendance for ten working days.

## Hard-Coded Attendance Values

Use:

* `1` for present
* `0` for absent

Declare or assign one value for each day.

## Rules

* Minimum attendance is `75%`
* Any value other than `0` or `1` is invalid
* Invalid values must not be counted

## Program Requirements

Display:

* Total working days
* Present days
* Absent days
* Attendance percentage
* Eligibility status
* Invalid attendance entries
* Final consistency message

## Mandatory Concepts

* Increment operator
* Assignment operators
* Arithmetic operators
* Type casting
* Decimal division
* Relational operators
* Logical operators
* `while`
* Ternary operator

## Sample Output

```text
ATTENDANCE REPORT

Total Working Days: 10
Present Days: 8
Absent Days: 2
Attendance Percentage: 80.0%

Required Attendance: 75.0%
Eligibility Status: ELIGIBLE
Consistency Status: Good Attendance
```

---

# Requirement 7 — Menu-Based Operator Explorer

## Problem Statement

Create a menu-driven Java program that performs operations on two hard-coded numbers.

## Hard-Coded Values

Declare:

* First number
* Second number
* A sequence of menu choices

Since runtime input is not allowed, menu choices must also be hard-coded.

Example concept:

```text
First operation choice: Addition
Second operation choice: Increment
Third operation choice: Comparison
Final operation choice: Exit
```

Create numeric values for the menu choices.

## Menu Options

```text
1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Remainder
6. Increment First Number
7. Decrement Second Number
8. Compare Numbers
9. Change Sign
10. Exit
```

## Program Requirements

The program must:

* Display the selected operation
* Perform multiple operations using a loop
* Update values after increment, decrement, or sign change
* Handle division by zero
* Handle an invalid hard-coded menu choice
* Stop when the exit choice is reached

## Mandatory Concepts

* `switch`
* `do-while`
* Arithmetic operators
* Assignment operators
* Relational operators
* Unary plus
* Unary minus
* Increment
* Decrement
* Ternary operator

## Sample Output

```text
Initial First Number: 12
Initial Second Number: 5

Selected Operation: Addition
Result: 17

Selected Operation: Increment First Number
Updated First Number: 13

Selected Operation: Compare Numbers
Result: First number is greater.

Selected Operation: Change Sign
Updated First Number: -13

Selected Operation: Exit
Operator Explorer Closed.
```

---

# Requirement 8 — Interview Preparation Progress Checker

## Problem Statement

Create a Java program that evaluates interview preparation.

## Hard-Coded Details

Declare:

* Student name
* Programming score
* Aptitude score
* Communication score
* Resume completion status
* Mock interview completion status
* Project completion status

## Suggested Rules

A student is interview-ready when:

* Programming score is at least `65`
* Aptitude score is at least `60`
* Communication score is at least `60`
* Resume is completed
* Mock interview is completed
* Project is completed

## Program Requirements

Display:

* Programming status
* Aptitude status
* Communication status
* Resume status
* Mock-interview status
* Project status
* Overall preparation percentage
* Final readiness result
* Weak areas
* Recommended action

## Mandatory Concepts

* Arithmetic operators
* Type casting
* Relational operators
* Logical operators
* Compound conditions
* Nested conditions
* Ternary operator
* `while` or `do-while`

## Sample Output

```text
INTERVIEW PREPARATION REPORT

Student Name: Naveen
Programming Status: Ready
Aptitude Status: Ready
Communication Status: Ready
Resume Status: Completed
Mock Interview Status: Completed
Project Status: Completed

Overall Preparation Percentage: 78.53%
Final Result: INTERVIEW READY
Recommended Action: Start applying and continue mock practice.
```

---

# Requirement 9 — Login Attempt and Account Security Simulator

## Problem Statement

Create a Java program that simulates repeated login attempts using hard-coded credentials.

## Hard-Coded Details

Declare:

* Correct username
* Correct PIN
* Username used in attempt 1
* PIN used in attempt 1
* Username used in attempt 2
* PIN used in attempt 2
* Username used in attempt 3
* PIN used in attempt 3

## Rules

* Maximum attempts are `3`
* Both username and PIN must be correct
* Stop when login is successful
* Lock the account after three failed attempts
* Display remaining attempts

## Program Requirements

Display:

* Attempt number
* Username status
* PIN status
* Login success or failure
* Remaining attempts
* Account-lock status
* Final message

## Mandatory Concepts

* `while` or `do-while`
* `String`
* Relational operators
* Logical operators
* Increment or decrement operator
* Nested conditions
* Ternary operator

## Sample Output

```text
LOGIN SECURITY REPORT

Attempt 1
Username Status: Correct
PIN Status: Incorrect
Login Result: Failed
Remaining Attempts: 2

Attempt 2
Username Status: Correct
PIN Status: Correct
Login Result: Successful

Welcome, learner01.
```

---

# Requirement 10 — Health and Fitness Status Calculator

## Problem Statement

Create a Java program that evaluates basic health and fitness information.

## Hard-Coded Details

Declare:

* Person name
* Height in metres
* Weight in kilograms
* Age
* Daily activity hours
* Water intake
* Sleep hours

## BMI Formula

```text
BMI = Weight / (Height × Height)
```

## BMI Categories

* Below 18.5: Underweight
* 18.5 to below 25: Normal
* 25 to below 30: Overweight
* 30 and above: Obese

## Health Rules

* Daily activity of at least 1 hour is good
* Water intake of at least 2 litres is good
* Sleep between 7 and 9 hours is healthy

## Program Requirements

Display:

* BMI value
* BMI category
* Activity status
* Water-intake status
* Sleep status
* Overall fitness category
* Improvement message

Use a loop to evaluate at least two profiles.

## Mandatory Concepts

* Arithmetic operators
* Type casting
* Decimal division
* Relational operators
* Logical operators
* `if-else-if`
* Ternary operator
* `while` or `do-while`

## Sample Output

```text
HEALTH AND FITNESS REPORT

Name: Meera
BMI: 22.04
BMI Category: Normal

Activity Status: Good
Water Intake Status: Good
Sleep Status: Healthy

Overall Fitness Status: HEALTHY
Message: Continue maintaining the same routine.
```

---

# Requirement 11 — Daily Study Hours Evaluator

## Problem Statement

Create a Java program that evaluates study hours for seven days.

## Hard-Coded Details

Declare study hours for seven days.

## Rules

* Daily target is `3` hours
* A successful day is a day where study hours are at least `3`

## Consistency Categories

* 6 or 7 successful days: Excellent
* 4 or 5 successful days: Good
* 2 or 3 successful days: Developing
* Fewer than 2 successful days: Needs Improvement

## Program Requirements

Display:

* Total study hours
* Average study hours
* Days meeting the target
* Days below the target
* Highest study-hours value
* Overall consistency status
* Final improvement message

## Mandatory Concepts

* `while`
* Arithmetic operators
* Assignment operators
* Increment operator
* Type casting
* Decimal division
* Relational operators
* Logical operators
* Ternary operator

## Sample Output

```text
WEEKLY STUDY REPORT

Total Study Hours: 21.0
Average Study Hours: 3.0
Highest Study Hours: 4.0

Days Meeting Target: 5
Days Below Target: 2

Consistency Status: Good
Message: Improve the low-study days and maintain consistency.
```

---

# Requirement 12 — Product Purchase and Discount Calculator

## Problem Statement

Create a Java program that calculates the final amount for a product purchase.

## Hard-Coded Details

Declare:

* Product name
* Product price
* Quantity
* Customer category
* Membership status
* Tax percentage
* Delivery charge

## Customer Categories

```text
1. Regular Customer
2. Student Customer
3. Premium Customer
```

## Suggested Discount Rules

* Regular: 5%
* Student: 10%
* Premium: 15%
* Additional membership discount: 5%

Students may modify the discount values.

## Program Requirements

Calculate and display:

* Original amount
* Customer discount
* Membership discount
* Amount after discount
* Tax amount
* Delivery charge
* Final payable amount
* Benefit status

Use a hard-coded customer category and a `switch` statement.

## Mandatory Concepts

* Arithmetic operators
* Assignment operators
* Type casting
* Decimal division
* Relational operators
* Logical operators
* Nested conditions
* `switch`
* Ternary operator

## Sample Output

```text
PURCHASE BILL

Product: Headphones
Original Amount: 5000.0
Customer Discount: 500.0
Membership Discount: 250.0
Amount After Discount: 4250.0
Tax Amount: 765.0
Delivery Charge: 100.0

Final Payable Amount: 5115.0
Benefit Status: Membership benefit applied.
```

---

# Requirement 13 — Number Behaviour Analyser

## Problem Statement

Create a repeating menu-driven Java program that analyses and modifies one hard-coded number.

## Hard-Coded Details

Declare:

* Starting number
* A sequence of menu choices
* Comparison number
* Divisibility-check number

## Menu

```text
1. Check Positive, Negative or Zero
2. Check Even or Odd
3. Check Divisibility
4. Compare with Another Number
5. Increment the Number
6. Decrement the Number
7. Change the Sign
8. Display Current Value
9. Exit
```

## Program Requirements

The program must:

* Perform multiple hard-coded menu operations
* Use `switch`
* Update the number when modified
* Handle invalid choices
* Stop when Exit is reached

## Mandatory Concepts

* `switch`
* `do-while`
* Modulus operator
* Relational operators
* Logical operators
* Unary minus
* Increment
* Decrement
* Ternary operator

## Sample Output

```text
Starting Number: 12

Selected Operation: Positive, Negative or Zero
Result: Positive Number

Selected Operation: Even or Odd
Result: Even Number

Selected Operation: Divisibility
Result: 12 is divisible by 3

Selected Operation: Increment
Updated Number: 13

Selected Operation: Change Sign
Updated Number: -13

Selected Operation: Display Current Value
Current Number: -13

Selected Operation: Exit
Number Analyser Closed.
```

---

# Requirement 14 — Course Selection Adviser

## Problem Statement

Create a Java program that recommends a learning path based on a student’s interest and readiness.

## Hard-Coded Details

Declare:

* Student name
* Interest category
* Programming confidence
* Logical ability
* Daily study time
* Career goal
* Current preparation level

## Interest Categories

```text
1. Software Development
2. Data and Analytics
3. Testing
4. Web Development
```

## Program Requirements

Use a hard-coded interest-category number and display:

* Selected interest
* Readiness status
* Recommended learning path
* Suggested study target
* Whether foundation revision is required
* Final recommendation

The program must not recommend an advanced path when scores are low.

## Mandatory Concepts

* `switch`
* `if-else`
* Nested conditions
* Relational operators
* Logical operators
* Compound conditions
* Ternary operator
* `while` or `do-while`

## Sample Output

```text
COURSE SELECTION REPORT

Student Name: Naveen
Selected Interest: Software Development
Career Goal: Backend Developer

Readiness Status: Ready to Begin
Recommended Learning Path: Programming Fundamentals and Java Development
Suggested Daily Study Time: 3 Hours
Foundation Revision Required: No

Final Recommendation:
Begin the learning path and practise consistently.
```

---

# Requirement 15 — Learning Streak and Productivity Tracker

## Problem Statement

Create a Java program that evaluates a student’s learning performance for seven days.

## Hard-Coded Details for Each Day

Declare values for:

* Learning activity completed
* Practice activity completed
* Homework completed
* Problems solved
* Study hours

## Completion Rules

A day is fully completed when:

* Learning is completed
* Practice is completed
* Homework is completed

A day is partially completed when at least one activity is completed.

A day is missed when no activity is completed.

A productive day requires:

* At least `5` problems solved
* At least `2` study hours

## Program Requirements

Display:

* Fully completed days
* Partially completed days
* Missed days
* Productive days
* Total problems solved
* Total study hours
* Average study hours
* Completion percentage
* Longest successful streak
* Final consistency category
* Motivation message

## Mandatory Concepts

* `while`
* Boolean expressions
* Arithmetic operators
* Assignment operators
* Relational operators
* Logical operators
* Increment operator
* Type casting
* Decimal division
* Nested conditions
* Ternary operator

## Sample Output

```text
WEEKLY LEARNING PRODUCTIVITY REPORT

Fully Completed Days: 4
Partially Completed Days: 2
Missed Days: 1
Productive Days: 4

Total Problems Solved: 33
Total Study Hours: 14.0
Average Study Hours: 2.0
Completion Percentage: 57.14%

Longest Successful Streak: 2 Days

Consistency Category: Good
Motivation Message:
Reduce missed days and continue building consistency.
```

---

# Repository Structure

The repository name must be:

```text
Second-PRD
```

Use the following structure:

```text
Second-PRD/
│
├── Project-Title/
│   ├── requirement/
│   │   └── requirement.md
│   ├── src/
│   │   └── Main.java
│   ├── sol/
│   │   └── Main.java
│   └── design-output/
│       ├── output-1.png
│       └── output-2.png
│
└── README.md
```

Replace `Project-Title` with the selected PRD title using hyphens between words.

Example:

```text
Second-PRD/
│
├── Weekly-Coding-Practice-Tracker/
│   ├── requirement/
│   │   └── requirement.md
│   ├── src/
│   │   └── Main.java
│   ├── sol/
│   │   └── Main.java
│   └── design-output/
│       ├── output-1.png
│       └── output-2.png
│
└── README.md
```
