package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewsDetail6Controller {

    @GetMapping(value="/newsdetail6")
    public String getnewsdetail6page() {
        return "newsdetail6";
    }
    
}