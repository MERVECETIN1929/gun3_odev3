
package odev3.core.logger;


public class DatabaseLogger implements Logger{

    @Override
    public void log(String message) {
        System.out.println("Database Log: "+message);    }
    
}
