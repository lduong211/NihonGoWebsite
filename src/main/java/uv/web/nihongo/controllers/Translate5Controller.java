package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Translate5Controller {

    @GetMapping(value="/translate5")
    public String gettranslate5page() {
        return "translate5";
    }
    
}