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
public class P4Q1c {
    public static void main(String[] args) {
        
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("Josh");
        
        emp1.setName("David");
        emp1.setSalary(5000.00);
        emp2.setSalary(4500.00);
        
        System.out.print("The employee with higher salary is ");
        if (emp1.getSalary() > emp2.getSalary()) {
            System.out.println(emp1.getName());
        } else {
            System.out.println(emp2.getName());
        }
        
        System.out.print("The total salary of the 2 employees is RM");
        System.out.printf("%.2f\n", emp1.getSalary() + emp2.getSalary());
    }
}
