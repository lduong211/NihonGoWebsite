package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DetailController {

    @GetMapping(value = "/detail")
    public String getDetailPage() {
        return "detail";
    }
}