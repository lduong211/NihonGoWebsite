package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RecipeController {

    @GetMapping(value="/recipe")
    public String getrecipepage() {
        return "recipe";
    }
    
}