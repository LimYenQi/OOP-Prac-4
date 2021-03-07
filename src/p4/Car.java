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
public class Car {
    private String plateNo;
    private String colour;
    private int year;
    private CarType carType; // aggregation
    
    public Car (String plateNo, String colour, int year, CarType carType) {
        this.plateNo = plateNo;
        this.colour = colour;
        this.year = year;
        this.carType = carType;
    }
    
    public String toString () {
        return this.plateNo + "\t\t" + this.colour + "\t" + this.year + "\t" + this.carType + "\t";
    }
}
