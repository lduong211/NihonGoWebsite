package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewsDetail5Controller {

    @GetMapping(value="/newsdetail5")
    public String getnewsdetail5page() {
        return "newsdetail5";
    }
    
}