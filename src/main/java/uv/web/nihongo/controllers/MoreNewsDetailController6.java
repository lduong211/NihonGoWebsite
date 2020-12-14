package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MoreNewsDetailController6 {

    @GetMapping(value="/morenewsdetail6")
    public String getmorenewsdetail6page() {
        return "morenewsdetail6";
    }
    
}