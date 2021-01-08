package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuCategoryController10 {

    @GetMapping(value="/menucategory10")
    public String getmenucategory10page() {
        return "menucategory10";
    }
    
}