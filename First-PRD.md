# HireReady — Campus Placement Application Checker

## First Java PRD

# 1. What Are You Building?

You are going to build a simple Java application called **HireReady**.

The application checks whether a student is eligible to apply for a campus placement drive.

The program will store the candidate's details, calculate assessment percentages, check all placement conditions, and display the final result.

---

# 2. What Is a PRD?

PRD means **Product Requirements Document**.

A PRD explains:

- What application must be created
- What information the application requires
- What calculations must be performed
- What conditions must be checked
- What output must be displayed

Your responsibility is to read the requirement, understand it, and create the Java program.

---

# 3. Project Scenario

A company is conducting a campus placement drive.

A candidate can apply only when all the company requirements are satisfied.

The company checks:

- Degree percentage
- Active backlogs
- Graduation year
- Aptitude performance
- Coding performance
- Communication score
- Project completion
- Profile verification

Your program must check one candidate and display whether the candidate can apply.

---

# 4. Concepts You Can Use

Use only the Java concepts completed in class:

- Java program structure
- `main()` method
- Variables
- Primitive data types
- `String`
- `System.out.print()`
- `System.out.println()`
- Arithmetic operators
- Assignment operators
- Relational operators
- Logical operators
- Type casting
- Integer and decimal division
- Boolean expressions
- `if`
- `else if`
- `else`
- Nested conditions
- Compound conditions
- String concatenation

---

# 5. Concepts You Must Not Use

Do not use:

- `Scanner`
- User input
- Loops
- Arrays
- User-defined methods
- Additional classes
- Objects
- Collections
- Exception handling
- File handling
- Database connectivity

Use only fixed values inside `Main.java`.

---

# 6. Candidate Details

Create variables for the following candidate details:

| Candidate Detail | Suggested Data Type |
|---|---|
| Candidate name | `String` |
| Registration number | `int` |
| Degree | `String` |
| Graduation year | `int` |
| Degree percentage | `double` |
| Active backlogs | `int` |
| Aptitude correct answers | `int` |
| Aptitude total questions | `int` |
| Coding test cases passed | `int` |
| Coding total test cases | `int` |
| Communication score | `int` |
| Project completed | `boolean` |
| Profile verified | `boolean` |

## Example Candidate Values

```java
String candidateName = "Aarav";
int registrationNumber = 24031;
String degree = "B.E. Computer Science";
int graduationYear = 2026;
double degreePercentage = 72.5;
int activeBacklogs = 0;

int aptitudeCorrectAnswers = 38;
int aptitudeTotalQuestions = 50;

int codingTestCasesPassed = 8;
int codingTotalTestCases = 10;

int communicationScore = 68;

boolean projectCompleted = true;
boolean profileVerified = true;
```

You must use your own candidate name, registration number, degree, and values.

Do not copy the complete example exactly.

---

# 7. Company Eligibility Rules

The candidate is eligible only when all the following conditions are satisfied:

1. Degree percentage must be at least `60`.
2. Active backlogs must be `0`.
3. Graduation year must be `2025`, `2026`, or `2027`.
4. Aptitude percentage must be at least `60`.
5. Coding percentage must be at least `70`.
6. Communication score must be at least `60`.
7. Project must be completed.
8. Profile must be verified.

---

# 8. Calculate Aptitude Percentage

Use this formula:

```text
Aptitude Percentage =
Aptitude Correct Answers / Aptitude Total Questions × 100
```

You must use casting before division.

Example:

```java
double aptitudePercentage =
        (double) aptitudeCorrectAnswers
        / aptitudeTotalQuestions
        * 100;
```

For `38` correct answers out of `50`, the aptitude percentage is:

```text
76.0
```

---

# 9. Calculate Coding Percentage

Use this formula:

```text
Coding Percentage =
Coding Test Cases Passed / Coding Total Test Cases × 100
```

Use casting before division.

Example:

```java
double codingPercentage =
        (double) codingTestCasesPassed
        / codingTotalTestCases
        * 100;
```

For `8` passed test cases out of `10`, the coding percentage is:

```text
80.0
```

---

# 10. Create Eligibility Conditions

Create one Boolean variable for every condition.

You must create conditions for:

- Degree eligibility
- Backlog eligibility
- Graduation-year eligibility
- Aptitude eligibility
- Coding eligibility
- Communication eligibility
- Project eligibility
- Profile-verification eligibility

Example:

```java
boolean degreeEligible = degreePercentage >= 60;
```

Create similar Boolean expressions for all other rules.

You must also create one final Boolean condition that combines all eligibility conditions using the logical AND operator.

---

# 11. Final Application Status

The program must display only one final status.

## Eligible to Apply

