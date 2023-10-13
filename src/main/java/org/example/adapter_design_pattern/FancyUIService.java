package org.example.adapter_design_pattern;

import org.example.adapter_design_pattern.payload.JSONData;

public class FancyUIService {
    public void displayMenu(JSONData jsonData){
        System.out.println("Displaying menu " + jsonData.getJsonData());
    }

    public void displayRecommendation(JSONData jsonData){
        System.out.println("Displaying recommendation " + jsonData.getJsonData());
    }
}
