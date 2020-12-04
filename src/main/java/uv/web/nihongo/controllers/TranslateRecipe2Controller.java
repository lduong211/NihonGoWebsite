package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TranslateRecipe2Controller {

    @GetMapping(value="/translaterecipe2")
    public String gettranslaterecipe2page() {
        return "translaterecipe2";
    }
    
}