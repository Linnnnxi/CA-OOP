/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package climateapp;

/**
 *
 * @author lenovo
 */
public class Benefits extends Climate {

    // Constructor
    public Benefits(String message) {
        super(message); // Call the parent class constructor
    }

    // Method to provide general benefits of reducing carbon footprint
    public String getBenefits() {
        return "\nReducing your carbon footprint can help to slow down climate change, improves air quality, protects wildlife, Mitigates Climate-related Disasters and conserves natural resources.";
    }

    // Method to provide personalized tips based on user activity
    public String getPersonalizedTips() {
        return "\nTip: Reduce car usage by carpooling or using public transport; Support Local and Organic Products; Travel Sustainably...";
    }

    // Method to get a benefits message
    public String getBenefitsMessage() {
        return getMessage() + " Here are some tips to reduce your impact!";
    }
}