Display this when all eligibility conditions are satisfied.

## Not Eligible

Display this when the candidate fails any of these:

- Degree percentage
- Active backlogs
- Graduation year
- Aptitude percentage
- Coding percentage
- Communication score

## Application On Hold

Display this when the candidate passes the performance requirements but:

- Project is incomplete, or
- Profile is not verified

---

# 12. Condition Checking Order

Check the conditions in this order:

1. Degree percentage
2. Active backlogs
3. Graduation year
4. Aptitude percentage
5. Coding percentage
6. Communication score
7. Project completion
8. Profile verification

The program must display the first problem that the candidate needs to correct.

Example:

If the degree percentage is below `60` and the candidate also has active backlogs, display only the degree-percentage issue because it comes first.

---

# 13. Final Status Messages

Use `if`, `else if`, and `else`.

The result should follow this format:

| Failed Condition | Application Status | Next Action |
|---|---|---|
| Degree below 60 | Not Eligible | Improve degree percentage |
| Active backlogs above 0 | Not Eligible | Clear active backlogs |
| Graduation year outside range | Not Eligible | Check graduation-year criteria |
| Aptitude below 60% | Not Eligible | Improve aptitude performance |
| Coding below 70% | Not Eligible | Improve coding performance |
| Communication below 60 | Not Eligible | Improve communication |
| Project incomplete | Application On Hold | Complete the project |
| Profile not verified | Application On Hold | Complete profile verification |
| All conditions passed | Eligible to Apply | Submit the company application |

---

# 14. Required Output

The program must display:

- Candidate name
- Registration number
- Degree
- Graduation year
- Degree percentage
- Active backlogs
- Aptitude score
- Aptitude percentage
- Coding test cases
- Coding percentage
- Communication score
- Project-completion status
- Profile-verification status
- Individual eligibility results
- Final application status
- Next action

---

# 15. Sample Output

```text
================================================
        CAMPUS PLACEMENT APPLICATION REPORT
================================================

Candidate Name          : Aarav
Registration Number     : 24031
Degree                  : B.E. Computer Science
Graduation Year         : 2026
Degree Percentage       : 72.5
Active Backlogs         : 0

------------------------------------------------
Aptitude Score          : 38 / 50
Aptitude Percentage     : 76.0
Coding Test Cases       : 8 / 10
Coding Percentage       : 80.0
Communication Score     : 68
Project Completed       : Yes
Profile Verified        : Yes

------------------------------------------------
Degree Eligibility      : Eligible
Backlog Eligibility     : Eligible
Graduation Year         : Eligible
Aptitude Eligibility    : Eligible
Coding Eligibility      : Eligible
Communication Status    : Eligible

------------------------------------------------
Application Status      : Eligible to Apply
Next Action             : Submit the company application
================================================
```

Your output wording may be slightly different, but all required details must be present.

Use your own candidate values in the final output.

---

# 16. Important Boolean Output Rule

Do not display only:

```text
true
false
```

Display meaningful results.

Instead of:

```text
Project Completed: true
```

Display:

```text
Project Completed: Yes
```

Instead of:

```text
Degree Eligible: false
```

Display:

```text
Degree Eligibility: Not Eligible
```

---

# 17. Simple Test Cases

Test the program by manually changing the fixed values in `Main.java`.

## Test Case 1 — Eligible Candidate

Use values that satisfy all conditions.

Expected result:

```text
Application Status: Eligible to Apply
```

## Test Case 2 — Not Eligible Candidate

Use a degree percentage below `60`.

Expected result:

```text
Application Status: Not Eligible
Next Action: Improve degree percentage
```

## Test Case 3 — Application On Hold

Satisfy all performance conditions, but set project completion to `false`.

Expected result:

```text
Application Status: Application On Hold
Next Action: Complete the project
```

---

# 18. GitHub Repository Structure

Create a GitHub repository named `First-PRD` and clone it to your system.

Create the following folders and files:

```text
First-PRD/
└── Campus-Placement-Application-Checker/
    └── HireReady/
        ├── src/
        │   └── Main.java
        └── output/
            └── console-output.txt
```

Write the complete Java program inside:

```text
Campus-Placement-Application-Checker/HireReady/src/Main.java
```

---

# 19. Save the Console Output

Compile and run the completed program.

Copy the **entire output displayed in the console** and paste it inside:

```text
Campus-Placement-Application-Checker/HireReady/output/console-output.txt
```

The output file must contain the complete final result produced by your program.

---

# 20. Push the Project to GitHub

After completing the program and saving the console output:

```bash
git add .
git commit -m "Complete HireReady first PRD"
git push origin main
```

Submit your GitHub repository link after pushing the completed project.
