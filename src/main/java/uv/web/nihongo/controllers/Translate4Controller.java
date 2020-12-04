package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Translate4Controller {

    @GetMapping(value="/translate4")
    public String gettranslate4page() {
        return "translate4";
    }
    
}