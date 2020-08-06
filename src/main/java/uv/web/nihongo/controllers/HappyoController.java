package uv.web.nihongo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import uv.web.nihongo.repositories.HappyoRepo;

@Controller
public class HappyoController {

    @Autowired
    HappyoRepo happyoRepo;
    
    @GetMapping("/listhappyo")
    private String getHappyoPage(Model model) {
        model.addAttribute("happyos", happyoRepo.findAll());
        return "listhappyo";
    }

    // @GetMapping("/happyo")
    // private String getHappyos(Model model) {
    //     model.addAttribute("happyos", happyoRepo.findAll());
    //     return "happyo";
    // }

    @GetMapping("happyo/{id}")
    private String editHappyo(@PathVariable int id, Model model) {
        model.addAttribute("happyo", happyoRepo.findById(id).get());
        return "happyo";
    }
}