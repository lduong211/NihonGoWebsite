package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuCategoryController2 {

    @GetMapping(value="/menucategory2")
    public String getmenucategory2page() {
        return "menucategory2";
    }
    
}