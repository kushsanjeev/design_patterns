package org.example.chain_of_responsibility_design_pattern;

public class InfoLogger extends LogProcessor{

    public InfoLogger(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void log(int logLevel, String message){
        if(logLevel == LogProcessor.INFO){
            System.out.println("Info : " + message);
        }
        else{
            System.out.println("bye I am info");
            super.log(logLevel, message);
        }
    }
}
