package org.example.adapter_design_pattern.adapter;

import org.example.adapter_design_pattern.FancyUIService;
import org.example.adapter_design_pattern.client.IMultiRestoApp;
import org.example.adapter_design_pattern.payload.JSONData;
import org.example.adapter_design_pattern.payload.XMLData;

public class FancyUIServiceAdapter implements IMultiRestoApp {

    private final FancyUIService fancyUIService;

    public FancyUIServiceAdapter(){
        fancyUIService = new FancyUIService();
    }
    @Override
    public void displayMenu(XMLData xmlData) {
        JSONData jsonData = convertXMLDataToJson(xmlData);
        fancyUIService.displayMenu(jsonData);
    }

    @Override
    public void displayRecommendation(XMLData xmlData) {
        JSONData jsonData = convertXMLDataToJson(xmlData);
        fancyUIService.displayRecommendation(jsonData);
    }

    private JSONData convertXMLDataToJson(XMLData xmlData){
        JSONData jsonData = new JSONData();
        jsonData.setJsonData(xmlData.getXmlData());
        return jsonData;
    }
}
