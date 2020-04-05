package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HappyoController {

    @GetMapping(value = "/admin")
    public String getHappyoPage() {
        return "happyo";
    }

}