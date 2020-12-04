package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TranslateController {

    @GetMapping(value="/translate")
    public String gettranslatepage() {
        return "translate";
    }
    
}