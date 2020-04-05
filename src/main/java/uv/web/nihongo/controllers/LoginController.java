package uv.web.nihongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping(value="/login")
    public String getLoginPage() {
        return "login";
    }
    
    @GetMapping(value="/index")
    public String getHomePage() {
        return "index";
    }

    @GetMapping(value="/happyo")
    public String getHappyoPage() {
        return "happyo";
    }

    @GetMapping(value="/weekly")
    public String getWeeklyPage() {
        return "weekly";
    }

    @GetMapping(value="/detail")
    public String getDetailPage() {
        return "detail";
    }

    @GetMapping(value="/unit-content")
    public String getUnitContentPage() {
        return "unit-content";
    }

    @GetMapping(value="/units")
    public String getUnitsPage() {
        return "units";
    }

    @GetMapping(value="/user-list")
    public String getUserListPage() {
        return "user-list";
    }

    @GetMapping(value="/weekly-words")
    public String getWeeklyWordsPage() {
        return "Weekly-words";
    }
}