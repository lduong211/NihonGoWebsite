package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MoreNewsDetailController3 {

    @GetMapping(value="/morenewsdetail3")
    public String getmorenewsdetail3page() {
        return "morenewsdetail3";
    }
    
}