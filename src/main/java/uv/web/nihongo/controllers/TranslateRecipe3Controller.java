package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TranslateRecipe3Controller {

    @GetMapping(value="/translaterecipe3")
    public String gettranslaterecipe3page() {
        return "translaterecipe3";
    }
    
}