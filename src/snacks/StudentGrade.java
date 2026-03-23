package snacks;

import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentGrade app = new StudentGrade();

        System.out.println("How many students do you have?");
        int numberOfStudents = scanner.nextInt();
        System.out.println("How many subject do they offer?");
        int numberOfSubjects = scanner.nextInt();

        System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Saved successfully");

        int[][] studentScores = new int[numberOfStudents][numberOfSubjects];

        for (int i = 0; i < numberOfStudents; i++) {
            for (int j = 0; j < numberOfSubjects; j++) {
                int score = -1;
                while (score < 0 || score > 100) {
                    System.out.println("Entering score for student " + (i + 1));
                    System.out.println("Enter score for subject " + (j + 1));
                    score = scanner.nextInt();
                    if (score < 0 || score > 100) {
                        System.out.println("Invalid score! Please enter score between 0 and 100.");
                    }
                }
                studentScores[i][j] = score;
                System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("Saved successfully");
            }
        }

        app.displayFullReport(studentScores);
    }

    public void displayFullReport(int[][] scores) {
        int numberOfStudents = scores.length;
        int numberOfSubjects = scores[0].length;

        int[] totalScores = new int[numberOfStudents];
        double[] averageScores = new double[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            totalScores[i] = calculateTotalScore(scores[i]);
            averageScores[i] = calculateAverageScore(scores[i]);
        }

        int[] positions = calculatePositions(totalScores);

        printMainTable(scores, totalScores, averageScores, positions);
        printSubjectSummaries(scores);
        printClassSummary(scores, totalScores);
    }

    public int calculateTotalScore(int[] scores) {
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        return total;
    }

    public double calculateAverageScore(int[] scores) {
        if (scores.length == 0) return 0.0;
        return (double) calculateTotalScore(scores) / scores.length;
    }

    public int[] calculatePositions(int[] totalScores) {
        int[] positions = new int[totalScores.length];
        for (int i = 0; i < totalScores.length; i++) {
            int rank = 1;
            for (int j = 0; j < totalScores.length; j++) {
                if (totalScores[j] > totalScores[i]) rank++;
            }
            positions[i] = rank;
        }
        return positions;
    }

    private void printMainTable(int[][] scores, int[] totals, double[] averages, int[] positions) {
        int numberOfSubjects = scores[0].length;
        String line = "=".repeat(60 + (numberOfSubjects * 8));

        System.out.println(line);
        System.out.printf("%-12s", "STUDENT");
        for (int i = 1; i <= numberOfSubjects; i++) {
            System.out.printf("%-8s", "SUB" + i);
        }
        System.out.printf("%-8s %-8s %-8s%n", "TOT", "AVE", "POS");
        System.out.println(line);

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-12s", "Student " + (i + 1));
            for (int score : scores[i]) {
                System.out.printf("%-8d", score);
            }
            System.out.printf("%-8d %-8.2f %-8d%n", totals[i], averages[i], positions[i]);
        }
        System.out.println(line);
        System.out.println(line);
    }

    private void printSubjectSummaries(int[][] scores) {
        System.out.println("\nSUBJECT SUMMARY");
        for (int j = 0; j < scores[0].length; j++) {
            int[] subjectScores = getSubjectScores(scores, j);
            int highestIndex = findHighestScorerIndex(subjectScores);
            int lowestIndex = findLowestScorerIndex(subjectScores);
            int total = calculateTotalScore(subjectScores);
            double average = calculateAverageScore(subjectScores);
            int passes = countPassesIn(subjectScores);
            int fails = countFailsIn(subjectScores);

            System.out.println("Subject " + (j + 1));
            System.out.println("Highest scoring student is:  Student " + (highestIndex + 1) + " scoring " + subjectScores[highestIndex]);
            System.out.println("Lowest Scoring student is:   Student " + (lowestIndex + 1) + " scoring " + subjectScores[lowestIndex]);
            System.out.println("Total Score is:  " + total);
            System.out.println("Average score is: " + String.format("%.2f", average));
            System.out.println("Number of passes: " + passes);
            System.out.println("Number of Fails: " + fails + "\n");
        }
    }

    private void printClassSummary(int[][] scores, int[] studentTotals) {
        int hardestSubjectIndex = 0;
        int easiestSubjectIndex = 0;
        int maxFails = -1;
        int maxPasses = -1;

        for (int j = 0; j < scores[0].length; j++) {
            int[] subScores = getSubjectScores(scores, j);
            int fails = countFailsIn(subScores);
            int passes = countPassesIn(subScores);
            if (fails > maxFails) {
                maxFails = fails;
                hardestSubjectIndex = j;
            }
            if (passes > maxPasses) {
                maxPasses = passes;
                easiestSubjectIndex = j;
            }
        }

        int bestStudentIndex = findHighestScorerIndex(studentTotals);
        int worstStudentIndex = findLowestScorerIndex(studentTotals);
        int classTotal = calculateTotalScore(studentTotals);
        double classAverage = (double) classTotal / studentTotals.length;

        System.out.println("The hardest subject is Subject " + (hardestSubjectIndex + 1) + " with " + maxFails + " failures");
        System.out.println("The easiest subject is Subject " + (easiestSubjectIndex + 1) + " with " + maxPasses + " passes");

        System.out.println("=========================================");
        System.out.println("CLASS SUMMARY");
        System.out.println("=========================================");
        System.out.println("Best Graduating Student is: Student " + (bestStudentIndex + 1) + " scoring " + studentTotals[bestStudentIndex]);
        System.out.println("=========================================");
        System.out.println("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("Worst Graduating Student is: Student " + (worstStudentIndex + 1) + " scoring " + studentTotals[worstStudentIndex]);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
        System.out.println("=========================================");
        System.out.println("Class total score is: " + classTotal);
        System.out.println("Class Average score is: " + classAverage);
        System.out.println("=========================================");
    }

    private int[] getSubjectScores(int[][] scores, int subjectIndex) {
        int[] subjectScores = new int[scores.length];
        for (int i = 0; i < scores.length; i++) {
            subjectScores[i] = scores[i][subjectIndex];
        }
        return subjectScores;
    }

    public int findHighestScorerIndex(int[] scores) {
        int highestIndex = 0;
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > scores[highestIndex]) highestIndex = i;
        }
        return highestIndex;
    }

    public int findLowestScorerIndex(int[] scores) {
        int lowestIndex = 0;
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < scores[lowestIndex]) lowestIndex = i;
        }
        return lowestIndex;
    }

    public int countPassesIn(int[] scores) {
        int passes = 0;
        for (int score : scores) {
            if (score >= 50) passes++;
        }
        return passes;
    }

    public int countFailsIn(int[] scores) {
        int fails = 0;
        for (int score : scores) {
            if (score < 50) fails++;
        }
        return fails;
    }
}
