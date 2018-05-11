package com.cham.ssepush;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.util.HtmlUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class GreetingService {

    @Autowired
    private SimpMessagingTemplate template;

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss:ms");

    @Scheduled(fixedRate = 1000)
    public void getGreeting(){
        Quote quote = new Quote("Hello, " + HtmlUtils.htmlEscape("Tom Johns") + "!"
                + dateFormat.format(new Date()), "Tom", "Watford", 10);
        template.convertAndSend("/topic/greetings",quote);
    }
}
