/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program1;


/**
 *
 * @author Anna
 */
public class User{
    double height;
    double weight;

    public User(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
    
    public double calculateBMI() {
        return weight/(Math.pow(height/100,2));
    }
    
    public void changeWeight(double weight){
        this.weight=weight;
    }

   
}
