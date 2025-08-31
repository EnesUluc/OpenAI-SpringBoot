package com.openai.demo.controller;


import com.openai.demo.Chat.AIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoRestController {
    @Autowired
    private AIService aiService;


    @GetMapping("/")
    public String getMapping(){
        return "main-page";
    }

    @PostMapping("/submitText")
    public String getResponse(@RequestParam("userText")String prompt, Model model){
        model.addAttribute("response",aiService.chat(prompt));
        return "main-page";
    }
}
