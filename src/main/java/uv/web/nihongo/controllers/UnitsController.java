package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UnitsController {

    @GetMapping(value="/units")
    public String getUnitsPage() {
        return "units";
    }
    
}