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
    
    Question questionType;
    ArrayList<String> answerList;
    int countA;
    int countB;
    int countC;
    int countD;
    
    public VotingService(Question questionType, ArrayList<String> answerList) {
        this.questionType = questionType;
        this.answerList = answerList;
    }

    // calculate student answer stats
    public void calcStats() {
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
    public Question getQuestionType() {
        return questionType;
    }

    public void setQuestionType(Question questionType) {
        this.questionType = questionType;
    }

    public ArrayList<String> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(ArrayList<String> answerList) {
        this.answerList = answerList;
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
