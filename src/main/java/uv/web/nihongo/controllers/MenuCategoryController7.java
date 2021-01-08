package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuCategoryController7 {

    @GetMapping(value="/menucategory7")
    public String getmenucategory7page() {
        return "menucategory7";
    }
    
}