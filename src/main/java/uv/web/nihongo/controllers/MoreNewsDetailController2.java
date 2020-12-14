package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MoreNewsDetailController2 {

    @GetMapping(value="/morenewsdetail2")
    public String getmorenewsdetail2page() {
        return "morenewsdetail2";
    }
    
}