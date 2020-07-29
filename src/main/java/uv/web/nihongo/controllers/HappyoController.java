package uv.web.nihongo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import uv.web.nihongo.repositories.HappyoRepo;

@Controller
public class HappyoController {

    @Autowired
    HappyoRepo happyoRepo;
    
    // @GetMapping(value="/happyo")
    // public String getHappyoPage() {
    //     return "happyo";
    // }

    @GetMapping("/happyo")
    private String getHappyos(Model model) {
        model.addAttribute("happyos", happyoRepo.findAll());
        return "happyo";
    }
}