package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RecipeDetail3Controller {

    @GetMapping(value="/recipe-detail3")
    public String getrecipedetail3page() {
        return "recipe-detail3";
    }
    
}