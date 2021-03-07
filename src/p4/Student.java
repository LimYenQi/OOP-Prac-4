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
public class Student {
    private String ID;
    private String name;
    private double totalScore;
    private int quizCount;
    private static double quizContribution;
    
    //Q3 bullet 2
    public Student () {
        this("","");
    }
    //Q3 bullet 1
    public Student (String ID, String name) {
        this.ID = ID;
        this.name = name;
        this.totalScore = 0;
        this.quizCount = 0;
    }
    
    public String getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public double getTotalScore() {
        return totalScore;
    }
    public double getAverageScore () {
        return totalScore/quizCount;
    }
    
    public void setID(String d) {
        ID = d;
    }
    public void setName(String n) {
        name = n;
    }
        //parameter type
    public void addQuiz(int score) {
        totalScore = totalScore + score;
        quizCount = quizCount + 1;
    }
    
    //Q3b
    public static double getQuizContribution() {
        return quizContribution;
    }
    public static void setQuizContribution(double quizContribution) {
        Student.quizContribution = quizContribution;
    }
}
