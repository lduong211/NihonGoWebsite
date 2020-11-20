package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewsDetail4Controller {

    @GetMapping(value="/newsdetail4")
    public String getnewsdetail4page() {
        return "newsdetail4";
    }
    
}