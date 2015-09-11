/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tyler
 */
public class Passenger {
    
    private String name;
    private byte service;
    
    public Passenger(String newName, byte newService) {
        name = newName;
        service = newService;
    }
    
    public String getName() {
        return name;
    }
    
    public byte getService() {
        return service;
    }
    
    public void setService(byte newService) {
        service = newService;
    }
    
    public void setName(String newName) {
        name = newName;
    }
    
    @Override
    public String toString() {
        return "";
    }
}
