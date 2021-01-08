package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuCategoryController8 {

    @GetMapping(value="/menucategory8")
    public String getmenucategory8page() {
        return "menucategory8";
    }
    
}