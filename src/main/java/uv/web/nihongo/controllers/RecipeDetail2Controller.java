package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RecipeDetail2Controller {

    @GetMapping(value="/recipe-detail2")
    public String getrecipedetail2page() {
        return "recipe-detail2";
    }
    
}