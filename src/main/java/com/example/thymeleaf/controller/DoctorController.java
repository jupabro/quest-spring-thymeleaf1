package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DoctorController {

    @GetMapping("/doctor")
    public String doctor(Model model,
                         @RequestParam(value="doctorname",
                                 required=false,
                                 defaultValue="John Smith") String doctorname,
                         @RequestParam(value="doctornumber",
                                 required=false,
                                 defaultValue="0") int doctornumber) {

        model.addAttribute("doctorname", doctorname);
        model.addAttribute("doctornumber", doctornumber);

        return "doctor";
    }
}
