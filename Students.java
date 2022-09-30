package iVoteSimulator;

import java.util.ArrayList;
import java.util.HashMap;


/*
 * Student class
 */

public class Students {

    // Arrays for student IDs and student answers
    private ArrayList<String> studentIdList;

    // Hash map to hold student ids and answers
    HashMap<Integer, String> studentMap;

    // Variables
    private Integer studentId;

    public Students() {
        studentIdList = new ArrayList<String>();
        studentMap = new HashMap<Integer, String>();
    }

    // adds to students to array
    public void addStudents(Integer studentID) {
        studentIdList.add(studentID.toString());
    }

    // getters and setters

    public ArrayList<String> getStudentIdList() {
        return studentIdList;
    }

    public HashMap<Integer, String> getStudentMap() {
        return studentMap;
    }

    public void setStudentMap(HashMap<Integer, String> studentMap) {
        this.studentMap = studentMap;
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
