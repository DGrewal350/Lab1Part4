/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CostAnalyzer;

/**
 *
 * @author daniel.grewal090
 */
public class RoomCarpet {
    RoomDimension size;
    double carpetCost;
    
    public RoomCarpet (RoomDimension dim, double cost)
    {
        this.size = dim;
        this.carpetCost = cost;
    }
    
    public double getTotalCost() { return this.size.getArea() * this.carpetCost; }
    public String toString() { return this.size.toString() + " at $" + Double.toString(this.carpetCost); }
    
}
