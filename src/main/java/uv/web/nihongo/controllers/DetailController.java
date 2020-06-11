package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DetailController {

    //N5
    @GetMapping(value = "/N5-detail")
    public String getN5DetailPage() {
        return "unitContents/N5/detail";
    }
    //N4
    @GetMapping(value = "/N4-detail")
    public String getN4DetailPage() {
        return "unitContents/N4/detail";
    }

    //N3
    @GetMapping(value = "/N3-detail")
    public String getN3DetailPage() {
        return "unitContents/N5/detail";
    }
}