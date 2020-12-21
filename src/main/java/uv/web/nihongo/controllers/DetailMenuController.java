package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DetailMenuController {

    @GetMapping(value="/detailmenu")
    public String getdetailmenupage() {
        return "detailmenu";
    }
    
}