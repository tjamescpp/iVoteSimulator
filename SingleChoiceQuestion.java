package iVoteSimulator;

import java.util.ArrayList;

public class SingleChoiceQuestion implements Question {

    // Arrays to store questions, answers, and student answers
    private ArrayList<String> questions;
    private ArrayList<String> answers;
    private ArrayList<Integer> studentAnswers;

    // Variables
    private String question1;
    private String question2;
    private String question3;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private String correctAnswer1;
    private String correctAnswer2;
    private String correctAnswer3;

    public SingleChoiceQuestion() {
        questions = new ArrayList<String>();
        answers = new ArrayList<String>();
        studentAnswers = new ArrayList<Integer>();

        // Create questions
        setQuestion1("The class that a subclass is derived from is called what?");
        setQuestion2("The class that is derived from superclass is called what?");
        setQuestion3("What is an interface in java?");

        addQuestion(question1);
        addQuestion(question2);
        addQuestion(question3);

        // Create possible answers
        setAnswer1("Superclass");
        setAnswer2("Subclass");
        setAnswer3("An abstract type that classes must implement");
        setAnswer4("None of the above");

        addAnswer(answer1);
        addAnswer(answer2);
        addAnswer(answer3);
        addAnswer(answer4);

        // Set correct answers
        setCorrectAnswer1("A");
        setCorrectAnswer2("B");
        setCorrectAnswer3("C");      
    }

    // add questions to array
    @Override
    public void addQuestion(String question) {
        questions.add(question);
    }

    // add answers to array
    @Override
    public void addAnswer(String answer) {
        answers.add(answer);
    }

    // add student answers to array
    @Override
    public void addStudentAnswer(int answer) {
        studentAnswers.add(answer);
    }

    // getters and setters
    public String getQuestion1() {
        return question1;
    }

    public void setQuestion1(String question1) {
        this.question1 = question1;
    }

    public String getQuestion2() {
        return question2;
    }

    public void setQuestion2(String question2) {
        this.question2 = question2;
    }

    public String getQuestion3() {
        return question3;
    }

    public void setQuestion3(String question3) {
        this.question3 = question3;
    }

    public ArrayList<String> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<String> questions) {
        this.questions = questions;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public ArrayList<Integer> getStudentAnswers() {
        return studentAnswers;
    }

    public void setStudentAnswers(ArrayList<Integer> studentAnswers) {
        this.studentAnswers = studentAnswers;
    }

    public String getAnswer4() {
        return answer4;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }

    public String getCorrectAnswer1() {
        return correctAnswer1;
    }

    public void setCorrectAnswer1(String correctAnswer1) {
        this.correctAnswer1 = correctAnswer1;
    }

    public String getCorrectAnswer2() {
        return correctAnswer2;
    }

    public void setCorrectAnswer2(String correctAnswer2) {
        this.correctAnswer2 = correctAnswer2;
    }

    public String getCorrectAnswer3() {
        return correctAnswer3;
    }

    public void setCorrectAnswer3(String correctAnswer3) {
        this.correctAnswer3 = correctAnswer3;
    }
}
