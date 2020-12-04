package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Translate2Controller {

    @GetMapping(value="/translate2")
    public String gettranslate2page() {
        return "translate2";
    }
    
}