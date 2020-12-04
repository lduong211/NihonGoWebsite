package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Translate6Controller {

    @GetMapping(value="/translate6")
    public String gettranslate6page() {
        return "translate6";
    }
    
}