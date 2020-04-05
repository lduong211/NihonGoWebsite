package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UnitContentController {

    @GetMapping(value="/unit-content")
    public String getUnitContentPage() {
        return "unit-content";
    }
    
}