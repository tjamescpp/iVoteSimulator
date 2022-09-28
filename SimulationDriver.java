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

        VotingService voteService;
        SingleChoiceQuestion singleChoiceQuestion = new SingleChoiceQuestion();
        // MultipleChoiceQuestion multipleChoiceQuestion = new MultipleChoiceQuestion();
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

        // Generate a random Single Choice question
        j = rand.nextInt(3);
        System.out.println(singleChoiceQuestion.getQuestions().get(j));

        // Print answers for students to choose from
        for (i = 0; i < 4; i++) {
            System.out.println(voteService.getAnswers().get(i));
        }

        // Correct answer
        if (j == 0) {
            singleChoiceQuestion.setCorrectAnswer("Superclass");
            correctAnswer = singleChoiceQuestion.getCorrectAnswer();
        } else if (j == 1) {
            singleChoiceQuestion.setCorrectAnswer("Subclass");
            correctAnswer = singleChoiceQuestion.getCorrectAnswer();
        } else if (j == 2) {
            singleChoiceQuestion.setCorrectAnswer("An abstract type that classes must implement");
            correctAnswer = singleChoiceQuestion.getCorrectAnswer();
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

        // Voting service object to calculate stats
        voteService.calcStats(answers);

        // Print student answers and stats
        System.out.println("\n===== Answers =====");

        System.out.println(
                "\nA: " + voteService.getCountA() +
                        "\nB: " + voteService.getCountB() +
                        "\nC: " + voteService.getCountC() +
                        "\nD: " + voteService.getCountD());

        System.out.println("\nCorrect Answer: " + correctAnswer);

    }
}