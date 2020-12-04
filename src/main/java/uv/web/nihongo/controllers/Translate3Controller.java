package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Translate3Controller {

    @GetMapping(value="/translate3")
    public String gettranslate3page() {
        return "translate3";
    }
    
}