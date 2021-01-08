package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuCategoryController4 {

    @GetMapping(value="/menucategory4")
    public String getmenucategory4page() {
        return "menucategory4";
    }
    
}