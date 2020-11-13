package uv.web.nihongo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import uv.web.nihongo.repositories.WeeklyWordRepo;

@Controller
public class WeeklyWordsController {

    @Autowired
    WeeklyWordRepo weeklyWordRepo;

    @GetMapping("/weekly-words")
    private String getWeeklyWords(Model model) {
        model.addAttribute("weeklywords", weeklyWordRepo.findAll());
        return "weekly-words";
    }

    // @GetMapping(value="/weekly-words")
    // public String getUnitsPage() {
    //     return "weekly-words";
    // }
    
}