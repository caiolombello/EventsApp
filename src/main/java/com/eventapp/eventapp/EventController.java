package com.eventapp.eventapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventController {

    @RequestMapping("/eventRegister")
    public String form() {
        return "event/eventForm";
    }

}