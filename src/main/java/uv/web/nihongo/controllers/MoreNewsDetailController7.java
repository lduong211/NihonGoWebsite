package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MoreNewsDetailController7 {

    @GetMapping(value="/morenewsdetail7")
    public String getmorenewsdetail7page() {
        return "morenewsdetail7";
    }
    
}