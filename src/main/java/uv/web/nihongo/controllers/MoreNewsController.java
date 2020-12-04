package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MoreNewsController {

    @GetMapping(value="/morenews")
    public String getmorenewspage() {
        return "morenews";
    }
    
}