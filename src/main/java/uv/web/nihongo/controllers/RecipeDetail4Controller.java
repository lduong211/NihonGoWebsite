package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RecipeDetail4Controller {

    @GetMapping(value="/recipe-detail4")
    public String getrecipedetail4page() {
        return "recipe-detail4";
    }
    
}