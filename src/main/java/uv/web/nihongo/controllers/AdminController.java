package uv.web.nihongo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uv.web.nihongo.repositories.AdminRepo;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminRepo adminRepo;

    @GetMapping
    public String getUserListPage(Model model) {
        model.addAttribute("admins", adminRepo.findAll());
        return "admin/userList";
    }

    @GetMapping(value = "editUser/{id}")
    public String getEditPage(Model model, @PathVariable int id) {
        model.addAttribute("admin", adminRepo.findById(id).get());
        return "admin/editUser";
    }

    // @PostMapping("updateUser/{id}")
    // public String getEditUser(@PathVariable("name") String name, @PathVariable("role") List<String> role,
    //         @PathVariable("password") String password, @PathVariable("username") String username, @Valid User user,
    //         BindingResult result, Model model) {
    //     if (result.hasErrors()) {
    //         user.setName(name);
    //         user.setRoles(role);
    //         user.setPassword(password);
    //         // user.setUsername(username);
    //         user.setName(name);
    //         return "update-user";
    //     }
    //     AdminRepo.save(user);
    //     model.addAttribute("users", AdminRepo.findAll());
    //     return "redirect:/admin";
    // }

    @GetMapping(value = "delete/{id}")
    public String deletUser(@PathVariable int id) {
        adminRepo.deleteById(id);
        return "redirect:/admin";
    }

}