package org.example.adapter_design_pattern.client;

import org.example.adapter_design_pattern.payload.XMLData;

public class MultiRestoApp implements IMultiRestoApp{
    @Override
    public void displayMenu(XMLData xmlData) {
        System.out.println("Displaying menu " + xmlData.getXmlData());
    }

    @Override
    public void displayRecommendation(XMLData xmlData) {
        System.out.println("Displaying recommendation " + xmlData.getXmlData());
    }
}
