package uv.web.nihongo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {


    @GetMapping(value = "/admin")
    public String getUserListPage() {
        return "admin/userList";
    }

}