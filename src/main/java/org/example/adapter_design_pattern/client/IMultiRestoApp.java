package org.example.adapter_design_pattern.client;

import org.example.adapter_design_pattern.payload.XMLData;

public interface IMultiRestoApp {

    void displayMenu(XMLData xmlData);
    void displayRecommendation(XMLData xmlData);
}
