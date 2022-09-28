package iVoteSimulator;

import java.util.ArrayList;


/*
 * Student class
 */

public class Student {

    // Arrays for student IDs and student answers
    private ArrayList<String> studentIdList;

    // Variables
    private Integer studentId;

    public Student() {
        studentIdList = new ArrayList<String>();
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
}
