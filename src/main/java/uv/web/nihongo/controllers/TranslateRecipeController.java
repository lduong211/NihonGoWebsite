package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TranslateRecipeController {

    @GetMapping(value="/translaterecipe")
    public String gettranslaterecipepage() {
        return "translaterecipe";
    }
    
}