package nl.demo.springjms.service.impl;

import nl.demo.springjms.jms.ConvertJmsMessage;
import nl.demo.springjms.jms.DemoJmsMessageSender;
import nl.demo.springjms.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Machiel on 5-5-2015.
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    DemoJmsMessageSender demoJmsMessageSender;

    public void sendDemoMessage(String message) {
        demoJmsMessageSender.demoSendMessage(message);
    }

    public void setDemoJmsMessageSender(DemoJmsMessageSender demoJmsMessageSender) {
        this.demoJmsMessageSender = demoJmsMessageSender;
    }
}
