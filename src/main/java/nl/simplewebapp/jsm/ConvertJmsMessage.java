package nl.simplewebapp.jsm;

import org.springframework.core.annotation.Order;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;

/**
 * Created by Machiel on 3-5-2015.
 */
@Service
public class ConvertJmsMessage {

    @JmsListener(destination = "in.queue")
    @SendTo("out.queue")
    public String convertMessage(String bericht) {
        String convertedBericht = bericht + " en extra text";

        return convertedBericht;
    }

}
