package org.example.adapter_design_pattern;

import org.example.adapter_design_pattern.adapter.FancyUIServiceAdapter;
import org.example.adapter_design_pattern.client.IMultiRestoApp;
import org.example.adapter_design_pattern.client.MultiRestoApp;
import org.example.adapter_design_pattern.payload.XMLData;

public class Main {
    public static void main(String[] args){
        IMultiRestoApp multiRestoApp = new MultiRestoApp();

        XMLData xmlData = new XMLData();
        xmlData.setXmlData("Hi I am xml Data");
        multiRestoApp.displayMenu(xmlData); // old UI


        FancyUIServiceAdapter fancyUIService = new FancyUIServiceAdapter();
        System.out.println("New UI display");
        fancyUIService.displayMenu(xmlData);
        fancyUIService.displayRecommendation(xmlData); // new UI
    }
}
