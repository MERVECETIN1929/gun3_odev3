package odev3.core.logger;

public class MailLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println("Email log: " + message);
    }

}
