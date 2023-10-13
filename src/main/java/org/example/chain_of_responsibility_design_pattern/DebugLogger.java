package org.example.chain_of_responsibility_design_pattern;

public class DebugLogger extends LogProcessor{
    public DebugLogger(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void log(int logLevel, String message){
        if(logLevel == LogProcessor.DEBUG){
            System.out.println("Debug : " + message);
        }
        else{
            System.out.println("bye I am debug");
            super.log(logLevel, message);
        }
    }
}
