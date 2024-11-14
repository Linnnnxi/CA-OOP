/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package climateapp;

/**
 *
 * @author lenovo
 */
public class CarbonTracker extends Climate {

    private double totalEmissions;

    // Constructor
    public CarbonTracker(String message) {
        super(message);
        this.totalEmissions = 0.0;
    }

    // Method to calculate emissions based on user activity 
    public double calculateEmissions(int activityLevel) {
        totalEmissions = activityLevel * 6.5; //example
        return totalEmissions;
    }

    public String getCarbonTrackerMessage() {
        return getMessage() + " \nYour carbon emissions are being tracked!";
    }
}
