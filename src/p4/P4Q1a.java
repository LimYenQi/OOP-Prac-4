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
public class P4Q1a {
    public static void main(String[] args) {
        
        Employee emp1 = new Employee("Josh", 5000);
        
        
//        System.out.println(emp1.name+", your salary before a salary raise of 8% is RM"+emp1.salary);
        emp1.raiseSalary(8);
        System.out.println("Your salary after a salary raise of 8% is RM"+emp1.getSalary());
    }
}
