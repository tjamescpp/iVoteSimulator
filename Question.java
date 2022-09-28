package iVoteSimulator;

import java.util.ArrayList;

// Question interface
public class Question {

    private ArrayList<String> questions;

    public Question() {
        questions = new ArrayList<String>();
    }

    // add questions to an ArrayList 
    public void addQuestion(String question){
        questions.add(question);
    }     

    public ArrayList<String> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<String> questions) {
        this.questions = questions;
    }

}
