package iVoteSimulator;

import java.util.Random;

/*
 * Student class
 */

public class Student {
    private String name;
    private int studentID;
    private Random randInt;

    public Student(String name) {
        this.name = name;
        // init random studentID
        this.studentID = randomID();
    }

    // generates random number between (1000, 9999)
    private int randomID(){
        randInt = new Random();
        return randInt.nextInt(10000) + 1000;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    
}
