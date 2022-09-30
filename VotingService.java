package iVoteSimulator;

import java.util.ArrayList;

/*
 * Voting Service class
 * 
 * 3) The Voting Service can be first configured with a given question type and candidate
    answers. Then, it can start accepting submissions from students. The important thing to
    keep in mind about accepting submissions is that each student can only submit one
    answer. If multiple submissions are received from the same student, only the last
    submission will be counted.

    4) The Voting Service can also output the statistics of the submission results. You don’t
    have to use the graphical interface. Simply use the standard output (System.out) to
    print out the count for each answer. For example, “A : 5, B : 12”, or “1. Right :
    15, 2. Wrong : 20”. Feel free to customize the format for your output.  
 */
public class VotingService {
    
    // question types
    protected SingleChoiceQuestion singleChoiceQuestion;
    protected MultipleChoiceQuestion multipleChoiceQuestion;

    // answers to questions
    private ArrayList<String> singleChoiceAnswers;
    private ArrayList<String> multipleChoiceAnswers;

    // possible answers
    private ArrayList<String> singleChoiceAnswerOptions;
    private ArrayList<String> multipleChoiceAnswerOptions;

    // counting variables for answers stats
    int countA;
    int countB;
    int countC;
    int countD;
    
    public VotingService(SingleChoiceQuestion questionType) {
        singleChoiceQuestion = questionType;
        singleChoiceAnswerOptions = new ArrayList<String>();
        singleChoiceAnswers = new ArrayList<String>();

        // add correct single choice answers
        singleChoiceAnswers.add("(A) Superclass");
        singleChoiceAnswers.add("(B) Subclass");
        singleChoiceAnswers.add("(C) An abstract type that classes must implement");

        createSingleChoiceQuestions();
    }

    public VotingService(MultipleChoiceQuestion questionType) {
        multipleChoiceQuestion = questionType;
        multipleChoiceAnswerOptions = new ArrayList<String>();
        multipleChoiceAnswers = new ArrayList<String>();

        // add correct multiple choice answers
        multipleChoiceAnswers.add("(C) public int var3 = 100;");
        multipleChoiceAnswers.add("(D) private int var4 = 100;");

        createMultipleChoiceQuestions();
    }

    public void createSingleChoiceQuestions(){

        // create questions
        singleChoiceQuestion.addQuestion("The class that a subclass is derived from is called what?");
        singleChoiceQuestion.addQuestion("The class that is derived from a superclass is called what?");
        singleChoiceQuestion.addQuestion("What is an interface in java?");

        // create possible answers
        singleChoiceAnswerOptions.add("(A) Superclass");
        singleChoiceAnswerOptions.add("(B) Subclass");
        singleChoiceAnswerOptions.add("(C) An abstract type that classes must implement");
        singleChoiceAnswerOptions.add("(D) None of the above");
    }

    public void createMultipleChoiceQuestions() {

        // create questions
        multipleChoiceQuestion.addQuestion("Which of the following variable declarations are correct?");

        // create possible answers
        multipleChoiceAnswerOptions.add("public interface TestInterface {" 
        + "\n\t(A) int var1;" 
        + "\n\t(B) final int var2" 
        + "\n\t(C) public int var3 = 100;" 
        + "\n\t(D) private int var4 = 100;" 
        + "\n\t(E) public static final int var5 = 100;"
        + "\n}");
    }

    // calculate student answer stats
    public void calcStats(ArrayList<String> answerList) {
        for (int i = 0; i < answerList.size(); i++) {
            if (answerList.get(i) == "A")
                countA += 1;
            else if (answerList.get(i) == "B")
                countB += 1;
            else if (answerList.get(i) == "C")
                countC += 1;
            else if (answerList.get(i) == "D")
                countD += 1;
        }
    }

    // getters and setters

    public SingleChoiceQuestion getSingleChoiceQuestion() {
        return singleChoiceQuestion;
    }

    public ArrayList<String> getSingleChoiceAnswers() {
        return singleChoiceAnswers;
    }

    public void setSingleChoiceAnswers(ArrayList<String> singleChoiceAnswers) {
        this.singleChoiceAnswers = singleChoiceAnswers;
    }

    public ArrayList<String> getMultipleChoiceAnswers() {
        return multipleChoiceAnswers;
    }

    public void setMultipleChoiceAnswers(ArrayList<String> multipleChoiceAnswers) {
        this.multipleChoiceAnswers = multipleChoiceAnswers;
    }

    public void setSingleChoiceQuestion(SingleChoiceQuestion singleChoiceQuestion) {
        this.singleChoiceQuestion = singleChoiceQuestion;
    }

    public MultipleChoiceQuestion getMultipleChoiceQuestion() {
        return multipleChoiceQuestion;
    }

    public void setMultipleChoiceQuestion(MultipleChoiceQuestion multipleChoiceQuestion) {
        this.multipleChoiceQuestion = multipleChoiceQuestion;
    }

    public ArrayList<String> getSingleChoiceAnswerOptions() {
        return singleChoiceAnswerOptions;
    }

    public void setChoiceAnswerOptions(ArrayList<String> singleChoiceAnswerOptions) {
        this.singleChoiceAnswerOptions = singleChoiceAnswerOptions;
    }

    public ArrayList<String> getMultipleChoiceAnswerOptions() {
        return multipleChoiceAnswerOptions;
    }

    public void setMultipleChoiceAnswerOptions(ArrayList<String> multipleChoiceAnswerOptions) {
        this.multipleChoiceAnswerOptions = multipleChoiceAnswerOptions;
    }

    public int getCountA() {
        return countA;
    }

    public void setCountA(int countA) {
        this.countA = countA;
    }

    public int getCountB() {
        return countB;
    }

    public void setCountB(int countB) {
        this.countB = countB;
    }

    public int getCountC() {
        return countC;
    }

    public void setCountC(int countC) {
        this.countC = countC;
    }

    public int getCountD() {
        return countD;
    }

    public void setCountD(int countD) {
        this.countD = countD;
    }  
}
