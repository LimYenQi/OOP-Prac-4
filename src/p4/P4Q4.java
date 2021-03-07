/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lim Yen Qi
 */
public class P4Q4 {
    public static void main(String[] args) {
        ArrayList<Registration> reg = new ArrayList<Registration>();
        
        ArrayList<CarType> carType1 = new ArrayList<CarType>();
        carType1.add(new CarType("Toyota", "Vios", 1.5));
        carType1.add(new CarType("Nissan", "Teana", 2.0));
        carType1.add(new CarType("Honda", "City", 1.6));
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Any car registrations? (yes, no)");
        String x = scanner.nextLine();
        
        while (x.equals("yes")) {
            System.out.print("\nName of the owner: ");
            String ownN = scanner.nextLine();
            System.out.print("IC of the owner: ");
            String ownI = scanner.nextLine();
            Owner own1 = new Owner(ownN, ownI);
            System.out.print("\n");
            
            System.out.println("The type of car available [Make Model Capacity]: ");
            System.out.println(carType1);
            System.out.print("The type of car the owner wants(1/2/3): ");
            int carT = scanner.nextInt();
            scanner.nextLine();
            System.out.print("\n");
            
            System.out.print("Enter the plate number of the car: ");
            String plate = scanner.nextLine();
            System.out.print("Enter the colour of the car: ");
            String colour = scanner.nextLine();
            System.out.print("Enter the year of the car: ");
            int year = scanner.nextInt();
            scanner.nextLine();
            System.out.print("\n");
            Car car1 = new Car(plate, colour, year, carType1.get(carT-1));
            reg.add(new Registration(own1, car1));
            
            System.out.println("\nAny car registrations? (yes, no)");
            x = scanner.nextLine();
        }
        
        System.out.print("\n");
        System.out.println("\t\t\tCar Registration List");
        System.out.println("Reg No.\tName\t\tIC No.\t\t\tPlate No.\tColour\tYear\tMake\tModel\tCapacity");
        for (int i = 0; i < reg.size(); i++) {
            System.out.println(reg.get(i));
        }
    }
}
