package iVoteSimulator;

/*
 * SingleChoiceQuestion inherits from the parent class Question
 * 
 * Methods inherited:
 * 
 * addQuestion()
 * getQuestions()
 * setQuestions(ArrayList<String> questions)
 */
public class SingleChoiceQuestion extends Question {

    // Holds the correct answer for a single choice question
    private String correctAnswer;

    public SingleChoiceQuestion() {
        correctAnswer = "";
    }

    // getters and setters
    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    
}
