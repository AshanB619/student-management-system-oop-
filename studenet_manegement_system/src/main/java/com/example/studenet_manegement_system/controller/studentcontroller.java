package com.example.studenet_manegement_system.controller;

import com.example.studenet_manegement_system.service.studetservice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class studentcontroller {
    private studetservice studetservice;

    public studentcontroller(studetservice studetservice) {
        super();
        this.studetservice = studetservice;
    }

    @GetMapping("/students")
    public String students(Model model) {
        model.addAttribute("Students",studetservice.getAllStudents());
        return "students";
    }

}
