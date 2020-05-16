import java.util.Scanner;
/**
 *  Final program
 *  It takes answers that will help achieve the final semester grade and prints its out.
 *  CS108-4
 *  05/15/2020
 *  @author  YeonJun Lee
 */
public class FinalScoreGuess {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        FinalClassGrade questions = new FinalClassGrade();

        //questions
        questions.name();
        String answer0 = scnr.nextLine();
        questions.scorePrev();
        int answer1 = scnr.nextInt();
        questions.finalProGrade();
        int answer2 = scnr.nextInt();
        questions.proWorth();
        int answer3 = scnr.nextInt();


        //calculate and print
        Score obj = new FinalScore(answer0, answer1, answer2, answer3);
        obj.computeFinal();
        System.out.println("Your Final Semester grade is: ");
        obj.print();


    }
}