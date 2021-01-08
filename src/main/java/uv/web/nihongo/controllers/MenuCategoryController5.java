package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuCategoryController5 {

    @GetMapping(value="/menucategory5")
    public String getmenucategory5page() {
        return "menucategory5";
    }
    
}