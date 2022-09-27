package iVoteSimulator;

import java.util.ArrayList;


/*
 * Student class
 */

public class Student {

    // Arrays for student IDs and student answers
    private ArrayList<String> studentIdList;
    private ArrayList<String> answerList;

    // Variables
    private Integer studentId;

    public Student() {
        studentIdList = new ArrayList<String>();
        answerList = new ArrayList<String>();
    }

    // adds answers to an array based on corresponding int (ex: 1 -> "A")
    public void addAnswers(int answer){
        if (answer == 1)
            answerList.add("A");
        else if (answer == 2)
            answerList.add("B");
        else if (answer == 3)
            answerList.add("C");
        else if (answer == 4)
            answerList.add("D");
        else
            answerList.add(null);
    }

    // adds to students to array
    public void addStudents(Integer studentID) {
        studentIdList.add(studentID.toString());
    }

    // getters and setters
    public ArrayList<String> getStudentIdList() {
        return studentIdList;
    }

    public void setStudentIdList(ArrayList<String> studentIdList) {
        this.studentIdList = studentIdList;
    }

    public int getStudentID() {
        return studentId;
    }

    public void setStudentID(int studentID) {
        this.studentId = studentID;
    }

    public ArrayList<String> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(ArrayList<String> answerList) {
        this.answerList = answerList;
    }
}
