package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TranslateRecipe4Controller {

    @GetMapping(value="/translaterecipe4")
    public String gettranslaterecipe4page() {
        return "translaterecipe4";
    }
    
}