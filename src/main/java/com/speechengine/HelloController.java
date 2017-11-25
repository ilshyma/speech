package com.speechengine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by asti on 25.11.2017.
 */
@Controller
public class HelloController {

    private MessageComponent messageComponent;


    @Autowired
    public void setMessageComponent(MessageComponent messageComponent) {
        this.messageComponent = messageComponent;
    }

    @RequestMapping("/m")
    @ResponseBody
    public String getM() {
        return messageComponent.getMessage();
    }
}
