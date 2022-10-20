/*
You have been tasked with writing a program for a school which produces some statistics on students’
exam results. The users are teachers who will input each student’s score, and any other necessary data.
Store the scores in an array. The program should output:

Each student’s score and percentage for the exam

The mean (average) score and percentage of the exam

Hints:

Have the program ask how many students took the exam, so it knows how many scores to process.

The program will also need to know the maximum possible score that can be achieved.

It will also need to ask the user to input each student’s score (you can refer to each student as
 a number, e.g. “Student 1”, “Student 2”, etc, rather than asking for names.)
 */

import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int students=sc.nextInt();

        int max_score=sc.nextInt();

        double[] scores = new double[students];

        System.out.println("\nEnter each student's score.");
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            scores[i] = sc.nextDouble();
        }
        double percentage=0;
        double mean=0;
        double sum=0;
        for (int i = 0; i < scores.length; i++) {
            percentage=(scores[i]/max_score)*100;
            System.out.println("Student " + (i + 1) + ": " + scores[i] + "/" + max_score + " (" + percentage + "%)");

            sum=sum+scores[i];


        }
        mean=sum/scores.length;
        System.out.println("The percentage score is: "+percentage);
        double meanPercentage = (mean / max_score) * 100;
        System.out.println("Mean: " + mean + "/" + max_score + " (" + meanPercentage + "%)");



    }
}
