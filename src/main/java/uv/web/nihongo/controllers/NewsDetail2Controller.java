package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewsDetail2Controller {

    @GetMapping(value="/newsdetail2")
    public String getnewsdetail2page() {
        return "newsdetail2";
    }
    
}