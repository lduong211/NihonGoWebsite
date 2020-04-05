package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WeeklyWordsController {

    @GetMapping(value="/weekly-words")
    public String getUnitsPage() {
        return "weekly-words";
    }
    
}