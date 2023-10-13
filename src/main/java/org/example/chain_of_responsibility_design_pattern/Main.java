package org.example.chain_of_responsibility_design_pattern;

public class Main {
    public static void main(String args[]){
        LogProcessor logProcessor = new InfoLogger(new DebugLogger(new ErrorLogger(null)));

        logProcessor.log(LogProcessor.INFO, "please help me I am new log");
        logProcessor.log(LogProcessor.ERROR, "Handle me I am error");
        logProcessor.log(LogProcessor.DEBUG, "Do hard work bro I am debugger");
        logProcessor.log(4, "I dont know who I am");
    }
}
