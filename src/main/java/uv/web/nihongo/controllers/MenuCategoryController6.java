package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuCategoryController6 {

    @GetMapping(value="/menucategory6")
    public String getmenucategory6page() {
        return "menucategory6";
    }
    
}