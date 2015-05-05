package nl.demo.springjms.jms;

/**
 * Created by Machiel on 3-5-2015.
 */
public class ConvertJmsMessage {

    public String convertMessage(String message) {
        return message + " en extra text";
    }
}