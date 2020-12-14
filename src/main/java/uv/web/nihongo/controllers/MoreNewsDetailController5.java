package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MoreNewsDetailController5 {

    @GetMapping(value="/morenewsdetail5")
    public String getmorenewsdetail5page() {
        return "morenewsdetail5";
    }
    
}