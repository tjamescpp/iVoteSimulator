package iVoteSimulator;

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
        Student student = new Student();
        SingleChoiceQuestion question = new SingleChoiceQuestion();
        VotingService voteService;
        Random rand = new Random();
        Integer answer = 0;
        String correctAnswer = "";
        int studentId;
        int i, j;

        // Simulator output
        System.out.println("\n===== Welcome to iVote! =====\n");

        // Generate a random Single Choice question
        j = rand.nextInt(3);
        System.out.println(question.getQuestions().get(j));

        // Get correct answer
        if (j == 0)
            correctAnswer = question.getCorrectAnswer1();
        else if (j == 1)
            correctAnswer = question.getCorrectAnswer2();
        else if (j == 2)
            correctAnswer = question.getCorrectAnswer3();

        // Print answers for students to choose from
        System.out.println(
            "\n(A) " + question.getAnswer1() + 
            "\n(B) " + question.getAnswer2() + 
            "\n(C) " + question.getAnswer3() + 
            "\n(D) " + question.getAnswer4()
        );
        
        // This loop generates 10 random students (ID numbers) and 10 random answers
        for (i = 0; i < 10; i++){
            studentId = rand.nextInt(1000) + 1000;
            student.addStudents(studentId);

            answer = rand.nextInt(4) + 1;
            student.addAnswers(answer);
        }

        // Voting service object to calculate stats
        voteService = new VotingService(question, student.getAnswerList());
        voteService.calcStats();

        // Print student answers and stats
        System.out.println("\n===== Answers =====");

        System.out.println(
            "\nA: " + voteService.getCountA() +
            "\nB: " + voteService.getCountB() +
            "\nC: " + voteService.getCountC() +
            "\nD: " + voteService.getCountD()
        );

        System.out.println("\nCorrect Answer: " + correctAnswer);

    }
}