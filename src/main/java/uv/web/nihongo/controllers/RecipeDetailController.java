package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RecipeDetailController {

    @GetMapping(value="/recipe-detail")
    public String getrecipedetailpage() {
        return "recipe-detail";
    }
    
}