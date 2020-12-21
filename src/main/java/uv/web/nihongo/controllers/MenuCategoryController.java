package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuCategoryController {

    @GetMapping(value="/menucategory")
    public String getmenucategorypage() {
        return "menucategory";
    }
    
}