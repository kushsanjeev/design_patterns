package org.example.chain_of_responsibility_design_pattern;

public class ErrorLogger extends LogProcessor{
    public ErrorLogger(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void log(int logLevel, String message){
        if(logLevel == LogProcessor.ERROR){
            System.out.println("Error : " + message);
        }
        else{
            System.out.println("bye I am error");
            super.log(logLevel, message);
        }
    }
}
