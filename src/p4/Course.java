/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4;

/**
 *
 * @author Lim Yen Qi
 */
public class Course {
    private String courseTitle;
    private double feesPerStudent;
    private int noOfStudents;
    private String[] studentNames = new String[100];
    private static int courseCount;

    public Course(String courseTitle, double feesPerStudent) {
        this.courseTitle = courseTitle;
        this.feesPerStudent = feesPerStudent;
        courseCount++;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public double getFeesPerStudent() {
        return feesPerStudent;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public String[] getStudentNames() {
        return studentNames;
    }

    public static int getCourseCount() {
        return courseCount;
    }
    
    public double calcFeesCollected() {
        return feesPerStudent * noOfStudents;
    }
    
    public void addStudent(String studName) {
        this.studentNames[noOfStudents] = studName;
        noOfStudents++;
    }

    public String toString() {
        return "\nCourse Title      : " + courseTitle + "\nFees Per Student  : RM" + feesPerStudent + "\nNumber of Students: " + noOfStudents;
    }
}
