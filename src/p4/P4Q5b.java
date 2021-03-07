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
public class P4Q5b {
    public static void main(String[] args) {
        Course c1 = new Course("Introduction to Computers", 250);
        
        c1.addStudent("Ali Said");
        c1.addStudent("Wong Ken");
        c1.addStudent("Peter Lim");
        
        String[] students = c1.getStudentNames();
        
        System.out.println("Details of The New Course");
        System.out.println(c1);
        System.out.print("Names of Students : ");
        for(int i = 0; i < c1.getNoOfStudents(); i++) {
            System.out.print(students[i]);
            if (i != (c1.getNoOfStudents() - 1))
                System.out.print(", ");
            else
                System.out.println();
        }
    }
}
