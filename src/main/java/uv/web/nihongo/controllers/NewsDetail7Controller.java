package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewsDetail7Controller {

    @GetMapping(value="/newsdetail7")
    public String getnewsdetail7page() {
        return "newsdetail7";
    }
    
}