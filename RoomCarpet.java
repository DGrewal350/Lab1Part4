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
    
    // Added carpet type which is just a type multiplyer so cost will be regular cost + (type/100 * cost)
    // (So default is type 0 which means cost + (0/100 * cost (0)) so just cost
    // If type is 1 then 10% of cost will be added to totalCost
    int carpetType;
    
    
    // Default constructor sets carpetCost to 8 per yard
    public RoomCarpet (RoomDimension dim) { this.size = dim; this.carpetCost = 8.00; this.carpetType = 0;}
    public RoomCarpet (RoomDimension dim, double cost)
    {
        this.size = dim;
        this.carpetCost = cost;
        this.carpetType = 0;
    }
    public RoomCarpet (RoomDimension dim, int type)
    {
        this.size = dim;
        this.carpetCost = 8.00;
        this.carpetType = type;
    }
    
    // helper function for getTotalCost()
    private double getCost() { return this.size.getArea() * this.carpetCost; }
    private double getAddition() { return ( (this.carpetType / 100.00) * this.getCost() ); }
    public double getTotalCost() { return (this.getCost() + this.getAddition() ); }
    public String toString() { return this.size.toString() + " at $" + Double.toString(this.carpetCost); }
    
}
