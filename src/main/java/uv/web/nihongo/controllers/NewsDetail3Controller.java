package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewsDetail3Controller {

    @GetMapping(value="/newsdetail3")
    public String getnewsdetail3page() {
        return "newsdetail3";
    }
    
}