
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tyler
 */
public class Train {
    
    ArrayList<Passenger> travelers;
    
    public Train(ArrayList<Passenger> newTravelers) {
        travelers = newTravelers;
    }
    
    public boolean isOnTrain(String person) {
        return false;
    }
    
    public double percentageFirstClassPassengers() {
        return 0;
    }
    
    public double trainRevenues(double firstClassPrice, double secondClassPrice) {
        return 0;
    }
    
    public ArrayList<Passenger> getTravelers() {
        return travelers;
    }
    
    public void setTravlers(ArrayList<Passenger> newTravelers) {
        travelers = newTravelers;
    }
    
    @Override
    public String toString() {
        return "";
    }
    
    @Override
    public boolean equals(Object o) {
        return false;
    }
}
