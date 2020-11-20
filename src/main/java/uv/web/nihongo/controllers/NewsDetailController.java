package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewsDetailController {

    @GetMapping(value="/newsdetail")
    public String getnewsdetailpage() {
        return "newsdetail";
    }
    
}