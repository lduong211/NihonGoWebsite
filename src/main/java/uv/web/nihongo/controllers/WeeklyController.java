package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WeeklyController {

    @GetMapping(value="/weekly")
    public String getWeeklyPage() {
        return "weekly";
    }
    
}