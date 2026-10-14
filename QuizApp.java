package quiz;

import java.util.Scanner;

public class QuizApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = 0;
        int choice;
        boolean quizAttempted = false;

        String[] questions = {
            "Which language is used for Android development?",
            "Which keyword creates an object in Java?",
            "Which method is the entry point in Java?",
            "Which symbol ends a Java statement?",
            "Which data type stores whole numbers?",
            "Which keyword is used for inheritance?",
            "Which loop executes at least once?",
            "Which keyword creates a class?",
            "Which operator checks equality?",
            "Which keyword returns a value?"
        };

        String[][] options = {
            {"Java", "HTML", "CSS", "SQL"},
            {"class", "new", "static", "void"},
            {"start()", "run()", "main()", "print()"},
            {":", ",", ";", "."},
            {"int", "String", "boolean", "char"},
            {"implements", "extends", "import", "package"},
            {"for", "while", "do-while", "if"},
            {"object", "create", "class", "method"},
            {"=", "==", "!=", "+"},
            {"break", "continue", "print", "return"}
        };

        int[] answers = {1, 2, 3, 3, 1, 2, 3, 3, 2, 4};

        do {
            System.out.println("\n===== QUIZ MANAGEMENT SYSTEM =====");
            System.out.println("1. Start Quiz");
            System.out.println("2. View Result");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            if (choice == 1) {

                score = 0;
                quizAttempted = true;

                for (int i = 0; i < questions.length; i++) {

                    System.out.println("\nQuestion " + (i + 1) + ": "
                            + questions[i]);

                    for (int j = 0; j < options[i].length; j++) {
                        System.out.println((j + 1) + ". " + options[i][j]);
                    }

                    int answer;

                    System.out.print("Enter answer (1-4): ");
                    answer = sc.nextInt();

                    while (answer < 1 || answer > 4) {
                        System.out.println(
                                "Invalid answer! Please enter 1 to 4.");
                        System.out.print("Enter answer (1-4): ");
                        answer = sc.nextInt();
                    }

                    if (answer == answers[i]) {
                        score++;
                        System.out.println("Correct Answer!");
                    } else {
                        System.out.println("Wrong Answer!");
                        System.out.println("Correct answer: "
                                + options[i][answers[i] - 1]);
                    }
                }

                System.out.println("\n===== QUIZ COMPLETED =====");
                System.out.println("Your score: " + score + "/10");

            } else if (choice == 2) {

                if (quizAttempted) {
                    System.out.println("\n===== YOUR RESULT =====");
                    System.out.println("Your score: " + score + "/10");
                } else {
                    System.out.println(
                            "Please complete the quiz first!");
                }

            } else if (choice == 3) {

                System.out.println(
                        "Thank you for using Quiz Management System!");

            } else {

                System.out.println(
                        "Invalid choice! Please select 1, 2, or 3.");
            }

        } while (choice != 3);

        sc.close();
    }
}