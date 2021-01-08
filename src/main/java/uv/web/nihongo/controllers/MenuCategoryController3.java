package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuCategoryController3{

    @GetMapping(value="/menucategory3")
    public String getmenucategory3page() {
        return "menucategory3";
    }
    
}