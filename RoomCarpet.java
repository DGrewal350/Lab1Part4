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
    
    // Default constructor sets carpetCost to 8 per yard
    public RoomCarpet (RoomDimension dim) { this.size = dim; this.carpetCost = 8.00; }
    public RoomCarpet (RoomDimension dim, double cost)
    {
        this.size = dim;
        this.carpetCost = cost;
    }
    
    public double getTotalCost() { return this.size.getArea() * this.carpetCost; }
    public String toString() { return this.size.toString() + " at $" + Double.toString(this.carpetCost); }
    
}
