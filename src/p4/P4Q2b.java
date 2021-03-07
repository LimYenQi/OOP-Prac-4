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
public class P4Q2b {
    public static void main(String[] args) {
        Student.setQuizContribution(20.0); //Q3
        Student student = new Student("2021BACS1004", "Eric");
    
        student.addQuiz(8);
        student.addQuiz(10);
        student.addQuiz(9);

        System.out.print("Name: ");
        System.out.println(student.getName());
        
        System.out.print("Total Score: ");
        System.out.println(student.getTotalScore());
        
        System.out.print("Average: ");
        System.out.println(student.getAverageScore());
        
        //Q3
        System.out.print("Total marks obtained from Quiz: ");
        System.out.println(student.getAverageScore()/10 * student.getQuizContribution());
    }
}
