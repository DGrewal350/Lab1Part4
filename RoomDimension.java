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
public class RoomDimension {
    double length;
    double width;
    
    public double getArea() { return this.length * this.width; }
    public String toString() { return Double.toString(this.length) + " x " + Double.toString(this.width); }
}
