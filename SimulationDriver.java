package iVoteSimulator;

import java.util.ArrayList;
import java.util.Random;

/*
 * Simulation driver class
 * 
 * 1) create a question type and configure the answers; 
 * 2) configure the question for iVote Service;
 * 3) randomly generate a number students and the answers;
 * 4) submit all the students’ answers to iVote Service; 
 * 5) call the Voting Service output function to display the result.
 * 
 * SimulationDriver should contain a main() method that triggers the whole process. 
 * You can randomly generate the IDs and answers for a group of students to simulate 
 * the submission process and check the results.
 */

public class SimulationDriver {

    public static void main(String[] args) {

        SingleChoiceQuestion singleChoiceQuestion = new SingleChoiceQuestion();
        MultipleChoiceQuestion multipleChoiceQuestion = new MultipleChoiceQuestion();

        singleQuestionSimulator(singleChoiceQuestion);
        multiplChoiceSimulator(multipleChoiceQuestion);
    }

    public static void singleQuestionSimulator (SingleChoiceQuestion singleChoiceQuestion) {
        VotingService voteService;
        ArrayList<String> answers = new ArrayList<String>();
        Student student = new Student();
        Random rand = new Random();
        Integer answer = 0;
        String correctAnswer = "";
        int studentId;
        int i, j;

        // Simulator output
        System.out.println("\n===== Welcome to iVote! =====\n");

        // Start voting service
        voteService = new VotingService(singleChoiceQuestion);
        singleChoiceQuestion = voteService.getSingleChoiceQuestion();

        // Generate a random single choice question
        j = rand.nextInt(3);
        System.out.println(singleChoiceQuestion.getQuestions().get(j) + "\n");

        // Correct answer
        correctAnswer = voteService.getSingleChoiceAnswers().get(j);

        // Print answers for students to choose from
        for (i = 0; i < voteService.getSingleChoiceAnswerOptions().size(); i++) {
            System.out.println(voteService.getSingleChoiceAnswerOptions().get(i));
        } 

        // This loop generates 10 random students (ID numbers) and 10 random answers
        for (i = 0; i < 10; i++) {
            studentId = rand.nextInt(1000) + 1000; // between 1000 - 9999
            student.addStudents(studentId);

            answer = rand.nextInt(4) + 1;

            if (answer == 1)
                answers.add("A");
            else if (answer == 2)
                answers.add("B");
            else if (answer == 3)
                answers.add("C");
            else if (answer == 4)
                answers.add("D");
        }

        // Call function to calculate stats
        voteService.calcStats(answers);

        // Print student answers and stats
        System.out.println("\n===== Answers =====");

        System.out.println(
                "\nA: " + voteService.getCountA() +
                "\nB: " + voteService.getCountB() +
                "\nC: " + voteService.getCountC() +
                "\nD: " + voteService.getCountD());

        System.out.println("\nCorrect Answer: " + correctAnswer + "\n");
    }

    public static void multiplChoiceSimulator(MultipleChoiceQuestion multipleChoiceQuestion) {
        VotingService voteService;
        ArrayList<String> answers = new ArrayList<String>();
        Student student = new Student();
        Random rand = new Random();
        Integer answer = 0;
        // String correctAnswer = "";
        int studentId;
        int i, j;

        // Simulator output
        System.out.println("\n===== Welcome to iVote! =====\n");

        // Start voting service
        voteService = new VotingService(multipleChoiceQuestion);
        multipleChoiceQuestion = voteService.getMultipleChoiceQuestion();

        // Generate a multiple choice question
        System.out.println(multipleChoiceQuestion.getQuestions().get(0) + "\n");

        // Print answers for students to choose from
        for (i = 0; i < voteService.getMultipleChoiceAnswerOptions().size(); i++) {
            System.out.println(voteService.getMultipleChoiceAnswerOptions().get(i));
        } 

        // This loop generates 10 random students (ID numbers) and 10 random answers
        for (i = 0; i < 10; i++) {
            studentId = rand.nextInt(1000) + 1000; // between 1000 - 9999
            student.addStudents(studentId);

            // 2 answers are also generated for every student.
            for (j = 0; j < 2; j++) {
                answer = rand.nextInt(4) + 1;

                if (answer == 1)
                    answers.add("A");
                else if (answer == 2)
                    answers.add("B");
                else if (answer == 3)
                    answers.add("C");
                else if (answer == 4)
                    answers.add("D");
            }     
        }

        // Call function to calculate stats
        voteService.calcStats(answers);

        // Print student answers and stats
        System.out.println("\n===== Answers =====");

        System.out.println(
                "\nA: " + voteService.getCountA() +
                "\nB: " + voteService.getCountB() +
                "\nC: " + voteService.getCountC() +
                "\nD: " + voteService.getCountD());

        // Print correct answer
        System.out.println("\nCorrect Answers:");
        for (i = 0; i < voteService.getMultipleChoiceAnswers().size(); i++)
            System.out.println(voteService.getMultipleChoiceAnswers().get(i));
    }
}