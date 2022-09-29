package iVoteSimulator;

/*
 * MultipleChoiceQuestion inherits from the parent class Question
 * 
 * Methods inherited:
 * 
 * addQuestion()
 * getQuestions()
 * setQuestions(ArrayList<String> questions)
 */
public class MultipleChoiceQuestion extends Question {
    
    // Holds the correct answer(s) for a multiple choice question
    private String correctAnswer;

    public MultipleChoiceQuestion() {
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
