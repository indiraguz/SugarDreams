
package com.sugarDreams.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
public class IndexController {
    @GetMapping("/")
    public String inicio(Model model) {

        model.addAttribute("Efallas");
        model.addAttribute("");

        return "index";
    }
    
}
