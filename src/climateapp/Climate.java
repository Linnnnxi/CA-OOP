/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package climateapp;

/**
 *
 * @author lenovo
 */
public class Climate {
    protected String message;

    // Constructor
    public Climate(String message) {
        this.message = message;
    }

    // Getter for message
    public String getMessage() {
        return message;
    }

    // Method to display a general climate message
    public String getClimateMessage() {
        return "Climate change is an urgent and difficult issue that requires conscious action!";
    }
}

