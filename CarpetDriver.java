/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CostAnalyzer;

import java.util.Scanner;

/**
 *
 * @author daniel.grewal090
 */
public class CarpetDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width, length;
        int type;
        
        System.out.print("Please enter the dimension of the room (length width): ");
        length = in.nextDouble();
        width = in.nextDouble();
        System.out.print("Please enter the number associated with your carpetType (1-10): ");
        type = in.nextInt();
        
        RoomDimension myRoom = new RoomDimension(length, width);
        
        RoomCarpet carpet = new RoomCarpet(myRoom, type);
        
        System.out.print("The total cost to carpet this room is: $" + carpet.getTotalCost());
        
    }
    
}
