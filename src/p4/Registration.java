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
public class Registration {
    private int regNo;
    private Owner owner; // aggregation
    private Car car; // aggregation
    private static int nextRegNo = 1000;
    
    public Registration (Owner owner, Car car) {
        this.owner = owner;
        this.car = car;
        nextRegNo++;
        this.regNo = nextRegNo;
    }
    
    public static int getNextRegNo () {
        return nextRegNo;
    }
    
    public String toString () {
        return this.regNo + "\t" + this.owner + "\t" + this.car + "\t";
    }
}
