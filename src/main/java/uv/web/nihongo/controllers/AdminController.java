package uv.web.nihongo.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uv.web.nihongo.entities.Admin;
import uv.web.nihongo.entities.Happyo;
import uv.web.nihongo.entities.WeeklyWord;
import uv.web.nihongo.repositories.AdminRepo;
import uv.web.nihongo.repositories.HappyoRepo;
import uv.web.nihongo.repositories.WeeklyWordRepo;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminRepo adminRepo;

    @Autowired
    private HappyoRepo happyoRepo;

    @Autowired
    private WeeklyWordRepo weeklyWordRepo;

    @GetMapping
    public String getUserListPage(Model model) {
        model.addAttribute("admins", adminRepo.findAll());
        return "admin/userList";
    }
 
    @GetMapping("/signup")
    public String showSignUpForm(Admin admin) {
        return "admin/addUser";
    }
     
    @PostMapping("/adduser")
    public String addUser(@Valid Admin admin, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "redirect:/admin/signup";
        }
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	    admin.setPassword(passwordEncoder.encode(admin.getPwd()));
        adminRepo.save(admin);
        model.addAttribute("users", adminRepo.findAll());
        return "redirect:/admin";
    }

    @GetMapping(value = "edituser/{id}")
    public String getEditPage(Model model, @PathVariable int id) {
        model.addAttribute("admin", adminRepo.findById(id).get());
        return "admin/addUser";
    }

    @PostMapping("updateuser/{id}")
    public String getEditUser(@PathVariable("id") int id, @Valid Admin admin,
            BindingResult result, Model model) {
        if (result.hasErrors()) {
            admin.setId(id);
            return "addUser/{id}";
        }
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	    admin.setPassword(passwordEncoder.encode(admin.getPwd()));
        adminRepo.save(admin);
        model.addAttribute("users", adminRepo.findAll());
        return "redirect:/admin";
    }

    @GetMapping(value = "delete/{id}")
    public String deletUser(@PathVariable int id) {
        adminRepo.deleteById(id);
        return "redirect:/admin";
    }

    //================================Happyo=======================================

    @GetMapping("/happyo")
    private String getHappyos(Model model) {
        model.addAttribute("happyos", happyoRepo.findAll());
        return "admin/happyo";
    }

    /* Edit Form */
    @GetMapping("happyo/{id}")
    private String editHappyo(@PathVariable int id, Model model) {
        model.addAttribute("happyo", happyoRepo.findById(id).get());
        return "admin/happyoFrm";
    }

    @PostMapping("happyo/{id}")
    private String editHappyo(@ModelAttribute Happyo happyo) {
        happyoRepo.save(happyo);
        return "redirect:/admin/happyo";
    }

    /* Add Form */
    @GetMapping("happyo/new")
    private String newHappyo(Model model) {
        model.addAttribute("happyo", new Happyo());
        return "admin/happyoFrm";
    }

    @PostMapping("happyo/new")
    private String newHappyo(@ModelAttribute Happyo happyo) {
        happyoRepo.save(happyo);
        return "redirect:/admin/happyo";
    }

    /* Delete */
    @GetMapping("happyo/delete/{id}")
    private String delHappyo(@PathVariable int id) {
        happyoRepo.deleteById(id);
        return "redirect:/admin/happyo";
    }

    //================================Happyo=======================================

    //================================WeeklyWords=======================================

    @GetMapping("/weeklyword")
    private String getWeeklyWords(Model model) {
        model.addAttribute("weeklywords", weeklyWordRepo.findAll());
        return "admin/weeklyWord";
    }

    /* Edit Form */
    @GetMapping("weeklyword/{id}")
    private String editWeeklyWord(@PathVariable int id, Model model) {
        model.addAttribute("weeklyword", weeklyWordRepo.findById(id).get());
        return "admin/weeklyWordFrm";
    }

    @PostMapping("weeklyword/{id}")
    private String editWeeklyWord(@ModelAttribute WeeklyWord weeklyWord) {
        weeklyWordRepo.save(weeklyWord);
        return "redirect:/admin/weeklyword";
    }

    /* Add Form */
    @GetMapping("weeklyword/new")
    private String newWeeklyWord(Model model) {
        model.addAttribute("weeklyword", new WeeklyWord());
        return "admin/weeklyWordFrm";
    }

    @PostMapping("weeklyword/new")
    private String newWeeklyWord(@ModelAttribute WeeklyWord weeklyWord) {
        weeklyWordRepo.save(weeklyWord);
        return "redirect:/admin/weeklyWord";
    }

    /* Delete */
    @GetMapping("weeklyword/delete/{id}")
    private String delWeeklyWord(@PathVariable int id) {
        weeklyWordRepo.deleteById(id);
        return "redirect:/admin/weeklyword";
    }

    //================================WeeklyWords=======================================

}