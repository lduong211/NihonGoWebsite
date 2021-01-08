package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuCategoryController9 {

    @GetMapping(value="/menucategory9")
    public String getmenucategory9page() {
        return "menucategory9";
    }
    
}