package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DetailMenuController2 {

    @GetMapping(value="/detailmenu2")
    public String getdetailmenu2page() {
        return "detailmenu2";
    }
    
}