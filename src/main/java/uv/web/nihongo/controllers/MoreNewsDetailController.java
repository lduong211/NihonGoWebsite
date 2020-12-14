package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MoreNewsDetailController {

    @GetMapping(value="/morenewsdetail")
    public String getmorenewsdetailpage() {
        return "morenewsdetail";
    }
    
}